package org.eclipse.xtext.peweb.services;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.OpenResources;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;

import java.io.File;

/*import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
*/

public class GetFileService implements PEService {
	
	private class GetFileResult implements IServiceResult{
		ResourceAbstractSyntaxTree ast;
		String filename;
		
		public GetFileResult(ResourceAbstractSyntaxTree ast, String fileName){
			this.ast = ast;
			this.filename = fileName;
		}
	}


	private OpenResources openResources;
	
	public GetFileService(OpenResources openResources){
		this.openResources = openResources;
	}
	
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {
			
		String fileName = serviceContext.getParameter("file-name");
		String projName = serviceContext.getParameter("project-name");
		if(projName == null){
			throw new InvalidRequestException("Get-File call requires a project-name field!");
		}else if(fileName == null){
			throw new InvalidRequestException("Get-File call requires a file-name field!");
		}
		String fileLocation = ("user-files" + File.separator + projName + File.separator + fileName);
		
		OpenFileState ofs;
		try {
			ofs = openResources.getFileState(fileLocation);
		} catch (ResourceLoadingException e) {
			//TODO change this
			throw new RuntimeException("Couldn't open fileLocation");
		}

		ResourceAbstractSyntaxTree ast = ofs.getAST();

		return new GetFileResult(ast, fileName);
	}
	

}
