package fr.esrf.tango.pogo.generator;

import net.danieldietrich.protectedregions.core.RegionParserBuilder;
import net.danieldietrich.protectedregions.core.RegionParserFactory;
import net.danieldietrich.protectedregions.support.ProtectedRegionSupport;
import net.danieldietrich.protectedregions.xtext.BidiJavaIoFileSystemAccess;

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Provides;

import fr.esrf.tango.pogo.generator.pr.PogoPR;

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
	
	@Provides
	public JavaIoFileSystemAccess createJavaIoFileSystemAccess(ProtectedRegionSupport support) {
	  support.addParser(RegionParserFactory.createJavaParser(new PogoPR(),false), ".java");
	  support.addParser(RegionParserFactory.createXmlParser(), ".xml", ".xsd");
	  support.addParser(new RegionParserBuilder().name("cpp").addComment("/*", "*/").addComment("//").ignoreCData('"', '\\')
				.ignoreCData('\'', '\\').setInverse(false).useOracle(new PogoPR()).build());
	  BidiJavaIoFileSystemAccess fsa = new BidiJavaIoFileSystemAccess(support);
	  // fsa.setFilter(...); // (optional)
	  return fsa;
	}
}
