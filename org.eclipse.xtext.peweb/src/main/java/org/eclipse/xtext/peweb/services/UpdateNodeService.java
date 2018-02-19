package org.eclipse.xtext.peweb.services;

import java.io.File;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.OpenResources;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;


public class UpdateNodeService implements PEService {

	private class UpdateNodeResponse implements IServiceResult{
		boolean success;
		String message;
		
		public UpdateNodeResponse(boolean success, String message){
			this.success = success;
			this.message = message;
		}
	}
	
	private OpenResources openResources;
	
	public UpdateNodeService(OpenResources openResources){
		this.openResources = openResources;
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {
		
		String nodeId = serviceContext.getParameter("node-id") ;
		String fileName = serviceContext.getParameter("file-name");
		String projectName = serviceContext.getParameter("project-name");
		String attributeName = serviceContext.getParameter("attribute-name");
		String referenceName = serviceContext.getParameter("reference-name");
		String value = serviceContext.getParameter("value");
		if(nodeId == null){
			throw new InvalidRequestException("A \'update-node' request must have a \'node-id\' parameter!");
		}
		if(fileName == null){
			throw new InvalidRequestException("A \'update-node' request must have a \'file-name\' parameter!");
		}
		if(projectName == null){
			throw new InvalidRequestException("A \'update-node' request must have a \'project-name\' parameter!");
		}
		if(value == null){
			throw new InvalidRequestException("A \'update-node' request must have a \'value\' parameter!");
		}
		
		String fileLocation = ("user-files" + File.separator + projectName + File.separator + fileName);
		
		if(attributeName !=null){
			return updateAttribute(fileLocation, nodeId ,attributeName,value);
		}else if(referenceName != null){
			return updateReference(fileLocation, nodeId ,referenceName,value);
		}
		throw new InvalidRequestException("A \'update-node' request must have a \'attribute-name\' or \'reference-name\' parameter!");
	}

	private IServiceResult updateAttribute(String fileLocation, String nodeId, String attributeName, String value) {
		
		try {
			OpenFileState ofs = this.openResources.getFileState(fileLocation);
			ResourceAbstractSyntaxTree node = ofs.getNode(nodeId);
			EObject eObject = node.getEObject();
			
			//TODO CHANGE THIS HACK 
			String type = node.getEClass().getEStructuralFeature(attributeName).getEType().getName();
			if(type == "EString"){
				eObject.eSet(node.getEClass().getEStructuralFeature(attributeName), value);
			}else if(type == "EInt"){
				eObject.eSet(node.getEClass().getEStructuralFeature(attributeName), Integer.parseInt(value));
			}
			
			return new UpdateNodeResponse(true, "success");
			
		}catch (ResourceLoadingException e) {
			throw new RuntimeException("Couldn't open " + fileLocation);
		}
	}

	private IServiceResult updateReference(String fileLocation, String nodeId, String referenceName, String value) {
		// TODO Auto-generated method stub
		return null;
		
		
		
	}
	
	

}
