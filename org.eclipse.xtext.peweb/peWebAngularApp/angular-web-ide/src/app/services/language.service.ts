
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Rx';
import { of } from 'rxjs/observable/of';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';


import { MessageService } from '..//mockServices/message.service';
import { LanguageSpec } from '../language-spec';
import { GetLanguageRawResponse } from './responses/get-language-response';


@Injectable()
export class LanguageService {
	
	constructor(
		private messageService:MessageService,
		private http:HttpClient
	) {};

	private readonly serviceUrl : string = `/pe-service`;

  getLanguages() : Observable<LanguageSpec[]> {

  	this.messageService.addMessage("Available Language Service: Getting available languages");
	  return this.http.get<GetLanguageRawResponse>(this.serviceUrl,
      {params: new HttpParams()
      	.append('serviceType','ls-languages')
      }).map(a => {console.log(  a.languages);
      		console.log(a.languages[0].Name);
      		return [new LanguageSpec(a.languages[0].Name,a.languages[0].FileExtension)]});
  }
}
