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
# Revision 1.3  2004/11/12 08:04:08  pascal_verdier
# Download of doc and pdf documents added.
#
# Revision 1.2  2004/10/25 14:01:54  pascal_verdier
# Servers are now sorted in sections.
#
# Revision 1.1  2004/09/02 06:46:11  pascal_verdier
# *** empty log message ***
#
#
# copyleft :    European Synchrotron Radiation Facility
#               BP 220, Grenoble 38043
#               FRANCE
#
#-======================================================================


PACKAGE =	servers2www
TANGO_HOME=	/segfs/tango
PACK_HOME= $(TANGO_HOME)/tools

JAVAC = javac
# -----------------------------------------------------------------
#
#		The compiler flags
#
#------------------------------------------------------------------
BIN_DIR   = ../bin
JAVAFLAGS = -g -deprecation -d $(BIN_DIR)
JAVAC     = javac  $(JAVAFLAGS)



#-------------------------------------------------------------------

#-----------------------------------------------------------------

all:	gene serv2www

serv2www:
	echo "making $(PACKAGE)"
	$(JAVAC) *.java

exe:
	@go

gene:
	@cd ../gene; make Pogo


clean:
	rm  -f $(BIN_DIR)/pogo/$(PACKAGE)/*.class

