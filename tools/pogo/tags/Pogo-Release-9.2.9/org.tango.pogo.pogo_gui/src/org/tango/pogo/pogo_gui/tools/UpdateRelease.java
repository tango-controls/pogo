//+======================================================================
// :  $
//
// Project:   Tango
//
// Description:  java source code for Tango manager tool..
//
// : pascal_verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016
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
// :  $
//
//-======================================================================

package org.tango.pogo.pogo_gui.tools;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * This class is able to update release number with date
 *      and generate html ReleaseNote.java
 *
 * @author verdier
 */

public class UpdateRelease {
    private String release = null;
    private String fileName = null;
    private String notesPath= ".";
    private String packName = null;
    private String title = null;
    //===============================================================
    //===============================================================
    public UpdateRelease(String[] args) throws PogoException {
        checkArguments(args);
        if (release!=null && fileName!=null) {
            patchReleaseNumber();
        }
        if (notesPath!=null && packName!=null) {
            generateReleaseNotes();
        }
    }
    //===============================================================
    //===============================================================
    private void generateReleaseNotes() throws PogoException {
        String notesFile = "ReleaseNote";
        if (!new File(notesFile).exists()) {
            notesFile += "s";
            if (!new File(notesFile).exists()) {
                throw new PogoException(notesFile + " not found");
            }
        }
        String outCode = "\npackage " + packName+";\n\n";
        outCode += getComments();

        outCode += "public interface " + notesFile + " {\n";
        outCode += "\tString str = \n";
        outCode += getHtmlHeader();

        outCode += getHtmlNotes(notesFile);

        outCode += getHtmlFooter();
        outCode += "}";

        String fileName = notesPath+'/'+notesFile+".java";
        ParserTool.writeFile(fileName, outCode);
        System.out.println(fileName + "  has been generated.");
    }
    //===============================================================
    //===============================================================
    private String getHtmlNotes(String notesFile) throws PogoException {
        List<String> inCode = ParserTool.readFileLines(notesFile, false);
        StringBuilder sb = new StringBuilder();
        for (String line :inCode) {
            if (line.endsWith(":")) {
                sb.append("\t\t\"<li><b>").append(line).append("</b><br>\" + \n");
            }
            else {
                sb.append("\t\t\"&nbsp; &nbsp; &nbsp; ").append(line).append("<br>\" + \n");
            }
        }
        return sb.toString();
    }
    //===============================================================
    //===============================================================
    private String getHtmlHeader() {
        StringBuilder sb = new StringBuilder("\t\t\"<!DOCTYPE HTML PUBLIC \\\"-//W3C//DTD HTML 3.2//EN\\\">\\n\" + \n" +
                "\t\t\"<html>\\n\" + \n" +
                "\t\t\"<head>\\n\" + \n" +
                "\t\t\"<title> Release Note </title>\\n\" + \n" +
                "\t\t\"</head>\\n\" + \n" +
                "\t\t\"<body text=\\\"#000000\\\" bgColor=\\\"#FFFFFF\\\" link=\\\"#0000FF\\\" vLink=\\\"#7F00FF\\\" aLink=\\\"#FF0000\\\">\\n\" + \n" +
                "\t\t\"<p><!-------TITLE------></p>\\n\" + \n");
        if (title!=null) {
            sb.append("\t\t\"<center>\t<h2>").append(title).append("</h2>\\n\" + \n");
            sb.append("\t\t\"\t(Generated ").append(getDate()).append(")</center><br>\\n\" + \n");
        }
        return sb.toString();
    }
    //===============================================================
    //===============================================================
    private String getHtmlFooter() {
        return "\t\t\"</body>\\n\" + \n\t\t\"</html>\\n\"\n\t;\n";
    }
    //===============================================================
    //===============================================================
    private String getComments() {
        return "/**\n * HTML code to display Release Notes for this package.\n"+
               " * It is generated by Pogo classes from a text file.\n */\n\n";
    }
    //===============================================================
    //===============================================================
    private void patchReleaseNumber() throws PogoException {
        String code = ParserTool.readFile(fileName);
        int start = code.indexOf("revNumber =");
        if (start<0) {
            start = code.indexOf("releaseString =");
            if (start<0)
                throw new PogoException("String releaseString Not Found");
        }
        start = code.indexOf('\"', start);
        start++;
        int end = code.indexOf('\"', start);
        String target = release + "  -  " + getDate();
        System.out.println("Replacing "+code.substring(start, end));
        System.out.println("    By    " + target);
        ParserTool.writeFile(fileName, code.substring(0, start) + target + code.substring(end));
    }
    //===============================================================
    //===============================================================
    private static String getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }
    //===============================================================
    //===============================================================

    //===============================================================
    //===============================================================
    public void checkArguments(String[] args) {
        for (int i=0 ; i<args.length ; i+=2) {
            switch (args[i]) {
                case "-release":
                    if ((i+1)<args.length)
                        release = args[i+1];
                    else
                        displaySyntax();
                    break;
                case "-file":
                    if ((i+1)<args.length)
                        fileName = args[i+1];
                    else
                        displaySyntax();
                    break;
                case "-note_path":
                    if ((i+1)<args.length)
                        notesPath = args[i+1];
                    else
                        displaySyntax();
                    break;
                case "-package":
                    if ((i+1)<args.length)
                        packName = args[i+1];
                    else
                        displaySyntax();
                    break;
                case "-title":
                    if ((i+1)<args.length) {
                        title = "";
                        while (++i < args.length && args[i].charAt(0)!='-')
                            title += args[i]+" ";
                        i -=2;
                    }
                    else
                        displaySyntax();
                    break;
                default:
                    displaySyntax();
            }
        }
        if ((release==null && fileName!=null) || (release!=null && fileName==null))
            displaySyntax();
    }
    //===============================================================
    //===============================================================
    public static void displaySyntax() {
        System.out.println("UpdateRelease:");
        System.out.println("  -release <version>:      release to be patched");
        System.out.println("  -file <file name>:       file to patch release and date");
        System.out.println("  -note_path <path>:       where ReleaseNotes.java must be generated");
        System.out.println("  -package <package name>: package for ReleaseNotes.java class");
        System.out.println("  -title <title>:          title added in ReleaseNotes.java");
        System.out.println();
        System.exit(0);
    }
    //===============================================================
    //===============================================================

    //===============================================================
    //===============================================================
    public static void main(String[] args) {
        if (args.length==0) {
            UpdateRelease.displaySyntax();
        }

        try {
            new UpdateRelease(args);
        } catch (PogoException e) {
            System.err.println(e.toString());
        } catch (Exception e) {
            //System.err.println(e.toString());
            e.printStackTrace();
        }
    }
}
