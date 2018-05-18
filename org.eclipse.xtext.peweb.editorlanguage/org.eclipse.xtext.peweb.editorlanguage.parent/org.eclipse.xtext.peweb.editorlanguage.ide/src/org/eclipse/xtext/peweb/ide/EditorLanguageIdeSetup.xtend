/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package org.eclipse.xtext.peweb.ide

import com.google.inject.Guice
import org.eclipse.xtext.peweb.EditorLanguageRuntimeModule
import org.eclipse.xtext.peweb.EditorLanguageStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class EditorLanguageIdeSetup extends EditorLanguageStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new EditorLanguageRuntimeModule, new EditorLanguageIdeModule))
	}
	
}