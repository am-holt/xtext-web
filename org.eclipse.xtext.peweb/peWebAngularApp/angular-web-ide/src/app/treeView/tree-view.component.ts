import { Component,EventEmitter, Input, Output, OnInit, ViewEncapsulation } from '@angular/core';
import { AbstractSyntaxTree } from '../abstract-syntax-tree';

@Component({
  selector: 'tree-view',
  templateUrl: './tree-view.component.html',
  styleUrls: ['./tree-view.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class TreeViewComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  @Output() clickedNode = new EventEmitter<AbstractSyntaxTree>();

  @Input() treeRoot:AbstractSyntaxTree;

  onClick(){
  	this.clickedNode.emit(this.treeRoot);
  }

  //if a child is clicked we need to pass up it's clickedNode output as editor is only subscribed to root
  passUpClickedNode(ast:AbstractSyntaxTree){
  	this.clickedNode.emit(ast);
  }

}
