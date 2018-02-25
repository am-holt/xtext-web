import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { StartupComponent } from './startup/startup.component';
import { AppRoutingModule } from './/app-routing.module';
import { MessageService } from './mockServices/message.service';
import { MockAvailableLanguageService } from './mockServices/available-language.service';
import { EditorComponent } from './editor/editor.component';
import { ProjectsService } from './services/projects.service';
import { TreeViewComponent } from './treeView/tree-view.component';
import { DefaultNodeEditorComponent } from './default-node-editor/default-node-editor.component';
import { DefaultEinputComponent } from './default-node-editor/default-einput/default-einput.component';
import { EditService } from './services/edit.service';
import { AvailableLanguagesService } from './services/available-languages.service';
import { LanguageService } from './services/language.service';

@NgModule({
  declarations: [
    AppComponent,
    StartupComponent,
    EditorComponent,
    TreeViewComponent,
    DefaultNodeEditorComponent,
    DefaultEinputComponent,
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [
    MessageService,
    ProjectsService,
    MockAvailableLanguageService,
    EditService,
    AvailableLanguagesService,
    LanguageService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
