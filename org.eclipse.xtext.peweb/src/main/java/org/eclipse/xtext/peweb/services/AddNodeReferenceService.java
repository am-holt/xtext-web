package org.eclipse.xtext.peweb.services;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.OpenResources;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;


public class AddNodeReferenceService implements PEService {

	private OpenResources openResources;
	
	private class AddNodeReferenceResult implements IServiceResult{
		ResourceAbstractSyntaxTree ast;
		public AddNodeReferenceResult(ResourceAbstractSyntaxTree ast){
			this.ast = ast;
		}
	}
	
	public AddNodeReferenceService(OpenResources openResources){
		this.openResources = openResources;
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {

		String nodeId = serviceContext.getParameter("node-id") ;
		String fileName = serviceContext.getParameter("file-name");
		String projectName = serviceContext.getParameter("project-name");
		String referenceName = serviceContext.getParameter("reference-name");
		String childType = serviceContext.getParameter("child-type");
		if(nodeId == null){
			throw new InvalidRequestException("A \'add-reference' request must have a \'node-id\' parameter!");
		}
		if(fileName == null){
			throw new InvalidRequestException("A \'add-reference' request must have a \'file-name\' parameter!");
		}
		if(projectName == null){
			throw new InvalidRequestException("A \'add-reference' request must have a \'project-name\' parameter!");
		}
		
		
		String fileLocation = ("user-files" + File.separator + projectName + File.separator + fileName);
		
		if(referenceName !=null){
			OpenFileState ofs;
			try {
				ofs = openResources.getFileState(fileLocation);
				ResourceAbstractSyntaxTree node = ofs.getNode(nodeId);
				EStructuralFeature refFeature = node.getEClass().getEStructuralFeature(referenceName);
								
				EClassifier classifier;
				//If the request specified a class to add then we add a node of that class, otherwise we default to the reference features type
				if(childType == null) {
					classifier = refFeature.getEType();
				}else {
					classifier = node.getEClass().getEPackage().getEClassifier(childType);
				}
				
				
				EObject toAdd = EcoreUtil.create((EClass)classifier);
				
				//TODO Investigate if this cast safe, references always list?
				EList<EObject> refs = ((EList<EObject>)node.getEObject().eGet(refFeature));
				refs.add(toAdd);
				return new AddNodeReferenceResult(ofs.addChildToNode(node, toAdd));
		
			} catch (ResourceLoadingException e) {
				//TODO fix this
				throw new RuntimeException(e);
			}
		}
		throw new InvalidRequestException("A \'add-reference' request must have a \'attribute-name\' or \'reference-name\' parameter!");

	}

}
