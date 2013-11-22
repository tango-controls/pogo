//+======================================================================
//
// Project:   Tango
//
// Description:	java source code for utilities
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013
//						European Synchrotron Radiation Facility
//                      BP 220, Grenoble 38043
//                      FRANCE
//
// This file is part of Tango.
//
// Tango is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// Tango is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
// $Revision: $
// $Date:  $
//
// $HeadURL: $
//
//-======================================================================

package org.tango.pogo.pogo_gui.packaging;

import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses;
import org.tango.pogo.pogo_gui.tools.ParserTool;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Packaging {
    private ArrayList<PackClass> classes = new ArrayList<PackClass>();
    private String packageName;
    private String packageAuthor;
    private String packagePath;
    private boolean multipleClasses = false;


    private PackFile[] packFiles = {
            new PackFile("README",              MODIFY),
            new PackFile("COPYING",             NOTHING),
            new PackFile("NEWS",                NOTHING),
            new PackFile("INSTALL",             NOTHING),
            new PackFile("AUTHORS",             MODIFY),
            new PackFile("ChangeLog",           NOTHING),
            new PackFile("autogen.sh",          MODIFY),
            new PackFile("configure.ac",        MODIFY),
            new PackFile("Makefile.am",         MODIFY),
            new PackFile("src/Makefile.am",     MODIFY,    ADD_CLASSES),
            new PackFile("m4/gcc_release.m4",   NOTHING),
    };
    private static final String[] directories = {
            "", "src", "build", "m4"
    };

    private static final boolean NOTHING     = false;
    private static final boolean MODIFY      = true;
    private static final boolean NO_UPDATE   = false;
    private static final boolean UPDATE      = true;
    private static final boolean ADD_CLASSES = true;

    //===============================================================
    /**
     * Will create the packaging class for code generation
     * @param className  Class name to create packaging.
     * @param path  Path to create packaging code.
     * @param author class Author
     * @throws DevFailed If template files are not found.
     */
    //===============================================================
    public Packaging(final String className, final String path, final String author) throws DevFailed {
        initialize(className, path, author);
        classes.add(new PackClass(className, path));
    }
    //===============================================================
    /**
     * Will create the packaging class for code generation
     * @param deviceClass  Class to create packaging.
     * @throws DevFailed If template files are not found.
     */
    //===============================================================
    public Packaging(final PogoDeviceClass deviceClass) throws DevFailed {
        String  className = deviceClass.getName();
        String  path = deviceClass.getDescription().getSourcePath();
        String  author = deviceClass.getDescription().getIdentification().getAuthor() +
                "@" + deviceClass.getDescription().getIdentification().getEmailDomain();
        initialize(className, path, author);
        classes.add(new PackClass(className, path));
    }
    //===============================================================
    /**
     * Will create the packaging class for code generation
     * @param deviceClasses  Classes to create packaging.
     * @throws DevFailed If template files are not found.
     */
    //===============================================================
    public Packaging(final PogoMultiClasses deviceClasses) throws DevFailed {
        String  className = deviceClasses.getName();
        String  path = deviceClasses.getSourcePath();
        String  author = "Unknown yet";
        initialize(className, path, author);
        List<OneClassSimpleDef> simpleDefList = deviceClasses.getClasses();
        for (OneClassSimpleDef _class : simpleDefList) {
            classes.add(new PackClass(_class.getClassname(), _class.getSourcePath()));
        }
        multipleClasses = true;
    }
    //===============================================================
    //===============================================================
    private void initialize(final String name, final String path, final String author) throws DevFailed {
        packageName   = name;
        packagePath   = path + "/packaging";
        packageAuthor = author;
        if (!isAvailable())
            Except.throw_exception("PropertyNotSet",
                    "Property \'PACKAGING_HOME\' not set",
                    "Packaging.Packaging()");

        //  Check if templates exist
        for (PackFile packFile : packFiles) {
            String  filename = Utils.getTemplatesPath() + "/" + packFile.name;
            if (!new File(filename).exists())
                Except.throw_exception("TemplateNotFound",
                        "Template file \'" + filename + "\' not found",
                        "Packaging.Packaging()");
        }
    }
    //===============================================================
    //===============================================================
    private void copyTemplates() throws DevFailed {
        for (PackFile packFile : packFiles) {
            String srcFile = Utils.getTemplatesPath() + "/" + packFile.name;
            String targetFile = packagePath + "/";
            targetFile += packFile.name;
            Utils.copyFile(srcFile, targetFile);
        }
    }
    //===============================================================
    //===============================================================
    private String addSourceReferences(String code) {
        String  nextLine = Utils.buildNextLine(packageName+"_SOURCES = ");
        StringBuilder   sb = new StringBuilder();

        //  For each class
        for (PackClass _class : classes) {
            //  Add headers
            for (String file : _class.headers)
                sb.append(file).append(nextLine);

            //  Get source files (without main and ClassFactory)
            ArrayList<String> files = _class.getSources();
            for (String file : files) {
                sb.append(file).append(nextLine);
            }
        }
        String  factory = ((multipleClasses)? "MultiClassesFactory.cpp" :"ClassFactory.cpp");
        sb.append(factory).append(nextLine);
        sb.append("main.cpp");

        code = code.replaceAll("TEMPLATE_SOURCES", sb.toString());
        return code;
    }
    //===============================================================
    //===============================================================
    private void updateTemplate(String fileName, boolean addClasses) throws DevFailed {
        String  code = ParserTool.readFile(fileName);
        if (addClasses)
            code = addSourceReferences(code);

        code = code.replaceAll("TEMPLATE_AUTHOR", packageAuthor);
        code = code.replaceAll("TEMPLATE_CLASS", packageName);

        //   ToDo Replace by header/function to be checked
        String  checkHeaders = "";
        code = code.replaceAll("TEMPLATE_CHECK_HEADERS", checkHeaders);
        String  checkFunctions = "";
        code = code.replaceAll("TEMPLATE_CHECK_FUNCS", checkFunctions);

        ParserTool.writeFile(fileName, code);
    }
    //===============================================================
    /**
     * Create links for specified files in specified path
     * @param path      specified path
     * @param fileNames specified files
     * @param srcPath specified files path
     * @param filter will not link ClassFactory and main if true
     * @throws DevFailed if link creation failed
     */
    //===============================================================
    private void createSourceLinks(final String path,
                                  final ArrayList<String> fileNames,
                                  final String srcPath,
                                  final boolean filter) throws DevFailed {

        //  ToDo When 1.7 will be used --> use java.nio.file.Files.createLink()

        try {
            //  Build a script file and execute it to create links
            String scriptName = path + "/create_links";
            String code = "#!/bin/sh\n\n";
            code += "cd  " + path + "\n\n";
            for (String fileName : fileNames) {
                //  Delete old link if any, then create new one
                if (!(filter &&  (fileName.equals("main.cpp") || fileName.equals("ClassFactory.cpp")))) {
                    code += "rm -f  " + fileName + "\n";
                    code += "ln -s  " + srcPath + "/" + fileName + "   " + fileName + "\n\n";
                }
            }
            //System.out.println(code);
            ParserTool.writeFile(scriptName, code);

            File    script = new File(scriptName);
            if (script.setExecutable(true)) {
                System.out.println("execute " + scriptName);
                try { Thread.sleep(100); } catch (InterruptedException e) { /* */ }
                Utils.executeShellCommand(scriptName);
            }
            //noinspection ResultOfMethodCallIgnored
            script.delete();
        }
        catch (Exception e) {
            Except.throw_exception("LinkFailed",
                    "Cannot create link: " + e,
                    "Packaging.createSourceLinks()");
        }
    }
    //===============================================================
    //===============================================================





    //===============================================================
    /**
     * Star the code generation for packaging
     * @throws DevFailed if code generation failed.
     */
    //===============================================================
    public void generate() throws DevFailed {
        Utils.buildDirectories(directories, packagePath);
        copyTemplates();

        for (PackFile packFile : packFiles) {
            if (packFile.modify) {
                updateTemplate(packagePath + "/" + packFile.name, packFile.addClasses);
            }
        }


        if (multipleClasses) {
            for (PackClass _class : classes) {
                createSourceLinks(packagePath + "/src", _class.headers, _class.path, true);
                createSourceLinks(packagePath + "/src", _class.sources, _class.path, true);
                ArrayList<String> additionalFiles = new ArrayList<String>();
                additionalFiles.add("MultiClassesFactory.cpp");
                additionalFiles.add("main.cpp");
                createSourceLinks(packagePath + "/src",  additionalFiles, "../..", false);

                //  !!!!
                _class.manageSerialSpecialCase();
            }
        }
        else  {
            createSourceLinks(packagePath + "/src", classes.get(0).headers, "../..", false);
            createSourceLinks(packagePath + "/src", classes.get(0).sources, "../..", false);
            //  !!!!
            classes.get(0).manageSerialSpecialCase();
        }
        System.out.println("Packaging for " + packageName +
                " has been created in:\n" + packagePath);
    }

    //===============================================================
    /**
     * Check if PACKAGING_HOME variable to know where template files are.
     * @return true if PACKAGING_HOME has been set.
     */
    //===============================================================
    public static boolean isAvailable() {
        return Utils.isAvailable();
    }
    //===============================================================
    //===============================================================
    public String getPackagePath() {
        return packagePath;
    }
    //===============================================================
    //===============================================================
    public String getPackageName() {
        return packageName;
    }
    //===============================================================
    //===============================================================
    public static void main(String[] args) {
        try {
            //Packaging packaging = new Packaging("Starter",
            //       "y:/tango/tools/pogo/test/cpp/starter", "verdier@esrf.fr");

            Packaging packaging = new Packaging("MyGauge",
                   "/segfs/tango/tools/pogo/test/cpp/my_gauge", "verdier@esrf.fr");
            packaging.generate();
        }
        catch (DevFailed e ) {
            Except.print_exception(e);
            e.printStackTrace();
        }
    }
    //===============================================================
    //===============================================================




    //===============================================================
    //===============================================================
    private class PackFile{
        String  name;
        boolean modify;
        boolean addClasses = false;
        //===========================================================
        private PackFile(String name, boolean modify) {
            this(name, modify, false);
        }
        //===========================================================
        private PackFile(String name, boolean modify, boolean addClasses) {
            this.name = name;
            this.modify = modify;
            this.addClasses = addClasses;
        }
        //===========================================================
    }
    //===============================================================
    //===============================================================
    private class PackClass {

        private String name;
        private String path;
        private ArrayList<String>   headers;
        private ArrayList<String>   sources;
        //===========================================================
        private PackClass(String name, String path) throws DevFailed {
            this.name = name;
            this.path = path;

            headers = Utils.getFileList(path, ".h");
            sources = Utils.getFileList(path, ".cpp");
        }
        //===========================================================
        private void manageSerialSpecialCase() {
            //  For class Serial:
            //  Due to a bad design, 2 source files are used as include files :-)
            if (name.equals("Serial")) {
                try {
                    String code = ParserTool.readFile(packagePath+"/Makefile.am");
                    String  key = "EXTRA_DIST = ";
                    String  badFiles = "";
                    for (String badFile : badSerialFiles)
                        badFiles += " src/" + badFile;
                    int pos = code.indexOf(key);
                    if (pos>0) {
                        pos += key.length();
                        code = code.substring(0, pos) + badFiles + code.substring(pos);
                        ParserTool.writeFile(packagePath+"/Makefile.am", code);
                    }
                }
                catch (DevFailed e) {
                    Except.print_exception(e);
                }
            }
        }
        //===========================================================
        private ArrayList<String> getSources() {
            ArrayList<String>   list = new ArrayList<String>();
            for (String file : sources)
                if (!file.equals("main.cpp") && !file.equals("ClassFactory.cpp"))
                    list.add(file);

            //  For class Serial:
            //  Due to a bad design, 2 source files are used as include files :-)
            if (name.equals("Serial")) {
                for (String badFile : badSerialFiles)
                    list.remove(badFile);
            }

            return list;
        }
        //===========================================================
        private  final String[] badSerialFiles = {"SerialLinux.cpp", "SerialWin32.cpp"};
    }
    //===============================================================
    //===============================================================
}
