package fr.esrf.tango.pogo.generator.cpp.projects.VC10;


import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;

/**
 *	Utilities for VC10 projects
 */

public class VC10Utils {

	//===========================================================
	/**
	 * Non printable char at head of VC10 files
	 */
	//===========================================================
	public String vc10EscapeChars() {
		//byte[]	sequence = { (byte)0xef, (byte)0xbb, (byte)0xbf};
		//return sequence.toString();
		return "ï»¿";
	}
	//===========================================================
	/**
	 *	Build xml list of source files for VC9 projects
	 */
	//===========================================================
	public String includeFilesPath(int nBits) {
		StringBuffer	sb = new StringBuffer();
		String		tangoIncludes = "$(TANGO_ROOT)\\win" + nBits + "\\include\\vc10;";
		String		tangoclasses  = "$(TANGO_ROOT)\\classes\\win" + nBits + "\\include\\vc10;";

		sb.append("<AdditionalIncludeDirectories>\n");
		sb.append("    ..;").append(tangoIncludes).append(tangoclasses).append("TemplateAbstractPath;%(AdditionalIncludeDirectories)\n");
		sb.append("</AdditionalIncludeDirectories>\n");

	  	return sb.toString();
	}
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

		//	Add dynamic attribute tools file if needed
		if (cls.getDynamicAttributes().size()>0) {
			sb.append(buildFileLine(cls.getName()+"DynAttrUtils.cpp"));
		}

		//	Add programmer's files if any
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
		
		sb.append(buildIncludeFileLine(cls.getName()+".h"));
		sb.append(buildIncludeFileLine(cls.getName()+"Clas.h"));
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	public String buildFileLine(String fileName) {
		return "<ClCompile Include=\"..\\" + fileName + "\" />\n";
	}
	//===========================================================
	//===========================================================
	public String buildIncludeFileLine(String fileName) {
		return "<ClInclude Include=\"..\\" + fileName + "\"> </ClInclude>\n";
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
	
	
	
	//=============================================================================
	//=============================================================================
	private String tangoLibraryName(String libName, String mode, boolean shared) {
		return libName + ((shared)? "_rt" : "") + mode + ".lib;";
	}
	//===========================================================
	/**
	 *	build  Tango libraries
	 *	@param	mode "d" for debug  "" for release
	 *	@param	shared will add "rt" for dll and "" for static
	 */
	//=============================================================================
	public String tangoLibraries(String mode, boolean shared) {
		
		return	tangoLibraryName("omniORB4",     mode, shared) +
				tangoLibraryName("omniDynamic4", mode, shared) +
				tangoLibraryName("COS4",         mode, shared) +
				tangoLibraryName("omnithread",   mode, shared) +
				tangoLibraryName("tango",        mode, false) +
				tangoLibraryName("log4tango",    mode, false) +
				tangoLibraryName("zmq",          mode, false);
	}

	//=============================================================================
	/**
	 * build Windows libraries list
	 * @return the Windows libraries list
	 */
	//=============================================================================
	public String windowsLibraries() {
		return "comctl32.lib;" +
				"ws2_32.lib;"  +
				"mswsock.lib;" +
				"advapi32.lib;";
	}
	
	//=============================================================================
	/**
	 * 
	 * @param cls		PogoDeviceClass object
	 * @param mode		"d" for debug  "" for release
	 * @param shared	will add "rt" for dll and "" for static
	 * @param itself	will add this device lib if true
	 * @return the libraries.
	 */
	//=============================================================================
	public String libraryList(PogoDeviceClass cls, String mode, boolean shared, boolean itself) {
		return "<AdditionalDependencies>\n\t" +
			   ((itself)? cls.getName() + mode + ".lib;" : "") +
			   tangoLibraries(mode, shared)  +
			   windowsLibraries() + "%(AdditionalDependencies)\n" + 
			   "</AdditionalDependencies>";
	}
	//=============================================================================
	/**
	 * Returns Tango library files path
	 * @param nBits  32/64
	 * @param shared for static or dll
	 * @return Tango library files path
	 */
	//=============================================================================
	public String tangoLibraryPath(int nBits, boolean shared) {
		String	dll = (shared)? "_dll" : "";
		return "$(TANGO_ROOT)\\win" + nBits + "\\lib\\vc10" + dll + ";$(TANGO_ROOT)\\classes\\win" + nBits + "\\lib\\vc10" + dll;
	}
	//=============================================================================
	/**
	 * Returns library files path
	 * @param nBits   32/64
	 * @param shared  for static or dll
	 * @return library files path
	 */
	//=============================================================================
	public String libraryPath(int nBits, boolean shared) {
		String	dll = (shared)? "_dll" : "";
		return "<AdditionalLibraryDirectories>\n"+
				"	..\\lib\\win" + nBits + "\\vc10"+ dll + ";" + tangoLibraryPath(nBits, shared) + ";%(AdditionalLibraryDirectories)\n" +
			    "</AdditionalLibraryDirectories>";
	}
}
