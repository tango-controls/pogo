//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the IHtmlTemplates class definition .
//
// $Author$
//
// Copyright (C) :      2004,2005,2006,2007,2008
//						European Synchrotron Radiation Facility
//                      BP 220, Grenoble 38043
//                      FRANCE
//
// This file is part of Tango.
//
// Tango is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// Tango is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
// $Revision$
//
// $Log$
// Revision 1.1  2008/11/10 15:21:46  pascal_verdier
// *** empty log message ***
//
//-======================================================================



package pogo.class2www;


public interface IHtmlTemplates
{
	static final String	html_index = "index.html";
	static final String	html_alpha = "Alphabetical.html";
	static final String	html_list  = "ClassList.html";


	static final String	head_list =
	"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n" +
	"<HTML>\n" +
	"<HEAD>\n" +
	"<Title> Tango Device Server User's Guide </Title>\n" +
	"   <META NAME=\"GENERATOR\" CONTENT=\"Mozilla/4.08 [en] (X11; I; HP-UX B.10.20 9000/777) [Netscape]\">\n" +
	"   <TITLE> DS User's Guide </TITLE>\n" +
	"</HEAD>\n";

	static final String	index =
		"	<FRAMESET cols=\"20%,80%\">\n" +
		"		<FRAME src=\"" + html_list + "\"   name=\"left\">\n" +
		"		<FRAME src=\"$PATH/"+ html_index + "\" name=\"right\">\n" +
		"	</FRAMESET>\n";

	static final String	table_header = "<Table Border=2 Cellpadding=3 CELLSPACING=0 WIDTH=\"100%\">\n" +
			"<TR BGCOLOR=\"#CCCCFF\" CLASS=\"TableHeadingColor\">\n" +
			"<Td COLSPAN=4> <Font Size=+2><Center><b> $NUMBER $FAMILY  Classes  hosted by $REPOSITORY</b></td></Font></Center>\n" +
			"<TR BGCOLOR=\"#CCCCFF\" CLASS=\"TableHeadingColor\">\n" +
			"<Td><Center><b>Class Name</b></td></Center>\n" +
			"<Td><Center><Font Size=-1> <b>Lang</b></Font></td></Center>\n" +
			"<Td><Center><Font Size=-1><b>Repos</b></Font></td></Center>\n" +
			"\n" +
			"<Td><Center><b>Description</b></td></Center>\n\n";

	static final String	table_footer = "</Table>\n" +
			"<br>\n\n" +
			"<br>\n" +
			"<br>\n" +
			"<Center>\n" +
			"Last Update: $DATE\n" +
			"</Center>\n";

	static final String	table_line = "<Tr><Td><b><Font size=-1 COLOR=\"#0000FF\"> "+
			"<a href=\"$HOSTED_URL\" target=new> $CLASS_NAME </a> </b></Font></Td>\n" +
			"<Td><Center><Font size=-2 COLOR=\"#0000FF\"><b> $LANGUAGE </b></Font></Center></Td>\n" +
			"<Td><Center><Font size=-2 COLOR=\"#0000FF\"><b> $REPOS_TYPE </b></Font></Center></Td>\n" +
			"<Td><b><Font size=-1><a href=$REPOS_HOME/" + html_alpha + "#$CLASS_NAME> $DESCRIPTION </a></Font></b></Td></Tr> \n";


	static final String	list_line = "<li> <a href=\"$LINK\" Target=\"right\">\t$TEXT </a>\n";

	static final String	bottom =
			"	<form method=get action=http://www.google.com/custom class=\"google_form\" Target=\"right\">\n" +
			"	<input class=\"google_box\" type=text name=q maxlength=\"50\" value=\"\">\n" +
			"	<input type=\"submit\" value=\"Search\">\n" +
			"	<input type=hidden name=domains value=\"http://www.esrf.eu/computing/cs/tango/tango_doc/\">\n" +
			"	<input type=hidden name=sitesearch value=\"http://www.esrf.eu/computing/cs/tango/tango_doc/\" checked >\n" +
			"	<input type=hidden name=meta value=\"lr=lang_en\">\n <Br>" +
			"	<Li><a href=Alphabetical.html Target=\"right\">\t Alphabetical List</a><Br>\n";

	static final String	bottom_item =
			"	<Li><a href=$LINK Target=\"new\">\t $TEXT</a>\n";


	static final String	summary =
			"<Br /><Br /><A Name=\"$CLASS_NAME\" />"+
			"<HR WIDTH=\"100%\" />\n" +
			"<Table>\n"+
			"	<Tr><Td>Class:   </Td> <Td> <b> $CLASS_NAME  </b></Td></Tr>\n" +
			"	<Tr><Td>Module:  </Td> <Td> <b><a href=\"$HOSTED_URL\"> $MODULE_NAME </a></b></Td></Tr>\n" +
			"	<Tr><Td>Family:  </Td> <Td> <b> $FAMILY      </b></Td></Tr>\n" +
			"	<Tr><Td>Author:  </Td> <Td> <b> $AUTHOR   ($INSTITUTE)</b></Td> </Tr>\n" +
			"	<Tr><Td>Revision:</Td> <Td> <b> $REVISION    </b></Td> </Tr>\n" +
			"	<Tr><Td>Language:</Td> <Td> <b> $LANGUAGE    </b></Td></Tr>\n" +
			"	<Tr><Td>Hosted:  </Td> <Td> <b> $REPOSITORY ($REPOS_TYPE)</b> repository</Td></Tr>\n" +
			"	<Tr><Td>Doc.:   </Td> <Td> <b> <a HREF=\"$WEB_URL\">$WEB_URL </a </b></Td></Tr>\n" +
			"</Table>\n" +
			"<Br><b>Description:</b>\n" +
			"<ul>\n" +
			"	$DESCRIPTION\n" +
			"</ul>\n";


	static final String	warning = "<Center><b>\n" +
			"WARNING:\n" +
			"These classes have been developped for a specific usage\n" +
			"and are not guaranteed for all platforms.\n" +
			"</Center></b>\n" +
			"<Br>\n" +
			"<Br>\n\n";

	static final String	mail_hader =
			"<Center><h1><u>Tango Device Server Classes</u></h1></Center><Br /><Br />\n" +
			"<Br /><Br /><HR WIDTH=\"100%\" />\n" +
			"<b>$NB_CLASSES new class has been found during TANGO repositories scan.</b>\n";
}
