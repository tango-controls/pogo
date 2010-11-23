#+======================================================================
# $Source: /segfs/tango/cvsroot/tools/pogo_oaw/org/tango/pogo/pogo_gui/Makefile,v $
#
# Project:      Tango Device Server
#
# Description:  Makefile to generate the JAVA Tango classes package
#
# $Author: verdier $
#
# $Version: $
#
# $Log: Makefile,v $
#
# copyleft :    European Synchrotron Radiation Facility
#               BP 220, Grenoble 38043
#               FRANCE
#
#-======================================================================


CVS_MODULE = pogo_oaw

TANGO_HOME	=	/segfs/tango
PACK_HOME	=	$(TANGO_HOME)/tools
DOC_HOME    =	$(TANGO_HOME)/doc/www/tango/tango_doc/tools_doc/pogo_doc/
JAR_DIR		=	$(TANGO_JAR_HOME)/appli

# -----------------------------------------------------------------
#
#		The compiler flags
#
#---------------------

BIN_DIR   =  /segfs/tango/tools/pogo/bin
JAVAFLAGS =  -d $(BIN_DIR)
JAVAC     =  javac -g $(JAVAFLAGS)

#-------------------------------------------------------------------

PACKAGE    = Pogo

DOC_HEADER = "<h1>POGO Classes</h1>"


#-----------------------------------------------------------------

all:	package exe

package:
	$(JAVAC) *.java

exe:
	@./go



