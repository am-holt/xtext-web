package org.eclipse.xtext.peweb.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.OpenResources;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.TypeHelper;
import org.eclipse.xtext.peweb.customview.ProjectionDescription;
import org.eclipse.xtext.peweb.customview.ViewRetriever;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;

public class GetNodeService implements PEService {
	
	private OpenResources openResources;
	private ViewRetriever viewRetriever;
	
	public GetNodeService(OpenResources openResources, ViewRetriever viewRetriever){
		this.openResources = openResources;
		this.viewRetriever = viewRetriever;
		
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {
		
		String nodeId = serviceContext.getParameter("node-id") ;
		String fileName = serviceContext.getParameter("file-name");
		String projectName = serviceContext.getParameter("project-name");
		if(nodeId == null){
			throw new InvalidRequestException("A \'get-node' request must have a \'node-id\' parameter!");
		}
		if(fileName == null){
			throw new InvalidRequestException("A \'get-node' request must have a \'file-name\' parameter!");
		}
		if(projectName == null){
			throw new InvalidRequestException("A \'get-node' request must have a \'project-name\' parameter!");
		}
		String fileLocation = ("user-files" + File.separator + projectName + File.separator + fileName);
		
		
		try {
					
			OpenFileState ofs = this.openResources.getFileState(fileLocation);
			ResourceAbstractSyntaxTree node = ofs.getNode(nodeId);
			TypeHelper th = this.openResources.getTypeHelper(node.getEClass().getEPackage());
			
			ProjectionDescription result = this.viewRetriever.getView(th, ofs, node);
						
			return result;
			
		} catch (ResourceLoadingException e) {
			//TODO change this
			throw new RuntimeException("Couldn't open " + fileLocation);
		}
	}

}
