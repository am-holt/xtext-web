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
import { Attribute, NodeDetails } from '../node-details';
import { AbstractSyntaxTree } from '../abstract-syntax-tree';


@Component({
  selector: 'app-editor',
  templateUrl: './editor.component.html',
  styleUrls: ['./editor.component.css']
})
export class EditorComponent implements OnInit {

	project : Project;
  openFile : File; //open file if is one
  nodeDetails : NodeDetails; //Data about current node, used to draw the nodeEdit
  valid : boolean; //Is the current file state valid?

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
    console.log("test");
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

  getNodeEditor(node:AbstractSyntaxTree){
    this.projectService.getNode(this.project.details.id,this.openFile.details,node).subscribe(a => this.nodeDetails = a);
  }

  saveFileClick(){
    this.projectService.saveFile(this.project.details.id,this.openFile.details).subscribe(a=>null);
  }
}
