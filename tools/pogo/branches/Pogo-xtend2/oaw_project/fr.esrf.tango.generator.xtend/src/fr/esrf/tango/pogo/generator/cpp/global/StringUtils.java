package fr.esrf.tango.pogo.generator.cpp.global;

import org.eclipse.emf.common.util.EList;

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
	public boolean isTrue(String str) {
		return (str!=null && str.equals("true"));
	}
	//===========================================================
	/**
	 * returns true if has been set
	 */
	//===========================================================
	public boolean isSet(String str) {
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

		//	The longest state name is 7 chars -> '|' on 10
		StringBuffer	sb = new StringBuffer("//  States   |  Description \n");
		sb.append("//--------------------------------------\n");
		for (State state : states) {
			sb.append("// ").append(state.getName());
			for (int i=state.getName().length() ; i<10 ; i++) {
				sb.append(' ');
			}
			sb.append("| ").append(state.getDescription()).append('\n');
		}
		
		return sb.toString();
	}
}
