export class AbstractSyntaxTree{

	//Used to display as part of tree-view component
	expanded = false;

	name: string;
	nodeId: string;
	children: AbstractSyntaxTree[]; //Children of the tree

	//Used so the automatic deserialisation can be given methods
	constructor(ast:AbstractSyntaxTree){
		this.name = ast.name;
		this.nodeId = ast.nodeId;
		this.children = [];
		for (var c of ast.children){
			this.children.push(new AbstractSyntaxTree(c));
		}
	}

	toggle(): void {
		this.expanded = !this.expanded;
	}

	getToggleIcon() : string{
		if(this.children == null || this.children.length==0){
			return ' ';
		}
		else if(this.expanded){
			return '-';
		}else{
			return '+';
		}
	}

	addChild(child:AbstractSyntaxTree){
		this.children.push(child);
	}

	removeChild(removeId:string){
		for(var i = this.children.length; i>=0;i--){
			if(this.children[i].nodeId === removeId ){
				this.children.splice(i,1);
			}
		}
	}
}