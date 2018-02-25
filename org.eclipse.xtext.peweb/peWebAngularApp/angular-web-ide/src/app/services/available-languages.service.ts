import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Rx';
import { of } from 'rxjs/observable/of';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';


import { MessageService } from './message.service';
import { LanguageSpec } from '../language-spec';
import { LANGUAGESPEC } from '../mockServices/mock-languages';


@Injectable()
export class AvailableLanguagesService {
	constructor(
		private messageService:MessageService,
		private http:HttpClient
	) {};

  getLanguages() : Observable<LanguageSpec> {

  	this.messageService.addMessage("Available Language Service: Getting available languages");
  	return of(LANGUAGESPEC)
  }
}
