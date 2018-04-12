package org.eclipse.xtext.peweb.customview;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.peweb.NodeRef;
import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.TypeHelper;

public class DefaultProjectionDescription extends ProjectionDescription {

	public class Attribute{ 
		String type; 
		String name; 
		Object value;
		public Attribute(String type, String name, Object value){
			this.type = type; 
			this.name = name;
			this.value = value;
		}
	}

	public class Reference{ 
		String name;
		List<String> possibleTypes;
		List<NodeRef> possibleCrossReferences;
		boolean crossReference;
		List<NodeRef> nodes = new ArrayList<NodeRef>();
		public Reference(String name, List<NodeRef> nodes, List<String> possibleTypes){
			this.name = name;
			this.crossReference = false;
			this.nodes = nodes;
			this.possibleTypes = possibleTypes;
		}
		
		//Have to include boolean otherwise type signatures are identical after generics removed at compile time. Must be better solution
		public Reference(String name, List<NodeRef> nodes,boolean crossReference, List<NodeRef> possibleCrossRefs){
			this.name = name;
			this.crossReference = crossReference;
			this.nodes = nodes;
			this.possibleCrossReferences = possibleCrossRefs;
		}
	}
	
	
	List<Attribute> attributes = new ArrayList<Attribute>();
	List<Reference> references = new ArrayList<Reference>();
	String nodeId ;
	
	
	//TODO is it necessary to pass OFS here? Could extend RAST so children match to reference name easily!
	public DefaultProjectionDescription(TypeHelper typeHelper, OpenFileState ofs, ResourceAbstractSyntaxTree node){
		this.nodeId = node.getNodeId();
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
			
			List<String> possibleSubtypes = typeHelper.getSubtypes(eRef.getEType().getName());
			
			if(eRef.isContainment()) {
				this.addReference(eRef, refNodes, possibleSubtypes);
			}else {
				List<NodeRef> possibleCrossRefs = new ArrayList<NodeRef>();
				
				for(String t : possibleSubtypes) {
					for(String id: ofs.getNodesOfType(t)) {
						possibleCrossRefs.add(ofs.getNode(id).getNodeRef());
					}
				}
				this.references.add(new Reference(eRef.getName(),refNodes,true, possibleCrossRefs));
			}
			
		}
	}
	
	private void addAtribute(String type, String name, Object value){
		this.attributes.add(new Attribute(type,name, value));
	}
	
	private void addReference(EReference ref, List<NodeRef> references, List<String> subTypes){
		
		Reference toAdd = new Reference(ref.getName(),references,subTypes);
		this.references.add(toAdd);
	}
}