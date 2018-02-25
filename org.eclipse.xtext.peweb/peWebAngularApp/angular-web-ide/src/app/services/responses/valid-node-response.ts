export class ValidNodeRawResponse{
	valid: boolean;
	message : string;
}

export class ValidNodeResponse{
	rawResponse: ValidNodeRawResponse;

	constructor(rawResponse:ValidNodeRawResponse){
		this.rawResponse = rawResponse;
	}

	getValid(): boolean{
		return this.rawResponse.valid;
	}

	getMessage():string{
		return this.rawResponse.message;
	}
}