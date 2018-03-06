package org.eclipse.xtext.peweb.valueconversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;

import com.google.inject.Inject;

public class MyTerminalConverters extends DefaultTerminalConverters{
    
	@Inject
    private CODENOTAGValueConverter codeNoTagValueConverter;
    
	@ValueConverter(rule = "CODENOTAG")
	public IValueConverter<String> CODENOTAG() {
		return codeNoTagValueConverter;
	}
	
	@Inject
    private CODESTARTValueConverter codeStartValueConverter;
    
	@ValueConverter(rule = "CODESTART")
	public IValueConverter<String> CODESTART() {
		return codeStartValueConverter;
	}
	
	@Inject
    private CODEMIDValueConverter codeMidValueConverter;
    
	@ValueConverter(rule = "CODEMID")
	public IValueConverter<String> CODEMID() {
		return codeMidValueConverter;
	}
	
	@Inject
    private CODEENDValueConverter codeEndValueConverter;
    
	@ValueConverter(rule = "CODEEND")
	public IValueConverter<String> CODEEND() {
		return codeEndValueConverter;
	}
}
