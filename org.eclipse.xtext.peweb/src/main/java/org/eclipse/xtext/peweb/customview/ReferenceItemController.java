package org.eclipse.xtext.peweb.customview;

public class ReferenceItemController {

	public final String nodeId;
	public final String removeButtonId;
	public final String divId;
	
	public ReferenceItemController(String nodeId, String removeButtonId,String divId) {
		this.nodeId = nodeId;
		this.removeButtonId = removeButtonId;
		this.divId = divId;
	}
}