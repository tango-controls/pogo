package fr.esrf.tango.pogo.validation;

import java.util.List;

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.Property;

public class ValidHelper {

	public static List<Property> getSiblings( Property p ) {
		PogoDeviceClass c = (PogoDeviceClass)p.eContainer();
		if ( c.getClassProperties().contains(p)) {
			return c.getClassProperties();
		} else {
			return c.getDeviceProperties();
		}
	}
	
}
