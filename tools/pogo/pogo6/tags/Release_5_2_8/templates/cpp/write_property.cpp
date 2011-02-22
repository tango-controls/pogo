//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::get_cvstag
// 
// description : 	parse TagName static var
//
//-----------------------------------------------------------------------------
string TemplateDevServClass::get_cvstag()
{
	string	strtag("");
	string	tagname(TagName);
	string	header = "$Name: ";
	string	endstr(" $");
	string::size_type	start = header.length();
	string::size_type	end   = tagname.find(endstr);
	if (end!=string::npos && end>start)
		strtag = tagname.substr(start, end-start);
	return strtag;
}

//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::get_cvstag
// 
// description : 	parse RcsId static var
//
//-----------------------------------------------------------------------------
string TemplateDevServClass::get_cvsroot()
{
	string	rcsId(RcsId);
	string	strloc("");
	string::size_type	start = rcsId.find("/");
	if (start!=string::npos)
	{
		string	filename(get_name());
		filename += "Class.cpp";
		string::size_type	end   = rcsId.find(filename);
		if (end>start)
		{
			strloc = rcsId.substr(start, end-start);
			//	Check if specific repository
			start = strloc.find("/cvsroot/");
			if (start!=string::npos && start>0)
			{
				string	repository = strloc.substr(0, start);
				if (repository.find("/segfs/")!=string::npos)
					strloc = "ESRF:" + strloc.substr(start, strloc.length()-start);
			}
		}
	}
	return strloc;
}
//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::write_class_property
// 
// description : 	Set class description as property in database
//
//-----------------------------------------------------------------------------
void TemplateDevServClass::write_class_property()
{
	//	Get and set cvs info
	string	cvsroot = get_cvsroot();
	string	cvstag = get_cvstag();
	set_cvs_location(cvsroot);
	set_cvs_tag(cvstag);

	//	Check if database used
	if (Tango::Util::_UseDb == false)
		return;

	Tango::DbData	data;
	string	classname = get_name();
	string	header;
	string::size_type	start, end;

	//	Put title
	Tango::DbDatum	title("ProjectTitle");
	string	str_title(PogoProjectTitle);
	title << str_title;
	data.push_back(title);

	//	Put Description
	Tango::DbDatum	description("Description");
	PogoClassDescription;
	description << str_desc;
	data.push_back(description);

	//	put cvs location
	Tango::DbDatum	cvs_loc("cvs_location");
	cvs_loc << cvsroot;
	data.push_back(cvs_loc);

	//	Get CVS tag revision
	Tango::DbDatum	cvs_tag("cvs_tag");
	cvs_tag << cvstag;
	data.push_back(cvs_tag);

	//	Get URL location
	string	httpServ(HttpServer);
	if (httpServ.length()>0)
	{
		Tango::DbDatum	db_doc_url("doc_url");
		db_doc_url << httpServ;
		data.push_back(db_doc_url);
	}

	//	Call database and and values
	//--------------------------------------------
	get_db_class()->put_property(data);
}
