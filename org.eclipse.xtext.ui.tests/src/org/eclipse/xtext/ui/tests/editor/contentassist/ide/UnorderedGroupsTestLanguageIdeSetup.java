/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguageRuntimeModule;
import org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguageStandaloneSetup;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class UnorderedGroupsTestLanguageIdeSetup extends UnorderedGroupsTestLanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new UnorderedGroupsTestLanguageRuntimeModule(), new UnorderedGroupsTestLanguageIdeModule());
	}
}
