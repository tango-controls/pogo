#+======================================================================
# $Source$
#
# Project:      Tango Device Server
#
# Description:  Makefile to generate the JAVA Tango classes package
#
# $Author$
#
# $Version: $
#
# $Log$
# Revision 3.19  2009/12/01 06:57:56  pascal_verdier
# DeviceID management added.
#
# Revision 3.18  2009/10/07 12:42:48  pascal_verdier
# IDL 4 added for Python (PyTango-7)
#
# Revision 3.17  2008/03/13 08:43:25  pascal_verdier
# Pb on get default value fixed.
#
# Revision 3.16  2008/02/22 10:09:24  pascal_verdier
# *** empty log message ***
#
# Revision 3.15  2007/08/07 13:04:42  pascal_verdier
# Generate Makefile and Windows Project menu added.
#
# Revision 3.14  2007/04/27 06:00:21  pascal_verdier
# Check for attribute collection added at creation.
#
# Revision 3.13  2007/04/17 14:03:06  pascal_verdier
# Attributes are now displayed separatly
# (Scalar, Spectrum and image attributes)
#
# Revision 3.12  2006/11/02 11:39:45  pascal_verdier
# Python code generation added.
#
# Revision 3.11  2006/09/19 13:19:55  pascal_verdier
# Allow boolean attribute for java servers.
# Bug in command factory for abstract class generation fixed.
# Bug in changing class name fixed.
# Abstarct classes sorted.
#
# Revision 3.10  2006/08/30 11:56:19  pascal_verdier
# Buttons text modified in attribute dialog.
#
# Revision 3.9  2006/06/26 09:24:53  pascal_verdier
# ango-5.5 compatiblity.
# extern C method added to be used as shared library.
# VCC 6 project file generated if running on Win32.
# .obj, .so, executable files generated in separated directories.
#
# Revision 3.8  2006/01/30 11:00:22  pascal_verdier
# Revision and cvs root displayed in tooltip.
#
# Revision 3.7  2005/12/09 13:54:02  pascal_verdier
# *** empty log message ***
#
# Revision 3.6  2005/12/08 09:25:08  pascal_verdier
# Release note html display added in help menu.
#
# Revision 3.5  2005/12/07 13:24:51  pascal_verdier
# *** empty log message ***
#
# Revision 3.4  2005/12/07 11:59:02  pascal_verdier
# Tag command added in Makefile.
#
# Revision 3.3  2005/11/24 08:28:45  pascal_verdier
# Analized with intelliJid.
#
# Revision 3.2  2005/11/07 08:40:46  pascal_verdier
# Memorized attribute written or not at starteup added.
#
# Revision 3.1  2005/10/19 09:57:36  pascal_verdier
# Returned to main trunk.
#
# Revision 3.0.1.20  2005/10/19 09:32:48  pascal_verdier
# path changed.
#
# Revision 3.0.1.19  2005/10/12 13:56:22  pascal_verdier
# Do not display any more splash screen at startup.
#
# Revision 3.0.1.18  2005/09/06 06:12:41  pascal_verdier
# *** empty log message ***
#
# Revision 3.0.1.17  2005/06/14 08:50:34  pascal_verdier
# SuperClass is replaced by AbstractClass.
#
# Revision 3.0.1.16  2005/03/30 09:13:33  pascal_verdier
# Command line has been added.
#
# Revision 3.0.1.15  2005/03/11 15:04:52  pascal_verdier
# Pathes have been changed.
#
# Revision 3.0.1.14  2005/03/11 14:15:35  pascal_verdier
# Abstract class management is not only in test mode.
#
# Revision 3.0.1.13  2005/03/02 14:01:53  pascal_verdier
# Managing Abstract Classes and inherited classes.
#
# Revision 3.0.1.12  2005/02/23 12:15:27  pascal_verdier
# 4.1.2 tag version.
#
# Revision 3.0.1.11  2005/01/25 15:29:09  pascal_verdier
# ATTR_SOLEIL param added to do not force upper case at befinig of attribute name.
#
# Revision 3.0.1.10  2005/01/24 08:43:37  pascal_verdier
# Modifying previous files if class name has changed.
#
# Revision 3.0.1.9  2005/01/17 15:45:43  pascal_verdier
# *** empty log message ***
#
# Revision 3.0.1.8  2005/01/12 12:48:47  pascal_verdier
# State Machine Dialog added.
#
# Revision 3.0.1.7  2004/12/08 10:04:14  pascal_verdier
# install_doc added.
#
# Revision 3.0.1.6  2004/11/29 09:54:41  pascal_verdier
# *** empty log message ***
#
# Revision 3.0.1.5  2004/10/21 06:55:13  pascal_verdier
# Check for non double item definitions
# for add, edit and clone item.
#
# Revision 3.0.1.4  2004/09/24 11:17:40  pascal_verdier
# Automatic revision number update at jar genaration.
#
# Revision 3.0.1.3  2004/08/26 07:25:58  pascal_verdier
# Attributes are now generated as class.
# Look and field changed.
#
# Revision 3.0.1.2  2003/09/10 08:08:01  pascal_verdier
# Minor changes
#
# Revision 3.0.1.1  2003/08/22 14:12:33  pascal_verdier
# *** empty log message ***
#
# Revision 3.0  2003/04/29 10:42:13  pascal_verdier
# TANGO 3.0 compatibility
# little bugs fixed.
#
# Revision 1.33  2003/01/16 14:32:36  verdier
# Tango classe files detected for open JFileChooser.
#
# Revision 1.32  2002/10/03 13:54:27  verdier
# Pogo has been used without known bug.
# Put class description as class property.
#
# Revision 1.31  2002/04/25 12:05:08  verdier
# IDL 2 implemented for c++ servers
#
# Revision 1.30  2002/02/06 15:21:23  verdier
# Java code generation updated.
#
# Revision 1.26  2001/12/18 10:13:30  verdier
# Attribute user default property code added.
#
# Revision 1.25  2001/11/09 09:46:57  verdier
# Many bugs fixed.
#
# Revision 1.24  2001/04/04 12:22:58  verdier
# Property management added for cpp.
#
# Revision 1.23  2000/10/24 06:21:22  verdier
# The compatibility with TANGO2 has been tested on DatabaseDs.
#
# Revision 1.20  2000/07/07 13:30:10  verdier
# Utilities added after first users.
#
# Revision 1.18  2000/06/20 06:57:35  verdier
# Right button double click management added for :
# editing src code, creating item, editing class....
# Little bugs fixed on generation/re-read src code.
#
# Revision 1.17  2000/05/12 07:37:10  verdier
#  Attributes management added for java generation.
#
# Revision 1.16  2000/04/26 06:04:00  verdier
# The save/restore file (.pogo) does not exist anymore.
# DevStates and DevStates allowed management is now available for java.
#
# Revision 1.15  2000/04/18 08:12:47  verdier
# Management of DevStates to allow command added.
#
# Revision 1.14  2000/04/12 09:25:43  verdier
# Methods to manage attributes are now generated
#  Only if at leat one attribute exists.
#
# Revision 1.13  2000/04/11 09:35:07  verdier
# Attributes management added.
#
# Revision 1.2  2000/03/03 09:43:00  verdier
# States management added
#
# Revision 1.1  2000/02/28 15:41:38  verdier
# Initial revision
#
# Revision 1.1  2000/02/28 14:57:44  verdier
# Initial revision
#
#
# copyleft :    European Synchrotron Radiation Facility
#               BP 220, Grenoble 38043
#               FRANCE
#
#-======================================================================


RELEASE    = 6.2.5
CVS_MODULE = pogo

TANGO_HOME	=	/segfs/tango
PACK_HOME	=	$(TANGO_HOME)/tools
DOC_ORIG    =   $(PACK_HOME)/pogo/doc
DOC_HOME    =	$(TANGO_HOME)/doc/www/tango/tango_doc/tools_doc/pogo_doc/
JAR_DIR		=	$(TANGO_JAR_HOME)/appli

# -----------------------------------------------------------------
#
#		The compiler flags
#
#---------------------

BIN_DIR   = ../../../../bin
JAVAFLAGS = -g -deprecation -d $(BIN_DIR)
JAVAC     = javac  $(JAVAFLAGS)

#-------------------------------------------------------------------

PACKAGE    = Pogo

DOC_HEADER = "<h1>POGO Classes</h1>"


#-----------------------------------------------------------------

all:	gene $(PACKAGE) exe


$(PACKAGE):
	$(JAVAC) *.java

gene:
	$(JAVAC) ../gene/*.java

exe:
	@./pogo

clean:
	rm  -f $(BIN_DIR)/pogo/gene/*.class
	rm  -f $(BIN_DIR)/pogo/appli/*.class


MAIN_CLASS=		$(PACKAGE)Appli
jar:
	echo "Updating date and revision number..."
	upd_rev  -f $(MAIN_CLASS).java  -r $(RELEASE)
	@java pogo.make_util.ReleaseNote2html -java "Pogo Release Note" pogo.appli
	$(JAVAC) ../gene/*.java
	$(JAVAC) ../class2www/*.java
	$(JAVAC) *.java
	@make_jar $(PACKAGE) $(RELEASE) $(JAR_DIR)

doc:
	@javadoc 				\
	-private 				\
	-version -author		\
	-nodeprecated			\
	-windowtitle POGO		\
	-header $(DOC_HEADER)	\
	-d ../doc/pr_guide		\
	*.java ../gene/*.java ../servers2www/*.java

install_doc:
	java pogo.make_util.ReleaseNote2html -html "Pogo Release Note"
	mv ReleaseNote.html  $(DOC_ORIG)
	cp $(DOC_ORIG)/*.html $(DOC_HOME)
	cp $(DOC_ORIG)/img/*  $(DOC_HOME)/img
	cp $(DOC_ORIG)/movies/*  $(DOC_HOME)/movies
	tango2www pogo

FTP_TARGET	=	maya:/ftp/pub/cs/tango/Pogo
JAR_FILE    =   $(PACKAGE)-$(RELEASE).jar
install_ftp:
	rcp $(JAR_DIR)/$(JAR_FILE) $(FTP_TARGET)
	rcp ReleaseNote $(FTP_TARGET)


PATCH_DIR  = ../properties/bin
PATCH_FILE = pogo/appli/DeviceIdProperties.class
DISTRIB    = $(TANGO_HOME)/source_release/tango-7.1.1/lib/java
distrib:
	cp $(JAR_DIR)/$(JAR_FILE)   $(DISTRIB)
	@echo "Patching $(DISTRIB)/$(JAR_FILE)"
	cd $(PATCH_DIR); jar uvf	$(DISTRIB)/$(JAR_FILE) $(PATCH_FILE)
	cd $(DISTRIB); rm Pogo.jar; ln -s $(JAR_FILE) Pogo.jar; ls -l Pogo*
