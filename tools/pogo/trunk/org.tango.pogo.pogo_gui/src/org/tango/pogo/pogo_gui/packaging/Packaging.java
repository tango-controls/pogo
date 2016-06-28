//+======================================================================
//
// Project:   Tango
//
// Description:	java source code for utilities
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013,2014
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

import fr.esrf.tango.pogo.pogoDsl.*;
import org.tango.pogo.pogo_gui.tools.ParserTool;
import org.tango.pogo.pogo_gui.tools.PogoException;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Packaging {
    private List<PackClass> packClassList = new ArrayList<>();
    private List<String> addedClasses = new ArrayList<>();
    private String packageName;
    private String packageAuthor;
    private String packagePath;
    private String packageVersion;
    private boolean multipleClasses = false;


    private PackFile[] packFiles = {
            new PackFile("README",              MODIFY,   UPDATE),
            new PackFile("COPYING",             NO_MODIF, NO_UPDATE),
            new PackFile("NEWS",                NO_MODIF, NO_UPDATE),
            new PackFile("INSTALL",             NO_MODIF, NO_UPDATE),
            new PackFile("AUTHORS",             MODIFY,   NO_UPDATE),
            new PackFile("ChangeLog",           NO_MODIF, NO_UPDATE),
            new PackFile("autogen.sh",          MODIFY,   UPDATE),
            new PackFile("configure.ac",        MODIFY,   UPDATE),
            new PackFile("Makefile.am",         MODIFY,   UPDATE),
            new PackFile("src/Makefile.am",     MODIFY,   UPDATE),
            new PackFile("m4/gcc_release.m4",   NO_MODIF, NO_UPDATE),
    };
    private static final String[] directories = {
            "", "src", "build", "m4"
    };

    private static final boolean NO_MODIF  = false;  // No modification from template
    private static final boolean MODIFY    = true;   // Modifications from template
    private static final boolean NO_UPDATE = false;  // No update if already exists
    private static final boolean UPDATE    = true;   // Updated at each code generation

    static final String PackageDir = "/packaging/";
    //===============================================================
    /**
     * Will create the packaging class for code generation
     * @param deviceClass  Class to create packaging.
     * @throws PogoException If template files are not found.
     */
    //===============================================================
    public Packaging(final PogoDeviceClass deviceClass, String packageVersion, String author) throws PogoException {
        this.packageVersion = packageVersion;
        String  className = deviceClass.getName();
        String  path = deviceClass.getDescription().getSourcePath();

        initialize(className, path, author);
        PackClass   _class = new PackClass(className, path);
        _class.addAdditionalFiles(deviceClass.getAdditionalFiles());
        packClassList.add(_class);
        manageInheritances(deviceClass.getDescription().getInheritances());
    }
    //===============================================================
    /**
     * Will create the packaging class for code generation
     * @param deviceClasses  Classes to create packaging.
     * @throws PogoException If template files are not found.
     */
    //===============================================================
    public Packaging(final PogoMultiClasses deviceClasses, String packageVersion, String author) throws PogoException {
        this.packageVersion = packageVersion;
        String  className = deviceClasses.getName();
        String  path = deviceClasses.getSourcePath();
        initialize(className, path, author);
        List<OneClassSimpleDef> simpleDefList = deviceClasses.getClasses();
        for (OneClassSimpleDef _class : simpleDefList) {
            PackClass   packClass =new PackClass(_class.getClassname(), _class.getSourcePath());
            packClass.addAdditionalFiles(_class.getAdditionalFiles());
            packClassList.add(packClass);
            manageInheritances(_class.getInheritances());
        }
        multipleClasses = true;
    }
    //===============================================================
    //===============================================================
    private void manageInheritances(List<Inheritance> inheritances) throws PogoException {
        for (Inheritance inheritance : inheritances) {
            String name = inheritance.getClassname();
            if (!(name.startsWith("Device") && name.endsWith("Impl")))
                packClassList.add(new PackClass(name, inheritance.getSourcePath()));
        }
    }
    //===============================================================
    //===============================================================
    private void initialize(final String name, final String path, final String author) throws PogoException {
        packageName   = name;
        packagePath   = path + "/packaging";
        packageAuthor = author;
        if (!isAvailable())
            throw new PogoException("Property \'PACKAGING_HOME\' not set");

        //  Check if templates exist
        for (PackFile packFile : packFiles) {
            if (PackUtils.getInstance().fileExistsInPackage(PackageDir + packFile.name))
                throw new PogoException("Template file \'" + packFile.name + "\' not found");
        }
    }
    //===============================================================
    //===============================================================
    private void copyTemplates() throws PogoException {
        for (PackFile packFile : packFiles) {
            String targetFile = packagePath + "/" + packFile.name;

            //  Check if already exists
            packFile.alreadyExists = new File(targetFile).exists();
            if (packFile.update || !packFile.alreadyExists) {
                String code = PackUtils.getInstance().readFileFromPackage(PackageDir + packFile.name);
                ParserTool.writeFile(targetFile, code);
                if (packFile.name.endsWith(".sh"))  //  must be executable
                    if (!new File(targetFile).setExecutable(true))
                        System.err.println("Cannot set executable " + targetFile);
            }
        }
    }
    //===============================================================
    //===============================================================
    private String addSourceReferences(String code) {
        String  nextLine = PackUtils.buildNextLine(packageName + "_SOURCES = ");
        StringBuilder   sb = new StringBuilder();

        //  For each class
        for (PackClass packClass : packClassList) {
            //  Check if already done
            if (addedClasses.indexOf(packClass.name)<0) {
                //  Add headers
                for (String file : packClass.headers)
                    sb.append(file).append(nextLine);

                //  Get source files (without main and ClassFactory)
                List<String> files = packClass.sources;
                for (String file : files) {
                    sb.append(file).append(nextLine);
                }
                addedClasses.add(packClass.name);
            }
            else
                PackUtils.println(packClass.name + " has already been added!");
        }
        String  factory = ((multipleClasses)? "MultiClassesFactory.cpp" :"ClassFactory.cpp");
        sb.append(factory).append(nextLine);
        sb.append("main.cpp");

        code = code.replaceAll("TEMPLATE_SOURCES", sb.toString());
        return code;
    }
    //===============================================================
    //===============================================================
    private void updateTemplate(String fileName) throws PogoException {
        String  code = ParserTool.readFile(fileName);
        if (fileName.endsWith("src/Makefile.am"))
            code = addSourceReferences(code);

        code = code.replaceAll("TEMPLATE_AUTHOR", packageAuthor);
        code = code.replaceAll("TEMPLATE_VERSION", packageVersion);
        code = code.replaceAll("TEMPLATE_CLASS", packageName);

        ParserTool.writeFile(fileName, code);
    }
    //===============================================================
    //===============================================================
    private void updateConfig(String fileName, List<String> headers, List<String> functions) throws PogoException {
        String  code = ParserTool.readFile(fileName);
        code = code.replaceAll("TEMPLATE_CHECK_HEADERS", PackUtils.buildConfigureList(headers));
        code = code.replaceAll("TEMPLATE_CHECK_FUNCS", PackUtils.buildConfigureList(functions));

        ParserTool.writeFile(fileName, code);
    }
    //===============================================================
    /**
     * Create links for specified files in specified path
     * @param path      specified path
     * @param fileName specified file
     * @param srcPath specified files path
     * @throws PogoException if link creation failed
     */
    //===============================================================
    private void createSourceLinks(final String path,
                                  final String fileName,
                                  final String srcPath) throws PogoException {
        List<String> list = new ArrayList<>();
        list.add(fileName);
        createSourceLinks(path, list, srcPath);
    }
    //===============================================================
    /**
     * Create links for specified files in specified path
     * @param path      specified path
     * @param fileNames specified files
     * @param srcPath specified files path
     * @throws PogoException if link creation failed
     */
    //===============================================================
    private void createSourceLinks(final String path,
                                  final List<String> fileNames,
                                  final String srcPath) throws PogoException {

        //  ToDo When 1.7 will be used --> use java.nio.file.Files.createLink()
        try {
            //  Build a script file and execute it to create links
            String scriptName = path + "/create_links";
            String code = "#!/bin/sh\n\n";
            code += "cd  " + path + "\n\n";
            for (String fileName : fileNames) {
                //  Delete old link if any, then create new one
                code += "rm -f  " + fileName + "\n";
                code += "ln -s  " + srcPath + "/" + fileName + "   " + fileName + "\n\n";
            }
            //PackUtils.println(code);
            ParserTool.writeFile(scriptName, code);

            File    script = new File(scriptName);
            if (script.setExecutable(true)) {
                PackUtils.println("execute " + scriptName);
                try { Thread.sleep(100); } catch (InterruptedException e) { /* */ }
                PackUtils.executeShellCommand(scriptName);
            }
            //noinspection ResultOfMethodCallIgnored
            script.delete();
        }
        catch (Exception e) {
            throw new PogoException("Cannot create link: " + e);
        }
    }
    //===============================================================
    //===============================================================





    //===============================================================
    /**
     * Star the code generation for packaging
     * @throws PogoException if code generation failed.
     */
    //===============================================================
    public void generate(List<String> headers, List<String> functions) throws PogoException {
        PackUtils.buildDirectories(directories, packagePath);
        copyTemplates();

        for (PackFile packFile : packFiles) {
            if (packFile.doUpdates()) {
                updateTemplate(packagePath + "/" + packFile.name);
                if (packFile.name.endsWith("configure.ac"))
                    updateConfig(packagePath + "/" + packFile.name, headers, functions);
            }
        }

        if (multipleClasses) {
            for (PackClass _class : packClassList) {
                createSourceLinks(packagePath + "/src", _class.headers, _class.path);
                createSourceLinks(packagePath + "/src", _class.getSources(), _class.path);

                //  !!!!
                _class.manageSerialSpecialCase();
            }
            createSourceLinks(packagePath + "/src", "MultiClassesFactory.cpp", "../..");
        }
        else  {
            int cnt = 0;
            for (PackClass _class : packClassList) {
                String  srcPath = (cnt++==0)? "../.." : _class.path;
                createSourceLinks(packagePath + "/src", _class.headers, srcPath);
                createSourceLinks(packagePath + "/src", _class.getSources(), srcPath);

                //  !!!!
                _class.manageSerialSpecialCase();
            }
            createSourceLinks(packagePath + "/src", "ClassFactory.cpp", "../..");
        }
        createSourceLinks(packagePath + "/src", "main.cpp", "../..");

        PackUtils.println("Packaging for " + packageName +
                " has been created in:\n" + packagePath);
    }

    //===============================================================
    /**
     * Check if PACKAGING_HOME variable to know where template files are.
     * @return true if PACKAGING_HOME has been set.
     */
    //===============================================================
    public static boolean isAvailable() {
        return PackUtils.isAvailable();
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




    //===============================================================
    //===============================================================
    private class PackFile{
        String  name;
        boolean modify;
        boolean update = false;
        boolean alreadyExists = false;
        //===========================================================
        private PackFile(String name, boolean modify, boolean update) {
            this.name = name;
            this.modify = modify;
            this.update = update;
        }
        //===========================================================
        private boolean doUpdates() {
            return (modify && !alreadyExists) || update;
        }
        //===========================================================
    }
    //===============================================================
    //===============================================================







    //===============================================================
    //===============================================================
    private class PackClass {

        private String name;
        private String path;
        private List<String>   headers;
        private List<String>   sources = new ArrayList<>();
        //===========================================================
        private PackClass(String name, String path) throws PogoException {
            this.name = name;
            this.path = path;

            headers = PackUtils.getFileList(path, ".h");
            sources.add(name+".cpp");
            sources.add(name+"Class.cpp");
            sources.add(name+"StateMachine.cpp");

            String  dynAttrFile = name+"DynAttrUtils.cpp";
            if (new File(path+"/"+dynAttrFile).exists())
                sources.add(dynAttrFile);
        }
        //===========================================================
        private void addAdditionalFiles(List<AdditionalFile> additionalFiles) {
            if (additionalFiles!=null) {
                for (AdditionalFile file : additionalFiles) {
                    sources.add(file.getName()+".cpp");
                }
            }
        }
        //===========================================================
        private void manageSerialSpecialCase() {
            //  For class Serial:
            //  Due to a bad design, 2 source files are used as include files :-)
            if (name.equals("Serial")) {
                try {
                    String code = ParserTool.readFile(packagePath + "/Makefile.am");
                    String  key = "EXTRA_DIST = ";
                    String  badFiles = "";
                    for (String badFile : badSerialFiles)
                        badFiles += " src/" + badFile + " ";
                    int pos = code.indexOf(key);
                    if (pos>0) {
                        pos += key.length();
                        code = code.substring(0, pos) + badFiles + code.substring(pos);
                        ParserTool.writeFile(packagePath + "/Makefile.am", code);
                    }
                }
                catch (PogoException e) {
                    System.err.println(e.toString());
                }
            }
        }
        //===========================================================
        private List<String> getSources() {
            List<String>   list = new ArrayList<>();
            for (String file : sources)
                if (!file.equals("main.cpp") && !file.equals("ClassFactory.cpp"))
                    list.add(file);

            //  For class Serial:
            //  Due to a bad design, 2 source files are used as include files :-)
            if (name.equals("Serial")) {
                Collections.addAll(list, badSerialFiles);
            }

            return list;
        }
        //===========================================================
        private  final String[] badSerialFiles = {"SerialLinux.cpp", "SerialWin32.cpp"};
    }
    //===============================================================
    //===============================================================
}
