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
import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.OpenResources;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;


public class RemoveNodeReferenceService implements PEService {

	private OpenResources openResources;
	
	private class RemoveNodeReferenceResult implements IServiceResult{
		boolean success;
		public RemoveNodeReferenceResult(boolean success){
			this.success = success;
		}
	}
	
	public RemoveNodeReferenceService(OpenResources openResources){
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
		
		
		String fileLocation = ("user-files" + File.separator + projectName + File.separator + fileName);
		
		if(referenceName !=null){
			OpenFileState ofs;
			try {
				ofs = openResources.getFileState(fileLocation);
				ResourceAbstractSyntaxTree node = ofs.getNode(nodeId);
				
				ResourceAbstractSyntaxTree toRemove = ofs.getNode(referenceId);

				EStructuralFeature refFeature = node.getEClass().getEStructuralFeature(referenceName);
				
				boolean result = true;
				if(((EReference)refFeature).isContainment()) {
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
				throw new RuntimeException(e);
			}
		}
		throw new InvalidRequestException("A \'add-reference' request must have a \'attribute-name\' or \'reference-name\' parameter!");

	}

}
