package fr.esrf.tango.pogo.generator;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtext.generator.GeneratorComponent.Outlet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import fr.esrf.tango.pogo.pogoDsl.PogoSystem;

public class PogoDslGeneratorComponent extends AbstractWorkflowComponent2 {
	private String modelSlot;
	private Injector injector;
	private Map<String,String> outlets = Maps.newHashMap();
	@Inject
	private IGenerator generator;
	
	public PogoDslGeneratorComponent () {
		injector = Guice.createInjector(new PogoGeneratorModule());
		injector.injectMembers(this);
	}
	
	@Override
	protected void checkConfigurationInternal(Issues issues) {
		checkRequiredConfigProperty("modelSlot", modelSlot, issues);
		super.checkConfigurationInternal(issues);
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		Object slotContent = ctx.get(modelSlot);
		if (slotContent==null) {
			throw new IllegalStateException("slot "+modelSlot+" is empty");
		}
		if (! (slotContent instanceof PogoSystem)) {
			throw new IllegalStateException("illegal object of type "+slotContent.getClass().getName()+" in slot "+modelSlot);
		}
		PogoSystem system = (PogoSystem) slotContent;
		
		generator.doGenerate(system.eResource(), getConfiguredFileSystemAccess());
		// system.eResource()
	}
	
	public void setModelSlot(String modelSlot) {
		this.modelSlot = modelSlot;
	}
	
	/**
	 * an outlet is defined by a name and a path.
	 * The generator will internally choose one of the configured outlets when generating a file.
	 * the given path defines the root directory of the outlet.
	 */
	public void addOutlet(Outlet out) {
		outlets.put(out.getOutletName(),out.getPath());
	}
	
	protected IFileSystemAccess getConfiguredFileSystemAccess() {
		final JavaIoFileSystemAccess configuredFileSystemAccess = injector.getInstance(JavaIoFileSystemAccess.class);
		for (Entry<String, String> outs : outlets.entrySet()) {
			configuredFileSystemAccess.setOutputPath(outs.getKey(), outs.getValue());
		}
		return configuredFileSystemAccess;
	}


}
