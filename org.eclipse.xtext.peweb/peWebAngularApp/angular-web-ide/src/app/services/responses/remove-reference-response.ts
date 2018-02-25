import { AbstractSyntaxTree } from '../../abstract-syntax-tree';

export class RemoveReferenceRawResponse{
	success: boolean;
}

export class RemoveReferenceResponse{

	rawResponse: RemoveReferenceRawResponse;

	constructor(rawResponse:RemoveReferenceRawResponse){
		this.rawResponse = rawResponse;
	}

	getSuccess(): boolean{ 
		return this.rawResponse.success
	}
}
