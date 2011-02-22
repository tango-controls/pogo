//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::write_class_property
// 
// description : 	Set class description as property in database
//
//-----------------------------------------------------------------------------
void TemplateDevServClass::write_class_property()
{
	//	First time, check if database used
	//--------------------------------------------
	if (Tango::Util::_UseDb == false)
		return;

	//	Prepeare DbDatum
	//--------------------------------------------
	Tango::DbDatum	title("ProjectTitle");
	string	str_title(PogoProjectTitle);
	title << str_title;

	Tango::DbDatum	description("Description");
	PogoClassDescription;
	description << str_desc;
	
	Tango::DbData	data;
	data.push_back(title);
	data.push_back(description);

	//	Call database and and values
	//--------------------------------------------
	get_db_class()->put_property(data);
}
