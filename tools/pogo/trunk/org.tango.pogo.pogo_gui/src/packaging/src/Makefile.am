## Process this file with automake to produce Makefile.in

AM_LDFLAGS = @TANGO_LIBS@
AM_CPPFLAGS = @TANGO_CFLAGS@


#
# Everything needed to create an executable for the class
#
bin_PROGRAMS = TEMPLATE_CLASS
include_HEADERS =
TEMPLATE_CLASS_SOURCES = TEMPLATE_SOURCES


#
# Support for GNU Flymake, in Emacs.
#
check-syntax: AM_CXXFLAGS += -fsyntax-only -pipe
check-syntax:
	test -z "$(CHK_SOURCES)" || $(CXXCOMPILE) $(CHK_SOURCES)

.PHONY: check-syntax
