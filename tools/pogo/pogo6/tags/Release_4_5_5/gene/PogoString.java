//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:	java source code for the TimeDs class .
//				This class is a singleton class and implements everything
//				which exists only once for all the Time ds object
//				It inherits from the DeviceClass class.
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.14  2006/01/12 10:02:35  pascal_verdier
// *** empty log message ***
//
// Revision 3.13  2005/12/21 15:35:11  pascal_verdier
// and again.
//
// Revision 3.12  2005/12/16 11:57:42  pascal_verdier
// idem.
//
// Revision 3.11  2005/12/09 13:56:56  pascal_verdier
// Fixe a bug in getDescription() method.
//
// Revision 3.10  2005/11/24 08:29:49  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.9  2005/03/21 09:03:10  pascal_verdier
// Bug on indent() fixed.
//
// Revision 3.8  2005/01/19 07:33:10  pascal_verdier
// Bug on Tab/spaces char fixed.
//
// Revision 3.7  2005/01/17 15:42:22  pascal_verdier
// Bug on double cotes in class description fixed.
//
// Revision 3.6  2004/11/22 15:29:31  pascal_verdier
// Javadoc tags correction.
//
// Revision 3.5  2004/11/22 11:07:46  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.4  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.3  2004/09/02 06:41:34  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
//
// Revision 3.2  2004/08/26 07:19:30  pascal_verdier
// Attributes are now generated as class.
//
// Revision 3.1  2003/09/10 08:11:30  pascal_verdier
// Minor bugs fixed.
// HTML doc generated with more details.
//
// Revision 3.0  2003/04/29 10:39:49  pascal_verdier
// TANGO 3.0 compatibility
// little bugs fixed.
//
// Revision 1.33  2003/01/16 14:32:36  verdier
// Tango classe files detected for open JFileChooser.
//
// Revision 1.32  2002/10/03 13:53:47  verdier
// Pogo has been used without known bug.
// Put class description as class property.
//
// Revision 1.31  2002/04/25 12:05:08  verdier
// IDL 2 implemented for c++ servers
//
// Revision 1.30  2002/02/06 15:20:20  verdier
// Java code generation updated.
//
// Revision 1.26  2001/12/18 10:12:22  verdier
// Attribute user default property code added.
//
// Revision 1.25  2001/11/09 09:46:13  verdier
// Many bugs fixed.
//
// Revision 1.24  2001/04/04 12:21:27  verdier
// Property management added for cpp.
//
// Revision 1.23  2000/10/24 06:20:13  verdier
// The compatibility with TANGO2 has been tested on DatabaseDs.
//
// Revision 1.22  2000/10/02 05:52:20  verdier
// Attribute code generated is now compatible with Tango 2.
//
// Revision 1.21  2000/09/22 08:54:31  verdier
// DevState & DevStatus are virtual.
// First tests with Tango2
// Taco import utility added.
//
// Revision 1.20  2000/07/07 13:29:17  verdier
// Utilities added after first users.
//
// Revision 1.18  2000/06/20 07:01:38  verdier
// Right button double click management added for :
// editing src code, creating item, editing class....
// Little bugs fixed on generation/re-read src code.
//
// Revision 1.17  2000/05/12 07:35:41  verdier
// Attributes management added for java generation.
//
// Revision 1.16  2000/04/26 06:06:52  verdier
// The save/restore file (.pogo) does not exist anymore.
// DevStates and DevStates allowed management is now available for java.
//
// Revision 1.15  2000/04/18 08:13:48  verdier
// Management of DevStates to allow command added.
//
// Revision 1.14  2000/04/12 09:24:10  verdier
// Methods to manage attributes are now generated
// Only if at leat one attribute exists.
//
// Revision 1.13  2000/04/11 09:34:13  verdier
// Attributes Management Added.
//
// Revision 1.12  2000/03/29 13:14:00  verdier
// Doc generation added.
//
// Revision 1.11  2000/03/21 12:52:37  verdier
// Command and class description from cpp source file.
// States (name and description) from cpp source file.
//
// Revision 1.10  2000/03/03 09:45:56  verdier
// States Management has been added (for .pogo files).
//
//  Revision 1.8  2000/01/12  10:23:28  verdier
//  Set as comments the methods where the arguments have been modified.
//
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================

package pogo.gene;


import java.util.StringTokenizer;
import java.util.Vector;
//=======================================================================
/**
 *	This class is used as a java.lang.String with other methods.
 *	These methods are some of ones that seems to be missed in String Class.
 */
//=======================================================================
public class PogoString
{
/*
 *	The string to work
 */
	public String str;
	
//=======================================================================
/**
 *	Constructor.
 *
 *	@param	str	The string to work
 */
//=======================================================================
	public PogoString(String str)
	{
		this.str = takeOffWindowsChar(str);
	}
	
//=======================================================================
/**
 *	Constructor.
 *
 *	@param	b	The byte array will be converted in string to work
 */
//=======================================================================
	public PogoString(byte[] b)
	{
		this.str = takeOffWindowsChar(b);
	}

//===============================================================
/**
 *	Take off Cr eventually added by Windows editor.
 */
//===============================================================
	String takeOffWindowsChar(String s)
	{
		return takeOffWindowsChar(s.getBytes());
	}
//===============================================================
/**
 *	Take off Cr eventually added by Windows editor.
 */
//===============================================================
	String takeOffWindowsChar(byte[] b_in)
	{
		//	Take off Cr eventually added by Windows editor
		int	nb = 0;
		for (int i=0 ; i<b_in.length ; i++)
			if (b_in[i]!=13)
				nb++;
		byte[]	b_out = new byte[nb];
		for (int i=0, j=0 ; i<b_in.length ; i++)
			if (b_in[i]!=13)
				b_out[j++] = b_in[i];

		return new String(b_out);			
	}
//=======================================================================
/**
 *	Search index of previous '\n'.
 *
 *	@param	start	index to start search.
 *	@return index of previous '\n'.
 */
//=======================================================================
	public int previousCr(int start)
	{
		while (start>=0 && str.charAt(start)!='\n')
			start--;
		start++;
		return start;
	}
//=======================================================================
/**
 *	Search index of next '\n'.
 *
 *	@param	start	index to start search.
 *	@return index of next '\n'.
 */
//=======================================================================
	public int nextCr(int start)
	{
		while (start<str.length() && str.charAt(start)!='\n')
			start++;
		return start;
	}
//=======================================================================
/**
 *	Search index of next test.
 *
 *	@param	start	index to start search.
 *	@return index of next test
 */
//=======================================================================
	public int inTest(int start)
	{
		if ((start=str.indexOf("if", start))<0)
			return start;

		start = str.indexOf("(", start);
		return start;
	}
//=======================================================================
/**
 *	Search index of the end of the test.
 *
 *	@param	start	index to start search.
 *	@return index of the end of the test.
 */
//=======================================================================
	public int outTest(int start)
	{
		start++;
		for (int cnt=1 ; cnt!=0 ; start++)
		{
			switch (str.charAt(start))
			{
			case '(':
				cnt++;
				break;
			case ')':
				cnt--;
				break;
			}
		}
		return start;
	}
//=======================================================================
/**
 *	Search index of next entry of the method.
 *
 *	@param	start	index to start search.
 *	@return index of next entry of the method.
 */
//=======================================================================
	public int inMethod(int start)
	{
		while (start<str.length() && str.charAt(start)!='{')
			start++;
		if (start<str.length())
			return start;
		else
			return -1;
	}
//=======================================================================
/**
 *	Search index of next out of the method.
 *
 *	@param	start	index to start search.
 *	@return index of next out of the method.
 */
//=======================================================================
	public int outMethod(int start)
	{
		int	end = start+1;
		for (int cnt=1 ; cnt!=0 && end<str.length() ; end++)
		{
			switch (str.charAt(end))
			{
			case '{':
				cnt++;
				break;
			case '}':
				cnt--;
				break;
			}
		}
		end = nextCr(end);
		if (end<str.length()-1)
			end++;
		return end;
	}
//=======================================================================
/**
 *	Extract the first method core found.
 *
 *	@return the first method core found.
 */
//=======================================================================
	public String extractMethodCore()
	{
		return extractMethodCore(0);
	}
//=======================================================================
/**
 *	Extract the first method core found.
 *
 *	@param	start	Start index to search next method.
 *	@return the first method core found.
 */
//=======================================================================
	public String extractMethodCore(int start)
	{
		//start = inMethod(start);
		//start = nextCr(start)+1;
		start = inMethod(start)+1;
		int	end = outMethod(start);
		while (end>start && str.charAt(end)!='}')
			end--;
		return str.substring(start, end);
	}


//=======================================================================
/**
 *	Extract params of a method call string.
 *
 *	@return a string array where items are field.
 */
//=======================================================================
	public String[] getParams()
	{
		return  getFields();
	}
	
//=======================================================================
/**
 *	Convert the string to a javadoc or doc++ comment.
 *	It search the '\n' and add after it the sequence " * ".
 *	Note that the first '*' char is not set by this method.
 *
 *	@return the string to a javadoc or doc++ comment.
 */
//=======================================================================
	public String setComments()
	{
		StringBuffer	sb = new StringBuffer("");
		
		int	start = 0;
		int	end;
		int	n = 0;
		while ((end=nextCr(start))<str.length())
		{
			end++;	// to keep the Cr itself
			if (n++>0)
				sb.append(" *	");
			sb.append(str.substring(start, end));
			start = end;
		}
		if (n>0)
			sb.append(" *	");
		sb.append(str.substring(start, end));
		return sb.toString();
	}
//=======================================================================
/**
 *	Add an anti-slash before double cotes char to be used in a string.
 */
//=======================================================================
	public void manageDoubleCotes()
	{
		int	idx=0;
		while ((idx=str.indexOf('\"', idx))>0)
		{
			insert(idx, "\\");
			idx += 2;
		}
	}
//=======================================================================
/**
 *	Insert a new String in PogoString Object.
 *
 *	@param	idx	Index where the string must be inserted.
 *	@param	s	String to be inserted.
 */
//=======================================================================
	public void insert(int idx, String s)
	{
		StringBuffer	sb = new StringBuffer(str);
		sb.insert(idx, s);
		str = sb.toString();
		//System.out.println("insert("+ idx + ", " +s+")");
	}
//=======================================================================
/**
 *	remove the first <i>pattern</i> found.
 *
 *	@param	pattern	Pattern String to be removed.
 */
//=======================================================================
	public void remove(String pattern)
	{
		remove(0, pattern);
	}
//=======================================================================
/**
 *	remove the first <i>pattern</i> found.
 *
 *	@param	start	Index to begin search of pattern.
 *	@param	pattern	Pattern String to be removed.
 */
//=======================================================================
	public void remove(int start, String pattern)
	{
		replace(start, pattern, "");
	}
//=======================================================================
/**
 *	replace the first <i>pattern</i> found by a new String.
 *
 *	@param	pattern	Pattern String to be replaced.
 *	@param	newOne	New String to replace pattern.
 */
//=======================================================================
	public void replace(String pattern, String newOne)
	{
		replace(0, pattern, newOne);
	}
//=======================================================================
/**
 *	replace the first <i>pattern</i> found by a new String.
 *
 *	@param	start	Index to begin search of pattern.
 *	@param	pattern	Pattern String to be replaced.
 *	@param	newOne	New String to replace pattern.
 */
//=======================================================================
	public void replace(int start, String pattern, String newOne)
	{
		StringBuffer	sb = new StringBuffer(str);
		int				start1, end;

		if ((start1=str.indexOf(pattern, start))<0)
			return;

		end = start1+pattern.length();
		if (newOne==null)
			sb.replace(start1, end, "");
		else
		{
			//System.out.println(start1+": " + newOne);
			sb.replace(start1, end, newOne);
		}

		str = sb.toString();
	}
//=======================================================================
/**
 *	Append a new string at the end of this object.
 *
 *	@param	newStr	the new string to be appened.
 */
//=======================================================================
	public void append(String newStr)
	{
		StringBuffer	sb = new StringBuffer(str);
		sb.append(newStr);
		str = sb.toString();
	}
//=======================================================================
/**
 *	@return the string used by this object whithout starting and ending
 *		space tab, or ',' char or comments tags.
 *		Like trim() in String class but extended.
 */
//=======================================================================
	public String noEdges()
	{
		return noEdges(0);
	}
//=======================================================================
/**
 *	@param start	index to start the trim.
 *
 *	@return the string used by this object whithout starting and ending
 *		space tab, or ',' char or comments tags.
 *		Like trim() in String class but extended.
 */
//=======================================================================
	public String noEdges(int start)
	{
		int	end = str.length()-1;
		
		while (start<end && (str.charAt(start)<'.' || str.charAt(start)=='/'))
			start++;
		while (start<=end && (str.charAt(end)<'.' || str.charAt(end)=='/'))
			end--;
		end++;
		return str.substring(start, end);
	}
//=======================================================================
/**
 *	extract the description text from comments.
 *
 *	@return the text found.
 */
//=======================================================================
	public String getDescription()
	{
		//	start at comments begining
		int	idx = str.indexOf("/**");
		if (idx>0)
			str = str.substring(idx);

		StringTokenizer st = new StringTokenizer(str, "\n");
		Vector	v  = new Vector();
		while(st.hasMoreTokens())
		{
			String	line = st.nextToken();
			if (line.indexOf("/**")>=0)
				continue;

			if (line.indexOf("@")>=0)		continue;
			if (line.indexOf("*/")>=0)		break;
			
            idx = line.indexOf("*");
            if (idx<0)
                idx = 0;
            else
                idx++;
            line = line.substring(idx).trim();
            v.add(line);
		}
		String	s = "";
		for (int i=0 ; i<v.size(); i ++)
		{
			s += (String)v.get(i);
			if (i<v.size()-1)
				s += "\n";
		}
		return s;
	}
//=======================================================================
/**
 *	Build class description file name from a full path string.
 *	It depends on language.
 *
 *	@return class description file name.
 */
//=======================================================================
	public String extractPathFromFullPath()
	{
		int 	end;

		//	Search last '/'
		//------------------------
		end = str.length()-1;
		while (end>0 && str.charAt(end)!='/')
			end--;
		if (end==0)
		{
			// search last '\' could be in window (!!!)
			end = str.length()-1;
			while (end>0 && str.charAt(end)!='\\')
				end--;
		}
		return str.substring(0, end);
	}
//============================================================================
/**
 * Replace all upper case by a "_" cahr and a lower case .
 *
 * @return The new value string.
 */
//============================================================================
	public String toLowerString()
	{
		StringBuffer	sb = new StringBuffer("");

		for (int i=0 ; i<str.length() ; i++)
		{
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')//	if upperr case
			{
				if (i>0)
					//	Check if previous char is not a n upper case too
					if (str.charAt(i-1)<'A' || str.charAt(i-1)>'Z')
						sb.append('_');

				//	Set it to lower case
				//---------------------------
				sb.append ((char)(str.charAt(i) + ('a'-'A')));
			}
			else
				sb.append(str.charAt(i));
		}
		return sb.toString();
	}
//=======================================================================
/**
 *	Remove all html tags excpet <br>
 */
//=======================================================================
	public String removeHtmlTags()
	{
		int	start, end=0;

		while ((start=str.indexOf("<", end))>=0)
		{
			end = str.indexOf(">", start);
			if (end>0)
			{
				end++;
				String	tag = str.substring(start, end).toLowerCase();
				if (!tag.equals("<br>"))
				{
					str = str.substring(0, start) + str.substring(end);
					end = start;
				}
			}
		}
		return str;
	}
//=======================================================================
//=======================================================================
	public int indexOf(String s)
	{
		return str.indexOf(s);
	}
//=======================================================================
//=======================================================================
	public int indexOf(String s, int i)
	{
		return str.indexOf(s, i);
	}
//=======================================================================
//=======================================================================
	public int lastIndexOf(String s)
	{
		return str.lastIndexOf(s);
	}
//=======================================================================
//=======================================================================
	public int lastIndexOf(String s, int i)
	{
		return str.lastIndexOf(s, i);
	}
//=======================================================================
//=======================================================================
	public String substring(int start, int end)
	{
		return str.substring(start, end);
	}
//=======================================================================
//=======================================================================
	public String substring(int start)
	{
		return str.substring(start);
	}
//=======================================================================
/**
 *	@return the string used by this object
 */
//=======================================================================
	public String toString()
	{
		return str;
	}

//=======================================================================
/**
 *	Extract fields of 'C' structure string.
 *
 *	@return a string array where items are field.
 */
//=======================================================================
	public String[] getFields()
	{
		//	Take Off dummy char if any
		str = trim('\n');
		str = trim(';');
		str = trim(',');
		str = str.trim();
		str = trim('{');
		str = trim('}');

		//	The 2 following actions are used for command factory
		//----------------------------------------------------------
		//	Replace '(' by ',' separator if not between quotes
		boolean	in_quotes = false;
		for (int i=0 ; i<str.length() ; i++)
		{
			if (str.charAt(i)=='\"')
				in_quotes = !in_quotes;
			else
			if (str.charAt(i)=='(' && !in_quotes)
				str = str.substring(0, i) + ',' + str.substring(i+1);
		}

		//	and remove ')' at end
		str = trim(')');

		//	The following action replace ',' if between cotes
		//	(because it is not a separator) by a dummy char
		replaceCommaByDummyChar();

		//	Get the tokens
		StringTokenizer st = new StringTokenizer(str, ",");
		Vector			v = new Vector();
		while (st.countTokens()>0)
			v.add(st.nextToken().trim());

		//	And put them in String array
		String[]	fields = new String[v.size()];
		for (int i=0 ; i<v.size() ; i++)
		{
			PogoString p = new PogoString((String)v.elementAt(i));
			//	return from dummy char to comma
			while (p.str.indexOf(DUMMY_CHAR)>=0)
				p.replace(DUMMY_CHAR, ",");
			//	take off '\"' char
			fields[i] = p.trim('"');
		}
		return fields;
	}

//=======================================================================
//=======================================================================
	public String[] string2array(String delim)
	{
		StringTokenizer st = new StringTokenizer(str, delim);
		Vector	v    = new Vector();
		while(st.hasMoreTokens())
			v.add(st.nextToken());
		//	Put it in a String array
		String[]	list = new String[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			list[i] = (String)v.elementAt(i);
		return list;
	}
//=======================================================================
//=======================================================================
	public String[] string2array()
	{
		StringTokenizer st = new StringTokenizer(str);
		Vector	v    = new Vector();
		while(st.hasMoreTokens())
			v.add(st.nextToken());
		//	Put it in a String array
		String[]	list = new String[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			list[i] = (String)v.elementAt(i);
		return list;
	}
//=======================================================================
//=======================================================================
	private static final String	DUMMY_CHAR = "`";
	private void replaceCommaByDummyChar()
	{
		int		start=0;
		int 	end;

		//	Get string between cotes
		while((start=str.indexOf("\"", start))>0)
		{
			start++;
			if ((end=str.indexOf("\"", start))>0)
			{
				//	And replace by dummy char
				PogoString	pgs = new PogoString(str.substring(start, end));
				while (pgs.str.indexOf(",")>=0)
					pgs.replace(",", DUMMY_CHAR);
				str = str.substring(0, start) + pgs.str + str.substring(end);
			}
			start = end+2;
		}
	}
//=======================================================================
/**
 *	Remove all byte c at start and at end if any.
 */
//=======================================================================
	public String trim(char c)
	{
		//	Check if length is null
		if (str.length()==0)
			return "";
		else
		if (str.length()==1)
			return str;

		//	trim at start then at end
		int	start = 0;
		int	end   = str.length()-1;
		while (str.charAt(start)==c && start<end)
			start++;

		while (str.charAt(end)==c && end>start)
			end--;
		//	Return result
		if (start>end)
			return "";
		else
		{
			String	s = str.substring(start, end+1);
			//	Could be just a quote
			if (s.equals("\""))
				return "";
			else
				return s;
		}
	}
//=======================================================================
//=======================================================================
	void indent(int val)
	{
		int 	start = 0;
		while (str.charAt(start)=='\n')
			start++;
		String	result = "";
		for (int end=nextCr(start+1) ; end<str.length() ; end=nextCr(start+1))
		{	
			end++;
			if (val<0)
			{
				if (start-val<end)
				{
					//	check if a space or tab char
					char	c = str.charAt(start);
					if (c==' ' || c=='\t')
						result += str.substring(start-val, end);
					else
						result += str.substring(start, end);
				}
			}
			else
			{
				result += "\t" + str.substring(start, end);
			}
			start = end;
		}
		str = result;
	}
//=======================================================================
//=======================================================================
	boolean isCommentLine(int position)
	{
		//	Get Line
		int	start = str.lastIndexOf("\n", position);
		int	end   = str.indexOf("\n", position);
		String	line;
		if (start<0)
			start = 0;
		if (end<0)
			line = str.substring(start);
		else
			line = str.substring(start, end);

		//	Check if comments		
		int	idx = line.indexOf("//");
		if (idx<0)
			return false;

		return (idx < (position-start));
	}
//=======================================================================
//=======================================================================
	byte[] getBytes()
	{
		return str.getBytes();
	}
//=======================================================================
//=======================================================================
	public static void main(java.lang.String[] args) {
	
		PogoString	pgs = new PogoString(
"<Td><b><a href=ArchivingWatcher/doc_html/index.html> This device is in charge of controlling HDB archiving. It does so by comparing the theoretical archiving (the attributes that have been registered for archiving) with the effective archiving (are records being added for the registered attributes).\n<Br>"+
"If the effective archiving matches the theoretical a..... <Br>\n" +
"If (x < y)  dont do it.</a></b></Td></Tr>"
);
/*
//"/*\n" +
//" *	Device States Description:\n" +
" *	Tango::UNKNOWN :	This device server has NOT been correctly initialised.\n" +
" *	Tango::ON :	All controlled servers are running.\n" +
" *	Tango::ALARM :	At least one controled device server is not running.\n" +
" */
//");


//			"/**\n" +
//			" *	Type of formula used to calculate the value attribute.\n" +
//			" *	could be set to POLYNOM or POW10.\n" +
//			" *	POLYNOM: the formula used is :\n" +
//			" *	a0 + a1X + a2X^2 + a3X^3\n" +
//			" *	POW10: the formula is :\n" +
//			" *	a0 + a1*10^(a2 + a3*X))\n" +
//			" */\n"+
//			"        string  calc_type;");
//		System.out.println(pgs.getDescription());
		System.out.println(pgs.removeHtmlTags());
	}
}
/* end of $Source$ */
