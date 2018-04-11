import { CustomViewDescriptor, AttributeController } from '../custom-view-descriptor';



export class MOCKNODEDETAILS{
	

	static htmlView : string = '<button (click)="test()" id="DynamicTest">DynamicTest</button><h1>Greetings!</h1> <input type="text" id="inputId">'
	
	static attributeController : AttributeController = {
				getter:'document.getElementById("inputId").value',
				setter:'document.getElementById("inputId").value = X',
				validator:'true', 
				attributeName:'name',
				nodeId:'2',
				initialValue : 'INITIAL VALUE'
	}

	public static DeclarationMain : CustomViewDescriptor = 
		new CustomViewDescriptor( MOCKNODEDETAILS.htmlView, [MOCKNODEDETAILS.attributeController], []);
		 
}
