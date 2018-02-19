package org.eclipse.xtext.peweb.services;

import java.io.File;
import java.io.FilenameFilter;

import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;

public class GetProjectService implements PEService {

	private class GetProjectResult implements IServiceResult{
		String[] Files;
		public GetProjectResult(String[] files){
			this.Files = files;
		}
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {
		String name = serviceContext.getParameter("name");
		if(name == null){
			throw new InvalidRequestException("get-project call requires a name field!");
		}else{
			File file = new File("./user-files" + File.separator + name);
			
			if(!file.exists()){
				throw new InvalidRequestException("No project with name " + name + "exists!");
			}
			else{
				String[] files = file.list(new FilenameFilter() {
					
					@Override
					public boolean accept(File current, String name) {
						File f = new File(current, name);
						//TODO Only get DSL specific files?
						return !f.isDirectory();
					}
					});
				//get rid of file extensions
				for(int i= 0; i< files.length;i++){
					files[i] = files[i].substring(0, files[i].lastIndexOf('.'));
				}
				GetProjectResult result = new GetProjectResult(files);
				return result;
			}
		}
	}

}
