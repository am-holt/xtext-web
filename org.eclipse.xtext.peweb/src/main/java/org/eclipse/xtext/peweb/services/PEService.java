package org.eclipse.xtext.peweb.services;

import javax.servlet.http.HttpServletResponse;

import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;


//Service interface 
public interface PEService {

	public IServiceResult service(IServiceContext serviceContext);

}
