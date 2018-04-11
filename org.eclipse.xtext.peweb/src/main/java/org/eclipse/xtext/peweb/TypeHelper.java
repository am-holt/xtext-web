package org.eclipse.xtext.peweb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

public class TypeHelper {

	private String newFileType;
	private EPackage ePackage;
	private Map<String,List<String>> subtypeMap = new HashMap<String,List<String>>();
	
	public TypeHelper(EPackage languagePackage) {
		this.ePackage = languagePackage;
	}
	
	public List<String> getSubtypes(String type) {
		if(!this.subtypeMap.containsKey(type)) {
			this.subtypeMap.put(type, calculateSubtypes(type));
		}
		return this.subtypeMap.get(type);
	}
	
	public String getNewFileType() {
		if(this.newFileType ==null) {
			this.newFileType = calculateNewFileType();
		}
		return this.newFileType;
	}

	private List<String> calculateSubtypes(String typeName) {
		EClassifier typeClassifier = this.ePackage.getEClassifier(typeName);
		if(!(typeClassifier instanceof EClass)) {
			throw new RuntimeException("can't calculate the subtypes for a non-EClass object!");
		}
		
		EClass typeClass = (EClass)this.ePackage.getEClassifier(typeName);
		
		EClassifier[]  classes = (EClassifier[])(ePackage.getEClassifiers().toArray());
		List<String> subTypes = new ArrayList<String>();
		
		for(int i = 0; i< classes.length;i ++) {
			if(classes[i] instanceof EClass) {
				EClass c = (EClass)classes[i];
				if(typeClass.isSuperTypeOf(c)) {
					subTypes.add(c.getName());
				}
			}		
		}
		return subTypes;
	}
	
	private String calculateNewFileType() {
		// TODO Auto-generated method stub
		return null;
	}
}
