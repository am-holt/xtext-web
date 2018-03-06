package org.eclipse.xtext.peweb.customview.generatoritems;

import java.util.Map;

public abstract interface JavascriptGeneratorItem {

	public String generateJs(Map<String,String> idMap);
	
}
