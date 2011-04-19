package fr.esrf.tango.pogo;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
public class PogoDslStandaloneSetup implements ISetup {

	public static void doSetup() {
		new PogoDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new fr.esrf.tango.pogo.PogoDslRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.esrf.fr/tango/pogo/PogoDsl")) {
		EPackage.Registry.INSTANCE.put("http://www.esrf.fr/tango/pogo/PogoDsl", fr.esrf.tango.pogo.pogoDsl.PogoDslPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("pogo", resourceFactory);
		

	//TODO registration of EValidators should be added here, too


	}
}
