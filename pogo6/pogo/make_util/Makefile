#+======================================================================
# $Source: /cvsroot/tango-cs/tango/tools/pogo/make_util/Makefile,v $
#
# Project:      Tango Device Server
#
# Description:  Makefile to generate the JAVA Tango classes package
#
# $Author$
#
# $Version$
#
# $Log: Makefile,v $
# Revision 1.1  2005/12/07 12:48:13  pascal_verdier
# *** empty log message ***
#
#
# copyleft :    European Synchrotron Radiation Facility
#               BP 220, Grenoble 38043
#               FRANCE
#
#-======================================================================

PACKAGE    = make_util
TANGO_HOME = /segfs/tango

# -----------------------------------------------------------------
#
#		The compiler flags
#
#------------------------------------------------------------------

BIN_DIR   = ../../../../bin
JAVAFLAGS = -g -deprecation -d $(BIN_DIR)
JAVAC = javac $(JAVAFLAGS)

#-------------------------------------------------------------------


#-----------------------------------------------------------------

all:	 $(PACKAGE)


$(PACKAGE):
	$(JAVAC) *.java

exe:
	./go

clean:
	rm  -f $(BIN_DIR)/pogo/make_util/*.class
