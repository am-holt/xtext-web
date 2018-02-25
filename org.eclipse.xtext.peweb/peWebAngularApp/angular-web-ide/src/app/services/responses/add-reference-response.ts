import { AbstractSyntaxTree } from '../../abstract-syntax-tree';

export class AddReferenceRawResponse{
	ast: AbstractSyntaxTree;
}

export class AddReferenceResponse{

	rawResponse: AddReferenceRawResponse;
	annotatedAst: AbstractSyntaxTree;

	constructor(rawResponse:AddReferenceRawResponse){
		this.rawResponse = rawResponse;
		this.annotatedAst = new AbstractSyntaxTree(this.rawResponse.ast);
	}

	getAst():AbstractSyntaxTree {
		return this.annotatedAst;
	}
}
