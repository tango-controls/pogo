static const char *RcsId     = "$Header$";
static const char *TagName   = "$Name$";
static const char *HttpServer= "http://www.esrf.fr/computing/cs/tango/tango_doc/ds_doc/";
//+=============================================================================
//
// file :        TemplateDevServClass.cpp
//
// description : C++ source for the TemplateDevServClass. A singleton
//               class derived from DeviceClass. It implements the
//               command list and all properties and methods required
//               by the TemplateDevServ once per process.
//
// project :     TANGO Device Server
//
// $Author$
//
// $Revision$
//
// $Log$
// Revision 3.10  2006/11/15 14:17:10  pascal_verdier
// Remove warnings from compiler.
//
// Revision 3.9  2006/06/26 09:31:03  pascal_verdier
// Tango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.8  2005/09/08 08:45:23  pascal_verdier
// For Pogo-4.4.0 and above.
//
// Revision 3.7  2005/06/17 08:53:21  pascal_verdier
// CVS tags management added.
//
// Revision 3.6  2005/05/19 13:11:18  pascal_verdier
// *** empty log message ***
//
// Revision 3.5  2005/03/02 14:06:15  pascal_verdier
// namespace is different than class name.
//
// Revision 3.4  2004/12/10 13:23:27  pascal_verdier
// Pogo-4.0.0 (Ready for Tango5).
//
// Revision 3.3  2004/11/08 14:27:21  pascal_verdier
// *** empty log message ***
//
// Revision 3.2  2004/11/08 11:33:16  pascal_verdier
// if device property not found in database, it takes class property value if exists.
//
// Revision 3.1  2004/09/06 09:27:05  pascal_verdier
// Modified for Tango 5 compatibility.
//
//
// copyleft :   European Synchrotron Radiation Facility
//              BP 220, Grenoble 38043
//              FRANCE
//
//-=============================================================================
//
//  		This file is generated by POGO
//	(Program Obviously used to Generate tango Object)
//
//         (c) - Software Engineering Group - ESRF
//=============================================================================


#include <tango.h>

#include <TemplateDevServ.h>
#include <TemplateDevServClass.h>


//+----------------------------------------------------------------------------
/**
 *	Create TemplateDevServClass singleton and return it in a C function for Python usage
 */
//+----------------------------------------------------------------------------
extern "C" {
#ifdef WIN32

__declspec(dllexport)

#endif

	Tango::DeviceClass *_create_TemplateDevServ_class(const char *name) {
		return TemplateDevServ_ns::TemplateDevServClass::init(name);
	}
}


namespace TemplateDevServ_ns
{
TemplateBlock
//+----------------------------------------------------------------------------
//
// method : 		DevTemplateCmd::execute()
// 
// description : 	method to trigger the execution of the command.
//                PLEASE DO NOT MODIFY this method core without pogo   
//
// in : - device : The device on which the command must be executed
//		- in_any : The command input data
//
// returns : The command output data (packed in the Any object)
//
//-----------------------------------------------------------------------------
CORBA::Any *DevTemplateCmd::execute(Tango::DeviceImpl *device,const CORBA::Any &in_any)
{

	cout2 << "DevTemplateCmd::execute(): arrived" << endl;

	extract(in_any, argin);

	return insert((static_cast<TemplateDevServ *>(device))->dev_template_cmd(argin));
}


TemplateBlock



//
//----------------------------------------------------------------
//	Initialize pointer for singleton pattern
//----------------------------------------------------------------
//
TemplateDevServClass *TemplateDevServClass::_instance = NULL;

//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::TemplateDevServClass(string &s)
// 
// description : 	constructor for the TemplateDevServClass
//
// in : - s : The class name
//
//-----------------------------------------------------------------------------
TemplateDevServClass::TemplateDevServClass(string &s):DeviceClass(s)
{

	cout2 << "Entering TemplateDevServClass constructor" << endl;
	
	cout2 << "Leaving TemplateDevServClass constructor" << endl;

}
//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::~TemplateDevServClass()
// 
// description : 	destructor for the TemplateDevServClass
//
//-----------------------------------------------------------------------------
TemplateDevServClass::~TemplateDevServClass()
{
	_instance = NULL;
}

//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::instance
// 
// description : 	Create the object if not already done. Otherwise, just
//			return a pointer to the object
//
// in : - name : The class name
//
//-----------------------------------------------------------------------------
TemplateDevServClass *TemplateDevServClass::init(const char *name)
{
	if (_instance == NULL)
	{
		try
		{
			string s(name);
			_instance = new TemplateDevServClass(s);
		}
		catch (bad_alloc)
		{
			throw;
		}		
	}		
	return _instance;
}

TemplateDevServClass *TemplateDevServClass::instance()
{
	if (_instance == NULL)
	{
		cerr << "Class is not initialised !!" << endl;
		exit(-1);
	}
	return _instance;
}

//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::command_factory
// 
// description : 	Create the command object(s) and store them in the 
//			command list
//
//-----------------------------------------------------------------------------
void TemplateDevServClass::command_factory()
{
	command_list.push_back(new DevTemplateCmd("DevReadPosition",
						      Tango::DEV_LONG,
						      Tango::DEV_LONG,
						      "Motor number (0-7)",
						      "Motor position"));
}

//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::get_class_property
// 
// description : 	Get the class property for specified name.
//
// in :		string	name : The property name
//
//+----------------------------------------------------------------------------
Tango::DbDatum TemplateDevServClass::get_class_property(string &prop_name)
{
	for (unsigned int i=0 ; i<cl_prop.size() ; i++)
		if (cl_prop[i].name == prop_name)
			return cl_prop[i];
	//	if not found, return  an empty DbDatum
	return Tango::DbDatum(prop_name);
}
//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::get_default_device_property()
// 
// description : 	Return the default value for device property.
//
//-----------------------------------------------------------------------------
Tango::DbDatum TemplateDevServClass::get_default_device_property(string &prop_name)
{
	for (unsigned int i=0 ; i<dev_def_prop.size() ; i++)
		if (dev_def_prop[i].name == prop_name)
			return dev_def_prop[i];
	//	if not found, return  an empty DbDatum
	return Tango::DbDatum(prop_name);
}

//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::get_default_class_property()
// 
// description : 	Return the default value for class property.
//
//-----------------------------------------------------------------------------
Tango::DbDatum TemplateDevServClass::get_default_class_property(string &prop_name)
{
	for (unsigned int i=0 ; i<cl_def_prop.size() ; i++)
		if (cl_def_prop[i].name == prop_name)
			return cl_def_prop[i];
	//	if not found, return  an empty DbDatum
	return Tango::DbDatum(prop_name);
}
//+----------------------------------------------------------------------------
//
// method : 		TemplateDevServClass::device_factory
// 
// description : 	Create the device object(s) and store them in the 
//			device list
//
// in :		Tango::DevVarStringArray *devlist_ptr : The device name list
//
//-----------------------------------------------------------------------------
void TemplateDevServClass::device_factory(const Tango::DevVarStringArray *devlist_ptr)
{

	//	Create all devices.(Automatic code generation)
	//-------------------------------------------------------------
	for (unsigned long i=0 ; i < devlist_ptr->length() ; i++)
	{
		cout4 << "Device name : " << (*devlist_ptr)[i].in() << endl;
						
		// Create devices and add it into the device list
		//----------------------------------------------------
		device_list.push_back(new TemplateDevServ(this, (*devlist_ptr)[i]));							 

		// Export device to the outside world
		// Check before if database used.
		//---------------------------------------------
		if ((Tango::Util::_UseDb == true) && (Tango::Util::_FileDb == false))
			export_device(device_list.back());
		else
			export_device(device_list.back(), (*devlist_ptr)[i]);
	}
	//	End of Automatic code generation
	//-------------------------------------------------------------

}

}	//	namespace TemplateDevServ_ns
