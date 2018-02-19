package org.eclipse.xtext.peweb;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;

public class OpenResources {

	private Map<String, OpenFileState> openFileMap = new HashMap<String, OpenFileState>();
	
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
}
