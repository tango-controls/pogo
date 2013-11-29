#                                               -*- Autoconf -*-
# Process this file with autoconf to produce a configure script.

AC_PREREQ(2.59)
AC_INIT([TEMPLATE_CLASS], [TEMPLATE_VERSION], [TEMPLATE_AUTHOR])
AC_CONFIG_HEADER([config.h])
AC_CONFIG_AUX_DIR(config)
AC_CONFIG_MACRO_DIR([m4])
AM_INIT_AUTOMAKE([-Wall])

# Checks for programs.
AC_PROG_CXX
AC_PROG_CC
#LT_INIT
AC_PROG_LIBTOOL

# Check gcc release
# Determine whether we have gcc of a particular version or later,
# based on major, minor, patchlevel versions and date.

if test "$CXX" = "c++" -o "$CXX" = "g++"; then
   gcc_AC_HAVE_GCC_VERSION(3,4,0)
   if test "x$ac_cv_gcc_version_3_4_0" = "xno"; then
      AC_MSG_ERROR([gcc release not supported. Use gcc 3.2.0 or above.], -1)
   fi
fi

# Checks for header files.
AC_HEADER_STDC
AC_CHECK_HEADERS([ TEMPLATE_CHECK_HEADERS ])

# Checks for library functions.
AC_CHECK_FUNCS([ TEMPLATE_CHECK_FUNCS ])

# Dependencies
PKG_CHECK_MODULES([TANGO], [tango >= 8.1.0])


TANGO_VERSION=`eval pkg-config --modversion tango`
TANGO_ROOT=`eval pkg-config --variable=prefix tango`

AC_CONFIG_FILES([
	Makefile
	src/Makefile
])

AC_OUTPUT

AC_MSG_RESULT([

    package.........: ${PACKAGE}
    version.........: ${VERSION}

    Compiler........: ${CXX}
    Compiler flags..: ${CXXFLAGS} ${AM_CXXFLAGS}

    TANGO...........: ${TANGO_ROOT}
    TANGO VERSION...: ${TANGO_VERSION}
])
