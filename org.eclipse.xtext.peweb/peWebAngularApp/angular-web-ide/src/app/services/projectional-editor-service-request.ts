import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';

@Injectable()
export class ProjectionalEditorServiceRequest {
	
	private readonly serviceUrl : string = `/pe-service`;
	
	httpType: string;
	params : HttpParams = new HttpParams();

	constructor(	type:string, service:string){

	}

}