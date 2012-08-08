package fr.esrf.tango.pogo.generator.html;

import org.eclipse.emf.common.util.EList;

import fr.esrf.tango.pogo.generator.common.StringUtils;
import fr.esrf.tango.pogo.generator.cpp.utils.InheritanceUtils;
import fr.esrf.tango.pogo.generator.java.JavaTypeDefinitions;
import fr.esrf.tango.pogo.generator.cpp.utils.CppTypeDefinitions;
import fr.esrf.tango.pogo.pogoDsl.AttrProperties;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.ClassIdentification;
import fr.esrf.tango.pogo.pogoDsl.EventCriteria;
import fr.esrf.tango.pogo.pogoDsl.FireEvents;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.Property;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.State;

public class HtmlUtils extends StringUtils {
	
	//===========================================================
	//===========================================================
	String getValue(String s) {
		if (isSet(s))
			return s;
		else
			return "Not set";
	}
	//===========================================================
	//===========================================================
	String htmlFileHeader(PogoDeviceClass cls) {
		return htmlFileHeader(cls, null);
	}
	//===========================================================
	//===========================================================
	String htmlFileHeader(PogoDeviceClass cls, String item) {
		String s = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 3.2//EN\">\n" +
			"<html>\n" +
			"<head>\n" +
			"<title> " + cls.getName() + " Tango Class ";
		if (item==null)
			s += "User s Guide";
		else
			s += item;
		s += " </title>\n" +
			"</head>\n" +
			"<body text=\"Black\" bgcolor=\"White\" link=\"Blue\" vlink=\"Purple\" alink=\"Red\">\n" ;
		return s;
	}
	//===========================================================
	//===========================================================
	String htmlTitle(String text) {
		return "<font size=\"+1\"><u><b> " + text + " </b></u></font>";
	}
	//===========================================================
	//===========================================================
	String htmlPageTitle(String text) {
		return "<center><h2><u><b> " + text + " </b></u></h2></center>";
	}
	//===========================================================
	//===========================================================
	String htmlIdContact(ClassIdentification id) {
		return id.getEmailDomain() + " - " +id.getAuthor();
	}
	//===========================================================
	//===========================================================
	String htmlClassFamily(ClassIdentification id) {
		String	s = id.getClassFamily();

		if (id.getSiteSpecific()==null || id.getSiteSpecific().length()==0)
			return s;
		else
			return s + "(specfic "+ id.getSiteSpecific() + ")";
	}
	//===========================================================
	//===========================================================
	String htmlStringWithBreak(String s) {
		return htmlStringWithBreak(s, "");
	}
	//===========================================================
	//===========================================================
	String htmlStringWithBreak(String s, String tag) {
		return s.replaceAll("\n", "<Br>\n"+tag);
	}
	//===========================================================
	//===========================================================
	String htmlList2String(EList<String> list) {
		return htmlList2String(list, "");
	}
	//===========================================================
	//===========================================================
	String htmlList2String(EList<String> list, String tag) {
		if (list.size()==0)
			return "none";

		StringBuffer	sb = new StringBuffer();
		int i = 0;
		for (String s : list) {
			if (list.size()<6) {
				//	one value by line
				sb.append(s).append(" <br>");
				//	no tag for last one
				if (i++<list.size()-1)
					sb.append("\n"+tag);
			}
			else {
				//	on one line if to much
				sb.append(s);
				//	no ',' for last one
				if (i++<list.size()-1)
					sb.append(", ");
			}
		}
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	String htmlInheritance(PogoDeviceClass cls) {
		
		InheritanceUtils	util = new InheritanceUtils();
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		
		//	Build http tango doc address for link
		String	tangoDoc = "http://www.esrf.fr/computing/cs/tango/tango_doc/kernel_doc/";
		String	language = cls.getDescription().getLanguage();
		if (language.toLowerCase().equals("cpp"))
			tangoDoc += "cpp_doc/";
		else
		if (language.toLowerCase().equals("java"))
			tangoDoc += "tango_java_api/";
		else
		if (language.toLowerCase().equals("java"))
			tangoDoc = "http://www.tango-controls.org/static/PyTango/latest/doc/html/index.html";
		
		//	Start to build
		StringBuffer	sb = new StringBuffer("<ul><li> <a href=" +
				"\"" + tangoDoc + "\" target=\"new\"> Tango::DeviceImpl</a></li>\n");
		
		for (int i=0 ; i<inheritances.size() ; i++) {
			Inheritance	inheritance = inheritances.get(i);
			if (util.isInheritanceClass(inheritance))
				sb.append("<ul> <li> ").append(inheritance.getClassname()).append("</li>\n");
		}
		sb.append("<ul> <li> ").append(cls.getName()).append("</li>\n");
		for (int i=0 ; i< 6-inheritances.size() ; i++) {
			sb.append("<br>\n");
		}		
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	String htmlTableHeader(String[] headers, String title) {
		StringBuffer	sb = new StringBuffer("<Table Border=2 Cellpadding=3 CELLSPACING=0>\n");
		sb.append("\t<tr bgcolor=\"#CCCCFF\" class=\"TableHeadingColor\">\n");
		sb.append("\t<td colspan=" + headers.length + "> <font size=+1> <center><b> "+ title );
		sb.append(" </b></font></center></td>\n");
		
		if (headers!=null && headers.length>0) {
			sb.append("\t<tr bgcolor=\"#CCCCFF\" class=\"TableHeadingColor\">\n");
			for (String header : headers) {
				sb.append(htmlTableCell("<center><b> " + header + " </b></center>"));
			}
		}
		sb.append("	</tr>\n");
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	String htmlTableCell(String s) {
		return "\t\t<td> " + s + " </td>\n";
	}
	//===========================================================
	//===========================================================
	private String htmlTableCell(EList<String> list) {
		StringBuffer	sb = new StringBuffer("<font size=\"-1\"> ");
		for (String str : list) {
			sb.append(" <li> ").append(str).append(" </li> ");
		}
		sb.append("</font>");
		return htmlTableCell(sb.toString());
	}
	//===========================================================
	//===========================================================
	String htmlTableLine(String[] array) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t<tr>\n");
		for (String s : array)
			sb.append(htmlTableCell(s));
		sb.append("\t</tr>\n");
		return sb.toString();
	}
	//===========================================================
	//===========================================================

	
	
	//===========================================================
	private static final String[]	propertyHeaders =
		{ "Name", "Description", "Type", "Default Value" };
	//===========================================================
	String htmlPropertyTable(EList<Property> properties, String title) {
		
		if (properties.size()==0)
			return htmlTitle("There is no "+title.toLowerCase());
		StringBuffer sb = new StringBuffer(htmlTableHeader(propertyHeaders, title));
		for (Property property : properties) {
			
			String	desc = htmlStringWithBreak(property.getDescription(), "\t\t\t");
			String	strType = JavaTypeDefinitions.javaPropType(property.getType());
			String	defValues = htmlList2String(property.getDefaultPropValue(), "\t\t\t");

			sb.append(htmlTableLine(
					new String[] { property.getName(), desc, strType, defValues }));
		}
		sb.append("</table>");
		return sb.toString();
	}
	//===========================================================
	private static final String[]	stateHeaders =
		{ "Name", "Description", };
	//===========================================================
	String htmlStatesTable(EList<State> states) {
		
		if (states.size()==0)
			return htmlTitle("There is no state defined");

		StringBuffer sb = new StringBuffer(htmlTableHeader(stateHeaders, "Device States"));
		for (State state : states) {
			
			String	desc = htmlStringWithBreak(state.getDescription(), "\t\t\t");
			sb.append(htmlTableLine(
					new String[] { state.getName(), desc }));
		}
		sb.append("</table>");
		return sb.toString();
	}
	//===========================================================
	//===========================================================

	
	
	//===========================================================
	private static final String[]	commandHeaders =
		{ "Name", "Input type", "Output type", "Level", "Description" };
	//===========================================================
	String htmlCommandsTable(EList<Command> commands) {
		
		if (commands.size()==0)
			return htmlTitle("There is no command defined.");
		StringBuffer sb = new StringBuffer(htmlTableHeader(commandHeaders, "Device Commands"));
		for (Command command : commands) {
			
			//	Build name with a link on command description file
			String	name = "<a href=\"Cmd" + command.getName() + ".html\"> " + command.getName() +" </a>";
			//	Build description
			String	desc = htmlStringWithBreak(command.getDescription(), "\t\t\t");
			if (desc.length()==0)
				desc = "None.";

			//	Build argument types
			String	argin  = CppTypeDefinitions.cppTypeEnum(command.getArgin().getType());
			String	argout = CppTypeDefinitions.cppTypeEnum(command.getArgout().getType());
			//	remove "Tango::" if any
			if (argin.startsWith("Tango::"))	argin = argin.substring(7);
			if (argout.startsWith("Tango::"))	argout = argout.substring(7);

			sb.append(htmlTableLine(
					new String[] { name, argin, argout, command.getDisplayLevel(), desc }));
		}
		sb.append("</table>");
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	String htmlOneCommandTable(Command command) {
		
		//	Build argument types
		String	argin  = CppTypeDefinitions.cppTypeEnum(command.getArgin().getType());
		String	argout = CppTypeDefinitions.cppTypeEnum(command.getArgout().getType());
		String	abstr  = isTrue((command.getStatus().getConcreteHere()))? "false": "true";
		String title = command.getName() + " Definition";
		String	poll   = "Not polled";
		if (isSet(command.getPolledPeriod()))
			if (command.getPolledPeriod().equals("0")==false)
				poll = command.getPolledPeriod();

		StringBuffer sb = new StringBuffer(htmlTableHeader(new String[0] , title));
		sb.append(htmlTableLine(
				new String[] { "Input Argument", argin, htmlStringWithBreak(command.getArgin().getDescription()) }));
		sb.append(htmlTableLine(
				new String[] { "Output Argument", argout, htmlStringWithBreak(command.getArgout().getDescription()) }));
		sb.append(htmlTableLine(
				new String[] { "DisplayLevel", command.getDisplayLevel(), ".."  }));
		sb.append(htmlTableLine(
				new String[] { "Inherited", command.getStatus().getInherited(), ".."  }));
		sb.append(htmlTableLine(
				new String[] { "Abstract", abstr, ".."  }));
		sb.append(htmlTableLine(
				new String[] { "Polling Period", poll, ".." }));

		sb.append("<Tr BGCOLOR=\"#CCCCFF\"><Td><Hr></Td><Td><Hr></Td><Td><Hr></Td></Tr>\n");

		//	Excluded state
		if (command.getExcludedStates().size()==0) {
			sb.append(htmlTableLine(
					new String[] { "Command allowed for", "All states", ".."  }));
		}
		else {
			sb.append("\t<tr>\n");
			sb.append(htmlTableCell("Command NOT allowed for"));
			sb.append(htmlTableCell(command.getExcludedStates()));
			sb.append(htmlTableCell(".."));
			sb.append("\t</tr>\n");
		}
		sb.append("</table>");
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	
	
	//===========================================================
	private static final String[]	attributeHeaders =
		{ "Name", "Inherited", "Abstract", "Attr. type", "R/W type", "Data type", "Level", "Description" }; 
	//===========================================================
	String htmlAttributesTable(EList<Attribute> attributes, boolean dynamic) {
		
		
		if (attributes.size()==0) {
			if (dynamic)
				return htmlTitle("There is no dynamic attribute defined.");
			else
				return htmlTitle("There is no attribute defined.");
		}
		
		String	title = (dynamic)? "Device Dynamic Attributes" : "Device Attributes";
		StringBuffer sb = new StringBuffer(htmlTableHeader(attributeHeaders, title));

		for (Attribute attribute : attributes) {
			//	Build name with a link on attribute description file
			String	name = "<a href=\"Attr" + attribute.getName() + ".html\"> " + attribute.getName() +" </a>";
			//	Build description
			String	desc = htmlStringWithBreak(attribute.getProperties().getDescription(), "\t\t\t");
			String	dataType  = CppTypeDefinitions.cppTypeEnum(attribute.getDataType());
			String	abstr  = isTrue((attribute.getStatus().getConcreteHere()))? "false": "true";

			sb.append(htmlTableLine(
					new String[] { name, 
							attribute.getStatus().getInherited(),
							abstr,
							attribute.getAttType(),
							attribute.getRwType(),
							dataType,
							attribute.getDisplayLevel(),
							desc 
						}));
		}
		sb.append("</table>");
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	private String attrSize(Attribute attribute) {
		if (attribute.getAttType().equals("Scalar"))
			return "";
		else
		if (attribute.getAttType().equals("Spectrum"))
			return "  ( " + attribute.getMaxX() + " )";
		else
			//	Image
			return "  ( " + attribute.getMaxX() +
					" x " + attribute.getMaxY() + " )";
	}
	//===========================================================
	//===========================================================
	String htmlOneAttributeDefinitionTable(Attribute attribute) {
		
		String title   = "Attribute Definition";
		String	dataType  = CppTypeDefinitions.cppTypeEnum(attribute.getDataType());
		String	abstr  = isTrue((attribute.getStatus().getConcreteHere()))? "false": "true";
		String	poll   = "Not polled";
		if (isSet(attribute.getPolledPeriod()))
			if (attribute.getPolledPeriod().equals("0")==false)
				poll = attribute.getPolledPeriod();
		
		StringBuffer sb = new StringBuffer(htmlTableHeader(new String[0] , title));
		sb.append(htmlTableLine(
				new String[] { "Attribute Type", attribute.getAttType() + attrSize(attribute) }));
		sb.append(htmlTableLine(
				new String[] { "R/W Type", attribute.getRwType() }));
		sb.append(htmlTableLine(
				new String[] { "Data Type", dataType }));
		sb.append(htmlTableLine(
				new String[] { "Display Level", attribute.getDisplayLevel() }));
		sb.append(htmlTableLine(
				new String[] { "Inherited", attribute.getStatus().getInherited() }));
		sb.append(htmlTableLine(
				new String[] { "Abstract", abstr }));
		sb.append(htmlTableLine(
				new String[] { "Polling Period", poll }));
		sb.append(htmlTableLine(
				new String[] { "Memorized", getValue(attribute.getMemorized()) }));
		if (isTrue(attribute.getMemorized()))
			sb.append(htmlTableLine(
						new String[] { "Write hardware at init.", getValue(attribute.getMemorizedAtInit()) }));

		sb.append("<Tr BGCOLOR=\"#CCCCFF\"><Td><Hr></Td><Td><Hr></Td></Tr>\n");

		//	Read excluded state
		if (attribute.getRwType().contains("READ")) {
			if (attribute.getReadExcludedStates().size()==0) {
				sb.append(htmlTableLine(
						new String[] { "Read allowed for", "All states" }));
			}
			else {
				sb.append("\t<tr>\n");
				sb.append(htmlTableCell("Read NOT allowed for"));
				sb.append(htmlTableCell(attribute.getReadExcludedStates()));
				sb.append("\t</tr>\n");
			}
		}			
		//	Write excluded state
		if (attribute.getRwType().contains("WRITE")) {
			if (attribute.getWriteExcludedStates().size()==0) {
				sb.append(htmlTableLine(
						new String[] { "Write allowed for", "All states" }));
			}
			else {
				sb.append("\t<tr>\n");
				sb.append(htmlTableCell("Write NOT allowed for"));
				sb.append(htmlTableCell(attribute.getWriteExcludedStates()));
				sb.append("\t</tr>\n");
			}
		}			

		sb.append("</table>");
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	String htmlOneAttributePropertiesTable(Attribute attribute) {
		
		String title = "Attribute Properties";
		StringBuffer sb = new StringBuffer(htmlTableHeader(new String[0] , title));
		
		AttrProperties	properties = attribute.getProperties();
		sb.append(htmlTableLine(
				new String[] { "label", properties.getLabel() }));
		sb.append(htmlTableLine(
				new String[] { "unit", properties.getUnit() }));
		sb.append(htmlTableLine(
				new String[] { "standard unit", properties.getStandardUnit() }));
		sb.append(htmlTableLine(
				new String[] { "display unit", properties.getDisplayUnit() }));
		sb.append(htmlTableLine(
				new String[] { "format", properties.getFormat() }));
		sb.append(htmlTableLine(
				new String[] { "max_value", properties.getMaxValue() }));
		sb.append(htmlTableLine(
				new String[] { "min_value", properties.getMinValue() }));
		sb.append(htmlTableLine(
				new String[] { "max_alarm", properties.getMaxAlarm() }));
		sb.append(htmlTableLine(
				new String[] { "min_alarm", properties.getMinAlarm() }));
		sb.append(htmlTableLine(
				new String[] { "max_warning", properties.getMaxWarning() }));
		sb.append(htmlTableLine(
				new String[] { "min_warning", properties.getMinWarning() }));
		sb.append(htmlTableLine(
				new String[] { "delta_time", properties.getDeltaTime() }));
		sb.append(htmlTableLine(
				new String[] { "delta_val", properties.getDeltaValue() }));
		sb.append("</table>");
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	String htmlOneAttributeEventCriteriaTable(Attribute attribute) {
		
		EventCriteria	evChangeCriteria  = attribute.getEventCriteria();
		EventCriteria	evArchiveCriteria = attribute.getEvArchiveCriteria();
		String title = "Attribute Event Criteria";
		StringBuffer sb = new StringBuffer(htmlTableHeader(new String[0] , title));
		
		//	On change event criteria
		sb.append(htmlEventCriteriaLine(evChangeCriteria, "Periodic",        0));
		sb.append(htmlEventCriteriaLine(evChangeCriteria, "Relative Change", 1));
		sb.append(htmlEventCriteriaLine(evChangeCriteria, "Absolute Change", 2));

		sb.append("<Tr BGCOLOR=\"#CCCCFF\"><Td><Hr></Td><Td><Hr></Td></Tr>\n");

		//	Archive event criteria
		sb.append(htmlEventCriteriaLine(evArchiveCriteria, "Archive Periodic",        0));
		sb.append(htmlEventCriteriaLine(evArchiveCriteria, "Archive Relative Change", 1));
		sb.append(htmlEventCriteriaLine(evArchiveCriteria, "Archive Absolute Change", 2));

		sb.append("<Tr BGCOLOR=\"#CCCCFF\"><Td><Hr></Td><Td><Hr></Td></Tr>\n");
		
		//	Push Change event by user code
		sb.append(htmlFireEventLine(attribute.getChangeEvent(), "Push Change event by user code", true));
		if (attribute.getChangeEvent()!=null && isTrue(attribute.getChangeEvent().getFire()))
			sb.append(htmlFireEventLine(attribute.getChangeEvent(), "<ul> Criteria checked by TANGO", false));
		sb.append("<Tr BGCOLOR=\"#CCCCFF\"><Td> </Td><Td> </Td></Tr>\n");

		//	Push Archive event by user code
		sb.append(htmlFireEventLine(attribute.getArchiveEvent(), "Push Archive event by user code", true));
		if (attribute.getArchiveEvent()!=null && isTrue(attribute.getArchiveEvent().getFire()))
			sb.append(htmlFireEventLine(attribute.getArchiveEvent(), "<ul> Criteria checked by TANGO", false));
		sb.append("<Tr BGCOLOR=\"#CCCCFF\"><Td> </Td><Td> </Td></Tr>\n");

		//	Push DataReady event by user code 	false
		sb.append(htmlFireEventLine(attribute.getDataReadyEvent(), "Push DataReady event by user code", true));
		if (attribute.getDataReadyEvent()!=null && isTrue(attribute.getDataReadyEvent().getFire()))
			sb.append(htmlFireEventLine(attribute.getDataReadyEvent(), "<li> Criteria checked by TANGO </li>", false));

		sb.append("</table>");
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	private String htmlEventCriteriaLine(EventCriteria criteria, String text, int fieldNum) {
		String[]	array = { text, "Not set" };
		if (criteria!=null) {
			switch(fieldNum) {
			case 0:
				array[1] = getValue(criteria.getPeriod());
				break;
			case 1:
				array[1] = getValue(criteria.getRelChange());
				break;
			case 2:
				array[1] = getValue(criteria.getAbsChange());
				break;
			}
		}
		return htmlTableLine( array );
	}
	//===========================================================
	//===========================================================
	private String htmlFireEventLine(FireEvents events, String text, boolean fire) {
		String[]	array = { text, "Not set" };
		if (events!=null) {
			if (fire)
				array[1] = getValue(events.getFire());
			else
				array[1] = getValue(events.getLibCheckCriteria());
		}
		return htmlTableLine( array );
	}
	//===========================================================
	//===========================================================
	String htmlFullDocummentTitleAndContents(PogoDeviceClass cls) {

		StringBuffer sb = new StringBuffer(htmlPageTitle(cls.getName() +
				" Tango " + cls.getDescription().getLanguage() + " Class"));
		sb.append("	<br><br>\n");
		sb.append("	<ul>\n");
		sb.append("		" + htmlTitle("Contents :"));
		sb.append("\n		<ul>\n");
		sb.append("			<li> <a href=\"FullDocument.html#description\">  Description  </a>\n");
		sb.append("			<li> <a href=\"FullDocument.html#properties\">   Properties   </a>\n");
		
		//	Commands
		sb.append("			<li> <a href=\"FullDocument.html#commands\">     Commands     </a>\n");
		sb.append("			<ul>\n");
		for (Command command : cls.getCommands())
			sb.append("				<li> <a href=\"FullDocument.html#cmd" + command.getName() + "\"> " + command.getName() + " </a>\n");
		sb.append("			</ul>\n");
		
		//	Attributes
		sb.append("			<li> <a href=\"FullDocument.html#attributes\">   Attributes   </a>\n");
		sb.append("			<ul>\n");
		for (Attribute attribute : cls.getAttributes())
			sb.append("				<li> <a href=\"FullDocument.html#attr" + attribute.getName() + "\"> " + attribute.getName() + " </a>\n");
		for (Attribute attribute : cls.getDynamicAttributes())
			sb.append("				<li> <a href=\"FullDocument.html#attr" + attribute.getName() + "\"> " + attribute.getName() + " (dynamic) </a>\n");
		sb.append("			</ul>\n");
		
		//	States
		sb.append("			<li> <a href=\"FullDocument.html#states\">       States       </a>\n");
		sb.append("		</ul>\n");
		sb.append("	</ul>\n");
		sb.append("	<hr>\n");

		return sb.toString();
	}
	//===========================================================
	//===========================================================

	
	
	
	//===========================================================
	//===========================================================
	void retrieveProtectedDescriptionPart(PogoDeviceClass cls) {
		try {
			//	Get protected region from Description.html 
			String	fileName = cls.getDescription().getSourcePath() + "/doc_html/Description.html";
			String	prText = getProtectedRegionContent(fileName, "./doc_html/index.html");
			if (prText!=null) {
				//System.out.println(prText);
				//	And insert it in FullDocument.html file
				fileName = cls.getDescription().getSourcePath() + "/doc_html/FullDocument.html";
				insertInProtectedRegion(fileName, "./doc_html/FullDocument.html", prText + " Added !!");
			}
		}
		catch (Exception e) {
			System.err.println(e);
		}
	}
 	//===========================================================
	//===========================================================
}
