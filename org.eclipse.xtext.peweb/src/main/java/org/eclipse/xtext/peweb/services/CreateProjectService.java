package org.eclipse.xtext.peweb.services;

import java.io.File;

import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;

public class CreateProjectService implements PEService {

	private class CreateProjectResult implements IServiceResult{
		Boolean success;
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {
		String name = serviceContext.getParameter("name");
		if(name == null){
			throw new InvalidRequestException("Create Project call requires a name field!");
		}else{
			File file = new File("./user-files" + File.separator + name);
			CreateProjectResult result = new CreateProjectResult();
			result.success = file.mkdir();
			return result;
		}
	}

}
