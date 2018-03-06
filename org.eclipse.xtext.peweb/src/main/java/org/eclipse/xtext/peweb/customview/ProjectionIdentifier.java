package org.eclipse.xtext.peweb.customview;

public class ProjectionIdentifier {

	public final String nodeName;
	public final String projectionName;
	
	public ProjectionIdentifier(String node, String projection) {
		this.nodeName = node;
		this.projectionName = projection;
	}
	
	@Override
	public boolean equals(Object other) {
	    if (other == null) { return false; }
	    if (!(other instanceof ProjectionIdentifier)) { return false; }
	    ProjectionIdentifier oth = (ProjectionIdentifier)other;
	    return this.nodeName == oth.nodeName && this.projectionName == oth.projectionName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
	    int result = 1;
	    result = prime * result + ((nodeName == null) ? 0 : nodeName.hashCode());
	    result = prime * result + ((projectionName == null) ? 0 : projectionName.hashCode());
	    return result;
	}
	
}
