package org.eclipse.xtext.peweb.valueconversion;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.ValueConverterWithValueException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class CODEENDValueConverter extends AbstractLexerBasedConverter<String> {

	@Override
	protected String toEscapedString(String value) {
		return ">>" + Strings.convertToJavaString(value, false) + ']';
	}

	
	//TODO Modify so escaped characters work correctly!
	@Override
	public String toValue(String string, INode node) {
		if (string == null)
			return null;
		try {
			if (string.length() == 1) {
				throw new ValueConverterWithValueException("CODENOTAG not surrounded by >> ]", node, "", null);
			}
			return string.substring(2, string.length()-1);
		} catch (IllegalArgumentException e) {
			throw new ValueConverterException(e.getMessage(), node, e);
		}
	}
	
}
