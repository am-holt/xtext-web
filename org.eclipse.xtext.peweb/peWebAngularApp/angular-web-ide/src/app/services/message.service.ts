import { Injectable } from '@angular/core';

@Injectable()
export class MessageService {

	public messages :string[] = [];

	addMessage(msg: string) : void {
		this.messages.push(msg);
	}

	clearMessages() : void{
		this.messages = [];	
	}
}
