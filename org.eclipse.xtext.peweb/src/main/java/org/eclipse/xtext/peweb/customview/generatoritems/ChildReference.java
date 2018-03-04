package org.eclipse.xtext.peweb.customview.generatoritems;

public class ChildReference implements GeneratorItem  {
	
	public final String ChildName;
	public final String ProjectionName;
	
	public ChildReference(String childName, String projectionName) {
		this.ChildName = childName;
		this.ProjectionName = projectionName;
	}
	

}
