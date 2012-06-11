package fr.esrf.tango.pogo.generator.cpp.global;

import org.eclipse.emf.common.util.EList;

public class StringUtils {

	//===========================================================
	/*
	 * Define the DeviceImpl used to generate
	 */
	//===========================================================
	public String DeviceImpl() {
		return "Tango::Device_4Impl";
	}
	
	//===========================================================
	/**
	 * Convert name to data member name (first char to lower case
	 */
	//===========================================================
	public String dataMemberName(String s) {	
		return s.substring(0,1).toLowerCase()+s.substring(1, s.length());
	}
	//===========================================================
	/*
	 * Convert a list to a string with '\n' separator char
	 */
	//===========================================================
	public String list2String(EList<String> list) {
		String str = "";
		for (int i=0 ; i<list.size(); i++) {
			str += list.get(i);
			if (i<list.size()-1)
				str += "\\n"; 
		}
		return str;
	}
	//===========================================================
	/*
	 * Convert multi lines text to a one line text
	 */
	//===========================================================
	public String oneLineString(String text) {
		String	str = text;
		return str.replaceAll("\n", "\\n");
	}
	//===========================================================
	/**
	 * Comment a String with more than one line
	 */
	//===========================================================
	public static String comments(String s, String tag) {
		return s.replaceAll("\n", "\n"+tag);
	}
}
