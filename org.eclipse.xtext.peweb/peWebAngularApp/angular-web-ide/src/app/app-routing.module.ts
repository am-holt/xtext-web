import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StartupComponent } from './startup/startup.component';
import { EditorComponent } from './editor/editor.component';

const routes: Routes = [
	{path:'startup', component:StartupComponent },
	{path: 'edit/:id', component:EditorComponent},
	{path: '', redirectTo:'/startup', pathMatch:'full'}
]


@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
