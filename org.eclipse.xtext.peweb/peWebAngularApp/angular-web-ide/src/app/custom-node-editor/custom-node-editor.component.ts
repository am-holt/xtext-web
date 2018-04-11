import { Component, EventEmitter, Input, Output, OnInit, OnChanges, AfterViewChecked, ViewEncapsulation } from '@angular/core';

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
	private readonly pollDelay = 500;
	private readonly pollTime = 5000;
  private readonly attributeValueMap = new Map();
  private setVal = true;



  constructor(
    private editService: EditService
  ) { }

  ngOnInit() {
  	//console.log("OnInit")
  }

  ngOnChanges(){
    this.setVal = true;
    //console.log("setVal tru");
  }

  ngAfterViewChecked(){
    //console.log("afterViewChecked")

    if(this.setVal){
      //Initialise attribute caches and set them to initial values
      //console.log("setVal");
      this.initAttributes();
      this.initReferences();
      this.setVal = false;  
    }
    
  }

  ngAfterViewInit() {
  	//console.log("afterViewInit" );
    //Set up a timer to regularly poll attributes for changes
    this.timer = Observable.timer(this.pollDelay,this.pollTime)
    this.timer.subscribe((t) => this.onGetPoll());    
  }

  @Input() projId: string;
  @Input() fileDetails: FileDetails;
  @Input() nodeViewDescriptor: CustomViewDescriptor;
  @Input() nodeAST : AbstractSyntaxTree;

  onGetPoll(){
    var changedValues : AttributeId[] = [];

  	for( var attribute of this.nodeViewDescriptor.attributeControllers){
      var currentValue = eval(attribute.getter);
      if( currentValue !== this.attributeValueMap.get(attribute.nodeId).get(attribute.attributeName)){
        changedValues.push(new AttributeId(attribute));
        this.attributeValueMap.get(attribute.nodeId).set(attribute.attributeName, currentValue);
        console.log("VALUE CHANGED: " + attribute.attributeName + " VAL: " + currentValue)
        this.editService.updateAttribute(this.projId,this.fileDetails,attribute.nodeId,attribute.attributeName,currentValue).subscribe();
      }
  	}
  }

  initReferences(){
    for(var reference of this.nodeViewDescriptor.referenceControllers){
      document.getElementById(reference.addButtonId).addEventListener("click",this.addReference(reference.nodeId,reference.referenceName));
      for(var referenceItem of reference.references){
        document.getElementById(referenceItem.removeButtonId).addEventListener("click",this.removeReference(reference.nodeId,reference.referenceName , referenceItem.nodeId,referenceItem.divId));
      }
    }
  }

  initAttributes() {
    for(var attribute of this.nodeViewDescriptor.attributeControllers){

      //Set the attributeValue cache with the initial values
      if(!this.attributeValueMap.has(attribute.nodeId)){
        this.attributeValueMap.set(attribute.nodeId, new Map());
      }
      this.attributeValueMap.get(attribute.nodeId).set(attribute.attributeName,attribute.initialValue);

      //Set the attribute value in the view
      eval("(X=>{"+attribute.setter+"})")(attribute.initialValue);
    }
  }

  addReference(nodeId:string, referenceName:string ) : EventListener {
    var editService = this.editService;
    var projId = this.projId;
    var fileDetails = this.fileDetails;
    var nodeAST = this.nodeAST;

    return function(){
      editService.addReference(projId,fileDetails,nodeId,referenceName).subscribe(a=>nodeAST.addChild(a,nodeId));
    }
  }

  removeReference(nodeId:string, referenceName:string, childId:string,  divId:string ): EventListener {
    var editService = this.editService;
    var projId = this.projId;
    var fileDetails = this.fileDetails;
    var nodeAST = this.nodeAST;

    return function(){
      editService.removeReference(projId,fileDetails,nodeId,childId,referenceName).subscribe(a=>nodeAST.removeChild(childId,nodeId));
      document.getElementById(divId).remove();
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
