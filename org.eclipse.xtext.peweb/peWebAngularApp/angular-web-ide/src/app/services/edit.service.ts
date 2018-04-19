import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';


import { Observable } from 'rxjs/Rx';
import { of } from 'rxjs/observable/of';
import 'rxjs/add/operator/map';

import { MessageService } from '../mockServices/message.service';
import { ProjectDetails } from '../project-details';
import { LanguageSpec } from '../language-spec';
import { Project } from '../project';
import { FileDetails } from '../file-details';
import { File } from '../file';
import { AbstractSyntaxTree } from '../abstract-syntax-tree';

import { ValidNodeResponse, ValidNodeRawResponse  } from './responses/valid-node-response';
import { UpdateNodeResponse, UpdateNodeRawResponse  } from './responses/update-node-response';
import { AddReferenceRawResponse, AddReferenceResponse } from './responses/add-reference-response';
import { RemoveReferenceRawResponse, RemoveReferenceResponse } from './responses/remove-reference-response';


@Injectable()
export class EditService {

  constructor(
    private messageService : MessageService,
    private http : HttpClient
    ) { }


  private readonly serviceUrl : string = `/pe-service`;

  validateAttribute(projId:string, fileDetails:FileDetails, nodeId:string, attributeName:string, newValue:any) : Observable<ValidNodeResponse>{
  	this.log("Validate Attribute: " + attributeName);
    return this.http.get<ValidNodeRawResponse>(this.serviceUrl,
      {params: new HttpParams()
      	.append('serviceType','validate-node')
      	.append('file-name', fileDetails.name)
      	.append('project-name',projId)
      	.append('node-id',nodeId)
        .append('attribute-name',attributeName)
        .append('value',newValue)
      }).map( a => new ValidNodeResponse(a));
  }

  updateAttribute(projId: string, fileDetails: FileDetails, nodeId: string, attributeName: string, newValue: any): Observable<UpdateNodeResponse> {
    //TODO change to post
    this.log("Update attribiute: "  + attributeName + " to " +newValue);
    console.log("updating attribute")
    return this.http.get<UpdateNodeRawResponse>(this.serviceUrl,
      {
        params: new HttpParams()
          .append('serviceType', 'update-node')
          .append('file-name', fileDetails.name)
          .append('project-name', projId)
          .append('node-id', nodeId)
          .append('attribute-name', attributeName)
          .append('value', newValue)
      }).map(a => new UpdateNodeResponse(a));
  }

  addReference(projId: string, fileDetails: FileDetails, nodeId: string, referenceName: string, type?:string): Observable<AbstractSyntaxTree> {
    this.log("Add ref: " + type)
    var paramsparams = new HttpParams()
          .append('serviceType', 'add-reference')
          .append('file-name', fileDetails.name)
          .append('project-name', projId)
          .append('node-id', nodeId)
          .append('reference-name', referenceName)

    if(type != null){
      paramsparams = paramsparams.append('child-type',type);
    }
          
    return this.http.get<AddReferenceRawResponse>(this.serviceUrl,
      {
        params: paramsparams
      }).map(a => new AddReferenceResponse(a).getAst()); 
  }

  addCrossReference(projId: string, fileDetails: FileDetails, nodeId: string, referenceName: string, childId:string): Observable<any> {
    this.log("Add crossRef")
    var paramsparams = new HttpParams()
          .append('serviceType', 'add-reference')
          .append('file-name', fileDetails.name)
          .append('project-name', projId)
          .append('node-id', nodeId)
          .append('reference-name', referenceName)
          .append('cross-reference', 'true')
          .append('child-id',childId)
          
    return this.http.get<AddReferenceRawResponse>(this.serviceUrl,
      {
        params: paramsparams
      }); 
  }

  removeReference(projId: string, fileDetails: FileDetails, nodeId: string, toRemoveId: string, referenceName:string): Observable<boolean> {
    this.log("Remove ref: "  + toRemoveId);
    return this.http.get<RemoveReferenceRawResponse>(this.serviceUrl,
      {
        params: new HttpParams()
          .append('serviceType', 'remove-reference')
          .append('file-name', fileDetails.name)
          .append('project-name', projId)
          .append('node-id', nodeId)
          .append('reference-id', toRemoveId)
          .append('reference-name', referenceName)
      }).map(a => new RemoveReferenceResponse(a).getSuccess()); 
  }


  private log(message:string):void{
    this.messageService.addMessage("Edit Service: " + message);
  }



/*
  validateNode(projId:string, fileDetails:FileDetails, nodeId:string) : Observable<ValidNodeResponse>{
    return this.http.get<ValidNodeRawResponse>(this.serviceUrl,
      {params: new HttpParams()
        .append('serviceType','valid-node')
        .append('file-name', fileDetails.getFullName())
        .append('project-name',projId)
        .append('node-id',nodeId)
      }).map( a => new ValidNodeResponse(a));
  }*/


  /*
  TO WRITE:

  validateNode(projID, nodeID, fileDetails)
	SaveFile(fileDetails, projID)


	*/

}
