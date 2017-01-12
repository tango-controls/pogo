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

package org.tango.pogo.pogo_gui.tools;

import fr.esrf.tango.pogo.pogoDsl.*;

import fr.esrf.tangoatk.widget.util.JSmoothProgressBar;
import fr.esrf.tangoatk.widget.util.Splash;
import org.tango.pogo.pogo_gui.PogoConst;
import org.eclipse.emf.common.util.EList;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;


public class Utils {
    private static Utils instance = null;

    private static ImageIcon tango_icon = null;
    public ImageIcon logoIcon;
    public ImageIcon rootIcon;
    public ImageIcon classIcon;
    public ImageIcon collectionIcon;
    public ImageIcon classPropertyIcon;
    public ImageIcon cmdIcon;
    public ImageIcon cmdExpertIcon;
    public ImageIcon scalarIcon;
    public ImageIcon scalarExpertIcon;
    public ImageIcon spectrumIcon;
    public ImageIcon spectrumExpertIcon;
    public ImageIcon imageIcon;
    public ImageIcon imageExpertIcon;
    public ImageIcon forwardedIcon;
    public ImageIcon pipeIcon;
    public ImageIcon devicePropertyIcon;
    public ImageIcon stateIcon;
    public ImageIcon inheritanceIcon;
    public ImageIcon removeIcon;

    public ImageIcon abstractIcon;
    public ImageIcon inheritedIcon;
    public ImageIcon overloadedIcon;
    public ImageIcon unknownIcon;

    public ImageIcon reloadIcon;
    public ImageIcon newIcon;
    public ImageIcon newFromTemplateIcon;
    public ImageIcon openIcon;
    public ImageIcon saveIcon;

    public ImageIcon cppLogo;
    public ImageIcon javaLogo;
    public ImageIcon pythonLogo;
    public ImageIcon pythonHLLogo;
    public ImageIcon errorIcon;

    //===============================================================
    //===============================================================
    private Utils() {
        rootIcon = getIcon("TangoSplash.jpg", 0.2);
        classIcon = getIcon("TangoClass.gif", 0.12);
        logoIcon = classIcon;
        collectionIcon = getIcon("tools.gif");
        classPropertyIcon = getIcon("class.gif");
        cmdIcon = getIcon("command.gif");
        cmdExpertIcon = getIcon("command_expert.gif");
        scalarIcon = getIcon("scalar.gif");
        scalarExpertIcon = getIcon("scalar_expert.gif");
        spectrumIcon = getIcon("spectrum.gif");
        spectrumExpertIcon = getIcon("spectrum_expert.gif");
        imageIcon = getIcon("image.gif", 0.25);
        imageExpertIcon = getIcon("image_expert.gif", 0.25);
        forwardedIcon = getIcon("forward.gif", 0.20);
        pipeIcon = getIcon("pipe.gif", 0.16);
        devicePropertyIcon = getIcon("device.gif");
        stateIcon = getIcon("state.gif");
        inheritanceIcon = getIcon("inherite.gif", 0.5);
        removeIcon = getIcon("remove.gif");

        abstractIcon = getIcon("abstract.gif");
        inheritedIcon = getIcon("inherited.gif");
        overloadedIcon = getIcon("concrete.gif");
        unknownIcon = getIcon("greyball.gif");

        reloadIcon = getIcon("reload_icon.gif", 0.8);
        newIcon = getIcon("new_icon.gif", 1.0);
        newFromTemplateIcon = getIcon("new_templ_icon.gif", 1.0);
        openIcon = getIcon("open_icon.gif", 1.0);
        saveIcon = getIcon("save_icon.gif", 1.0);

        cppLogo    = getIcon("CppLogo.gif",    0.66);
        javaLogo   = getIcon("JavaLogo.gif",   0.12);
        pythonLogo = getIcon("PythonLogo.gif", 0.33);
        pythonHLLogo = getIcon("PythonHLLogo.gif", 0.33);

        errorIcon = getIcon("error.gif");

        //  Initialize pogoGuiRevision
        getPogoGuiRevision();
    }

    //===============================================================
    //===============================================================
    public static Utils getInstance() {
        if (instance == null)
            instance = new Utils();
        return instance;
    }

    //===============================================================
    //===============================================================
    private static double   pogoGuiRevision = -1.0;
    public static double getPogoGuiRevision() {
        
        //  Check if already done
        if (pogoGuiRevision<0) {
           StringTokenizer stk = new StringTokenizer(PogoConst.revNumber);
           String  s = stk.nextToken();    //  Rel number
            int end = s.indexOf('.');
            if (end>0) {
                //  Check if second '.'
                end = s.indexOf('.', end+1);
                if (end>0) {
                    s = s.substring(0, end);
               }
                try {
                    pogoGuiRevision = Double.parseDouble(s);
                }
                catch (NumberFormatException e) {
                    System.err.println("When trying to get PogoGuiRevision :\n" + e);
                }
            }
            System.out.println("********* Pogo GUI Release : " +
                    pogoGuiRevision + ".x *********");
        }
        return pogoGuiRevision;
    }
    //===============================================================
    //===============================================================
    public ImageIcon getIcon(String filename, double ratio) {
        ImageIcon icon = getIcon(filename);
        return getIcon(icon, ratio);
    }

    //===============================================================
    //===============================================================
    public ImageIcon getIcon(ImageIcon icon, double ratio) {
        if (icon != null) {
            int width = icon.getIconWidth();
            int height = icon.getIconHeight();

            width = (int) (ratio * width);
            height = (int) (ratio * height);
            icon = new ImageIcon(
                    icon.getImage().getScaledInstance(
                            width, height, Image.SCALE_SMOOTH));
        }
        return icon;
    }

    //===============================================================
    //===============================================================
    public java.net.URL getImageUrl(String filename) {
        return getClass().getResource("/org/tango/pogo/pogo_gui/img/" + filename);
    }

    //===============================================================
    //===============================================================
    public ImageIcon getIcon(String filename) {
        java.net.URL url = getImageUrl(filename);
        if (url == null) {
            System.err.println("Icon file  " + filename + "  not found");
            return null;
        }
        return new ImageIcon(url);
    }
    //===============================================================
    //===============================================================
    public static String getRelativeFilename(String absFilename) {
        String relativeFilename = absFilename;
        int pos = absFilename.lastIndexOf(
                System.getProperty("file.separator"));
        if (pos > 0)
            relativeFilename = absFilename.substring(pos + 1);
        return relativeFilename;
    }

    //===============================================================
    //===============================================================
    public static String getPath(String filename) {
        String separator = System.getProperty("file.separator");
        int pos = filename.lastIndexOf(separator);
        String path = "./";
        if (pos > 0)
            path = filename.substring(0, pos);
        return path;
    }

    //============================================================================
    //============================================================================
    public static int getLanguage(String lang) {
        for (int i = 0; i < PogoConst.strLang.length; i++)
            if (lang.toLowerCase().equals(PogoConst.strLang[i].toLowerCase()))
                return i;
        return -1;
    }

    //============================================================================
    //============================================================================
    public static String getFileExtension(String lang) {
        return PogoConst.fileExtension[getLanguage(lang)];
    }
    //============================================================================
    /**
     * Build the execute method's name from command's name
     *
     * @param commandName the command specified name.
     * @return The method's name built.
     */
    //========================================================================
    public static String buildCppExecuteMethodName(String commandName) {
        //	Special case for State and Status cmd
        if (commandName.equals("State"))
            return "dev_state";
        if (commandName.equals("Status"))
            return "dev_status";

        //	Else replace upper case by '_' char and lowercase
        String str = "";
        for (int i = 0; i < commandName.length(); i++) {
            if (commandName.charAt(i) >= 'A' && commandName.charAt(i) <= 'Z') { //	if upper case
                if (i > 0) {
                    //	Check if previous char is not an upper case too
                    if (commandName.charAt(i - 1) < 'A' || commandName.charAt(i - 1) > 'Z')
                        str += '_';
                }
                //	Set it to lower case
                str += (char) (commandName.charAt(i) + ('a' - 'A'));
            } else
                str += commandName.charAt(i);
        }
        return str;
    }

    //===============================================================
    //===============================================================
    public static int getCommandIndex(EList<Command> list, Command cmd) {
        int idx = -1;
        int i = 0;
        for (Command c : list) {
            if (c == cmd)
                idx = i;
            i++;
        }
        return idx;
    }

    //===============================================================
    //===============================================================
    public static int getAttributeIndex(EList<Attribute> list, Attribute attribute) {
        int idx = -1;
        int i = 0;
        for (Attribute att : list) {
            if (att == attribute)
                idx = i;
            i++;
        }
        return idx;
    }
   //===============================================================
    //===============================================================
    public static int getForwardedAttributeIndex(EList<ForwardedAttribute> list, ForwardedAttribute attribute) {
        int idx = -1;
        int i = 0;
        for (ForwardedAttribute att : list) {
            if (att == attribute)
                idx = i;
            i++;
        }
        return idx;
    }
   //===============================================================
    //===============================================================
    public static int getPipeIndex(EList<Pipe> list, Pipe attribute) {
        int idx = -1;
        int i = 0;
        for (Pipe pipe : list) {
            if (pipe == attribute)
                idx = i;
            i++;
        }
        return idx;
    }

    //===============================================================
    //===============================================================
    public static int getStateIndex(EList<State> list, State state) {
        int idx = -1;
        int i = 0;
        for (State st : list) {
            if (st == state)
                idx = i;
            i++;
        }
        return idx;
    }

    //===============================================================
    //===============================================================
    public static int getPropertyIndex(EList<Property> list, Property prop) {
        int idx = -1;
        int i = 0;
        for (Property p : list) {
            if (p == prop)
                idx = i;
            i++;
        }
        return idx;
    }

    //===================================================================
    //===================================================================
    public static String strReplaceSpecialCharToCode(String text) {
        if (text == null)
            return null;
        text = Utils.strReplace(text, "\"", "``").trim();
        text = Utils.strReplace(text, "\'", "`").trim();
        return text;
    }

    //===================================================================
    //===================================================================
    public static String strReplaceSpecialCharToDisplay(String text) {
        if (text == null)
            return null;
        text = Utils.strReplace(text, "\\\"", "\"").trim();
        text = Utils.strReplace(text, "\\\'", "\'").trim();
        return text;
    }

    //===================================================================
    //===================================================================
    public static String strReplace(String text, String old_str, String new_str) {
        if (text == null) return "";
        for (int pos = 0; (pos = text.indexOf(old_str, pos)) >= 0; pos += new_str.length())
            text = text.substring(0, pos) + new_str +
                    text.substring(pos + old_str.length());
        return text;
    }

    //===============================================================
    //===============================================================
    public static String checkNameSyntax(String name, String type, boolean isStateStatus) throws PogoException {
        return checkNameSyntax(name,type, isStateStatus, false);
    }
    //===============================================================
    //===============================================================
    public static String checkNameSyntax(String name,
                                         String type, boolean isStateStatus,
                                         boolean isAttribute) throws PogoException {
        if (name == null || name.length() == 0)
            throw new PogoException(type+" (" + name + ") not valid !");

        //	check if one word
        StringTokenizer stk = new StringTokenizer(name);
        String s = "";
        while (stk.hasMoreTokens())
            s += stk.nextToken();
        name = s;

        //	Check for special char
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if ((c < '0' || (c > '9' && c < 'A') || (c > 'Z' && c < 'a') || c > 'z') && c != '_')
                throw new PogoException("Syntax error in " + type + ": Do not use '" + c + "' char.");
        }

        char firstChar = name.toUpperCase().charAt(0);
        //	First char must be a letter
        if (firstChar < 'A' || firstChar > 'Z') {
            if (!(firstChar == '_' && isAttribute)) //  '-' only for attribute
               throw new PogoException(name + ":\nSyntax error in " + type + ": The first char must be a letter");
        }
        //	Check for NOT state or Status
        if (!isStateStatus)
            if (name.equals("State") || name.equals("Status"))
                throw new PogoException(name + "  is reserved");

        return name;
    }
    //===============================================================

    /**
     * If b equals true, return "true" , otherwise return "false"
     *
     * @param b the specified input boolean
     * @return "true" if str equals true, otherwise return "false"
     */
    //===============================================================
    public static String strBoolean(boolean b) {
        return (b) ? "true" : "false";
    }
    //===============================================================
    /**
     * If str equals true, return "true" , otherwise return "false"
     *
     * @param str the specified input string
     * @return "true" if str equals true, otherwise return "false"
     */
    //===============================================================
    public static String strBoolean(String str) {
        return (isTrue(str)) ? "true" : "false";
    }
    //===============================================================
    /**
     * If str equals true, return true , otherwise return false
     *
     * @param str the specified input string
     * @return true if str equals true, otherwise return false
     */
    //===============================================================
    public static boolean isTrue(String str) {
        return str != null && str.equals("true");
    }
    //===============================================================
    /**
     * If str equals false or null, return true , otherwise return false
     *
     * @param str the specified input string
     * @return true if str equals false or null, otherwise return false
     */
    //===============================================================
    public static boolean isFalse(String str) {
        return ! isTrue(str);
    }

    //===============================================================
    //===============================================================
    public static boolean isSet(String str) {
        return str!=null && !str.isEmpty();
    }
    //===============================================================
    /**
     * Like String.equals() but check if input args are not null
     *
     * @param str1 string 1 to be compared
     * @param str2 string 2 to be compared
     * @return return true is str1 equals str2.
     */
    //===============================================================
    public static boolean isEquals(String str1, String str2) {
        return str1 != null &&
                str2 != null && str1.equals(str2);
    }

    //===============================================================
    //===============================================================
    public static boolean isExpert(Command cmd) {
        return isEquals(cmd.getDisplayLevel(),
                PogoConst.strLevel[PogoConst.EXPERT]);
    }

    //===============================================================
    //===============================================================
    public static boolean isExpert(Attribute att) {
        return isEquals(att.getDisplayLevel(),
                PogoConst.strLevel[PogoConst.EXPERT]);
    }

    //===============================================================
    //===============================================================
    public static void popupError(Component component, String message) {
        try {
            throw new PogoException(message);
        } catch (PogoException e) {
            Utils.getInstance().stopSplashRefresher();
            e.popup(component);
        }
    }
    //===============================================================
    /**
     * Returns a vector of file names found in specified directory
     *
     * @param dirName specified directory name
     * @return a vector of file names fond.
     */
    //===============================================================
    public List<String> getFileList(String dirName) {
        List<String> v = new ArrayList<>();
        File dir = new File(dirName);
        String[] fileNames = dir.list();

        if (fileNames == null)
            return v;

        for (String name : fileNames) {
            String filename = dirName + "/" + name;
            File f = new File(filename);
            if (!f.isDirectory())
                v.add(name);
        }
        Collections.sort(v, new StringCompare());
        return v;
    }
    //===============================================================
    /**
     * Search a file from a directory (in it an sub directories)
     *
     * @param searched the serched file name
     * @param dirname  the disrectory to start search
     * @return the full file name (path/name)
     */
    //===============================================================
    public static String searchFileFromDirectory(String searched, String dirname) {
        File d = new File(dirname);
        String[] filenames = d.list();

        if (filenames == null)
            return null;
        for (String name : filenames) {
            //	Recursive if directory
            String filename = dirname + "/" + name;
            File f = new File(filename);
            if (f.isDirectory()) {
                String found = searchFileFromDirectory(searched, f.toString());
                if (found != null)
                    return found;
            } else if (name.equals(searched))
                return filename;
        }

        //	Not found
        return null;
    }
    //===============================================================
    /**
     * Check if OS is Unix
     *
     * @return true if OS is not windows
     */
    //===============================================================
    public static boolean osIsUnix() {
        String os = System.getProperty("os.name");
        return !os.toLowerCase().startsWith("windows");
    }

    //===============================================================
    //===============================================================
    public static void showInHtmBrowser(String url) {
        //  Check for browser
        String browser;
        if ((browser = System.getProperty("BROWSER")) == null) {
            if (osIsUnix())
                browser = "firefox - turbo";
            else
                browser = "explorer";
        }
        String cmd = browser + " " + url;
        try {
            executeShellCmdAndReturn(cmd);
        } catch (Exception e) {
            PogoException.popup(new JFrame(), e.toString());
        }
    }
    //===============================================================
    /**
     * Execute a shell command and throw exception if command failed.
     *
     * @param cmd shell command to be executed.
     * @throws java.io.IOException in case of execution failed
     */
    //===============================================================
    public static void executeShellCmdAndReturn(String cmd)
            throws IOException {
        Process process = Runtime.getRuntime().exec(cmd);

        // get command output stream and
        // put a buffered reader input stream on it.
        InputStream inputStream = process.getInputStream();
        new BufferedReader(new InputStreamReader(inputStream));

        // do not read output lines from command
        // Do not check its exit value
    }
    //===============================================================
    /**
     *	Execute a shell command and throw exception if command failed.
     *
     *	@param cmd	shell command to be executed.
     */
    //===============================================================
    public static String executeShellCommand(String cmd) throws PogoException {
        try {
            Process process = Runtime.getRuntime().exec(cmd);

            // get command's output stream and
            // put a buffered reader input stream on it.
            InputStream inputStream = process.getInputStream();
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();

            // read output lines from command
            String str;
            while ((str = br.readLine()) != null) {
                sb.append(str).append("\n");
            }

            // wait for end of command
            process.waitFor();

            // check its exit value
            int retVal;
            if ((retVal = process.exitValue()) != 0) {
                //	An error occur try to read it
                InputStream errorStream = process.getErrorStream();
                br = new BufferedReader(new InputStreamReader(errorStream));
                while ((str = br.readLine()) != null) {
                    sb.append(str).append("\n");
                }
                throw new PogoException("the shell command\n" + cmd +
                        "\nreturns : " + retVal + " !\n\n" + sb);
            }
            System.out.println(sb);
            return sb.toString();
        }
        catch (Exception e) {
            if (e instanceof PogoException)
                throw (PogoException) e;
            throw new PogoException(e.toString());
        }
    }

    //===============================================================
    //===============================================================
    public static String getXmiFile(boolean getMultiClasses) {
        File f = new File(".");
        String[] fileList = f.list();
        for (String fileName : fileList) {
            if (new File(fileName).isFile()) {
                if (!getMultiClasses && fileName.endsWith(".xmi") && !fileName.contains(".multi.")) {
                    return fileName;
                }
                else
                if (getMultiClasses && fileName.endsWith(".multi.xmi")) {
                    return fileName;
                }
            }
        }
        return null;
    }
    //===============================================================
    /**
     * Manage the doc_html location in "." or ".."
     * @param pogoClass the specified class.
     * @param beforeProcessing  before/after processing to know the way ro move
     */
    //===============================================================
    static void manageHtmlDirectory(PogoDeviceClass pogoClass, boolean beforeProcessing) {
        String defaultLocation  = "./doc_html";
        if (!PogoProperty.docHome.equals(defaultLocation)) {   //  Not the default location
            if (pogoClass.getDescription().getFilestogenerate().contains("html")) {
                File    defaultLocationFile = new File(
                        pogoClass.getDescription().getSourcePath()+"/"+defaultLocation);
                File    expectedLocationFile = new File(
                        pogoClass.getDescription().getSourcePath()+"/"+PogoProperty.docHome);
                if (beforeProcessing) {
                    //  try to move from location to default
                    if (expectedLocationFile.renameTo(defaultLocationFile))
                        System.err.println("Failed to move html dir to " + defaultLocation);
                }
                else {
                    //  try to move from location to default
                    if (defaultLocationFile.renameTo(expectedLocationFile))
                        System.err.println("Failed to move html dir to " + expectedLocationFile);
                }
            }
        }

        /*** Description file has been set to ClassDescription ***
        if (beforeProcessing) {
            //  Check html file to do not have ' char
            //  Problem during protected region parsing
            File description = new File(pogoClass.getDescription().getSourcePath() +
                    "/" + defaultLocation+"/Description.html");
            if (description.exists()) {
                try {
                    String          htmlChar = "&lsquo;";
                    StringBuilder   sb = new StringBuilder();
                    String  code = ParserTool.readFile(description.toString());
                    int start;
                    int end = 0;
                    boolean modified = false;
                    while ((start=code.indexOf('\'', end))>0) {
                        sb.append(code.substring(end, start)).append(htmlChar);
                        end = start+1;
                        modified = true;
                    }
                    sb.append(code.substring(end));
                    
                    if (modified) {
                        ParserTool.writeFile(description.toString(), sb.toString());
                    }
                }
                catch(PogoException e) {
                    System.err.println(e);
                }
            }
        }
         ****************/
    }
    //===============================================================
    //===============================================================
    private static String getAbsolutePath(String path) {
        //  Check original path
        File file = new File(path);
        if (file.isFile()) {
            //  If file, get only pah
            return file.getParent();
        }
        else
            return file.getAbsolutePath();
    }
    //===============================================================
    /**
     * Compute relative path between a path and a reference
     * @param path          specified path
     * @param referencePath reference path
     * @return the relative path
     */
    //===============================================================
    public static String getRelativePath(String path, String referencePath) {
        String separator = System.getProperty("file.separator");
        path = getAbsolutePath(path);
        referencePath = getAbsolutePath(referencePath);

        StringTokenizer stk = new StringTokenizer(path, separator);
        List<String>    pathList = new ArrayList<>();
        while (stk.hasMoreTokens()) pathList.add(stk.nextToken());
        stk = new StringTokenizer(referencePath, separator);
        List<String>    refList = new ArrayList<>();
        while (stk.hasMoreTokens()) refList.add(stk.nextToken());

        //  Special case for Windows
        //  If file come from different disk (e.g. c: end d:)
        if (refList.get(0).endsWith(":") && pathList.get(0).endsWith(":")) {
            if (refList.get(0).equalsIgnoreCase(pathList.get(0))==false) {
                //  Cannot compute a relative path
                //      --> return absolute
                return path;
            }
        }

        //  Check common part from start
        int idx;
        if (refList.get(0).equalsIgnoreCase(pathList.get(0)))
            idx = 1;
        else
            idx = 0;
        while (idx<refList.size() && idx<pathList.size() &&
               refList.get(idx).equals(pathList.get(idx)))
            idx++;
        //  Add up part
        StringBuilder sb = new StringBuilder();
        for (int i=idx ; i<refList.size() ; i++)
            sb.append("..").append(separator);
        //  Add down part
        for (int i=idx ; i<pathList.size() ; i++)
            sb.append(pathList.get(i)).append(separator);

        //  Remove last separator
        String relative = sb.toString();
        if (relative.endsWith(separator))
            relative = relative.substring(0, relative.length()-1);

        //  if no .. part add relative to ./
        if (relative.startsWith("..")==false)
            relative = "./"+relative;

        //  Convert to Linux format
        relative = strReplace(relative, "\\", "/");
        while (relative.startsWith("././")) {
            relative = relative.substring("./".length());
        }
        return relative;
    }
    //===============================================================
    /**
     * Compute an absolute path with a reference path and a relative path
     * @param relativePath  relative path
     * @param referencePath reference path
     * @return the absolute path
     */
    //===============================================================
    public static String getAbsolutePath(String relativePath, String referencePath) {
        String separator = System.getProperty("file.separator");
        referencePath = getAbsolutePath(referencePath);

        //  Then build absolute path
        return new File(referencePath+separator+relativePath).getAbsolutePath();
    }
    //===============================================================
    //===============================================================
    public static void main(String[] args) {
        String relative  = "../../CounterTimer/trunk/src";
        String reference = "Y:/tango/tmp/pascal/rel_path/SimCounterTimer/trunk/SimCounterTimer.xmi";
        //String path    = "y:/tango/tmp/pascal/rel_path/SimCounterTimer/trunk/abstract";
        String path      = "y:/tango/tmp/pascal/rel_path/CounterTimer/trunk/src";

        System.out.println("Absolute: " + getAbsolutePath(relative, reference));
        System.out.println("Relative: " + getRelativePath(path, reference));
    }
    //===============================================================
    //===============================================================


    //  Multi lines tooltip methods
    private static final String tooltipHeader =
            "<html><BODY TEXT=\"#000000\" BGCOLOR=\"#FFFFD0\">";

    //===============================================================
    //===============================================================
    public static String buildToolTip(String text) {
        return buildToolTip(null, text);
    }

    //===============================================================
    //===============================================================
    public static String buildToolTip(String title, String text) {

        StringBuilder sb = new StringBuilder(tooltipHeader);
        if (title != null && title.length() > 0) {
            sb.append("<b><Center>")
                    .append(Utils.strReplace(title, "\n", "<br>\n"))
                    .append("</center></b><HR WIDTH=\"100%\">");
        }
        if (text != null && text.length() > 0) {
            text = Utils.strReplace(text, "\n", "<br>\n");
            text = Utils.strReplace(text, "\t", "&nbsp;&nbsp;&nbsp;&nbsp;");
            sb.append(text);
        }
        return sb.toString();
    }
    //===============================================================
    //===============================================================




    //======================================================
    //======================================================
    private static HashMap<String, Color> foregroundMap = null;
    public static Color getForeground4State(String stateName) {
        if (foregroundMap==null) {
            foregroundMap = new HashMap<>();
            foregroundMap.put("ON", Color.black);
            foregroundMap.put("OFF", Color.black);
            foregroundMap.put("CLOSE", Color.black);
            foregroundMap.put("OPEN", Color.black);
            foregroundMap.put("INSERT", Color.black);
            foregroundMap.put("EXTRACT", Color.black);
            foregroundMap.put("MOVING", Color.white);
            foregroundMap.put("STANDBY", Color.black);
            foregroundMap.put("FAULT", Color.white);
            foregroundMap.put("INIT", Color.black);
            foregroundMap.put("RUNNING", Color.white);
            foregroundMap.put("ALARM", Color.black);
            foregroundMap.put("DISABLE", Color.black);
            foregroundMap.put("UNKNOWN", Color.white);
        }
        Color color = foregroundMap.get(stateName);
        if (color==null)
            color = foregroundMap.get("UNKNOWN");
        return color;
    }
    //======================================================
    //======================================================
    private static HashMap<String, Color> stateMap = null;
    public static Color getColor4State(String stateName) {
        if (stateMap==null) {
            stateMap = new HashMap<>();
            stateMap.put("ON", new java.awt.Color(0, 255, 0));          // Green
            stateMap.put("OFF", new java.awt.Color(255, 255, 255));     // White
            stateMap.put("CLOSE", new java.awt.Color(255, 255, 255));   // White
            stateMap.put("OPEN", new java.awt.Color(0, 255, 0));        // Green
            stateMap.put("INSERT", new java.awt.Color(255, 255, 255));  // White
            stateMap.put("EXTRACT", new java.awt.Color(0, 255, 0));     // Green
            stateMap.put("MOVING", new java.awt.Color(128, 160, 255));  // Light Blue
            stateMap.put("STANDBY", new java.awt.Color(255, 255, 0));   // Yellow
            stateMap.put("FAULT", new java.awt.Color(255, 0, 0));       // Red
            stateMap.put("INIT", new java.awt.Color(204, 204, 122));    // Beige
            stateMap.put("RUNNING", new java.awt.Color(0, 125, 0));     // Dark Green
            stateMap.put("ALARM", new java.awt.Color(255, 140, 0));     // Orange
            stateMap.put("DISABLE", new java.awt.Color(255, 0, 255));   // Magenta
            stateMap.put("UNKNOWN", new java.awt.Color(125, 125, 125)); // Grey
        }
        Color color = stateMap.get(stateName);
        if (color==null)
            color = stateMap.get("UNKNOWN");
        return color;
    }
    //======================================================
    //======================================================





    private static Splash splash = null;
    private static boolean splashOn;
    private SplashRefresher splash_refresher;
    private static boolean useDisplay = true;
    //=======================================================
    //=======================================================
    private void createSplash() {
        try {
            if (tango_icon == null)
                tango_icon = getIcon("TangoSplash.gif");
            JSmoothProgressBar myBar = new JSmoothProgressBar();
            myBar.setStringPainted(true);
            myBar.setBackground(Color.lightGray);
            myBar.setProgressBarColors(Color.gray, Color.lightGray, Color.darkGray);

            splash = new Splash(tango_icon, Color.black, myBar);
            splash.setMessage("POGO: Tango code generator");
            splash.setMaxProgress(100);
            splash.setTitle("POGO");
            splash.setCopyright(PogoConst.revNumber);
        } catch (Exception e) {
            useDisplay = false;
            System.err.println("Cannot create Splah: " + e);
        }
    }

    //=======================================================
    //=======================================================
    public void stopSplashRefresher() {
        if (splash != null && useDisplay)
            splash_refresher.setSplashOn(false, "");
    }

    //=======================================================
    //=======================================================
    private boolean splashInit = false;

    public void startSplashRefresher(String message) {
        if (!splashInit) {
            String env = System.getenv("Classes2www"); //  For classes2www, No display
            if (env != null && env.equals("true"))
                useDisplay = false;
        }
        splashInit = true;

        if (splash == null)
            if (useDisplay)
                createSplash();
        if (!useDisplay)
            splash = null;

        if (useDisplay) {
            splashOn = true;
            splash_refresher = new SplashRefresher();
            splash_refresher.start();
            splash_refresher.setSplashOn(true, message);
        }
    }

    //=======================================================
    //=======================================================
    private class SplashRefresher extends Thread {
        //===================================================
        private synchronized void setSplashOn(boolean b, String message) {
            if (useDisplay) {
                splashOn = b;
                splash.setMessage(message);
            }
        }

        //===================================================
        public void run() {
            int idx = 1;
            splash.initProgress();
            splash.setVisible(true);
            splash.repaint();
            while (splashOn) {
                splash.progress(idx);
                if (idx++ > 98)
                    idx = 10;
                doSleep(100);
            }
            splash.progress(100);
            splash.setVisible(false);
        }

        //===================================================
        private synchronized void doSleep(long millis) {
            try {
                wait(millis);
            } catch (InterruptedException e) {/*  */}
        }
        //====================================================
    }




    //======================================================
    /**
     * MyCompare class to sort collection
     */
    //======================================================
    class StringCompare implements Comparator<String> {
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    }
}
