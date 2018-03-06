import { ViewDescriptor } from './view-descriptor';
import { AttributeId} from './attribute-id';

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

export class CustomViewDescriptor  implements ViewDescriptor{

	static readonly CUSTOM_TYPE = "custom"

	//The type of the viewDescriptor
	type:string;

	//The html to display to the user
	htmlView : string;

	//Descibes how to get and set the attributes in the view
	attributeControllers : AttributeController[];

	//TODO: References

	constructor(htmlView:string, attributes:AttributeController[]){
		this.type = "custom";
		this.htmlView = htmlView;
		this.attributeControllers = attributes;
	}
}

