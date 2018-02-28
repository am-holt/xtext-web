import {Attribute,Reference, DefaultViewDescriptor} from '../../default-view-descriptor';
import {CustomViewDescriptor} from '../../custom-view-descriptor';



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

	getNodeDetails(ast:any){
		return new DefaultViewDescriptor(this.rawResponse.attributes,this.rawResponse.references,this.rawResponse.nodeId);
	}
}