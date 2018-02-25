import {LanguageSpec} from '../../language-spec'

export class GetLanguageRawResponse{
	languages: LanguageSpec1[]

}

class LanguageSpec1{
	Name:string;
	FileExtension:string;
}