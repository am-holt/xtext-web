package org.eclipse.xtext.peweb.services;

import java.io.File;
import java.io.IOException;

import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.OpenResources;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;


public class SaveFileService implements PEService {

	private class SaveFileResponse implements IServiceResult{
		public boolean success;
		public String message;
		
		public SaveFileResponse(boolean success, String message){
			this.success= success;
			this.message = message;
		}
		
	}
	
	private OpenResources openResources;
	
	public SaveFileService(OpenResources openResources ){
		this.openResources = openResources;
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {
		
		String fileName = serviceContext.getParameter("file-name");
		String projectName = serviceContext.getParameter("project-name");
		
		if(fileName == null){
			throw new InvalidRequestException("A \'update-node' request must have a \'file-name\' parameter!");
		}
		if(projectName == null){
			throw new InvalidRequestException("A \'update-node' request must have a \'project-name\' parameter!");
		}
				
		String fileLocation = ("user-files" + File.separator + projectName + File.separator + fileName);
		
		try{
			OpenFileState ofs = this.openResources.getFileState(fileLocation);
			ofs.saveFile();
			return new SaveFileResponse(true,"success");
		}catch(IOException e){
			throw new RuntimeException("Couldn't open " + fileLocation + " IOException: " + e.getMessage());
		}catch(ResourceLoadingException e){
			throw new RuntimeException("Couldn't open " + fileLocation);
		}
	}

}
