import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';


import { Observable } from 'rxjs/Rx';
import { of } from 'rxjs/observable/of';
import 'rxjs/add/operator/map';

import { MessageService } from './message.service';
import { ProjectDetails } from '../project-details';
import {LanguageSpec} from '../language-spec';
import { PROJECTS } from './mock-projects';
import { Project } from '../project';
import { FileDetails } from '../file-details';

@Injectable()
export class ProjectsService {

  constructor(
    private messageService : MessageService,
    private http : HttpClient
    ) { }
  projects : Project[] = PROJECTS;
  newProjectID = 'newproj';
  newProjectIDCount = 1;

  getProjectDetails(): Observable<ProjectDetails[]> {
  	this.log("getting project details");
  	return of(this.projects.map(proj => proj.details));
  }

  addNewProject(name: string ) : Observable<string>{
  	var newId = this.newProjectID + this.newProjectIDCount;
  	this.newProjectIDCount += 1;
  	this.log("adding project " + name);
  	this.projects.push({details:{name:name, id:newId},files: []});
  	return of(newId);
  }

  getProject(id:string) : Observable<Project>{
    this.log("retrieving project id: " + id);
    return of(this.projects.find(proj => proj.details.id == id));
  }


  addFileToProject(id:string , fileName:string) : Observable<FileDetails>{
    this.log("adding file "+ fileName + "to project " + id);
    var file : FileDetails = new FileDetails(fileName + ".small");
    
    var proj = this.projects.find(p=>p.details.id == id);
    if(proj.files == null){
      proj.files = [];  
    }
    this.projects.find(p=> p.details.id == id).files.push(file);
    return of(file);
  }

  test() : void {
    this.log("test:" );
    //this.http.get(`/pe-service`).subscribe(response => console.log(response["message"]));
    
  }

  private log(message:string):void{
    this.messageService.addMessage("Projects Service: " + message);
  }
}
