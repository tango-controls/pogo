
package fr.esrf.tango.pogo;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PogoDslStandaloneSetup extends PogoDslStandaloneSetupGenerated{

	public static void doSetup() {
		new PogoDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

