//+======================================================================
//
// Project:   Tango
//
// Description:	java source code  to read pogo properties file to load them.
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

package org.tango.pogo.pogo_gui.tools;


/**
 *	This class is able to read pogo properties file to load them.
 *
 * @author verdier
 */

import org.tango.pogo.pogo_gui.PogoConst;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;


public class PogoProperty {

    //---------------------- General definitions -----------------------------------
    private static final String packname = "org.tango.pogo";
    private static final String defPropFilename = "/Pogo.default_properties";
    private static final String sitePropFilename = "/Pogo.site_properties";

    private static PogoProperty instance = null;
    public static List<String> classFamilies = new ArrayList<>();
    public static List<String> platformNames = new ArrayList<>();
    public static List<String> busNames = new ArrayList<>();
    private static final String copyrightProp = "copyright";
    private static final String docHomeProp = "doc_home";
    private static final String makefileHomeProp = "makefile_home";
    private static final String installHomeProp = "install_home";

    //---------------------- Class identification definitions -----------------------------------
    private static final String classFamiliesProp = "class_families";
    private static final String platformNamesProp = "platform_names";
    private static final String busNamesProp = "bus_names";
    private static final String siteNameProp = "site.name";
    private static final String siteClassFamiliesProp = "site.class_families";

    public static String siteName = null;
    public static String copyright = "";
    public static String docHome = "./doc_html";
    public static String makefileHome = "$(TANGO_HOME)";
    public static String installHome = "$(TANGO_HOME)";
    public static List<String> siteClassFamilies = new ArrayList<>();

    //---------------------- $HOME/.pogorc definitions -----------------------------------

    private static final int ownHistoSize = 20;
    private static final String ownInheritanceHome = "hinerit_home";
    private static final String ownContactAddress = "contact_address";
    private static final String ownLoadPrevious = "load_previous";
    private static final String ownProjectHistory = "project_history";
    private static final String multiProjectHistory = "multi_class_project_history";

    public static String inheritHome = null;
    public static String contactAddress = "";
    public static boolean loadPrevious = true;
    public static List<String> projectHistory = new ArrayList<>();
    public static List<String> multiClassProjectHistory = new ArrayList<>();

    public static final Object  monitor = new Object();
    //===============================================================
    //===============================================================
    public static PogoProperty getInstance() {
        return instance;
    }

    //===============================================================
    //===============================================================
    public static PogoProperty init() throws PogoException {
        synchronized (monitor) {
            if (instance == null)
                instance = new PogoProperty();
        }
        return instance;
    }

    //===============================================================
    //===============================================================
    private PogoProperty() throws PogoException {
	
		checkEnvironment();
	
        loadDefaultProperties();
        loadSiteProperties();
        loadPogoRcProperties();
        displayProperties();
    }

    //===============================================================
    /**
     * Check the class path from environment.
     * Some Eclipse classes failed if at least one path is empty or does not exist.
     * This method get the classpath, and keep only the existing ones.
     */
    //===============================================================
	private void checkEnvironment() {
        String classpath = System.getProperty("java.class.path");
        //System.out.println("java.class.path=" + classpath);

        //  I tried to do it for Win, but does not work
        if (Utils.osIsUnix()) {
            //  Get each path
            StringTokenizer stk = new StringTokenizer(classpath, ":");
            classpath = "";
            while (stk.hasMoreTokens()) {
                String  s = stk.nextToken();
                //  Check if exists
                File f = new File(s);
                if (f.exists())
                    classpath += s + ":";
                else
                    System.err.println(s + " found in classpath,  does not exist !!!");
            }
            if (classpath.endsWith(":")) {
                //  Remove it
                classpath = classpath.substring(0, classpath.length()-1);
            }
        }
        //System.out.println("java.class.path=" + classpath);
        System.setProperty("java.class.path", classpath);
	}
    //===============================================================
    //===============================================================
    private void loadDefaultProperties() throws PogoException {
        try {
            //	fill data members with default  properties if any
            List<String> vs = loadProperties(defPropFilename);
            classFamilies = getStringListProperty(classFamiliesProp, vs);
            platformNames = getStringListProperty(platformNamesProp, vs);
            busNames = getStringListProperty(busNamesProp, vs);
            installHome = checkOverwritingPropertyString(installHomeProp, installHome, vs);

            //	add an empty element as first for Lists
            classFamilies.add(0, "");
            busNames.add(0, "");

        } catch (Exception e) {
            if (e instanceof PogoException)
                throw (PogoException) e;
            else
                throw new PogoException(e.toString());
        }
    }

    //===============================================================
    //===============================================================
    private void loadSiteProperties() {
        try {
            //	fill data members with site properties if any
            List<String> codeList = loadSiteProperties(sitePropFilename);
            siteName = getStringProperty(siteNameProp, codeList);
            copyright = checkOverwritingLinesProperty(copyrightProp, codeList);
            docHome = checkOverwritingPropertyString(docHomeProp, docHome, codeList);
            makefileHome = checkOverwritingPropertyString(makefileHomeProp, makefileHome, codeList);
            siteClassFamilies = getStringListProperty(siteClassFamiliesProp, codeList);
        } catch (Exception e) {
            //	Display only a warning, but start normaly
            System.err.println("\nWARNING:	No site specific properties file found !\n");
        }
    }

    //===============================================================
    //===============================================================
    private String checkOverwritingLinesProperty(String propertyName, List<String> codeLines) {
        List<String> lines = new ArrayList<>();
        boolean in = false;
        String header = packname + "." + propertyName + ":";
        for (String codeLine : codeLines) {
            //  Get start and stop in code
            if (codeLine.startsWith(header))
                in = true;
            else
            if (codeLine.startsWith(packname))
                in = false;

            //  Get expected lines
            if (in) {
                //  First line is property name but could be followed by string
                if (codeLine.startsWith(header))
                    lines.add(codeLine.substring(header.length()).trim());
                else
                    lines.add(codeLine);
            }
        }
        //  if not empty, returns as String
        StringBuilder sb = new StringBuilder();
        for (String line : lines)
            sb.append(line).append("\n");
        return sb.toString().trim();
    }
    //===============================================================
    //===============================================================
    private void loadPogoRcProperties() {
        try {
            //	fill data members with own properties if any
            String rc_file = getPogoRCname();
            if (rc_file != null) {
                System.out.println(rc_file);
                List<String> propertyList = loadPropertiesRC(rc_file);
                projectHistory = getStringListProperty(ownProjectHistory, propertyList);
                multiClassProjectHistory =
                        getStringListProperty(multiProjectHistory, propertyList);
                inheritHome = getStringProperty(ownInheritanceHome, propertyList);
                contactAddress = getStringProperty(ownContactAddress, propertyList);

                String tmp = getStringProperty(ownLoadPrevious, propertyList);
                loadPrevious = Utils.isTrue(tmp);

                //	remove first one if is empty
                if (projectHistory.size() > 0 && projectHistory.get(0).length() == 0)
                    projectHistory.remove(0);
                if (multiClassProjectHistory.size() > 0 && multiClassProjectHistory.get(0).length() == 0)
                    multiClassProjectHistory.remove(0);
            }
        } catch (Exception e) {
            System.err.println("\nWARNING:	" + e);
        }
    }

    //===============================================================
    //===============================================================
    private String checkOverwritingPropertyString(String propertyName, String propertyValue, List<String> propertyList) {
        String tmp = getStringProperty(propertyName, propertyList);
        if (tmp != null) propertyValue = tmp;
        return propertyValue;
    }

    //===============================================================
    //===============================================================
    private static String getPogoRCname() {
        String env = System.getenv("HOME");
        if (env == null)
            env = System.getenv("TANGO_ROOT");
        if (env == null)
            env = System.getProperty("user.home");
        if (env == null)
            return null;
        return env + "/.pogorc";
    }

    //===============================================================
    //===============================================================
    private List<String> loadSiteProperties(String filename) throws PogoException, IOException {
        //	Get file URL and load it
        java.net.URL url = getClass().getResource(filename);
        System.out.println("Reading properties from " + url.getFile());
        InputStream is = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        List<String> lines = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null) {
            if (!str.startsWith("#")) {
                if (str.length() > 0) {
                    lines.add(str);
                    //System.out.println(str);
                }
            }
        }
        br.close();
        return lines;
    }
    //===============================================================
    //===============================================================
    private List<String> loadProperties(String filename) throws PogoException, IOException {
        //	Get file URL and load it
        java.net.URL url = getClass().getResource(filename);
        System.out.println("Reading properties from " + url.getFile());
        InputStream is = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        List<String> lines = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null) {
            str = str.trim();
            if (!str.startsWith("#")) {
                if (str.length() > 0) {
                    lines.add(str);
                    //System.out.println("lines:"+str);
                }
            }
        }
        br.close();
        return lines;
    }

    //===============================================================
    //===============================================================
    private List<String> loadPropertiesRC(String filename) throws PogoException, IOException {
        List<String> vs = new ArrayList<>();
        String code = ParserTool.readFile(filename);
        StringTokenizer stk = new StringTokenizer(code, "\n");
        while (stk.hasMoreTokens())
            vs.add(stk.nextToken());
        return vs;
    }

    //===============================================================
    //===============================================================
    private List<String> getStringListProperty(String propertyName, List<String> vs) {
        List<String> result = new ArrayList<>();
        boolean found = false;
        for (String line : vs) {
            if (!line.trim().startsWith("#")) {   //  Not a comment {
                if (!found) {
                    if (line.startsWith(packname + "." + propertyName)) {
                        int pos = line.indexOf(':');
                        if (pos > 0) {
                            found = true;
                            result.add(line.substring(pos + 1).trim());
                        }
                    }
                } else {
                    //  Check if it is a property name
                    if (line.trim().indexOf(':') > 2)// cannot be >0, could be like c:\..\..
                        found = false;
                    else
                        result.add(line.trim());
                }
            }
        }
        return result;
    }

    //===============================================================
    //===============================================================
    private String getStringProperty(String propertyName, List<String> propertyList) {
        for (String s : propertyList)
            if (s.startsWith(packname + "." + propertyName)) {
                int pos = s.indexOf(':');
                if (pos > 0) {
                    String str = s.substring(pos + 1).trim();
                    if (str.length() > 0)
                        return str;
                    else
                        return null;
                }
            }
        return null;
    }

    //===============================================================
    //===============================================================
    public void displayProperties() {
        String debug = System.getProperty("DEBUG_PROP");
        if (debug != null && debug.equals("true")) {
            displayProperty(classFamiliesProp, classFamilies);
            displayProperty(platformNamesProp, platformNames);
            displayProperty(busNamesProp, busNames);
        }
        displayProperty(docHomeProp, docHome);
        displayProperty(makefileHomeProp, makefileHome);
        displayProperty(installHomeProp, installHome);
        displayProperty(siteNameProp, siteName);
        displayProperty(copyrightProp, copyright);

        if (debug != null && debug.equals("true")) {
            displayProperty(siteClassFamiliesProp, siteClassFamilies);
        }
    }

    //===============================================================
    //===============================================================
    private void displayProperty(String name, String value) {
        System.out.println(name + ":	" + value);
    }

    //===============================================================
    //===============================================================
    private void displayProperty(String name, List<String> values) {
        System.out.print(name + ":");
        for (String s : values)
            System.out.println("	" + s);
        System.out.println();
    }

    //===============================================================
    //===============================================================
    public static void addProject(String projectName, int type) {
        if (type == PogoConst.SINGLE_CLASS) {
            //	Check if already exists -> remove
            for (int i = 0; i < projectHistory.size(); i++)
                if (projectHistory.get(i).equals(projectName))
                    projectHistory.remove(i);
            //	Add the new one in first index
            projectHistory.add(0, projectName);

            //	Check if size is not too big
            while (projectHistory.size() > ownHistoSize)
                projectHistory.remove(ownHistoSize - 1);
        } else {
            //	Check if already exists -> remove
            for (int i = 0; i < multiClassProjectHistory.size(); i++)
                if (multiClassProjectHistory.get(i).equals(projectName))
                    multiClassProjectHistory.remove(i);
            //	Add the new one in first index
            multiClassProjectHistory.add(0, projectName);

            //	Check if size is not too big
            while (multiClassProjectHistory.size() > ownHistoSize)
                multiClassProjectHistory.remove(ownHistoSize - 1);
        }
        //	Then update file.
        updatePogoRC();
    }

    //===============================================================
    private static String buildPropertyLine(String propertyName) {
        return packname + '.' + propertyName + ":\t";
    }

    //===============================================================
    //===============================================================
    public static void updatePogoRC() {
        StringBuilder sb = new StringBuilder();
        sb.append("#\n");
        sb.append("#       This is the Pogo user preferences file\n");
        sb.append("#\n\n");

        sb.append(buildPropertyLine(ownInheritanceHome)).append(inheritHome);
        sb.append("\n");
        sb.append(buildPropertyLine(ownContactAddress)).append(contactAddress);
        sb.append("\n");
        sb.append(buildPropertyLine(ownLoadPrevious)).append(loadPrevious);
        sb.append("\n\n");
        sb.append(buildPropertyLine(ownProjectHistory)).append('\n');
        for (String project : projectHistory)
            sb.append('\t').append(project).append('\n');
        sb.append("\n\n");
        sb.append(buildPropertyLine(multiProjectHistory)).append('\n');
        for (String project : multiClassProjectHistory)
            sb.append('\t').append(project).append('\n');

        //  Try to read to compare
        String rc_file = getPogoRCname();
        String code = "";
        try {
            code = ParserTool.readFile(rc_file);
        } catch (Exception e) {
            //	Display only a warning, but start normally
            System.err.println("\nWARNING:	" + e);
        }

        try {
            //  If different -> save.
            if (!code.equals(sb.toString())) {
                ParserTool.writeFile(rc_file, sb.toString());
                System.out.println(rc_file + " updated");
            }
        } catch (Exception e) {
            //	Display only a warning, but start normally
            System.err.println("\nWARNING:	" + e);
        }
    }
    //===============================================================
    //===============================================================

    //===============================================================
    //===============================================================
    public boolean updateSitePropertyFile(Component parent) throws PogoException {
        java.net.URL url =
                getClass().getResource(sitePropFilename);
        String  fileName = null;
        boolean alreadyExists = true;
        //  If save directory is unknown
        if (url == null) {
            alreadyExists = false;
            Utils.popupError(new JFrame(),
                    "URL for property file (" + sitePropFilename + ") is unknown !\n\n"+
                    "Select a directory to write property file.\n" +
                    "It will have to be added in  your CLASSPATH environment.");

            //  OPeb a JFileChooser to select it
            JFileChooser    fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            if (fileChooser.showDialog(parent, "Target Dir.") == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (file != null && file.isDirectory()) {
                    fileName = file.getAbsolutePath() + sitePropFilename;
                }
            }
            else
                return false;
        }
        else {
            fileName = url.toString();
            if (fileName.startsWith("file:"))
                fileName = fileName.substring("file:".length());
        }


        //  Read file
        String code = ParserTool.readFile(fileName);
        boolean writeIt = false;
        //  Insert Site name
        int start = code.indexOf(siteNameProp);
        if (start>0) {
            start = code.indexOf(':', start) + 1;
            int end = code.indexOf('\n', start);
            code = code.substring(0, start) + "  " +
                    ((siteName == null) ? "" : siteName) + code.substring(end);
            writeIt = true;
        }

        //  Insert Site copyright
        if (copyright!=null && !copyright.isEmpty()) {
            start = code.indexOf(copyrightProp);
            if (start>0) {
                int end = code.indexOf("#", start);
                if (end<0)
                    end = code.indexOf(packname, start);
                if (end>0)
                    code = code.substring(0, start) +
                            copyrightProp + ":\n" +
                            copyright + "\n\n" + code.substring(end);
                else
                    code = code.substring(0, start) +
                            copyrightProp + ":\n" + copyright + "\n";
            }
            else {
                code += "#\n" +
                        "#\tCopyright for generated Tango classes\n" +
                        "#\n" +
                        "org.tango.pogo.copyright:\n" +
                        copyright+ "\n";
            }
            writeIt = true;
        }


        //  Insert Site families
        start = code.indexOf(siteClassFamiliesProp);
        if (start>0) {
            //  Build string to be inserted for families
            StringBuilder indent = new StringBuilder();
            for (int i = 0; i < siteClassFamiliesProp.length() + packname.length() + 3; i++)
                indent.append(' ');
            StringBuilder sb = new StringBuilder("  ");
            for (String family : siteClassFamilies)
                sb.append(family).append('\n').append(indent);
            String property = "  " + sb.toString().trim() + '\n';

            //  Get position to insert
            start = code.indexOf(':', start) + 1;
            int end = code.indexOf('#', start);
            code = code.substring(0, start) + property + code.substring(end);
            writeIt = true;
        }

        //  Then write file.
        if (writeIt) {
            System.out.println("writing  " + fileName);
            ParserTool.writeFile(fileName, code);
            if (!alreadyExists) {
                //  If first generating time display message
                JOptionPane.showMessageDialog(parent,
                        "File "+ fileName + "has been written\n\n" +
                        "Add the directory to your CLASSPATH environment to be re-loaded by Pogo !",
                        "Help Window",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        }
        return true;
    }
    //===============================================================
    //===============================================================

    //===============================================================
    //===============================================================
    public static void main(String[] args) {
        try {
            PogoProperty.init().displayProperties();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
