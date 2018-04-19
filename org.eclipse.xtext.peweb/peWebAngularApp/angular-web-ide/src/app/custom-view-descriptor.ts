import { ViewDescriptor } from './view-descriptor';
import { AttributeId} from './attribute-id';
import { NodeReference } from './node-reference';

export class AttributeController{
	
	//The name of the attribute this refers to
	attributeName: string;

	//The id of the node this attribute refers to
	nodeId:string;

	//A javascript method to describe how to get the value for the attribute from the view
	getter:string;

	//A javascript method to describe how to set the value for the attribute in the view
	setter:string;

	//The initial value of the attribute
	initialValue:any;

	//A javascript method to describe how to check a value is valid, may have side effects such as painting things red etc.
	validator:string;
}

export class ReferenceController{
	//The id of the node the reference belongs to
	nodeId: string;

	//The name of the reference feature this controller is for
	referenceName:string;

	//The id of the button used to add another reference
	addSelectorId: string;

	//The types possible to create here
	possibleTypes: string[];

	//Whether or not this reference represents a crossReference
	crossReference :boolean;

	//The possible nodes this reference could cross reference
	possibleCrossReferences : NodeReference[];

	//An array of the referenced nodes contained in this reference feature
	references: ReferenceItemController[];

}

export class ReferenceItemController{
	//The id of the node being referenced;
	nodeId: string;

	//The id of the button used to remove the item;
	removeButtonId: string;

	//The identifier of the div that the referenced node is contained within
	divId: string;
}

export class CustomViewDescriptor  implements ViewDescriptor{

	static readonly CUSTOM_TYPE = "custom"

	//The type of the viewDescriptor
	type:string;

	//The html to display to the user
	htmlView : string;

	//Descibes how to get and set the attributes in the view
	attributeControllers : AttributeController[];

	//Describes how to add and remove references in the view
	referenceControllers : ReferenceController[];

	constructor(htmlView:string, attributes:AttributeController[], references:ReferenceController[]){
		this.type = "custom";
		this.htmlView = htmlView;
		this.attributeControllers = attributes;
		this.referenceControllers = references;
	}
}

