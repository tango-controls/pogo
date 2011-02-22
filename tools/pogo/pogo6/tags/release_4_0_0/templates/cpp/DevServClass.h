//=============================================================================
//
// file :         TemplateDevServClass.h
//
// description :  Include for the TemplateDevServClass root class.
//                This class is represents the singleton class for
//                the TemplateDevServ device class.
//                It contains all properties and methods which the 
//                TemplateDevServ requires only once e.g. the commands.
//			
// project :      TANGO Device Server
//
// $Author$
//
// $Revision$
//
// $Log$
// Revision 3.1  2004/09/06 09:27:05  pascal_verdier
// Modified for Tango 5 compatibility.
//
//
// copyleft :     European Synchrotron Radiation Facility
//                BP 220, Grenoble 38043
//                FRANCE
//
//=============================================================================
//
//  		This file is generated by POGO
//	(Program Obviously used to Generate tango Object)
//
//         (c) - Software Engineering Group - ESRF
//=============================================================================

#ifndef _TEMPLATEDEVSERVCLASS_H
#define _TEMPLATEDEVSERVCLASS_H

#include <tango.h>
#include <TemplateDevServ.h>


namespace TemplateDevServ
{
//=====================================
//	Define classes for attributes
//=====================================
class ATTRIBUTEAttrib: public Tango::Attr
{
public:
	ATTRIBUTEAttrib():Attr("ATTRIBUTE", DATA_TYPE, RW_TYPE) {};
	~ATTRIBUTEAttrib() {};
	
	virtual void read(Tango::DeviceImpl *dev,Tango::Attribute &att)
	{(static_cast<CLASS *>(dev))->read_ATTRIBUTE(att);}
	virtual void write(Tango::DeviceImpl *dev,Tango::WAttribute &att)
	{(static_cast<CLASS *>(dev))->write_ATTRIBUTE(att);}
	virtual bool is_allowed(Tango::DeviceImpl *dev,Tango::AttReqType ty)
	{return (static_cast<CLASS *>(dev))->is_ATTRIBUTE_allowed(ty);}
};


//=========================================
//	Define classes for commands
//=========================================
class DevTemplateCmd : public Tango::Command
{
public:
	DevTemplateCmd(const char   *name,
	               Tango::CmdArgType in,
				   Tango::CmdArgType out,
				   const char        *in_desc,
				   const char        *out_desc,
				   Tango::DispLevel  level)
	:Command(name,in,out,in_desc,out_desc, level)	{};

	DevTemplateCmd(const char   *name,
	               Tango::CmdArgType in,
				   Tango::CmdArgType out)
	:Command(name,in,out)	{};
	~DevTemplateCmd() {};
	
	virtual CORBA::Any *execute (Tango::DeviceImpl *dev, const CORBA::Any &any);
	virtual bool is_allowed (Tango::DeviceImpl *dev, const CORBA::Any &any)
	{return (static_cast<CLASS *>(dev))->is_COMMAND_allowed(any);}
};

//
// The TemplateDevServClass singleton definition
//

class TemplateDevServClass : public Tango::DeviceClass
{
public:

//	add your own data members here
//------------------------------------

public:
	Tango::DbData	cl_prop;

//	Method prototypes
	static TemplateDevServClass *init(const char *);
	static TemplateDevServClass *instance();
	~TemplateDevServClass();
	Tango::DbDatum	get_class_property(string &);
	
protected:
	TemplateDevServClass(string &);
	static TemplateDevServClass *_instance;
	void command_factory();
	void write_class_property();

private:
	void device_factory(const Tango::DevVarStringArray *);
};


}	//	namespace TemplateDevServ

#endif // _TEMPLATEDEVSERVCLASS_H
