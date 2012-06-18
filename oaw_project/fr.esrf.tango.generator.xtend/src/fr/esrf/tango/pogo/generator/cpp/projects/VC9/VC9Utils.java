package fr.esrf.tango.pogo.generator.cpp.projects.VC9;


import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;

/**
 *	Utilities for VC9 projects
 */

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
		return "<File RelativePath=\"..\\" + fileName + "\"> </File>\n";
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
