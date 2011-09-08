
package fr.esrf.tango.pogo.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.CheckType;

public class PogoDslCheckValidator extends org.eclipse.xtext.check.AbstractCheckValidator {

	public PogoDslCheckValidator() {
		configure();
	}
	
	protected void configure() {
		addCheckFile("fr::esrf::tango::pogo::validation::PogoDslFastChecks", CheckType.FAST);
		addCheckFile("fr::esrf::tango::pogo::validation::PogoDslChecks", CheckType.NORMAL);
		addCheckFile("fr::esrf::tango::pogo::validation::PogoDslExpensiveChecks", CheckType.EXPENSIVE);
	}
	
	@Override
	protected List<? extends EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(fr.esrf.tango.pogo.pogoDsl.PogoDslPackage.eINSTANCE);
		return result;
	}
	
}
