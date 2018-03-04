package org.eclipse.xtext.peweb.customview.generatoritems;

public class CodeLiteral implements GeneratorItem, JavascriptGeneratorItem {

	private final String HtmlString;
	
	public CodeLiteral(String str) {
		this.HtmlString = str;
	}
}
