import{Attribute,Reference} from '../../node-details';
import {AbstractSyntaxTree} from '../../abstract-syntax-tree';
import {NodeDetails} from '../../node-details';

export class GetNodeRawResponse{
	attributes: Attribute[];
	references: Reference[];
	nodeId: string;
}

export class GetNodeResponse{
	rawResponse : GetNodeRawResponse;
	constructor(rawResponse:GetNodeRawResponse){
		this.rawResponse = rawResponse;
	}	

	getNodeDetails(ast:AbstractSyntaxTree){
		return new NodeDetails(this.rawResponse.attributes,this.rawResponse.references,this.rawResponse.nodeId,ast);
	}
}