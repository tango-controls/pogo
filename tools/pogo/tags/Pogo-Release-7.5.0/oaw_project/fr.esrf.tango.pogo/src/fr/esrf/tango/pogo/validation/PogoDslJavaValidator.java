package fr.esrf.tango.pogo.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import com.google.inject.Inject;

import fr.esrf.tango.pogo.Extensions;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;
import fr.esrf.tango.pogo.pogoDsl.Property;
 

public class PogoDslJavaValidator extends AbstractPogoDslJavaValidator {
	@Inject
	private Extensions ext;
	
	/**
	 * Adds location information to the message
	 */
	@Override
	protected void error(String message, EObject source,
			EStructuralFeature feature, String code, String... issueData) {
		super.error(message + ": "+ext.loc(source), source, feature, code, issueData);
	}
	
	@Check (CheckType.FAST)
	public void checkClassDescription (PogoDeviceClass element) {
		if (element.getDescription()==null) {
			error ("no class description specified", element, PogoDslPackage.Literals.POGO_DEVICE_CLASS__DESCRIPTION, IssueCodes.ERROR_NO_CLASS_DESCRIPTION);
		}
	}
	
	/**
	 * Checks the following conditions for a Command:
	 * <ul>
	 * <li>Command name must start with capital letter
	 * <li>Input type is specified
	 * <li>Output type is specified
	 * </ul>
	 * @param element
	 */
	@Check (CheckType.FAST)
	public void checkCommand (Command element) {
		if (!Character.isUpperCase(element.getName().charAt(0))) {
			error ("command names must start with a capital letter", element, PogoDslPackage.Literals.COMMAND__NAME, IssueCodes.ERROR_COMMAND_NAME_START_UPPERCASE);
		}
		if (element.getArgin()==null) {
			error ("no input type specified", element, PogoDslPackage.Literals.COMMAND__ARGIN, IssueCodes.ERROR_COMMAND_INPUTTYPE_MISSING);
		}
		if (element.getArgout()==null) {
			error ("no output type specified", element, PogoDslPackage.Literals.COMMAND__ARGOUT, IssueCodes.ERROR_COMMAND_OUTPUTTYPE_MISSING);
		}
	}
	
	@Check (CheckType.FAST)
	public void checkPropertyName (Property element) {
		if (!Character.isUpperCase(element.getName().charAt(0))) {
			error ("command names must start with a capital letter", element, PogoDslPackage.Literals.PROPERTY__NAME, IssueCodes.ERROR_PROPERTY_NAME_START_UPPERCASE);
		}
	}
	
	
/*
	
context Command ERROR "no output type specified: "+loc():
	argout != null;

context Command ERROR "no input type specified: "+loc():
	argin != null;

context Argument ERROR "no argument type specified: "+loc():
	type != null;

context Argument ERROR "no argument description specified: "+loc():
	description != null;

context Property ERROR "no type specified: "+loc():
	type != null;
	
context Property ERROR "no name specified: "+loc():
	name != null;
	
context Command ERROR "no argin specified: "+loc():
	argin != null;
	
context Command ERROR "no argout specified: "+loc():
	argout != null;
	
context Property ERROR "duplicate name: "+loc():
	siblings().select(e|e.name == this.name).size == 1;
	


 */
}
