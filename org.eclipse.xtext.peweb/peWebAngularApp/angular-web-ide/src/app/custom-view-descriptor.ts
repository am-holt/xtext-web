import { ViewDescriptor } from './view-descriptor';
import { AttributeId} from './attribute-id';

export class AttributeController{
	
	//The identifier for the attribute this refers to
	attributeId: AttributeId;

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

	//The html to display to the user
	htmlView : string;

	//Descibes how to get and set the attributes in the view
	attributeControllers : AttributeController[];

	//TODO: References

	constructor(htmlView:string, attributes:AttributeController[]){
		this.htmlView = htmlView;
		this.attributeControllers = attributes;
	}

}

