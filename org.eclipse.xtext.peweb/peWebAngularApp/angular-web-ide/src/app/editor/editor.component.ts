import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
import { LanguageSpec } from '../language-spec';
//import { MockAvailableLanguageService } from '../mockServices/available-language.service';
import {LanguageService } from '../services/language.service'
import { ProjectsService } from '../services/projects.service';
import { Project } from '../project';
import { TreeViewComponent } from '../treeView/tree-view.component';
import { File} from '../file';
import { FileDetails } from '../file-details';
import { AbstractSyntaxTree } from '../abstract-syntax-tree';

import {DefaultViewDescriptor} from '../default-view-descriptor';
import {CustomViewDescriptor} from '../custom-view-descriptor';
import {ViewDescriptor} from '../view-descriptor';

@Component({
  selector: 'app-editor',
  templateUrl: './editor.component.html',
  styleUrls: ['./editor.component.css']
})
export class EditorComponent implements OnInit {

	project : Project;
  openFile : File; //open file if is one
  nodeViewDescriptor : ViewDescriptor; //Data about current node, used to draw the nodeEdit
  valid : boolean; //Is the current file state valid?
  openNodeAST: AbstractSyntaxTree; //the node currently being projected (null if no such node)

  constructor(
  	private route:ActivatedRoute,
  	private availableLangService: LanguageService,
  	private projectService: ProjectsService 
  ) { }

  ngOnInit() {

  	const id = this.route.snapshot.paramMap.get('id');
  	console.log(id);
    this.projectService.getProject(id).subscribe(prj => this.project = prj);
    this.valid = true;
  }

  loadFile(file:FileDetails){
    //this.openFile = file;
    console.log("Opened "+ file.name)
    this.projectService.getFile(this.project.details.id,file).subscribe(a=>this.openFile = a);
  }

  newFileClick(){
   var name : string = "";
    while(name == "" ){
      var name = prompt("Please enter file name:");
      if (name == null) {
        return //user cancelled the request
      } else if(this.project.files.find(file => file.getNameWithoutExtension() == name) != null){
        alert("File name already exists");
        name = "";  
      }
      
    }
    this.projectService.addFileToProject(this.project.details.id, name).subscribe(fileDetail => this.project.files.push(fileDetail));
  }

  getNodeView(node:AbstractSyntaxTree){
    this.projectService.getNode(this.project.details.id,this.openFile.details,node).subscribe(a =>
      {
        this.openNodeAST = node;
        this.nodeViewDescriptor = a;
      })
  }

  saveFileClick(){
    this.projectService.saveFile(this.project.details.id,this.openFile.details).subscribe(a=>null);
  }

  isDefaultView(obj :any){
    return (obj.type == DefaultViewDescriptor.DEFAULT_TYPE);
  }

  isCustomView(obj :ViewDescriptor){
    return (obj.type == CustomViewDescriptor.CUSTOM_TYPE);
  }

  //Refreshes the node view for the currently projected node
  refreshView(){
    this.getNodeView(this.openNodeAST);
  }
}
