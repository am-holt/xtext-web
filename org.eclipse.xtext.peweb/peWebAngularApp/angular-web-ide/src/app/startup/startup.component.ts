import { Component, OnInit } from '@angular/core';
import { LanguageSpec } from '../language-spec';
//import { MockAvailableLanguageService } from '../mockServices/available-language.service';
import { LanguageService } from '../services/language.service';
import { ProjectDetails } from '../project-details';
import { Router } from '@angular/router';
import { ProjectsService} from '../services/projects.service';

@Component({
  selector: 'app-startup',
  templateUrl: './startup.component.html',
  styleUrls: ['./startup.component.css']
})

export class StartupComponent implements OnInit {
  constructor( 
    private availableLangService : LanguageService,
    private projectsService : ProjectsService,
    private router : Router
  ) { }

  availableLanguages : LanguageSpec[] = [];
  existingProjects : ProjectDetails[];

  ngOnInit() {
  	this.getAvailableLanguages();
    this.getExistingProjects();
  }

  getExistingProjects(): void{
    this.projectsService.getProjectDetails().subscribe(projects => this.existingProjects = projects);
    console.log("test");
  }

  getAvailableLanguages() :void {
  	this.availableLangService.getLanguages().subscribe(langs => {this.availableLanguages = langs});
  }

  newProjectClick(){
    //this.projectsService.test();
    var name : string = "";
    
    while(name == "" ){
      var name = prompt("Please enter your project name:");
      if (name == null) {
        return //user cancelled the request
      } else if(this.existingProjects.find(project => project.name == name) != null){
        alert("Name already exists");
        name = "";  
      }
      
    }
    var id = this.projectsService.addNewProject(name);
    id.subscribe(id => this.router.navigate(['edit/' + id]));

  }
}
