package org.eclipse.xtext.peweb.customview;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.peweb.NodeRef;

public class ReferenceController {

	public final String nodeId;
	public final String referenceName;
	public final String addSelectorId;
	public final boolean crossReference;
	private List<String> possibleTypes;
	private List<NodeRef> possibleCrossReferences;
	private List<ReferenceItemController> references;
	
	public ReferenceController(String nodeId, String referenceName, String addSelectorId, List<String> possibleTypes) {
		this.referenceName = referenceName;
		this.addSelectorId = addSelectorId;
		this.nodeId = nodeId;
		this.crossReference = false;
		this.references = new ArrayList<ReferenceItemController>();
		this.possibleTypes = possibleTypes;
	}
	
	//Have to include boolean otherwise type signatures are identical after generics removed at compile time. Must be better solution
	public ReferenceController(String nodeId, String referenceName, String addSelectorId, boolean crossReference, List<NodeRef> possibleCrossReferences) {
		this.referenceName = referenceName;
		this.addSelectorId = addSelectorId;
		this.nodeId = nodeId;
		this.crossReference = true;
		this.references = new ArrayList<ReferenceItemController>();
		this.possibleCrossReferences = possibleCrossReferences;
	}
	
	public void addReferenceItem(String nodeId, String removeButtonId, String divId) {
		this.references.add(new ReferenceItemController(nodeId,removeButtonId,divId));
	}
	
	public List<ReferenceItemController> getReferenceItems() {
		return this.references;
	}
}