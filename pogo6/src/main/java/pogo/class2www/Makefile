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
#
# copyleft :    European Synchrotron Radiation Facility
#               BP 220, Grenoble 38043
#               FRANCE
#
#-======================================================================


PACKAGE    = class2www
TANGO_HOME = /segfs/tango
JAR_DIR    = $TANGO_JAR_HOME/appli

# -----------------------------------------------------------------
#
#		The compiler flags
#
#------------------------------------------------------------------

BIN_DIR   = /segfs/tango/tools/bin
JAVAFLAGS = -g -deprecation -d $(BIN_DIR)
JAVAC = javac $(JAVAFLAGS)

#-------------------------------------------------------------------


#-----------------------------------------------------------------

all:	 trace classes

trace:
	@echo $(CLASSPATH)

classes:
	$(JAVAC) *.java

exe:
	./$(PACKAGE)

clean:
	rm  -Rf $(BIN_DIR)/admin/astor/access

