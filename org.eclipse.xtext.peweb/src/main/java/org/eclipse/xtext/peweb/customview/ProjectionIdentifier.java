package org.eclipse.xtext.peweb.customview;

public class ProjectionIdentifier {

	public final String NodeName;
	public final String ProjectionName;
	
	public ProjectionIdentifier(String node, String projection) {
		this.NodeName = node;
		this.ProjectionName = projection;
	}
	
}
