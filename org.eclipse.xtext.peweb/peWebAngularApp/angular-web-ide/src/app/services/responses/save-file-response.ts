export class SaveFileRawResponse{
  success: boolean;
  message : string;
}

export class SaveFileResponse{
  rawResponse: SaveFileRawResponse;

  constructor(rawResponse:SaveFileRawResponse){
    this.rawResponse = rawResponse;
  }

  getSuccess(): boolean{
    return this.rawResponse.success;
  }

  getMessage():string{
    return this.rawResponse.message;
  }
}