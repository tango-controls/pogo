
package pogo.appli;

public interface ReleaseNote
{
	public final String	str = 
		"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 3.2//EN\">\n" + 
		"<HTML>\n" + 
		"<HEAD>\n" + 
		"<Title> Release Note </Title>\n" + 
		"</HEAD>\n" + 
		"<BODY TEXT=\"#000000\" BGCOLOR=\"#FFFFFF\" LINK=\"#0000FF\" VLINK=\"#7F00FF\" ALINK=\"#FF0000\">\n" + 
		"<P><!-------TITLE------></P>\n" + 
		"<Center>	<h2>Pogo Release Note</h2>\n" + 
		"	(Generated Wed Apr 18 11:48:35 CEST 2007)</Center><Br>\n" + 
		"<li><b>Pogo-5.0.5:</b><Br>\n" + 
		"&nbsp; &nbsp; Attributes are now displayed separatly<Br>\n" + 
		"&nbsp; &nbsp; (Scalar, Spectrum and image attributes)<Br>\n" + 
		"<li><b>Pogo-5.0.4:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug in DsClass.h generation fixed.<Br>\n" + 
		"<li><b>Pogo-5.0.3:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug in python attribute properties (with coma) fixed.<Br>\n" + 
		"<li><b>Pogo-5.0.2:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug in attribute_factory fixed.<Br>\n" + 
		"<li><b>Pogo-5.0.1:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug in python init_device method fixed.<Br>\n" + 
		"&nbsp; &nbsp; Bug in abstract class generation fixed.<Br>\n" + 
		"<li><b>Pogo-5.0.0:</b><Br>\n" + 
		"&nbsp; &nbsp; Pyton code generation added.<Br>\n" + 
		"&nbsp; &nbsp; User code part added for C++.<Br>\n" + 
		"&nbsp; &nbsp; Bugs fixed in java code generation.<Br>\n" + 
		"&nbsp; &nbsp; Inheritance diagram added.<Br>\n" + 
		"<li><b>Pogo-4.6.0:</b><Br>\n" + 
		"&nbsp; &nbsp; Allow boolean attribute for java servers.<Br>\n" + 
		"&nbsp; &nbsp; Bug in command factory for abstract class generation fixed.<Br>\n" + 
		"&nbsp; &nbsp; Bug in changing class name fixed.<Br>\n" + 
		"&nbsp; &nbsp; Put class inheritance as class property.<Br>\n" + 
		"&nbsp; &nbsp; Edit Abstract class if any added.<Br>\n" + 
		"&nbsp; &nbsp; Generate inheritance diagram in index.html<Br>\n" + 
		"<li><b>Pogo-4.5.10:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug command comments fixed.<Br>\n" + 
		"<li><b>Pogo-4.5.9:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug project file when using abstract classes under win32 fixed.<Br>\n" + 
		"<li><b>Pogo-4.5.8:</b><Br>\n" + 
		"&nbsp; &nbsp; Change buttons text on attribute dialog.<Br>\n" + 
		"<li><b>Pogo-4.5.7:</b><Br>\n" + 
		"&nbsp; &nbsp; NullPointerException fixed in PogoString class.<Br>\n" + 
		"<li><b>Pogo-4.5.6:</b><Br>\n" + 
		"&nbsp; &nbsp; One line Added to get round a file database usage bug.<Br>\n" + 
		"<li><b>Pogo-4.5.5:</b><Br>\n" + 
		"&nbsp; &nbsp; Tango-5.5 compatiblity.<Br>\n" + 
		"&nbsp; &nbsp; extern C method added to be used as shared library.<Br>\n" + 
		"&nbsp; &nbsp; VCC 6 project file generated if running on Win32.<Br>\n" + 
		"&nbsp; &nbsp; .obj, .so, executable files generated in separated directories.<Br>\n" + 
		"<li><b>Pogo-4.5.1:</b><Br>\n" + 
		"&nbsp; &nbsp; Add a missing class to jar file.<Br>\n" + 
		"<li><b>Pogo-4.5.0:</b><Br>\n" + 
		"&nbsp; &nbsp; Add the pdf doc generation (under linux only).<Br>\n" + 
		"&nbsp; &nbsp; Revision and cvsroot get from CVS files if exist.<Br>\n" + 
		"<li><b>Pogo-4.4.10:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug in get_class_property() call position fixed.<Br>\n" + 
		"&nbsp; &nbsp; Bug in State description fixed.<Br>\n" + 
		"<li><b>Pogo-4.4.9:</b><Br>\n" + 
		"&nbsp; &nbsp; If ...StateMachine not found, display a warning message<Br>\n" + 
		"&nbsp; &nbsp; and generate a default one at next code genaration.<Br>\n" + 
		"<li><b>Pogo-4.4.8:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug fixed in command execute method.<Br>\n" + 
		"<li><b>Pogo-4.4.7:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug fixed in read property description (due to '*' char).<Br>\n" + 
		"&nbsp; &nbsp; Change in tag syntax.<Br>\n" + 
		"<li><b>Pogo-4.4.6:</b><Br>\n" + 
		"&nbsp; &nbsp; Display Release note in help menu added.<Br>\n" + 
		"<li><b>Pogo-4.4.5:</b><Br>\n" + 
		"&nbsp; &nbsp; make_util package added (for tag module).<Br>\n" + 
		"<li><b>Pogo-4.4.4:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug in renaming command has been fixed.<Br>\n" + 
		"<li><b>Pogo-4.4.3:</b><Br>\n" + 
		"&nbsp; &nbsp; Memorized attribute written or not at starteup added.<Br>\n" + 
		"<li><b>Pogo-4.4.2:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug on AttributeDialog fixed.<Br>\n" + 
		"&nbsp; &nbsp; Splash screen is not displayed any more at startup.<Br>\n" + 
		"<li><b>Pogo-4.4.1:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug on array property fixed.<Br>\n" + 
		"<li><b>Pogo-4.4.0:</b><Br>\n" + 
		"&nbsp; &nbsp; Property Wizard functionalities added.<Br>\n" + 
		"<li><b>Pogo-4.3.2:</b><Br>\n" + 
		"&nbsp; &nbsp; Bug on display message about Device_2 to Device_3 fixed.<Br>\n" + 
		"<li><b>Pogo-4.3.1:</b><Br>\n" + 
		"&nbsp; &nbsp; Check main.cpp file and add tg->server_cleanup() call if not already done.<Br>\n" + 
		"<li><b>Pogo-4.3.0:</b><Br>\n" + 
		"&nbsp; &nbsp; CVS tags to Database management added.<Br>\n" + 
		"&nbsp; &nbsp; State machine inherited from abstract class (if any) added.<Br>\n" + 
		"</Body>\n" + 
		"</Html>\n" + 
		"";
}
