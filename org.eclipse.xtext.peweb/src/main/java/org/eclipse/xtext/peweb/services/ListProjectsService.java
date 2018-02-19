package org.eclipse.xtext.peweb.services;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;

public class ListProjectsService implements PEService {

	
	private class ListProjectsResult implements IServiceResult{
		public String[] projectnames;
		
		public ListProjectsResult(String[] pn){
			this.projectnames = pn;
		}
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {
		File file = new File("./user-files/");
		String a = file.getAbsolutePath();
		
		String[] directories = file.list(new FilenameFilter() {
		  @Override
		  public boolean accept(File current, String name) {
		    return new File(current, name).isDirectory();
		  }
		});
		
		return new ListProjectsResult(directories);
	}
}
