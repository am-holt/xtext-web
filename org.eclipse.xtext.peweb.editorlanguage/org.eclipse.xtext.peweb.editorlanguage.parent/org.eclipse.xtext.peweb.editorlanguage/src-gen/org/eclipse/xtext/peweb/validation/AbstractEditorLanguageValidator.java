/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package org.eclipse.xtext.peweb.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractEditorLanguageValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.eclipse.xtext.peweb.editorLanguage.EditorLanguagePackage.eINSTANCE);
		return result;
	}
	
}