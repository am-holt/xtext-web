package org.eclipse.xtext.peweb.services;

import java.io.File;
import java.util.Map;
import org.eclipse.xtext.web.server.test.HashMapSession;
import org.eclipse.xtext.web.server.test.MockServiceContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.ISession;

public abstract class AbstractAPIServiceTester {

	
	protected IServiceContext getServiceContext(Map<String, String> parameters) {

		return new MockServiceContext(parameters, new HashMapSession());

	}
	
	
	protected boolean checkASTEqual(EObject a, EObject b) {
		EqualityHelper helper = new EcoreUtil.EqualityHelper();
		return  helper.equals(a, b);
	}

	
	protected String getFileLocation(String projectName, String fileName) {
		return "user-files" + File.separator + projectName + File.separator + fileName;
	}
}
