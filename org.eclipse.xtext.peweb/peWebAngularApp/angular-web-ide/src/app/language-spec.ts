export class LanguageSpec{
	name: string
	fileExtension : string

	constructor(name: string, ext: string){
		this.name = name;
		this.fileExtension = ext;
	}
}