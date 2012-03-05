#+======================================================================
#
# Project:      Tango Device Server
#
# Description:  Makefile to generate the Pogo classes
#
# $Author: verdier $
#
# $Revision: $
#
#-======================================================================


RELEASE    = 8.0.0
CVS_MODULE = pogo_oaw

TANGO_HOME	=	/segfs/tango
PACK_HOME	=	$(TANGO_HOME)/tools
DOC_HOME    =	$(TANGO_HOME)/doc/www/tango/tango_doc/tools_doc/pogo_doc/
JAR_DIR		=	$(TANGO_JAR_HOME)/appli

SVN_POGO_PATH = $(SVN_TCS)/tools/pogo
SVN_TAG_REV    = Release-$(RELEASE)

# -----------------------------------------------------------------
#
#		The compiler flags
#
#---------------------

BIN_DIR   = $(TANGO_HOME)/tools/pogo/bin
JAVAFLAGS =  -d $(BIN_DIR)
JAVAC     =  javac -g $(JAVAFLAGS)

#-------------------------------------------------------------------

PACKAGE    = Pogo

DOC_HEADER = "<h1>POGO Classes</h1>"


#-----------------------------------------------------------------

all:	 GUI exe

full:	constants	utils	GUI

GUI:
	$(JAVAC) *.java

constants:
	$(JAVAC) PogoConst.java

utils:
	$(JAVAC) tools/*.java

exe:
	@./go
#	/segfs/tango/tmp/pogo/zip/pogo/bin/pogo-configure



MAIN_CLASS=		$(PACKAGE)GUI
version:
	echo "Updating date and revision number..."
	upd_rev  -f PogoConst.java  -r $(RELEASE)
	@java pogo.make_util.ReleaseNote2html -java "Pogo Release Note" org.tango.pogo.pogo_gui
	@make GUI

jar:
	@echo "------------------------------------"
	@echo "  Use Eclipse to build jar file !"
	@echo "------------------------------------"

doc:
	@javadoc 				\
	-private 				\
	-version -author		\
	-nodeprecated			\
	-windowtitle POGO		\
	-header $(DOC_HEADER)	\
	-d doc/pr_guide		\
	*.java tools/*.java 

clean:
	rm -R $(BIN_DIR)/pogo/pogo_gui

ECLIPSE_JAR_DIR=/users/verdier/pogo_jar/jar
TARGET_JAR_DIR=/segfs/tango/release/java/appli
JAR_FILE=org.tango.pogo
install:
	@cp $(ECLIPSE_JAR_DIR)/$(JAR_FILE).jar $(TARGET_JAR_DIR)/$(JAR_FILE)-$(RELEASE).jar
	@cd $(TARGET_JAR_DIR); \
	rm $(JAR_FILE).jar;   \
	ln -s $(JAR_FILE)-$(RELEASE).jar  $(JAR_FILE).jar; \
	ls -l $(JAR_FILE)*.jar

#	mv $(TARGET_JAR_DIR)/$(JAR_FILE)-$(RELEASE).jar  $(TARGET_JAR_DIR)/$(JAR_FILE)-$(RELEASE)-tmp.jar

FTP_TARGET	=	maya:/ftp/pub/cs/tango/Pogo
install_ftp:
	@echo "rcp $(JAR_FILE) $(FTP_TARGET)"
	@cd $(TARGET_JAR_DIR); rcp $(JAR_FILE)-$(RELEASE).jar  $(FTP_TARGET)
	@rcp ReleaseNote $(FTP_TARGET)

TANGO_REV=tango-7.2.2
SRC_REL_PATH=$(TANGO_HOME)/source_release/$(TANGO_REV)/lib/java
source_release:
	@cd $(TARGET_JAR_DIR); cp $(JAR_FILE)-$(RELEASE).jar  $(SRC_REL_PATH)
	ls -l $(SRC_REL_PATH)/$(JAR_FILE)*


DOC_HOME=/segfs/tango/tools/pogo/doc
TARGET_DOC_HOME=maya:/www/doc/computing/cs/tango/tango_doc/tools_doc/pogo_doc
install_doc:
	rcp  -r $(DOC_HOME)/*       $(TARGET_DOC_HOME)

#	rcp  $(DOC_HOME)/img/*   $(TARGET_DOC_HOME)/img

clean_headers:
	clean_headers *.java
	clean_headers tools/*.java


tag:
	@echo "Tagging  $(PACKAGE)  for $(SVN_TAG_REV)"
	svn copy  $(SVN_POGO_PATH)/trunk \
	          $(SVN_POGO_PATH)/tags/$(PACKAGE)-$(SVN_TAG_REV)

