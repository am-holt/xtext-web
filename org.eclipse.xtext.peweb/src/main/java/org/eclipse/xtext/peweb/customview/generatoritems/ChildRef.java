package org.eclipse.xtext.peweb.customview.generatoritems;

import static com.google.common.collect.Sets.intersection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.peweb.NodeRef;
import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.TypeHelper;
import org.eclipse.xtext.peweb.customview.CustomHtmlProjectionDescription;
import org.eclipse.xtext.peweb.customview.HtmlComponentSpecification;
import org.eclipse.xtext.peweb.customview.HtmlProjectionSpecification;
import org.eclipse.xtext.peweb.customview.ProjectionIdentifier;
import org.eclipse.xtext.peweb.customview.ReferenceController;
import org.eclipse.xtext.peweb.customview.ViewRetriever;
import org.eclipse.xtext.peweb.customview.DefaultProjectionDescription.Reference;

public class ChildRef implements GeneratorItem  {
	
	public final String childName;
	public final String projectionName;
	
	public ChildRef(String childName, String projectionName) {
		this.childName = childName;
		this.projectionName = projectionName;
	}

	@Override
	public CustomHtmlProjectionDescription generate(String htmlIdSuffix, Map<String, String> idMap, OpenFileState ofs, TypeHelper typeHelper,
			ResourceAbstractSyntaxTree node, Map<ProjectionIdentifier, HtmlProjectionSpecification> nodeMap,
			Map<String, HtmlComponentSpecification> componentMap) {
		
		EObject eObject = node.getEObject();
		
		// TODO Correct cast, think probably not?
		EStructuralFeature structFeature = node.getEClass().getEStructuralFeature(childName);
		
		//TODO Only works if list!
		EList<EObject> eObjects = (EList<EObject>)eObject.eGet(structFeature);
		
		CustomHtmlProjectionDescription result = new CustomHtmlProjectionDescription(); 
		
		int suffixAddition = 0;
		String addRefSelectorId = "addRefSelector" + this.childName + htmlIdSuffix;
		
		EReference eRef = (EReference)node.getEClass().getEStructuralFeature(childName);
			
		List<String> possibleTypes = typeHelper.getSubtypes(eRef.getEType().getName());
		List<NodeRef> possibleCrossRefs = new ArrayList<NodeRef>();
		ReferenceController referenceController;
		
		if(eRef.isContainment()) {
			referenceController = new ReferenceController(node.getNodeId(),this.childName, addRefSelectorId, possibleTypes);
		}else {
			 		
			for(String t : possibleTypes) {
				for(String id: ofs.getNodesOfType(t)) {
					possibleCrossRefs.add(ofs.getNode(id).getNodeRef());
				}
			}
			referenceController = new ReferenceController(node.getNodeId(),this.childName, addRefSelectorId,true, possibleCrossRefs);
		}
		
		
		for(EObject refObject : eObjects){

			
			ResourceAbstractSyntaxTree childNode = ofs.getNode(ofs.getEObjectId(refObject));		
			ProjectionIdentifier childProjId = new ProjectionIdentifier(childNode.getName(),this.projectionName); 
			if(!nodeMap.containsKey(childProjId)) {
				throw new RuntimeException("Node type: " + childProjId.nodeName + " does not have " +childProjId.projectionName+" projection");
			}else {
				
				String divId = "childDiv" + childNode.getNodeId() + htmlIdSuffix + "_" + suffixAddition;
				String removeBtnId = "removeChildBtn" + childNode.getNodeId() + htmlIdSuffix + "_" + suffixAddition;
				
				result.append("<div id=\"" + divId + "\">");
				result.append("<hr>");
				result.append("<button id=\""+removeBtnId+"\">Remove Node</button>");
				result.append(nodeMap.get(childProjId).generate(htmlIdSuffix + "_" + suffixAddition,ofs,typeHelper, childNode, nodeMap, componentMap));
				result.append("</div>");
				
				referenceController.addReferenceItem(childNode.getNodeId(), removeBtnId, divId);
				
			}
			
			suffixAddition +=1;
		}
		result.append("<hr>");
		/*<select (change)="AddCrossReference(ref,$event.target.value)">
		<option selected disabled>Add Cross Reference</option>
		<option *ngFor="let node of ref.possibleCrossReferences" [value]="node.nodeId">
			{{node.name}}
		</option>
	</select>
*/		
		result.append("<select id=\""+addRefSelectorId+"\">");
		if(eRef.isContainment()) {
			result.append("<option selected disabled>Add Child</option>");
			for(String pt : possibleTypes) {
				result.append("<option value=\""+pt+"\">Add " +pt + " Node</option>");
			}
		}else {
			result.append("<option selected disabled>Add Reference</option>");
			for(NodeRef nr : possibleCrossRefs) {
				result.append("<option value=\""+nr.getNodeId() +"\">Add " +nr.getName() + " </option>");
			}
		}
		result.append("</select>");
		
		
		
		
		result.append(referenceController);
		//Append above as ReferenceController to result
		
		return result;
		
	}
	

}


/*
 * this.nodeId = node.getNodeId();
		this.type = "default";
		EObject eObject = node.getEObject();
		EList<EAttribute> attributes = node.getEClass().getEAllAttributes();
		EList<EReference> references = node.getEClass().getEAllReferences();
		
		for(EAttribute a : attributes){
			//Only works if eObject.eGet(a) is serializable....
			this.addAtribute(a.getEAttributeType().getName(), a.getName(),eObject.eGet(a));
		}
		
		for(EReference eRef : references){
			
			List<NodeRef> refNodes = new ArrayList<NodeRef>();
			
			//TODO Only works if list!
			EList<EObject> eObjects = (EList<EObject>)eObject.eGet(eRef);
			
			for(EObject refObject : eObjects){
				refNodes.add(new NodeRef(ofs.getEObjectId(refObject),refObject.eClass().getName()));
			}
			this.addReference(eRef.getName(), refNodes);
		}
 * */
