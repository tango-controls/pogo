package fr.esrf.tango.pogo.generator.java;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import fr.esrf.tango.pogo.generator.cpp.global.StringUtils;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.Property;
import fr.esrf.tango.pogo.pogoDsl.Command;

public class JavaUtils {

	//===========================================================
	/**
	 * returns true if has been set
	 */
	//===========================================================
	public static boolean isSet(String str) {
		return (str!=null && !str.isEmpty());
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
	public String strJavaType(Attribute attribute) {
		return JavaTypeDefinitions.javaType(attribute.getDataType());
	}
	//===========================================================
	public String strFullJavaType(Attribute attribute) {
		if (attribute.getAttType().equals("Scalar"))
			return JavaTypeDefinitions.javaType(attribute.getDataType());
		else
			return JavaTypeDefinitions.javaType(attribute.getDataType()) + "[]";
	}
	//===========================================================
	public String strJavaType(Property property) {
		return JavaTypeDefinitions.javaPropType(property.getType());
	}
	//===========================================================
	public String strArginType(Command command) {
		return JavaTypeDefinitions.javaType(command.getArgin().getType());
	}
	//===========================================================
	public String strArgoutType(Command command) {
		return JavaTypeDefinitions.javaType(command.getArgout().getType());
	}
	//===========================================================
	//===========================================================
	public String allocation(Attribute attribute) {
		if (attribute.getAttType().equals("Spectrum"))
			return " = new " +
				JavaTypeDefinitions.javaType(attribute.getDataType()) + "[" +
						attribute.getMaxX() + "]";
		else
		if (attribute.getAttType().equals("Image"))
			return " = new " +
				JavaTypeDefinitions.javaType(attribute.getDataType()) + "[" +
						attribute.getMaxX() + "*" + attribute.getMaxY() + "]";
		else
			return "";
	}
	//===========================================================
	/**
	 * Returns the device class package name
	 * @param cls	the class object
	 * @return the device class package name
	 */
	//===========================================================
	public String javaDevicePackage (PogoDeviceClass cls) {
		return "org.tango."+cls.getName().toLowerCase();
	}
	
	//===========================================================
	/**
	 * Returns the full qualified name the for device class 
	 * @param cls	the class object
	 * @return the full qualified name the for device class 
	 */
	//===========================================================
	public String fullQualifiedJavaDeviceClassName( PogoDeviceClass cls ){
		return javaDevicePackage(cls) + "." + cls.getName();
	} 
	
	//===========================================================
	/**
	 * Returns the full qualified name the for device class file
	 * @param cls	the class object
	 * @return the full qualified name the for device class file
	 */
	//===========================================================
	public String javaDeviceClassFileName( PogoDeviceClass cls ) {
		return fullQualifiedJavaDeviceClassName(cls).replaceAll("\\.","/") + ".java";
	} 
	
	//===========================================================
	/**
	 * Returns the default property values with expected format
	 * @param property the specified property
	 * @return the default property values with expected format
	 */
	//===========================================================
	public String defaultValue(Property property) {
		EList<String>	defaultValues = property.getDefaultPropValue();
		if (defaultValues==null || defaultValues.isEmpty())
			return "";
		else {
			String	str = ", defaultValue = \"[";
			for (int i=0 ; i<defaultValues.size() ; i++) {
				str += defaultValues.get(i);
				if (i<defaultValues.size()-1)
					str += ", ";
			}
			str += "]\"";
			return str;
		}
	}

	//===========================================================
	/**
	 * Returns the attribute properties with expected format
	 * @param attribute the specified attribute
	 * @return the attribute properties with expected format
	 */
	//===========================================================
	public String declareProperties(Attribute attribute) {
		
		//	Put in a list property value only if has been set
		ArrayList<String>	list = new ArrayList<String>();
		if (isSet(attribute.getProperties().getDescription()))
			list.add("description=\"" + oneLineString(attribute.getProperties().getDescription()) + "\"");
		if (isSet(attribute.getProperties().getLabel()))
			list.add("label=\"" + attribute.getProperties().getLabel() + "\"");
		if (isSet(attribute.getProperties().getUnit()))
			list.add("unit=\"" + attribute.getProperties().getUnit() + "\"");
		if (isSet(attribute.getProperties().getStandardUnit()))
			list.add("standard_unit=\"" + attribute.getProperties().getStandardUnit() + "\"");
		if (isSet(attribute.getProperties().getDisplayUnit()))
			list.add("display_unit=\"" + attribute.getProperties().getDisplayUnit() + "\"");
		if (isSet(attribute.getProperties().getFormat()))
			list.add("format=\"" + attribute.getProperties().getFormat() + "\"");
		if (isSet(attribute.getProperties().getMaxValue()))
			list.add("maxValue=\"" + attribute.getProperties().getMaxValue() + "\"");
		if (isSet(attribute.getProperties().getMinValue()))
			list.add("minValue=\"" + attribute.getProperties().getMinValue() + "\"");
		if (isSet(attribute.getProperties().getMaxAlarm()))
			list.add("max_alarm=\"" + attribute.getProperties().getMaxAlarm() + "\"");
		if (isSet(attribute.getProperties().getMinAlarm()))
			list.add("min_alarm=\"" + attribute.getProperties().getMinAlarm() + "\"");
		if (isSet(attribute.getProperties().getMaxWarning()))
			list.add("max_warning=\"" + attribute.getProperties().getMaxWarning() + "\"");
		if (isSet(attribute.getProperties().getMinWarning()))
			list.add("min_warning=\"" + attribute.getProperties().getMinWarning() + "\"");
		if (isSet(attribute.getProperties().getDeltaTime()))
			list.add("delta_t=\"" + attribute.getProperties().getDeltaTime() + "\"");
		if (isSet(attribute.getProperties().getDeltaValue()))
			list.add("delta_val=\"" + attribute.getProperties().getDeltaValue() + "\"");
	
		if (list.isEmpty())
			return "";
		else
			return "\n@AttributeProperties(" + propertiesInOneLine(list) + ")";
	}
	
	//===========================================================
	//===========================================================
	public String stateMachine(Attribute attribute) {

		ArrayList<String>	list = new ArrayList<String>();
		for (String state : attribute.getReadExcludedStates())
			list.add("DeviceState."+state);

		if (list.isEmpty())
			return "";
		else
			return "\n@StateMachine(deniedStates={" + propertiesInOneLine(list) + "})";

	}
	//===========================================================
	/**
	 * Returns the properties with expected format
	 * @param list the specified properties
	 * @return the properties with expected format
	 */
	//===========================================================
	public String propertiesInOneLine(ArrayList<String> list) {

		//	append all set properties with comma separator (not at end !)
		StringBuffer	sb = new StringBuffer();
		for (int i=0 ; i<list.size() ; i++) {
			sb.append(list.get(i));
			if (i<list.size()-1)
				sb.append(", ");
		}
		return sb.toString();
	}

	
	//===========================================================
	//===========================================================
	public String headerParameters(Command command) {
		String	params = "";
		if (JavaTypeDefinitions.javaType(command.getArgin().getType()).equals("void")==false) {
			params += "* @param " + parameter(command, "In") + " " + StringUtils.comments(
					command.getArgin().getDescription(), "*" + parameterInBlanks(command)) + "\n";
		}
		if (JavaTypeDefinitions.javaType(command.getArgout().getType()).equals("void")==false) {
			params += "* @return " + StringUtils.comments(
					command.getArgout().getDescription(), "*         ") + "\n";
		}
		params += "* @throws DevFailed if command execution failed.";
		return params;
	}
	//===========================================================
	//===========================================================
	public String strArginTypeDeclare(Command command) {
		String type = JavaTypeDefinitions.javaType(command.getArgin().getType());
		if (type.equals("void"))
			return "";
		else
			return type + " " + parameter(command, "In");
	}
	//===========================================================
	//===========================================================
	public String strArgoutTypeDeclare(Command command) {
		String type = JavaTypeDefinitions.javaType(command.getArgout().getType());
		if (type.equals("void"))
			return "";
		else
			return type + " " + parameter(command, "Out;");
	}
	//===========================================================
	//===========================================================
	public String strArgoutTypeReturn(Command command) {
		String type = JavaTypeDefinitions.javaType(command.getArgin().getType());
		if (type.equals("void"))
			return "";
		else
			return "return " + parameter(command, "Out;");
	}
	//===========================================================
	//===========================================================
	public String parameter(Command command, String inout) {
		return new StringUtils().dataMemberName(command.getName()) + inout;
	}
	//===========================================================
	//===========================================================
	public String parameterInBlanks(Command command) {
		String param = " @param " + parameter(command, "In ");
		StringBuilder sb = new StringBuilder();
		for (int i=0 ; i<param.length() ; i++)
			sb.append(' ');
		return sb.toString();
	}
}
