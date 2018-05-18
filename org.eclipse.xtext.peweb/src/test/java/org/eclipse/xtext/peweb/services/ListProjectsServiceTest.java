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

class ListProjectsServiceTest extends AbstractAPIServiceTester {

	//The Statemachine EMF model is used to build AST structures
	private StatemachineFactory statemachineFactory = StatemachineFactory.eINSTANCE;
	
	//Test to ensure if an exception is thrown
	@Test
	void testNoError() {
		
		HashMap<String,EObject> mockFiles = new HashMap<String,EObject>();
		MockOpenResources mockOpenResources = new MockOpenResources(mockFiles);
		RemoveNodeReferenceService service = new RemoveNodeReferenceService(mockOpenResources);
				
		//Initialise the API call parameters
		HashMap<String,String> callParameters = new HashMap<String,String>();
		callParameters.put("serviceType", "ls-projects");
		
		
		service.service(this.getServiceContext(callParameters));
		
	}
}
