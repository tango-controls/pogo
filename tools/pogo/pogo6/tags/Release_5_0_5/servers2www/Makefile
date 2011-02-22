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
# Revision 1.7  2005/10/21 06:39:27  pascal_verdier
# *** empty log message ***
#
# Revision 1.6  2005/10/19 09:28:07  pascal_verdier
# Full list of device servers added.
#
# Revision 1.5  2005/06/14 08:53:06  pascal_verdier
# If new class(es) found in repositories, send an email to tango mailing list.
#
# Revision 1.4  2005/03/15 08:55:39  pascal_verdier
# Pathes have been changed.
#
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
BIN_DIR   = ../../../../bin
JAVAFLAGS = -g -deprecation -d $(BIN_DIR)
JAVAC     = javac  $(JAVAFLAGS)



#-------------------------------------------------------------------

#-----------------------------------------------------------------

all:	serv2www 

serv2www:
	echo "making $(PACKAGE)"
	$(JAVAC) *.java

exe:
	@check_news

gene:
	@cd ../gene; make Pogo


clean:
	rm  -f $(BIN_DIR)/pogo/$(PACKAGE)/*.class





start:
	servers2www start

move:
	servers2www move

check:
	servers2www check

pages:
	servers2www pages

unzip:
	servers2www unzip

mail:
	servers2www mail

list:
	servers2www list

test:
	servers2www test

update:
	servers2www update

backup:
	servers2www backup

