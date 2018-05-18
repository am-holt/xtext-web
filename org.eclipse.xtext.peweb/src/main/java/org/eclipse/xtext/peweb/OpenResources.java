package org.eclipse.xtext.peweb;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;

public class OpenResources implements IOpenResources{

	private Map<String, OpenFileState> openFileMap = new HashMap<String, OpenFileState>();
	private Map<EPackage, TypeHelper> typeHelperMap = new HashMap<EPackage, TypeHelper>();
	
	//Try to get the details for a file, opening it if needed
	public OpenFileState getFileState(String fileLocation) throws ResourceLoadingException{
		if(openFileMap.containsKey(fileLocation)){
			return openFileMap.get(fileLocation);
		}else{
			//TODO Logger
			return this.openFile(fileLocation);
		}
	}
	
	private OpenFileState openFile(String fileLocation) throws ResourceLoadingException{
		OpenFileState ofs = new OpenFileState(fileLocation);
		openFileMap.put(fileLocation, ofs);
		return ofs;
	}
	
	public TypeHelper getTypeHelper(EPackage ePackage){
		if(typeHelperMap.containsKey(ePackage)){
			return typeHelperMap.get(ePackage);
		}else{
			return this.createTypeHelper(ePackage);
		}
	}

	private TypeHelper createTypeHelper(EPackage ePackage) {
		TypeHelper th = new TypeHelper(ePackage);
		this.typeHelperMap.put(ePackage, th);
		return th;
	}
}
