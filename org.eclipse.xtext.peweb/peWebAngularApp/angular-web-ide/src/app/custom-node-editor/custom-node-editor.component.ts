import { Component, Input, OnInit, ViewEncapsulation } from '@angular/core';

import { EditService } from'../services/edit.service';
import { FileDetails } from '../file-details';
import { AbstractSyntaxTree } from '../abstract-syntax-tree';
import { Observable } from 'rxjs/Rx';
import { CustomViewDescriptor } from '../custom-view-descriptor';
import {AttributeId} from '../attribute-id';


@Component({
  selector: 'custom-node-editor',
  templateUrl: './custom-node-editor.component.html',
  styleUrls: ['./custom-node-editor.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class CustomNodeEditorComponent implements OnInit {

	private timer;
	private readonly pollDelay = 5000;
	private readonly pollTime = 5000;
  private readonly attributeValueMap = new Map();
  


  constructor(
    private editService: EditService
  ) { }

  ngOnInit() {
  	
  }

  ngAfterViewInit() {
  	console.log("afterViewInit" );
  	eval("(X=>{"+this.nodeViewDescriptor.attributeControllers[0].setter+"})(\""+ this.nodeViewDescriptor.attributeControllers[0].initialValue + "\")" );

    //Initialise attribute caches and set them to initial values
    this.initAttributes();

    //Set up a timer to regularly poll attributes for changes
  	this.timer = Observable.timer(this.pollDelay,this.pollTime)
  	this.timer.subscribe((t) => this.onGetPoll());
  }

  @Input() projId: string;
  @Input() fileDetails: FileDetails;
  @Input() nodeViewDescriptor: CustomViewDescriptor;

  onGetPoll(){
    var changedValues : AttributeId[] = [];

  	for( var attribute of this.nodeViewDescriptor.attributeControllers){
      var currentValue = eval(attribute.getter);
      if( currentValue !== this.attributeValueMap.get(attribute.attributeId)){
        changedValues.push(attribute.attributeId);
        this.attributeValueMap.set(attribute.attributeId, currentValue);
        console.log("VALUE CHANGED: " + attribute.attributeId.name + " VAL: " + currentValue)
      }
  	}
  }

  initAttributes() {
    for(var attribute of this.nodeViewDescriptor.attributeControllers){

      //Set the attributeValue cache with the initial values
      this.attributeValueMap.set(attribute.attributeId,attribute.initialValue);

      //Set the attribute value in the view
      eval("(X=>{"+this.nodeViewDescriptor.attributeControllers[0].setter+"})")(this.nodeViewDescriptor.attributeControllers[0].initialValue);
    }
  }

  test() {
  	//console.log("(X=>{"+this.nodeDetails.view.attributesView[0].setter+"})(\""+ this.nodeDetails.attributes[0].value + "\")" );
  	//eval("(X=>{"+this.nodeDetails.view.attributesView[0].setter+"})(\""+ this.nodeDetails.attributes[0].value + "\")" );

    console.log("HI")

    console.log("BYE")
  }



  //TODO Display custom code


/*  AttributeChange(att: Attribute, value: any): void {
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

	}*/

}
