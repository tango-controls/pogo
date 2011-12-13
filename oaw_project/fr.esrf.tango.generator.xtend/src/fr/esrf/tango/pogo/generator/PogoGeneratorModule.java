package fr.esrf.tango.pogo.generator;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Binder;
import com.google.inject.Inject;

public class PogoGeneratorModule extends AbstractGenericModule {
//	@Inject
//	IOutputConfigurationProvider outputConfigurationProvider;
	
//	public void configureIFileSystemAccess (Binder binder) {
//		JavaIoFileSystemAccess fsa = new JavaIoFileSystemAccess();
//		IOutputConfigurationProvider outputConfigurationProvider = 
//				binder.getProvider(IOutputConfigurationProvider.class).get();
//		for (OutputConfiguration cfg : outputConfigurationProvider.getOutputConfigurations()) {
//			fsa.getOutputConfigurations().put(cfg.getName(), cfg);
//		}
//		binder.bind(IFileSystemAccess.class).toInstance(fsa);
//	}
//	
	public Class<? extends IGenerator> bindIGenerator () {
		return PogoDslGenerator.class;
	}
}
