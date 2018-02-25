import {AbstractSyntaxTree} from './abstract-syntax-tree';

export class Attribute{
	type:string;
	name:string;
	value:string;
}

export class Reference{
	name:string;
	nodes:NodeReference[];
}

export class NodeReference{
	name:string;
	nodeId: string;
}

export class NodeDetails{
	attributes: Attribute[];
	references: Reference[];
	nodeId: string;
	ast: AbstractSyntaxTree;
	constructor(atts:Attribute[],refs:Reference[],id:string,ast:AbstractSyntaxTree){
		this.attributes = atts;
		this.references = refs;
		this.nodeId = id;
		this.ast = ast;
	}
}