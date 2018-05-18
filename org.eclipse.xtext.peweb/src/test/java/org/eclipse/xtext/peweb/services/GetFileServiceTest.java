package org.eclipse.xtext.peweb.services;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.eclipse.xtext.peweb.MockOpenResources;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;
import org.eclipse.xtext.web.example.statemachine.statemachine.*;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.InvalidRequestException.ResourceNotFoundException;

class GetFileServiceTest extends AbstractAPIServiceTester {

	//The Statemachine EMF model is used to build AST structures
	private StatemachineFactory statemachineFactory = StatemachineFactory.eINSTANCE;
	
	//Test to ensure if param is missing from an API call an exception is thrown
	void testMissingParameter(String param) {
		
		HashMap<String,EObject> mockFiles = new HashMap<String,EObject>();
		MockOpenResources mockOpenResources = new MockOpenResources(mockFiles);
		RemoveNodeReferenceService service = new RemoveNodeReferenceService(mockOpenResources);
				
		//Initialise the API call parameters
		HashMap<String,String> callParameters = new HashMap<String,String>();
		callParameters.put("serviceType", "get-file");		
		callParameters.put("project-name", "proj");
		callParameters.put("file-name", "file");
		//remove the parameter we want to miss!
		callParameters.remove(param);
		
		try {
			service.service(this.getServiceContext(callParameters));
			fail("No exception thrown");
		}catch(InvalidRequestException e) {
			
			//Assert that the error message mentions the missing parameter
			//By just using a contains we don't have to worry about exact messages changing
			assert(e.getMessage().contains(param));
		}
	}


	//Test to ensure no file-name parameter throws an exception
	@Test
	void testMissingFileNameParameter() {	
		testMissingParameter("file-name");
	}
	
	//Test to ensure no project-name parameter throws an exception
	@Test
	void testMissingProjNameParameter() {
		testMissingParameter("project-name");
	}	
}
