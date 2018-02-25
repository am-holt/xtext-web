export class UpdateNodeRawResponse{
  success: boolean;
  message : string;
}

export class UpdateNodeResponse{
  rawResponse: UpdateNodeRawResponse;

  constructor(rawResponse:UpdateNodeRawResponse){
    this.rawResponse = rawResponse;
  }

  getSuccess(): boolean{
    return this.rawResponse.success;
  }

  getMessage():string{
    return this.rawResponse.message;
  }
}