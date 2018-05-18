package org.eclipse.xtext.peweb;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;

public interface IOpenResources {
	
	
	public OpenFileState getFileState(String fileLocation) throws ResourceLoadingException;
	
	public TypeHelper getTypeHelper(EPackage ePackage);
	


}
