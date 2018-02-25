import {ProjectDetails} from '../project-details';
import { Project} from '../project';
import {AbstractSyntaxTree} from '../abstract-syntax-tree';
import {FileDetails} from '../file-details';

export const PROJECTS : Project[] = [
	{ details: {name:"AlexsProj", id:"aproj"}, files:
		[
			new FileDetails("testFile.small")
		] 
	},
	{ details: {name:"Test2Project", id:"bproj"}, files: null}
]