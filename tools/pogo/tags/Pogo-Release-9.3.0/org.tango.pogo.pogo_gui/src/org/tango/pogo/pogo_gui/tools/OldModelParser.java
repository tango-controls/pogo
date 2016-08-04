//+======================================================================
//
// Project:   Tango
//
// Description:  java source code to manage a parser tool for old POGO model
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
 *	This class is able to manage a parser tool for old POGO model
 *
 * @author verdier
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings({"ALL"})
public class OldModelParser {
    private String fileCode;
    private pogo.gene.PogoClass pogo_class;
    private List<String> methods = new ArrayList<>();
    private List<String> signatures = new ArrayList<>();

    private static final String[] cpp_constructors = {
            "(Tango::DeviceClass *cl,string &s)",
            "(Tango::DeviceClass *cl,const char *s)",
            "(Tango::DeviceClass *cl,const char *s,const char *d)",
    };
    private static final String[] cpp_expected_sig = {
            "void ::delete_device()",
            "void ::init_device()",
            "void ::get_device_property()",
            "void ::always_executed_hook()",
            "void ::read_attr_hardware(vector<long> &attr_list)",
    };


    //===============================================================
    //===============================================================
    public OldModelParser(String filename)
            throws SecurityException, IOException, PogoException {
        try {
            pogo_class = new pogo.gene.PogoClass(filename);
        } catch (pogo.gene.PogoException e) {
            throw new PogoException(e.toString());
        }
        initialize(filename);
    }

    //===============================================================
    //===============================================================
    public OldModelParser(String filename, pogo.gene.PogoClass pogo_class)
            throws SecurityException, IOException, PogoException {
        this.pogo_class = pogo_class;
        initialize(filename);
    }

    //===============================================================
    //===============================================================
    private void initialize(String filename)
            throws SecurityException, IOException, PogoException {
        fileCode = ParserTool.readFile(filename);
        int start = fileCode.indexOf("namespace ");
        if (filename.endsWith("main.cpp") ||
                filename.endsWith(".html"))
            return;    //	nothing to parse
        if (start < 0)
            throw new PogoException("namespace not found in " + filename);
        start = fileCode.indexOf("{", start) + 2;
        if (start < 0)
            throw new PogoException("Namespace not found");

        parseMethodCode(start);
    }

    //===============================================================
    //===============================================================
    public String getCode() {
        return fileCode;
    }

    //===============================================================
    //===============================================================
    private void parseMethodCode(int start) {
        int pos;
        while ((pos = fileCode.indexOf("{", start)) > 0) {
            pos++;
            int cnt = 1;
            while (cnt > 0) {
                if (fileCode.charAt(pos) == '{')
                    cnt++;
                else if (fileCode.charAt(pos) == '}')
                    cnt--;
                pos++;
            }
            String method = fileCode.substring(start, pos).trim();
            methods.add(method);
            String sig = getMethodSignature(method);
            signatures.add(sig);
            start = pos;
        }
    }

    //===============================================================
    //===============================================================
    private String getMethodSignature(String method) {
        int end = method.indexOf("{");
        String signature = method.substring(0, end);
        //	Remove comments (//) if any
        int start = 0;
        int pos;
        int previous = -1;
        while ((pos = signature.indexOf("//", start)) >= 0 && start > previous) {
            previous = start;
            start = signature.indexOf("\n", pos) + 1;
        }
        signature = signature.substring(start);

        //	Remove comments (/*  */) if any
        start = 0;
        while ((pos = signature.indexOf("/*", start)) >= 0)
            start = signature.indexOf("*/", pos) + 2;
        signature = signature.substring(start);
        return signature.trim();
    }

    //===============================================================
    //===============================================================
    private String getCode(int methnum) {
        String method = methods.get(methnum);
        int start = method.indexOf("{") + 1;
        int end = method.lastIndexOf("}");
        return method.substring(start, end).trim();
    }
    //===============================================================
    /**
     * @return a vector of method signatures
     */
    //===============================================================
    public List<String> getMethodSignatures() {
        return signatures;
    }
    //===============================================================
    /**
     * Returns method code for specified signature
     *
     * @param in_signature the specified signature
     * @return method code for specified signature.
     */
    //===============================================================
    public String getMethodCode(String in_signature) {
        for (int i = 0; i < signatures.size(); i++) {
            String signature = signatures.get(i);
            if (signature.equals(in_signature.trim()))
                return getCode(i);
        }
        return null;
    }
    //================================	===============================
    /**
     * Returns method for specified signature
     *
     * @param in_signature the specified signature
     * @return method for specified signature.
     */
    //===============================================================
    public String getMethod(String in_signature) {
        for (int i = 0; i < signatures.size(); i++) {
            String signature = signatures.get(i);
            if (signature.equals(in_signature.trim())) {
                System.out.println("inserting code for " + in_signature);
                return methods.get(i);
            }
        }
        return null;
    }
    //===============================================================
    //===============================================================

    //===============================================================
    //===============================================================
    private String getExpectedSig(int i) {
        int pos = cpp_expected_sig[i].indexOf("::");
        return cpp_expected_sig[i].substring(0, pos) +
                pogo_class.class_name + cpp_expected_sig[i].substring(pos);
    }

    //===============================================================
    //===============================================================
    private boolean isCommandMethod(String signature) {
        for (int i = 0; i < pogo_class.commands.size(); i++) {
            pogo.gene.Cmd cmd = pogo_class.commands.cmdAt(i);
            String meth_sig =
                    cmd.buildCppExecCmdMethodSignature(pogo_class.class_name);
            if (meth_sig.equals(signature))
                return true;
            else {
                //	remove argin name
                int pos = meth_sig.indexOf("argin");
                if (pos > 0) {
                    meth_sig = meth_sig.substring(0, pos);
                    if (signature.startsWith(meth_sig))
                        return true;
                }
            }
        }
        return false;
    }

    //===============================================================
    //===============================================================
    private boolean isAttributeMethod(String signature) {
        boolean expected = false;
        String meth_sig;
        for (int i = 0; i < pogo_class.attributes.size(); i++) {
            pogo.gene.Attrib att = pogo_class.attributes.attributeAt(i);
            meth_sig = "void " + pogo_class.class_name + "::" +
                    "read_" + att.name + "(Tango::Attribute &attr)";
            if (meth_sig.equals(signature))
                expected = true;
            else {
                meth_sig = "void " + pogo_class.class_name + "::" +
                        "write_" + att.name + "(Tango::WAttribute &attr)";
                if (meth_sig.equals(signature))
                    expected = true;
            }
        }
        return expected;
    }

    //===============================================================
    //===============================================================
    private boolean isExpected(String signature) {
        boolean expected = false;
        for (int i = 0; i < cpp_expected_sig.length; i++) {
            String exp_sig = getExpectedSig(i);
            if (exp_sig.equals(signature))
                expected = true;
        }
        if (!expected) {
            if (isCommandMethod(signature))
                expected = true;
            else if (isAttributeMethod(signature))
                expected = true;
        }
        return expected;
    }

    //===============================================================
    //===============================================================
    private boolean isConstructor(String meth_sig) {
        String header = pogo_class.class_name + "::" + pogo_class.class_name;
        for (String str : cpp_constructors)
            if (meth_sig.startsWith(header + str))
                return true;
        return false;
    }

    //===============================================================
    //===============================================================
    public String getUnexpectedMethods() {
        StringBuffer sb = new StringBuffer();
        for (String sig : signatures) {
            //	Check if it is a constructor
            if (!isConstructor(sig)) {
                //	Check if it is an expected method
                if (!isExpected(sig))
                    sb.append(getMethod(sig)).append("\n");
            }
        }
        return sb.toString();
    }
    //===============================================================
    //===============================================================


    //===============================================================
    //===============================================================
    public String getIncludeFiles() {
        int start;
        int end = 0;
        StringBuffer sb = new StringBuffer();
        while ((start = fileCode.indexOf("#include", end)) > 0) {
            end = fileCode.indexOf('\n', start) + 1;

            //  check for precompiler line before
            int start0 = fileCode.lastIndexOf('\n', start - 1);
            start0 = fileCode.lastIndexOf('\n', start0 - 1) + 1;
            if (fileCode.substring(start0).startsWith("#ifdef"))
                start = start0;
            //  check for precompiler line after
            if (fileCode.substring(end).startsWith("#endif"))
                end = fileCode.indexOf('\n', end) + 1;

            sb.append(fileCode.substring(start, end));
        }
        return sb.toString();
    }

    //===============================================================
    //===============================================================
    public String getDefinitions() {
        int start = fileCode.indexOf("Add your own constant");
        if (start < 0)
            return null;
        start = fileCode.indexOf('\n', start) + 1;
        start = fileCode.indexOf('\n', start) + 1;
        int end = fileCode.indexOf("namespace", start);
        return fileCode.substring(start, end);
    }

    //===============================================================
    //===============================================================
    public String getDataMembers() {
        int start = fileCode.indexOf("Add your own data members here");
        if (start < 0)
            return null;
        start = fileCode.indexOf('\n', start) + 1;
        start = fileCode.indexOf('\n', start) + 1;
        int end = fileCode.indexOf("Here is the Start of the automatic code generation part", start);
        end = fileCode.lastIndexOf('\n', end);

        return fileCode.substring(start, end);
    }

    //===============================================================
    //===============================================================
    public String getAdditionalMethodPrototypes() {
        int start = fileCode.indexOf("Here is the end of the automatic code generation part");
        if (start < 0)
            return null;
        start = fileCode.indexOf('\n', start) + 1;
        start = fileCode.indexOf('\n', start) + 1;
        int end = fileCode.indexOf("};", start);
        String code = fileCode.substring(start, end);

        start = code.indexOf("Add your own data members here");
        if (start > 0) {
            start = code.lastIndexOf('\n', start) + 1;
            StringBuffer sb = new StringBuffer(code.substring(0, start));
            start = code.indexOf('\n', start) + 1;
            start = code.indexOf('\n', start) + 1;
            sb.append(code.substring(start));
            code = sb.toString();
        }
        //System.out.println(code);
        return code.trim();
    }

    //===============================================================
    //===============================================================
    public String getAdditionalClassDeclarations() {
        int start = fileCode.indexOf("namespace " + pogo_class.class_name + "_ns");
        if (start < 0)
            return null;
        start = fileCode.indexOf("{", start) + 2;
        int end = fileCode.indexOf("class " + pogo_class.class_name + ":");
        String code = fileCode.substring(start, end);

        //  remove class description if any
        start = code.indexOf("Class Description");
        if (start > 0) {
            start = code.lastIndexOf("/*", start);
            end = code.indexOf("*/", start);
            end = code.indexOf("\n", end) + 1;
            code = code.substring(0, start) + code.substring(end);
        }

        //  State description if any
        start = code.indexOf("States Description");
        if (start > 0) {
            start = code.lastIndexOf("/*", start);
            end = code.indexOf("*/", start);
            end = code.indexOf("\n", end) + 1;
            code = code.substring(0, start) + code.substring(end);
        }
        //System.out.println(sb.toString().trim());
        return code.trim();
    }

    //===============================================================
    //===============================================================
    public String getAdditionalClasses() {
        //  Get end of code generation
        int start = fileCode.indexOf("Here is the end of the automatic code generation part");
        if (start < 0)
            return null;

        //  get end of tango class declaration
        int end;
        boolean found = false;
        while (!found && (end = fileCode.indexOf("\n", start)) > 0) {
            String line = fileCode.substring(start, end);
            if (line.trim().equals("};")) {    //  found
                start += line.length() + 1;
                found = true;
            } else
                start = end + 1;
        }
        if (!found)
            return null;

        //  Then, get end of file
        end = fileCode.indexOf("namespace", start);
        end = fileCode.lastIndexOf("\n", end) + 1;
        String code = fileCode.substring(start, end);
        //System.out.println(code);
        return code.trim();
    }
    //===============================================================
    /**
     * In old model, the write value for attribute was put in a gloabl.
     * In new model it is put in a local variable.
     * This method replace old name by new one and remove
     * get_write_value() method generated by Pogo generator.
     *
     * @param code    the code read from old files.
     * @param attName attribute name
     * @return return the code after treatrement.
     */
    //===============================================================
    public String manageWriteValue(String code, String attName) {
        //  ToDo it only if environment variable is set as false
        String s = System.getenv("MANAGE_WRITE_METHOD");
        if (s==null || !s.equals("true")) {
            return "\t// the variable w_val will not be used !\n" + code;
        }
        if (code != null) {
            //  Remove get_write_value() method
            String oldVar = "attr_" + attName + "_write";
            String newVar = "w_val";
            int start = code.indexOf("attr.get_write_value(" + oldVar);
            if (start >= 0) {
                int end = code.indexOf('\n', start);
                start = code.lastIndexOf('\n', start);
                if (start < 0) start = 0;
                code = code.substring(0, start) + code.substring(end + 1);
            }

            //  Replace
            while ((start = code.indexOf(oldVar)) > 0) {
                int end = start + oldVar.length();
                code = code.substring(0, start) + newVar +
                        code.substring(end);
            }
        }
        return code;
    }

    //===============================================================
    //===============================================================
    public String getCppMethodCode(String signature) {
        String code = null;
        int start, end;
        //	Get the parsed method.
        for (int i = 0; i < signatures.size(); i++) {
            start = signature.indexOf("argin");
            if (start > 0)
                signature = signature.substring(0, start);//	remove argin if cmd.
            if (signatures.get(i).startsWith(signature)) {
                //	Get start and end of method core
                code = methods.get(i);
                start = code.indexOf(signature);
                start = code.indexOf("{", start) + 1;
                end = code.lastIndexOf("}");
                code = code.substring(start, end).trim();

                //	Remove trace if any (Already in new fileCode.)
                if (code.startsWith("DEBUG_STREAM") ||
                        code.startsWith("INFO_STREAM")) {
                    start = code.indexOf('\n');
                    if (start < 0) return null;
                    code = code.substring(start).trim();
                }
                code = "\t" + code;    //	add tab for cpp
            }
        }
        return code;
    }

    //===============================================================
    //===============================================================
    public String getCppStaticInit(String classname) {
        String namespace = "namespace " + classname + "_ns";
        int start = fileCode.indexOf(namespace);
        if (start < 0)
            return null;
        start = fileCode.indexOf('{', start) + 1;

        int end = fileCode.indexOf(classname + "::" + classname + "(", start);
        if (end < 0)
            return null;
        end = fileCode.lastIndexOf("//", end);
        end = fileCode.lastIndexOf("//", end - 1);
        end = fileCode.lastIndexOf("//", end - 1);
        return fileCode.substring(start, end).trim();
    }
    //===============================================================

    /**
     * Retreive the real input argument definition
     * (argin could have another name)
     *
     * @param signature specified method signature.
     * @return the real input argument definition
     */
    //===============================================================
    public String getCppMethodArginDef(String signature) {
        String code = null;
        int start, end;
        //	Get the parsed method.
        for (int i = 0; i < signatures.size(); i++) {
            start = signature.indexOf("argin");
            if (start > 0)
                signature = signature.substring(0, start);//	remove argin if cmd.
            if (signatures.get(i).startsWith(signature)) {
                //	Get start and end of argin definition
                //	(argin could have another name)
                code = methods.get(i);
                start = code.indexOf(signature);
                start = code.indexOf('(', start);
                end = code.indexOf(')', start);
                code = code.substring(start + 1, end).trim();
            }
        }
        return code;
    }
    //===============================================================
    //===============================================================


    //===============================================================
    //===============================================================
    public String getHtmlDescripion() {
        int start = fileCode.indexOf("Device Description");
        int end;
        if (start < 0)
            end = fileCode.toLowerCase().indexOf("</center>\n");
        else
            end = fileCode.toLowerCase().indexOf("</center>\n", start);

        if (end < 0)
            return "";
        else
            start = end + "</center>\n".length();

        //  Get end of description
        end = fileCode.toLowerCase().indexOf("</body>\n");
        String code;
        if (end < 0)
            code = fileCode.substring(start);
        else
            code = fileCode.substring(start, end);

        //  check if description itself already exists
        start = code.indexOf(pogo_class.class_desc);
        if (start > 0)
            code = code.substring(start, pogo_class.class_desc.length());
        return code;
    }
    //===============================================================
    //===============================================================


    //===============================================================
    //===============================================================
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (String s : signatures)
            sb.append(s).append("\n");
        return sb.toString();
    }

    //===============================================================
    //===============================================================
    public static void displaySyntax() {
        System.out.println("OldModelParser <filename>");
        System.exit(0);
    }

    //===============================================================
    //===============================================================
    public static void main(String[] args) {
        if (args.length < 1)
            displaySyntax();
        try {
            OldModelParser parser = new OldModelParser(args[0]);
            String code = parser.getUnexpectedMethods();
            System.out.println(code);
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
}
