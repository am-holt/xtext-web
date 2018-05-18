package org.eclipse.xtext.peweb.services;

import java.io.File;

import org.eclipse.xtext.peweb.OpenResources;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;


public class ValidateNodeService implements PEService {

	private class ValidateNodeResponse implements IServiceResult{
		boolean valid;
		String message;
		
		public ValidateNodeResponse(boolean valid, String message){
			this.valid = valid;
			this.message = message;
		}
	}
	
	private OpenResources openResources;
	
	public ValidateNodeService(OpenResources openResources){
		this.openResources = openResources;
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {
		
		String nodeId = serviceContext.getParameter("node-id") ;
		String fileName = serviceContext.getParameter("file-name");
		String projectName = serviceContext.getParameter("project-name");
		
		if(nodeId == null){
			throw new InvalidRequestException("A \'validate-node' request must have a \'node-id\' parameter!");
		}
		if(fileName == null){
			throw new InvalidRequestException("A \'validate-node' request must have a \'file-name\' parameter!");
		}
		if(projectName == null){
			throw new InvalidRequestException("A \'validate-node' request must have a \'project-name\' parameter!");
		}
		
		
		String fileLocation = ("user-files" + File.separator + projectName + File.separator + fileName);
		
		return new ValidateNodeResponse(true, "");
	}

	private IServiceResult validateAttribute(String fileLocation, String nodeId, String attributeName, String value) {		
		return new ValidateNodeResponse(true,"NeedsToBeImplemented");
	}

	private IServiceResult validateReference(String fileLocation, String nodeId, String referenceName, String value) {
		return new ValidateNodeResponse(true,"NeedsToBeImplemented");
	}

}
