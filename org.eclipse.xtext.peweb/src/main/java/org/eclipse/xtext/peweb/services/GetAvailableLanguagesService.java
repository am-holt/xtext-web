package org.eclipse.xtext.peweb.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;

import com.google.inject.Inject;

public class GetAvailableLanguagesService implements PEService {
	
	@Inject 
	public  FileExtensionProvider fileExtensionProvider;
	
	private class GetLanguagesResult implements IServiceResult{
		private List<LanguageDetails> languages = new ArrayList<LanguageDetails>();
		
		public void addLanguage(String name, String extension) {
			this.languages.add(new LanguageDetails(name,extension));
		}
	}
	
	private class LanguageDetails{
		String Name;
		String FileExtension;
		
		public LanguageDetails(String name, String extension) {
			this.Name = name;
			this.FileExtension = extension;
		}
	}
	
	public IServiceResult service(IServiceContext serviceContext) {
		GetLanguagesResult result =  new GetLanguagesResult();
		result.addLanguage(this.fileExtensionProvider.getPrimaryFileExtension(), this.fileExtensionProvider.getPrimaryFileExtension());
		return result;
		
		
	}

	

}
