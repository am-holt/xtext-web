import { ViewDescriptor } from './view-descriptor';
import {NodeReference} from './node-reference';

export class Attribute{
	//The name of the attribute this describes
	name:string;

	//The datatype of the attribute
	type:string;

	//The initial value of the attribute
	value:string;
}

export class Reference{
	//The name of the referenceSet
	name:string;

	//The possible types this reference may contain
	possibleTypes:string[];

	//Whether or not this reference represents a crossReference
	crossReference :boolean;

	//The possible nodes this reference could cross reference
	possibleCrossReferences : NodeReference[];

	//The list of nodes references
	nodes:NodeReference[];
}


export class DefaultViewDescriptor  implements ViewDescriptor{
	
	static readonly DEFAULT_TYPE = "default"

	//The type of the descriptor
	type:string;

	//List of the nodes attributes to display
	attributes: Attribute[];

	//List of the node's reference sets to display
	references: Reference[];

	//The id of the node this describes
	nodeId: string;

	constructor(atts:Attribute[],refs:Reference[],id:string){
		this.type = "default";
		this.attributes = atts;
		this.references = refs;
		this.nodeId = id;
	}
}
