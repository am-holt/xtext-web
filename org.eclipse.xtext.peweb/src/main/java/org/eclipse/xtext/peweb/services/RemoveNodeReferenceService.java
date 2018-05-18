package org.eclipse.xtext.peweb.services;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.peweb.IOpenResources;
import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.OpenResources;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;


public class RemoveNodeReferenceService implements PEService {

	private IOpenResources openResources;
	
	private class RemoveNodeReferenceResult implements IServiceResult{
		boolean success;
		public RemoveNodeReferenceResult(boolean success){
			this.success = success;
		}
	}
	
	public RemoveNodeReferenceService(IOpenResources openResources){
		this.openResources = openResources;
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {

		String nodeId = serviceContext.getParameter("node-id") ;
		String fileName = serviceContext.getParameter("file-name");
		String projectName = serviceContext.getParameter("project-name");
		String referenceName = serviceContext.getParameter("reference-name");
		String referenceId = serviceContext.getParameter("reference-id");
		if(nodeId == null){
			throw new InvalidRequestException("A \'remove-reference' request must have a \'node-id\' parameter!");
		}
		if(fileName == null){
			throw new InvalidRequestException("A \'remove-reference' request must have a \'file-name\' parameter!");
		}
		if(projectName == null){
			throw new InvalidRequestException("A \'remove-reference' request must have a \'project-name\' parameter!");
		}
		if(referenceName ==null){
			throw new InvalidRequestException("A \'remove-reference' request must have a \'reference-name\' parameter!");
		}
		if(referenceId ==null){
			throw new InvalidRequestException("A \'remove-reference' request must have a \'reference-id\' parameter!");
		}
		
		String fileLocation = ("user-files" + File.separator + projectName + File.separator + fileName);
		
		
			OpenFileState ofs;
			try {
				ofs = openResources.getFileState(fileLocation);
				ResourceAbstractSyntaxTree node = ofs.getNode(nodeId);
				
				ResourceAbstractSyntaxTree toRemove = ofs.getNode(referenceId);

				if(node == null) {
					throw new InvalidRequestException("\'node-id\' is not present in file!");
				}
				EStructuralFeature refFeature = node.getEClass().getEStructuralFeature(referenceName);
				System.out.println(refFeature);
				if(refFeature == null) {
					throw new InvalidRequestException("\'reference-name\' doesn't exist for this node!");
				}
				
				
				boolean result = true;
				if(((EReference)refFeature).isContainment()) {
					
					if(toRemove == null) {
						throw new InvalidRequestException("\'reference-id\' doesn't exist!");
					}
					EcoreUtil.delete(toRemove.getEObject(), true);
					result = ofs.removeChildNode(node, toRemove);
				}else {
					Object referencedObject = node.getEObject().eGet(refFeature);
					//If the crossreference is contained in an EList we remove it
					if(referencedObject instanceof EList<?>) {				
						EList<EObject> refs = ((EList<EObject>)referencedObject);
						refs.remove(toRemove.getEObject());
					}else { //If the reference is a singleton we unset it so it is no longer pointing to toRemove
						node.getEObject().eUnset(refFeature);
					}										
				}
				
				return new RemoveNodeReferenceResult(result);
		
			} catch (ResourceLoadingException e) {
				//TODO fix this
				throw new InvalidRequestException.ResourceNotFoundException(e.getMessage());
			}
		

	}

}