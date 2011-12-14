package fr.esrf.tango.pogo.generator;

import java.util.List;

import net.danieldietrich.protectedregions.core.IRegionParser;
import net.danieldietrich.protectedregions.core.RegionParserBuilder;
import net.danieldietrich.protectedregions.core.RegionParserFactory;
import net.danieldietrich.protectedregions.support.ProtectedRegionSupport;
import net.danieldietrich.protectedregions.xtext.BidiJavaIoFileSystemAccess;

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.common.collect.Lists;
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
	  for (IRegionParser parser: createCppParsers()) {
		  support.addParser(parser);
	  }
	  support.addParser(createPythonParser());
	  BidiJavaIoFileSystemAccess fsa = new BidiJavaIoFileSystemAccess(support);
	  // fsa.setFilter(...); // (optional)
	  return fsa;
	}
	
	private IRegionParser createPythonParser () {
		IRegionParser parser = new RegionParserBuilder().name("py").addComment("#").ignoreCData('"', '\\')
				.ignoreCData('\'', '\\').setInverse(false).useOracle(new PogoPR()).build();
		return parser;
	}
	
	private List<IRegionParser> createCppParsers () {
		String[] extensions = new String[] {"cpp","hpp","h", "cxx","hxx"};
		
		List<IRegionParser> parsers = Lists.newArrayList();
		for (String extension: extensions) {
			IRegionParser parser = new RegionParserBuilder().name(extension).addComment("/*", "*/").addComment("//").ignoreCData('"', '\\')
					.ignoreCData('\'', '\\').setInverse(false).useOracle(new PogoPR()).build();
			parsers.add(parser);
		}
		return parsers;
	}
}
