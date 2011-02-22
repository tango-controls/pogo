//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Pogo class files definition .
//
// $Author$
//
// $Revision$
//
// $Log$
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================


package pogo.gene;


public class ProjectFiles implements PogoDefs
{
	static private String	orig_path = null;
	static private String	orig_class_name = null;
	static private String	path;
	static private String	class_name;
	static private int		language;
	static private String	extention;

//============================================================================
/**
 *	
 */
//============================================================================
	public ProjectFiles(String path, String class_name, int language)
	{
		this.path       = path;
		this.class_name = class_name;
		this.language   = language;
		if (language==javaLang)
			extention = javaExtention;
		else
			extention = cppExtention;
	}
//============================================================================
/**
 *	Extracte class name, path and all project file names from file name passed.
 */
//============================================================================
	public ProjectFiles(String filename) throws PogoException
	{
		//	Check extention		
		int	ext_idx = filename.length()-1;
		while (ext_idx>0 && filename.charAt(ext_idx)!='.')
			ext_idx--;
		if (ext_idx==0)
			throw new PogoException(filename + ": Not Available File's Name !");
		extention = filename.substring(ext_idx);

		//	And use it to fixe language
		if (extention.equals(PogoDefs.javaExtention))
			language  = javaLang;
		else
		if (extention.equals(PogoDefs.cppExtention)	||
			extention.equals(PogoDefs.cppDefExtention))
		{
			language  = cppLang;
			extention = cppExtention;
		}
		else
			throw new PogoException("File's extention unknown !");
	
		//	get path
		int	end_path = filename.lastIndexOf("/", ext_idx);
		if (end_path<0)
		{
			//	Check for windaube
			end_path = filename.lastIndexOf("\\", ext_idx);
			if (end_path<0)
			{
				path = ".";
				class_name = filename.substring(0, ext_idx);
			}
		}
		//	path not null
		if (end_path>0)
		{
			path = filename.substring(0, end_path);
			class_name = filename.substring(end_path+1, ext_idx);
		}

		//	Get the original input data
		orig_path       = new String(path);
		orig_class_name = new String(class_name);
		//System.out.println(this);
	}

//============================================================================
//============================================================================
	public void updateOriginalFields()
	{
		orig_path       = new String(path);
		orig_class_name = new String(class_name);
	}
//============================================================================
//============================================================================
	public int	getLanguage()
	{
		return language;
	}
//============================================================================
//============================================================================
	public String getPath()
	{
		return path;
	}
//============================================================================
//============================================================================
	public String getOriginalPath()
	{
		return orig_path;
	}
//============================================================================
//============================================================================
	public void setPath(String path)
	{
		this.path = path;
	}
//============================================================================
//============================================================================
	public void setOriginalPath(String orig_path)
	{
		this.orig_path = orig_path;
	}
//============================================================================
//============================================================================
	public String getClassName()
	{
		return class_name;
	}
//============================================================================
//============================================================================
	public String getOriginalClassName()
	{
		return orig_class_name;
	}
//============================================================================
//============================================================================
	public void setClassName(String class_name)
	{
		this.class_name = class_name;
	}
//============================================================================
//============================================================================
	public void setOriginalClassName(String orig_class_name)
	{
		this.orig_class_name = orig_class_name;
	}
//============================================================================
//============================================================================
	public String getServer()
	{
		return path + "/" + class_name + extention;
	}
//============================================================================
//============================================================================
	public String getServer_h()
	{
		return path + "/" + class_name + ".h";
	}
//============================================================================
//============================================================================
	public String getServerClass()
	{
		return path + "/" + class_name + "Class" + extention;
	}
//============================================================================
//============================================================================
	public String getServerClass_h()
	{
		return path + "/" + class_name + "Class.h";
	}
//============================================================================
//============================================================================
	public String getAllowed()
	{
		if (language==javaLang)
			return "";
		else
			return path + "/" + class_name + "StateMachine" + extention;
	}
//============================================================================
//============================================================================
	private String doc_path = "";
	public String getDocHtml()
	{
		//	Check only first time.
		if (doc_path.equals("")==false)
			return doc_path;
		else
			doc_path = System.getProperty("HTML_DIR");

		//	Check if property found
		if (doc_path==null)
			doc_path = path + "/doc_html";
		else
		if (doc_path.startsWith("/"))	//	Absolute path
			doc_path = doc_path;
		else
			doc_path = path + "/" + doc_path;

		return doc_path;
	}
//============================================================================
//============================================================================
	public String getHtmlServerslist()
	{
		return "ServersList";
	}
//============================================================================
//============================================================================
	public String toString()
	{
		return	"ProjectFiles:\n"+
				"Path:	"     + path +
				"\nClass: 	" + getClassName() +
				"\nServer:	" + getServer() +
				"\nServer.h:	" + getServer_h() +
				"\nServerC:	" + getServerClass() +
				"\nServerC.h:	" + getServerClass_h();
	}
	
//============================================================================
//============================================================================
	public static void main(java.lang.String[] args) {
	
		String	filename = 
			"/segfs/tango/tools/pogo/test/cpp/PowerSupply/PowerSupply.h";
		
		try
		{
			ProjectFiles	p = new ProjectFiles(filename);
			System.out.println(p);
			
			System.out.println();
			System.out.println();
			p = new ProjectFiles("../template", "Test", cppLang);
			System.out.println(p);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
