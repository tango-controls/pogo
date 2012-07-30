package fr.esrf.tango.pogo.generator.common;

import org.eclipse.emf.common.util.EList;
import java.util.ArrayList;

import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.Property;
import fr.esrf.tango.pogo.pogoDsl.State;


public class StringUtils {

	//===========================================================
	/*
	 * Define the DeviceImpl used to generate
	 */
	//===========================================================
	public static String DeviceImpl() {
		return "Tango::Device_4Impl";
	}

	//===========================================================
	/**
	 * convert string to boolean
	 */
	//===========================================================
	public static boolean isTrue(String str) {
		return (str!=null && str.equals("true"));
	}
	//===========================================================
	/**
	 * convert string to boolean
	 */
	//===========================================================
	public static boolean isFalse(String str) {
		return !isTrue(str);
	}
	//===========================================================
	/**
	 * returns true if has been set
	 */
	//===========================================================
	public static boolean isSet(String str) {
		return (str!=null && !str.isEmpty());
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
		StringBuffer sb = new StringBuffer();
		for (int i=0 ; i<list.size(); i++) {
			sb.append(list.get(i));
			if (i<list.size()-1)
				sb.append("\\n"); 
		}
		return sb.toString();
	}
	//===========================================================
	/*
	 * Convert multi lines text to a one line text
	 */
	//===========================================================
	public String oneLineString(String text) {
		//return str.replaceAll("\n", "\\n");	-> does not work

		StringBuffer	sb = new StringBuffer();
		int	start = 0;
		int end;
		while ((end=text.indexOf('\n', start))>0){
			sb.append(text.substring(start, end)).append("\\n");
			start = end +1;
		}
		sb.append(text.substring(start));
		return sb.toString();
	}
	//===========================================================
	/*
	 * Convert a multi lines string to a multi push_back(line) 
	 */
	//===========================================================
	public String string2Vector(String text, String vectorName) {
		StringBuffer	sb = new StringBuffer();
		int	start = 0;
		int end;
		while ((end=text.indexOf('\n', start))>0){
			sb.append(vectorName).append(".push_back(\"");
			sb.append(text.substring(start, end)).append("\");\n");		
			start = end +1;
		}
		sb.append(vectorName).append(".push_back(\"");
		sb.append(text.substring(start)).append("\");\n");		
		return sb.toString();
	}
	//===========================================================
	/**
	 * Comment a String with more than one line
	 */
	//===========================================================
	public static String comments(String s, String tag) {
		return s.replaceAll("\n", "\n"+tag);
	}
	//===========================================================
	/**
	 * build a "if" content from the specified list.
	 * 		used by StateMachine
	 * @param list
	 * @return the "if" content from the specified list
	 */
	//===========================================================
	public String ifContentFromList(EList<String> list) {
		StringBuffer	sb = new StringBuffer();
		for (int i=0 ; i<list.size(); i++) {
			sb.append("get_state()==Tango::").append(list.get(i));
			if (i<list.size()-1)
				sb.append(" ||\n	");
		}
		return sb.toString();
	}
	
	//===========================================================
	/**
	 * build a "if" content from the specified list.
	 * 		used by PythonUtils
	 * @param list
	 * @return the "if" content from the specified list
	 */
	//===========================================================
	public String ifContentFromListPython(EList<String> list) {
		StringBuffer	sb = new StringBuffer();
		sb.append("self.get_state() in [");
		for (int i=0 ; i<list.size(); i++) {
			sb.append("PyTango.DevState.").append(list.get(i));
			if (i<list.size()-1)
				sb.append(" ,\n	");
		}
		sb.append("]");
		return sb.toString();
	}
	
	//======================================================
	//	Check if at least one property is mandatory
	//======================================================
	public boolean hasMandatoryProperty(EList<Property> properties) {
		for (Property property : properties)
			if (isTrue(property.getMandatory()))
				return true;
		return false;
	}
	
	//======================================================
	public boolean isScalar(Attribute attr) {
		return (attr.getAttType().equals("Scalar"));
	}
	//======================================================
	public boolean isSpectrum(Attribute attr) {
		return (attr.getAttType().equals("Spectrum"));
	}
	//======================================================
	public boolean isImage(Attribute attr) {
		return (attr.getAttType().equals("Image"));
	}
	//======================================================
	//	Attribute utilities
	//======================================================
	public String attTypeDimentions(Attribute attr) {
		if (isSpectrum(attr))
			return " max = " + attr.getMaxX();
		else
		if (isImage(attr))
			return  " max = " + attr.getMaxX() + " x " + attr.getMaxY();
		else
			return "";
	}
	//===========================================================
	//===========================================================
	public boolean isRead(Attribute attribute) {
		String	str = attribute.getRwType();
		return isSet(str) && str.contains("READ");
	}
	//===========================================================
	public boolean isWrite(Attribute attribute) {
		String	str = attribute.getRwType();
		return isSet(str) && str.contains("WRITE");
	}
	//===========================================================

	
	//===========================================================
	/**
	 * build the states table
	 */
	//===========================================================
	public static String statesTable(EList<State> states) {

		//	Build a list of state columns to build the table
		ArrayList<String[]>	list = new ArrayList<String[]>();
		list.add(new String[] { "================================================================" });
		list.add(new String[] { "States", "Description" });
		list.add(new String[] { "================================================================" });
		for (State state : states) {
			list.add(new String[] { state.getName(), state.getDescription() });
		}
		return buildTable(list);
	}
	//===========================================================
	//===========================================================
	private static String buildTable(ArrayList<String[]> list) {
		StringBuffer	sb = new StringBuffer();
		//	Get the longest first element
		int	length = 0;
		for (String[] array : list) {
			if (array.length>1)
				if (array[0].length()>length)
					length = array[0].length();
		}
		
		for (String[] array : list) {
			if (array.length>1) {
				sb.append("//  ").append(buildTab(array[0], length)).append("  |  ").append(array[1]);
			}
			else
				sb.append("//").append(array[0]);
			sb.append('\n');
		}
		return sb.toString();
	}

	//===========================================================
	private static String buildTab(String str, int nbChar) {
		StringBuffer	sb = new StringBuffer(str);
		for (int i=str.length() ; i<nbChar ; i++) {
			sb.append(' ');
		}
		return sb.toString();
	}
	//===========================================================
}
