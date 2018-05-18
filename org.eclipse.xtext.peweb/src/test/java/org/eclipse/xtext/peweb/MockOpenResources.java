package org.eclipse.xtext.peweb;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;

public class MockOpenResources implements IOpenResources {

	
	private Map<String,EObject> fileNameToAST;
	
	public MockOpenResources(Map<String,EObject> asts) {
		this.fileNameToAST = asts;
	}
	
	
	@Override
	public OpenFileState getFileState(String fileLocation) throws ResourceLoadingException {
	
		if(!this.fileNameToAST.containsKey(fileLocation)) {
			throw new ResourceLoadingException(fileLocation + " file not found!");
		}
		
		return new OpenFileState(this.fileNameToAST.get(fileLocation));
	}

	@Override
	public TypeHelper getTypeHelper(EPackage ePackage) {
		// TODO Auto-generated method stub
		return null;
	}

}
