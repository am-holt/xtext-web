package org.eclipse.xtext.peweb.customview.generatoritems;

import static com.google.common.collect.Sets.intersection;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.peweb.NodeRef;
import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.customview.CustomHtmlProjectionDescription;
import org.eclipse.xtext.peweb.customview.HtmlComponentSpecification;
import org.eclipse.xtext.peweb.customview.HtmlProjectionSpecification;
import org.eclipse.xtext.peweb.customview.ProjectionIdentifier;
import org.eclipse.xtext.peweb.customview.ReferenceController;
import org.eclipse.xtext.peweb.customview.ViewRetriever;

public class ChildRef implements GeneratorItem  {
	
	public final String childName;
	public final String projectionName;
	
	public ChildRef(String childName, String projectionName) {
		this.childName = childName;
		this.projectionName = projectionName;
	}

	@Override
	public CustomHtmlProjectionDescription generate(String htmlIdSuffix, Map<String, String> idMap, OpenFileState ofs,
			ResourceAbstractSyntaxTree node, Map<ProjectionIdentifier, HtmlProjectionSpecification> nodeMap,
			Map<String, HtmlComponentSpecification> componentMap) {
		
		EObject eObject = node.getEObject();
		
		// TODO Correct cast, think probably not?
		EStructuralFeature structFeature = node.getEClass().getEStructuralFeature(childName);
		
		//TODO Only works if list!
		EList<EObject> eObjects = (EList<EObject>)eObject.eGet(structFeature);
		
		CustomHtmlProjectionDescription result = new CustomHtmlProjectionDescription(); 
		
		int suffixAddition = 0;
		String addBtnId = "addChildBtn" + this.childName + htmlIdSuffix;
		ReferenceController referenceController = new ReferenceController(node.getNodeId(),this.childName, addBtnId );
		
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
				result.append(nodeMap.get(childProjId).generate(htmlIdSuffix + "_" + suffixAddition,ofs, childNode, nodeMap, componentMap));
				result.append("</div>");
				
				referenceController.addReferenceItem(childNode.getNodeId(), removeBtnId, divId);
				
			}
			
			suffixAddition +=1;
		}
		result.append("<hr>");
		result.append("<button id=\""+addBtnId+"\">Remove Node</button>");
		
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
