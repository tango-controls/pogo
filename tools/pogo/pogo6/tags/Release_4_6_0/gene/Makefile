#+======================================================================
# $Source$
#
# Project:      Tango Device Server
#
# Description:  Makefile to generate the JAVA Tango classes package
#
# $Author$
#
# $Version$
#
# $Log$
# Revision 1.8  2006/06/26 09:22:47  pascal_verdier
# ango-5.5 compatiblity.
# extern C method added to be used as shared library.
# VCC 6 project file generated if running on Win32.
# .obj, .so, executable files generated in separated directories.
#
# Revision 1.7  2006/01/30 11:02:10  pascal_verdier
# Revision and cvsroot are taken from CVS files if exists.
# Doc in pdf generated if linux.
#
# Revision 1.6  2005/11/24 08:29:16  pascal_verdier
# Analized with intelliJid.
#
# Revision 1.5  2005/10/19 09:31:21  pascal_verdier
# path changed.
#
# Revision 1.4  2005/06/15 06:56:32  pascal_verdier
# *** empty log message ***
#
# Revision 1.3  2005/06/14 08:45:00  pascal_verdier
# Minor change.
#
# Revision 1.2  2005/03/11 15:06:00  pascal_verdier
# Pathes have been changed.
#
# Revision 1.1  2004/12/10 14:04:47  pascal_verdier
# *** empty log message ***
#
# Revision 1.32  2002/10/03 13:53:47  verdier
# Pogo has been used without known bug.
# Put class description as class property.
#
# Revision 1.30  2002/02/06 15:20:20  verdier
# Java code generation updated.
#
# Revision 1.26  2001/12/18 10:12:22  verdier
# Attribute user default property code added.
#
# Revision 1.25  2001/11/09 09:46:13  verdier
# Many bugs fixed.
#
# Revision 1.24  2001/04/04 12:21:27  verdier
# Property management added for cpp.
#
# Revision 1.23  2000/10/24 06:20:13  verdier
# The compatibility with TANGO2 has been tested on DatabaseDs.
#
# Revision 1.22  2000/10/02 05:52:20  verdier
# Attribute code generated is now compatible with Tango 2.
#
# Revision 1.20  2000/07/07 13:29:17  verdier
# Utilities added after first users.
#
# Revision 1.18  2000/06/20 07:01:38  verdier
# Right button double click management added for :
# editing src code, creating item, editing class....
# Little bugs fixed on generation/re-read src code.
#
# Revision 1.17  2000/05/12 07:35:41  verdier
# Attributes management added for java generation.
#
# Revision 1.16  2000/04/26 06:06:52  verdier
# The save/restore file (.pogo) does not exist anymore.
# DevStates and DevStates allowed management is now available for java.
#
# Revision 1.15  2000/04/18 08:13:48  verdier
# Management of DevStates to allow command added.
#
# Revision 1.14  2000/04/12 09:24:10  verdier
# Methods to manage attributes are now generated
# Only if at leat one attribute exists.
#
# Revision 1.13  2000/04/11 09:34:13  verdier
# Attributes Management Added.
#
# Revision 1.11  2000/03/21 12:52:37  verdier
# Command and class description from cpp source file.
# States (name and description) from cpp source file.
#
# Revision 1.10  2000/03/03 09:45:56  verdier
# States Management has been added (for .pogo files).
#
# Revision 1.8  2000/01/12  10:23:28  verdier
# Set as comments the methods where the arguments have been modified.
#
#
# copyleft :    European Synchrotron Radiation Facility
#               BP 220, Grenoble 38043
#               FRANCE
#
#-======================================================================


TANGO_HOME=	/segfs/tango
PACK_HOME= $(TANGO_HOME)/tools
JAR_DIR = $(PACK_HOME)/jar

# -----------------------------------------------------------------
#
#		The compiler flags
#
#------------------------------------------------------------------

BIN_DIR   = ../../../../bin
JAVAFLAGS = -g -deprecation -d $(BIN_DIR)
JAVAC     = javac  $(JAVAFLAGS)

#-------------------------------------------------------------------

PACKAGE =	Pogo

#-----------------------------------------------------------------

all:	gene  exe

gene:
	$(JAVAC) *.java

appli:
	@cd ../appli; make $(PACKAGE)

exe:
	@cd ../appli; pogo
#	java pogo.gene.PogoString

clean:
	rm  -f $(BIN_DIR)/pogo/gene/*.class
	rm  -f $(BIN_DIR)/pogo/appli/*.class

