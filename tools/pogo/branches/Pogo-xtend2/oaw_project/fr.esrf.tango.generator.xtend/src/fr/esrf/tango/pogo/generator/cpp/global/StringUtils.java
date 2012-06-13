package fr.esrf.tango.pogo.generator.cpp.global;

import org.eclipse.emf.common.util.EList;
import java.util.ArrayList;

import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.State;


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
	 * convert string to boolean
	 */
	//===========================================================
	public static boolean isTrue(String str) {
		return (str!=null && str.equals("true"));
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
	
	
	//======================================================
	//	Attribute utilities
	//======================================================
	public static String attTypeDimentions(Attribute attr) {
		if (attr.getAttType().equals("Spectrum"))
			return " max = " + attr.getMaxX();
		else
		if (attr.getAttType().equals("Image"))
			return  " max = " + attr.getMaxX() + " x " + attr.getMaxY();
		else
			return "";
	}
	//===========================================================
	//===========================================================
	public boolean isRead(String str) {
		return isSet(str) && str.contains("READ");
	}
	//===========================================================
	public boolean isWrite(String str) {
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
	/**
	 * build the commands table
	 */
	//===========================================================
	public static String commandsTable(EList<Command> commands) {

		//	Build a list of command columns to build the table
		ArrayList<String[]>	list = new ArrayList<String[]>();
		list.add(new String[] { "================================================================" });
		list.add(new String[] { "  The following table gives the correspondence" });
		list.add(new String[] { "  between command and method names." });
		list.add(new String[] { "" });
		list.add(new String[] { "Command name", "Method name" });
		list.add(new String[] { "================================================================" });
		for (Command command : commands) {
			if (isTrue(command.getStatus().getConcreteHere()))
				list.add(new String[] { command.getName(), command.getExecMethod() });
			else
				list.add(new String[] { command.getName(), "Inherited (no method)" });
		}
		list.add(new String[] { "================================================================" });
		return buildTable(list);
	}
	//===========================================================
	/**
	 * build the commands table
	 */
	//===========================================================
	public  String attributesTable(EList<Attribute> attributes) {

		String title = "  Attributes managed ";
		if (attributes.size()>1)
			title += "are:";
		else
			title += "is:";
		//	Build a list of command columns to build the table
		ArrayList<String[]>	list = new ArrayList<String[]>();
		list.add(new String[] { "================================================================" });
		list.add(new String[] { title });
		list.add(new String[] { "================================================================" });
		for (Attribute attribute : attributes) {
			//	Build description
			String	desc = TypeDefinitions.cppType(attribute.getDataType()) + "	" +
						attribute.getAttType();
			if (attribute.getAttType().equals("Scalar")==false)
				desc += "  (" + attTypeDimentions(attribute) + ")";

			list.add(new String[] { attribute.getName(), desc });
		}
		list.add(new String[] { "================================================================" });
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

	//===========================================================
	//	Build a string with specified strings for Makefile
	//===========================================================
	private String buildFileListForMakefile(ArrayList<String> list, String startTag, String endTag) {
		StringBuffer	sb = new StringBuffer();
		for (int i=0 ; i<list.size();i++) {
			sb.append(startTag).append(list.get(i)).append(endTag);
			if (i<list.size()-1)
				sb.append(" \\").append('\n');
		}
		return sb.toString();
	}
	//===========================================================
	public String buildAdditionalFileListForMakefile(EList<AdditionalFile> list, String startTag, String endTag) {
		ArrayList<String>	files = new ArrayList<String>();
		for (AdditionalFile file : list)
			files.add(file.getName());
		return buildFileListForMakefile(files, startTag, endTag);
	}
	//===========================================================
	public String buildInheritanceFileListForMakefile(EList<Inheritance> list, String startTag, String endTag) {
		ArrayList<String>	files = new ArrayList<String>();
		for (Inheritance inheritance : list)
			files.add(inheritance.getClassname());
		return buildFileListForMakefile(files, startTag, endTag);
	}



}
