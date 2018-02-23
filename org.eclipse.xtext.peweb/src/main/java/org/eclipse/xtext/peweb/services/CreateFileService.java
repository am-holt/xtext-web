package org.eclipse.xtext.peweb.services;

import java.io.File;
import java.io.IOException;

import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;

import com.google.inject.Inject;

public class CreateFileService implements PEService {

	@Inject 
	public  FileExtensionProvider fileExtensionProvider;
	
	private class CreateFileResult implements IServiceResult{
		String name; 
		Boolean success;
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {
		String name = serviceContext.getParameter("name");
		String extension = this.fileExtensionProvider.getPrimaryFileExtension();
		String projectId = serviceContext.getParameter("project-name");
		try{
			if(name == null){
				throw new InvalidRequestException("Create file call requires a name field!");
			}else if(projectId == null){
				throw new InvalidRequestException("Create file call requires a project-name field!");
			}else{
				File file = new File("./user-files" + File.separator +projectId  + File.separator + name + "."  + extension);
				CreateFileResult result = new CreateFileResult();
				result.success = file.createNewFile();
				result.name = name + "." + extension;
				return result;
			}
		}catch(IOException e){
			throw new InvalidRequestException("IO Error: " + e.getMessage());
		}
		
	}

}
