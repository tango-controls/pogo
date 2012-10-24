package fr.esrf.tango.pogo.generator.cpp.utils;

import org.eclipse.emf.common.util.EList;
import java.util.ArrayList;

import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.State;


public class CppStringUtils extends fr.esrf.tango.pogo.generator.common.StringUtils{


	//===========================================================
	public String strType(Attribute attribute) {
		return CppTypeDefinitions.cppType(attribute.getDataType());
	}

	//===========================================================
	//	Dynamic attribute headers and signatures
	//===========================================================
	public String addDynamicAttributeHeaderComment(Attribute attribute) {
		 String comment = " *  parameter attname: attribute name to be cretated and added.\n";
		 if (isScalar(attribute) == false)
			 comment += " *  parameter ptr:     memory buffer used to set attribute value.\n" +
			            " *                     If NULL or not specified, buffer will be allocated.";
		 return comment;
	}
	//===========================================================
	public String removeDynamicAttributeHeaderComment(Attribute attribute) {
		 String comment = " *  parameter attname: attribute name to be removed and added.\n";
		 if (isScalar(attribute) == false)
			 comment += " *  parameter free_it: memory buffer will be freed if true or not specified.";
		 return comment;
	}
	//===========================================================
	public String addDynamicAttributeSignature(PogoDeviceClass cls, Attribute attribute, boolean prototype) {
		String	signature = "void ";
		if (prototype==false)
			signature += cls.getName() + "::";
		signature += "add_" + attribute.getName() + "_dynamic_attribute(string attname";
		if (isScalar(attribute) == false) {
			signature += ", " + strType(attribute) + " *ptr";
			if (prototype)
				signature += "=NULL";
		}
		signature += ")";
		if (prototype)
			signature += ";";
		return signature;
	}
	//===========================================================
	public String removeDynamicAttributeSignature(PogoDeviceClass cls, Attribute attribute, boolean prototype) {
		String	signature = "void ";
		if (prototype==false)
			signature += cls.getName() + "::";
		signature += "remove_" + attribute.getName() + "_dynamic_attribute(string attname";
		if (isScalar(attribute) == false) {
			signature += ", bool free_it";
			if (prototype)
				signature += "=true";
		}
		signature += ")";
		if (prototype)
			signature += ";";
		return signature;
	}
	
	
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
	public String commandsTable(EList<Command> commands) {

		InheritanceUtils	inher = new InheritanceUtils();
		//	Build a list of command columns to build the table
		ArrayList<String[]>	list = new ArrayList<String[]>();
		list.add(new String[] { "================================================================" });
		list.add(new String[] { "  The following table gives the correspondence" });
		list.add(new String[] { "  between command and method names." });
		list.add(new String[] { "" });
		list.add(new String[] { "Command name", "Method name" });
		list.add(new String[] { "================================================================" });
		for (Command command : commands) {
			if (inher.isConcreteHere(command))
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
			String	desc = CppTypeDefinitions.cppType(attribute.getDataType()) + "	" +
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
		String	emptyTab = "//  ";
		for (int i=0 ; i<length ; i++)
			emptyTab += " ";
		
		for (String[] array : list) {
			if (array.length>1) {
				String	comments = comments(array[1], emptyTab+"  |  ");
				sb.append("//  ").append(buildTab(array[0], length)).append("  |  ").append(comments);
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
