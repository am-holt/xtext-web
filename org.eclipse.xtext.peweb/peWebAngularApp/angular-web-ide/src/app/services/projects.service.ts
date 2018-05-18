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
import { ViewDescriptor } from '../view-descriptor';
import { CustomViewDescriptor } from '../custom-view-descriptor';
import { GetNodeResponse, GetNodeRawResponse } from './responses/get-node-response';
import { SaveFileResponse, SaveFileRawResponse } from './responses/save-file-response';

//TODO Delete
import{ MOCKNODEDETAILS   } from '../mockServices/mock-node-details'

@Injectable()
export class ProjectsService {

  constructor(
    private messageService : MessageService,
    private http : HttpClient
    ) { }

  private readonly serviceUrl : string = `/pe-service`;
  
  getProjectDetails(): Observable<ProjectDetails[]> {
  	this.log("getting project details");
  	return this.http.post(this.serviceUrl, {},
      {params: new HttpParams().append('serviceType','ls-projects')})
      .map( res => <String[]>(res["projectnames"])).map(a =>a.map(this.stringToProjectDetails));
  }

  private stringToProjectDetails(s:string ) : ProjectDetails{
    return {id:s, name: s}
  }

  addNewProject(name: string) : Observable<string>{
    this.log("Add new project: " + name);
  	var b : Observable<string> = this.http.post(this.serviceUrl,{},
      {params: new HttpParams().append('serviceType', 'add-project').append('name',name)}).map(a=>name);
    
    return b;
  }

  getProject(id:string) : Observable<Project>{    
    this.log("retrieving project id: " + id);
    var b : Observable<Project> = this.http.post(this.serviceUrl,{},
      {params: new HttpParams().append('serviceType', 'get-project').append('name',id)})
      .map(a=> a["Files"])
      .map<string[],Project>(ls => {var files = ls.map(a=> new FileDetails(a)); return {details:{name:id,id:id},files:files}});
    return b;
  }

  getFile(projId:string, fileDetails:FileDetails): Observable<File>{
    this.log("Get file: " + fileDetails.name);
    var a = this.http.post(this.serviceUrl,{},
      {params: new HttpParams().append('serviceType','get-file').append('file-name', fileDetails.name).append('project-name',projId)})
      .map(a=> new File(new AbstractSyntaxTree(a["ast"]), fileDetails));
    return a;
  }


  //TODO refactor out into separate service? 
  //TODO Modify service so it returns something other than default node response
  getNode(projId: string, fileDetails:FileDetails, node:AbstractSyntaxTree): Observable<ViewDescriptor>{
    this.log("Get Node: " + node.nodeId);
    return this.http.post<ViewDescriptor>(this.serviceUrl,{},
      {params: new HttpParams().append('serviceType','get-node')
      .append('file-name', fileDetails.name)
      .append('project-name',projId)
      .append('node-id',node.nodeId)});
  }


  //TODO delete once done
  mockgetNode(projId: string, fileDetails:FileDetails, node:AbstractSyntaxTree): Observable<ViewDescriptor>{
    console.log("Instance of (proj serv): " + (MOCKNODEDETAILS.DeclarationMain instanceof CustomViewDescriptor ));
    
    return of(MOCKNODEDETAILS.DeclarationMain );

  }

  addFileToProject(projId:string , fileName:string) : Observable<FileDetails>{
    this.log("adding file "+ fileName + "to project " + projId);
    
    var b : Observable<FileDetails> = this.http.post(this.serviceUrl,{},
      {params: new HttpParams().append('serviceType', 'add-file')
      .append('name',fileName)
      .append('project-name',projId)})
      .map(a => new FileDetails(a["name"]));
    return b;
  }

  saveFile(projId:string , fileDetails:FileDetails) : Observable<SaveFileResponse>{
    this.log("saving file "+ fileDetails.name + " to project " + projId);
    
    return this.http.post<SaveFileRawResponse>(this.serviceUrl,{},
      {params: new HttpParams().append('serviceType', 'save-file')
      .append('file-name',fileDetails.name)
      .append('project-name',projId)})
      .map(a => new SaveFileResponse(a));
  }
  
  private log(message:string):void{
    this.messageService.addMessage("Projects Service: " + message);
  }

  /**
   * Handle Http operation that failed.
   * Let the app continue.
   * @param operation - name of the operation that failed
   * @param result - optional value to return as the observable result
   */
  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      console.error(error);
      this.log(`${operation} failed: ${error.message}`);
      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}
