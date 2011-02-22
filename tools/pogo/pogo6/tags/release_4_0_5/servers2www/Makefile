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


TANGO_HOME=	/segfs/tango
PACK_HOME= $(TANGO_HOME)/tools

JAVAC = javac
# -----------------------------------------------------------------
#
#		The compiler flags
#
#------------------------------------------------------------------

JAVAFLAGS = -g

#-------------------------------------------------------------------

#PACKAGE =	HTMLpage
#CL_LIST =	$(PACKAGE).class


PACKAGE =	servers2www
CL_LIST =	ScanRepository.class	\
			HTMLpage.class			\
			ModuleFamily.class		\
			Servers2www.class

DOC_HEADER	=	"<h1>POGO Java Program</h1>"
#
# Rule for compiling
#

.SUFFIXES:	.class .java
.java.class:
	$(JAVAC) $(JAVAFLAGS) $<

#-----------------------------------------------------------------

all:	gene $(PACKAGE)

$(PACKAGE): 	$(CL_LIST)

exe:
	@go

gene:
	@cd ../gene; make Pogo


clean:
	rm  -f *.class

