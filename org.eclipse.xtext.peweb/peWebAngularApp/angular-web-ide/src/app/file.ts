import { AbstractSyntaxTree } from './abstract-syntax-tree';
import { FileDetails } from './file-details'

export class File{
	treeRoot : AbstractSyntaxTree; //The abstract syntax tree which makes up the file
	details : FileDetails;

	constructor(treeRoot: AbstractSyntaxTree, details:FileDetails){
		this.treeRoot = treeRoot;
		this.details = details;
	}
}