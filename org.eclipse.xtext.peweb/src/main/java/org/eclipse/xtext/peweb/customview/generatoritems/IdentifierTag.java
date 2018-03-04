package org.eclipse.xtext.peweb.customview.generatoritems;

public class IdentifierTag implements GeneratorItem, JavascriptGeneratorItem  {

	public final String Identifier;
	
	public IdentifierTag(String id) {
		this.Identifier = id;
	}
	
}
