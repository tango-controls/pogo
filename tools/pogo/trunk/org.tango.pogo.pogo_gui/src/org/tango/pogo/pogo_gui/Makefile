#+======================================================================
#
# Project:      Tango Device Server
#
# Description:  Makefile to generate the Pogo classes
#
# $Author: verdier $
#
# $Revision:  $
#
#-======================================================================


RELEASE    = 9.1.12


TANGO_HOME	=	/segfs/tango
PACK_HOME	=	$(TANGO_HOME)/tools
POGO_DOC	=	$(HOME)/workspace/documentation
DOC_HOME    =	$(TANGO_HOME)/doc/www/tango/tango_doc/tools_doc/pogo_doc/
JAR_DIR		=	$(TANGO_JAR_HOME)/appli

SVN_POGO_PATH = $(SVN_TCS)/tools/pogo
SVN_TAG_REV    = Release-$(RELEASE)

# -----------------------------------------------------------------
#
#		The compiler flags
#
#------------------------------------------------------------------

BIN_DIR   =  ../../../../../bin
JAVAFLAGS = -Xlint:deprecation   -Xlint:unchecked   -d $(BIN_DIR)
JAVAC     =  javac $(JAVAFLAGS)

#-------------------------------------------------------------------

PACKAGE    = Pogo

DOC_HEADER = "<h1>POGO Classes</h1>"


#-----------------------------------------------------------------

all:	 GUI
# exe

full:	atk constants	utils	GUI

GUI:
	$(JAVAC) *.java

constants:
	$(JAVAC) PogoConst.java

utils:
	$(JAVAC) tools/*.java

exe:
	@./go

clean:
	rm  -Rf $(BIN_DIR)/com
	rm  -Rf $(BIN_DIR)/*.i*
	rm -f  $(BIN_DIR)/org/tango/pogo/pogo_gui/hs_err*
	rm -f  $(BIN_DIR)/org/tango/pogo/pogo_gui/*.form
	rm -f  $(BIN_DIR)/org/tango/pogo/pogo_gui/classpath
	rm -f  $(BIN_DIR)/org/tango/pogo/pogo_gui/tools/*.form
	rm -f  $(BIN_DIR)/org/tango/pogo/pogo_gui/packacging/*.form

MAIN_CLASS=		$(PACKAGE)GUI
version:
	make clean
	echo "Updating date and revision number..."
	upd_rev  -f PogoConst.java  -r $(RELEASE)
	@java pogo.make_util.ReleaseNote2html -java "Pogo Release Note" org.tango.pogo.pogo_gui
	@make GUI

jar:
	@echo "------------------------------------"
	@echo "  Use Eclipse to build jar file !"
	@echo "------------------------------------"

doc:
	@javadoc \
	-private \
	-version -author \
	-nodeprecated \
	-windowtitle POGO \
	-header $(DOC_HEADER) \
	-d doc/pr_guide	 \
	*.java tools/*.java 


ECLIPSE_JAR_DIR=/users/verdier/pogo/jar
TARGET_JAR_DIR=/segfs/tango/release/java/appli
JAR_FILE=org.tango.pogo
install:
	@cp $(ECLIPSE_JAR_DIR)/$(JAR_FILE).jar $(TARGET_JAR_DIR)/$(JAR_FILE)-$(RELEASE).jar
	@cd $(TARGET_JAR_DIR); \
	rm $(JAR_FILE).jar;   \
	ln -s $(JAR_FILE)-$(RELEASE).jar  $(JAR_FILE).jar; \
	ls -l $(JAR_FILE)*.jar
	cp ReleaseNote $(TARGET_JAR_DIR)/ReleaseNote.txt

#	mv $(TARGET_JAR_DIR)/$(JAR_FILE)-$(RELEASE).jar  $(TARGET_JAR_DIR)/$(JAR_FILE)-$(RELEASE)-tmp.jar

FTP_TARGET	=	ftpserv:/ftp/anonymous/pub/cs/tango/Pogo
install_ftp:
	@echo "scp $(JAR_FILE)-$(RELEASE).jar $(FTP_TARGET)"
	@cd $(TARGET_JAR_DIR); scp $(JAR_FILE)-$(RELEASE).jar  $(FTP_TARGET)
	@rcp ReleaseNote $(FTP_TARGET)

TANGO_REV=tango-7.2.2
SRC_REL_PATH=$(TANGO_HOME)/source_release/$(TANGO_REV)/lib/java
source_release:
	@cd $(TARGET_JAR_DIR); cp $(JAR_FILE)-$(RELEASE).jar  $(SRC_REL_PATH)
	ls -l $(SRC_REL_PATH)/$(JAR_FILE)*


TARGET_DOC_HOME=webserv02:/www/doc/computing/cs/tango/tango_doc/tools_doc/pogo_doc
install_doc:
	cp $(POGO_DOC)/*.html         $(DOC_HOME)
	cp $(POGO_DOC)/img/*         $(DOC_HOME)/img
	scp  -r $(DOC_HOME)/*       $(TARGET_DOC_HOME)

#	rcp  $(DOC_HOME)/img/*   $(TARGET_DOC_HOME)/img

clean_headers:
	clean_headers *.java
	clean_headers tools/*.java


tag:
	@echo "Tagging  $(PACKAGE)  for $(SVN_TAG_REV)"
	EDITOR=nedit; svn copy  $(SVN_POGO_PATH)/trunk \
	          $(SVN_POGO_PATH)/tags/$(PACKAGE)-$(SVN_TAG_REV)

