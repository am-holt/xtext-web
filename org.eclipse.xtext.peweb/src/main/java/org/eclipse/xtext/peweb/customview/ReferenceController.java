package org.eclipse.xtext.peweb.customview;

import java.util.ArrayList;
import java.util.List;

public class ReferenceController {

	public final String nodeId;
	public final String referenceName;
	public final String addButtonId;
	private List<String> possibleTypes;
	private List<ReferenceItemController> references;
	
	public ReferenceController(String nodeId, String referenceName, String addButtonId, List<String> possibleTypes) {
		this.referenceName = referenceName;
		this.addButtonId = addButtonId;
		this.nodeId = nodeId;
		this.references = new ArrayList<ReferenceItemController>();
		this.possibleTypes = possibleTypes;
	}
	
	public void addReferenceItem(String nodeId, String removeButtonId, String divId) {
		this.references.add(new ReferenceItemController(nodeId,removeButtonId,divId));
	}
	
	public List<ReferenceItemController> getReferenceItems() {
		return this.references;
	}
}