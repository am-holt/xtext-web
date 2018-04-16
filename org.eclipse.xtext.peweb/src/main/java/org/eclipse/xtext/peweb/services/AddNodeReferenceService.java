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
		boolean crossReference = Boolean.valueOf(serviceContext.getParameter("cross-reference"));
		String childId = serviceContext.getParameter("child-id");
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
		if(childId == null && crossReference) {
			throw new InvalidRequestException("A 'add-reference' request must have a 'child-id' parameter for a cross-reference!");
		}
		
		
		String fileLocation = ("user-files" + File.separator + projectName + File.separator + fileName);
		
		if(referenceName !=null){
			OpenFileState ofs;
			try {
				ofs = openResources.getFileState(fileLocation);
				
				ResourceAbstractSyntaxTree node = ofs.getNode(nodeId);
				EStructuralFeature refFeature = node.getEClass().getEStructuralFeature(referenceName);
				
				EObject toAdd;
				ResourceAbstractSyntaxTree astToReturn = null;
				
				Object referencedObject = node.getEObject().eGet(refFeature);
				
				// If the reference links to a singular EObject then we cannot add another
				if(referencedObject instanceof EObject) {
					throw new RuntimeException("Can't add a child here, the upper bound is one");
				}
				
				if(!crossReference) {
					EClassifier classifier;
					//If the request specified a class to add then we add a node of that class, otherwise we default to the reference features type
					if(childType == null) {
						classifier = refFeature.getEType();
					}else {
						classifier = node.getEClass().getEPackage().getEClassifier(childType);
					}
					
					toAdd = EcoreUtil.create((EClass)classifier);
					astToReturn = ofs.addChildToNode(node, toAdd);
				}else { //Cross Reference
					toAdd = ofs.getNode(childId).getEObject();
					//Don't want to add cross references to the RAST
				}
				
				
				if(referencedObject instanceof EList<?>) {				
					EList<EObject> refs = ((EList<EObject>)referencedObject);
					refs.add(toAdd);
				}else {
					node.getEObject().eSet(refFeature, toAdd);
				}

				return new AddNodeReferenceResult(astToReturn);
		
			} catch (ResourceLoadingException e) {
				//TODO fix this
				throw new RuntimeException(e);
			}
		}
		throw new InvalidRequestException("A \'add-reference' request must have a \'attribute-name\' or \'reference-name\' parameter!");
	}
}
