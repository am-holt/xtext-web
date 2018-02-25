import { Component, Input, OnInit, ViewEncapsulation } from '@angular/core';
import { NodeDetails, Attribute, Reference, NodeReference } from '../node-details';
import { EditService } from'../services/edit.service';
import {FileDetails } from '../file-details';
import {AbstractSyntaxTree } from '../abstract-syntax-tree';

@Component({
  selector: 'default-node-editor',
  templateUrl: './default-node-editor.component.html',
  styleUrls: ['./default-node-editor.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class DefaultNodeEditorComponent implements OnInit {

  constructor(
    private editService: EditService
  ) { }

  ngOnInit() {
  }

  @Input() projId: string;
  @Input() fileDetails: FileDetails;
  @Input() nodeDetails: NodeDetails;

  test(o: any) {
    console.log("edit" + o);
  }

  AttributeChange(att: Attribute, value: any): void {
    console.log(this.fileDetails);

    //What to do here? save?
    //Locally Validate
    this.editService.validateAttribute(this.projId, this.fileDetails, this.nodeDetails.nodeId, att.name, value).subscribe(a=>null);
    this.editService.updateAttribute(this.projId, this.fileDetails, this.nodeDetails.nodeId, att.name, value).subscribe(a=>null);
  }


  AddReferenceClick(ref: Reference): void {
    console.log("Add " + ref.name);
    this.editService.addReference(this.projId, this.fileDetails, this.nodeDetails.nodeId, ref.name).subscribe(a=>this.nodeDetails.ast.addChild(a));
  }

	RemoveReferenceClick(nodeId: string, ref:Reference) {
    console.log("Remove " + nodeId);
    this.editService.removeReference(this.projId, this.fileDetails, this.nodeDetails.nodeId, nodeId, ref.name)
    .subscribe(a=>{if(a){this.nodeDetails.ast.removeChild(nodeId)}else{console.error("Error removing reference")}});

	}

}
