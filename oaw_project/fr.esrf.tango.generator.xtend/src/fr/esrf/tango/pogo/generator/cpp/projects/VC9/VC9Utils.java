package fr.esrf.tango.pogo.generator.cpp.projects.VC9;

import org.eclipse.emf.common.util.EList;
import java.util.ArrayList;

import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.State;


public class VC9Utils {

	//===========================================================
	/**
	 *	Build xml list of source files for VC9 projects
	 */
	//===========================================================
	public String sourceFileList(PogoDeviceClass cls) {
		StringBuffer	sb = new StringBuffer();
		
		sb.append(buildFileLine(cls.getName()+".cpp"));
		sb.append(buildFileLine(cls.getName()+"Class.cpp"));
		sb.append(buildFileLine(cls.getName()+"StateMachine.cpp"));
		for (AdditionalFile file : cls.getAdditionalFiles()) {
			String fileName = getOnlyFileName(file.getPath());
			if (fileName!=null)
				sb.append(buildFileLine(fileName));
		}
		return sb.toString();
	}
	//===========================================================
	/**
	 *	Build xml list of include files for VC9 projects
	 */
	//===========================================================
	public String includeFileList(PogoDeviceClass cls) {
		StringBuffer	sb = new StringBuffer();
		
		sb.append(buildFileLine(cls.getName()+".h"));
		sb.append(buildFileLine(cls.getName()+"Clas.h"));
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	public String buildFileLine(String fileName) {
		StringBuffer	sb = new StringBuffer();

		sb.append("<File RelativePath=\"..\\").append(fileName).append("\"> </File>\n");
	return sb.toString();
	}
	//===========================================================
	//===========================================================
	private String getOnlyFileName(String pathName) {
		int pos = pathName.lastIndexOf('/');
		if (pos<0)
			pos = pathName.lastIndexOf('\\');
		if (pos<0)
			return null;
		else
			return pathName.substring(pos+1);
	}
	//===========================================================
	//===========================================================
}
