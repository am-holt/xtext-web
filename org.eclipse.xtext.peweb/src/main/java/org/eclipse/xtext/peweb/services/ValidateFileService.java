package org.eclipse.xtext.peweb.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.peweb.OpenResources;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;


public class ValidateFileService implements PEService {

	private class ValidateFileResponse implements IServiceResult{
		private class Tuple{
			String nodeId;
			boolean valid;
			String message;
			
			public Tuple(String id, boolean valid, String message){
				this.nodeId = id;
				this.valid = valid;
				this.message = message;
			}
		}
		
		List<Tuple> invalidNodes = new ArrayList<Tuple>();
		
		public void AddNode(String nodeId, String message) {
			this.invalidNodes.add(new Tuple(nodeId,false,message));
		}
	}
	
	private OpenResources openResources;
	
	public ValidateFileService(OpenResources openResources){
		this.openResources = openResources;
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {
		
		
		String fileName = serviceContext.getParameter("file-name");
		String projectName = serviceContext.getParameter("project-name");
		
		if(fileName == null){
			throw new InvalidRequestException("A \'validate-node' request must have a \'file-name\' parameter!");
		}
		if(projectName == null){
			throw new InvalidRequestException("A \'validate-node' request must have a \'project-name\' parameter!");
		}
		
		return new ValidateFileResponse();
		
	}

}
