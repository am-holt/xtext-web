export class FileDetails{
	name: string;
	

	constructor(name:string){
		this.name = name;
	}

	public getExtension() : string {
		return this.name.substring( this.name.lastIndexOf('.'));
	}

	public getNameWithoutExtension(): string{
		return this.name.substring(0, this.name.lastIndexOf('.'));
	}
}