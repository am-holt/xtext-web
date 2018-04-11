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

	findChild(findId:string){
		var ast = null;
		if(this.nodeId == findId){
			return this;
		}else{
			for(var child of this.children){
				var childResult = child.findChild(findId);
				if(childResult !=null){
					return childResult;
				}
			}
		}
		return null;
	}

	addChild(child: AbstractSyntaxTree, addId?:string,){
		var toModify = this;
		if(addId != null){
			toModify = this.findChild(addId);
			if(toModify == null){
				throw new Error("Couldn't find a node with Id " + addId);
			}
		}
		toModify.children.push(child);
	}

	removeChild(removeId:string, rootId?:string){
		var toModify = this;
		if(rootId != null){
			toModify = this.findChild(rootId);
			if(toModify == null){
				throw new Error("Couldn't find a node with Id " + rootId);
			}
		}
		console.log("remove, len:" + this.children.length);
		for(var i = this.children.length -1; i>=0;i--){
			if(this.children[i].nodeId === removeId ){
				this.children.splice(i,1);
				console.log(this.children.length);
			}
		}
	}

	update(ast: AbstractSyntaxTree){
		this.name = ast.name;
		this.nodeId = ast.nodeId;
		this.children = ast.children;
	}
}