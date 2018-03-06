import {AttributeController} from './custom-view-descriptor';

export class AttributeId{
	
	//Id of the node the attribute is referencing
	nodeId: string;

	//Name of the attribute
	name: string

	constructor(ac: AttributeController){
		this.nodeId = ac.nodeId;
		this.name = ac.attributeName;
	}
}