package fr.esrf.tango.pogo.generator.cpp.global;

import org.eclipse.emf.common.util.EList;
import java.util.ArrayList;

import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.State;


public class InheritanceUtils {

	//===========================================================
	/**
	 *	Inheritance util (return true if not the TangoDeviceImpl)
	 */
	//===========================================================
	public boolean isInheritanceClass(Inheritance inheritance) {
		if (StringUtils.isSet(inheritance.getClassname())) {
			return (inheritance.getClassname().startsWith("Device_") &&
					inheritance.getClassname().endsWith("Impl") ==false);
		}
		else
			return false;
	}

	//===========================================================
	/**
	 *	Inheritance util (return true at least the first one is not the TangoDeviceImpl)
	 */
	//===========================================================
	public boolean hasInheritanceClass(PogoDeviceClass cls) {

		int	inherSize = cls.getDescription().getInheritances().size();
		return inherSize>0 &&
				isInheritanceClass(cls.getDescription().getInheritances().get(inherSize-1));
	}
	
}
