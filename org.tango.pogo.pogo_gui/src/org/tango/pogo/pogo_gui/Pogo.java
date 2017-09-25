//+======================================================================
//
// Project:   Tango
//
// Description:  java source code for main pogo class.
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

package org.tango.pogo.pogo_gui;

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import org.tango.pogo.pogo_gui.tools.OAWutils;
import org.tango.pogo.pogo_gui.tools.PogoException;
import org.tango.pogo.pogo_gui.tools.PogoProperty;
import org.tango.pogo.pogo_gui.tools.Utils;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.tango.pogo.pogo_gui.PogoConst.Python;
import static org.tango.pogo.pogo_gui.PogoConst.strLang;

/*
 *	This class is able to manage shell command line before Pogo startup.
 *
 * @author verdier
 */

@SuppressWarnings({"UnusedDeclaration"})    //  Public methods
public class Pogo {
    private static final int GENE_SRC = 0;
    private static final int GENE_HTML = 1;
    private static final int GENE_SPHINX = 2;
    private static final int MULTI = 3;
    private static final int HELP = 4;
    private static final String[] known_actions = {"-src", "-html", "-sphinx", "-multi", "-?"};

    private DeviceClass deviceClass = null;
    private PogoException pogoException = null;
    private List<String> sourceFiles = new ArrayList<>();

    //===============================================================
    //===============================================================
    public Pogo() throws PogoException {
        PogoProperty.init();    //	Load them
    }

    //===============================================================
    //===============================================================
    public Pogo(String filename) throws PogoException {
        this();
        sourceFiles.add(filename);
    }
    //===============================================================
    /**
     * Return the DeviceClass object loaded (mainly used by class2www classes)
     *
     * @return the DeviceClass loaded object if any.
     */
    //===============================================================
    public DeviceClass getDeviceClass() {
        return deviceClass;
    }
    //===============================================================
    /**
     * Check if generate doe/doc has failed
     *
     * @return return true if generate doe/doc has failed
     */
    //===============================================================
    public boolean hasFailed() {
        return (pogoException != null);
    }
    //===============================================================
    /**
     * @return PogoException Object if generate doe/doc has failed
     */
    //===============================================================
    public PogoException getPogoException() {
        return pogoException;
    }
    //===============================================================
    //===============================================================
    private String getPythonGeneratedFile(PogoDeviceClass pogoClass) {
        String filesToGenerate ="";
        String generatedFile = deviceClass.getPogoDeviceClass().getDescription().getFilestogenerate();
        if (generatedFile.contains("Python Package"))
            filesToGenerate += ", Python Package";
        if (generatedFile.contains("Protected Regions"))
            filesToGenerate += ", Protected Regions";
        if (filesToGenerate.isEmpty())
            return "";
        else
            return filesToGenerate;
    }
    //===============================================================
    /**
     * Generate source files for specified inputs.
     */
    //===============================================================
    public void generateSourceFiles() {
        try {
            for (String filename : sourceFiles) {
                //	Read source files
                File file = new File(filename);
                filename = file.getAbsolutePath();
                deviceClass = new DeviceClass(filename);
                PogoDeviceClass pogoClass = deviceClass.getPogoDeviceClass();


                //	Check is from old Pogo model (not generated with OAW)
                if (deviceClass.isOldPogoModel()) {
                    deviceClass.generateFromOldModel(filename, true);
                } else {
                    //	Set the file list to be generated and generate
                    //"XMI   file,Code files,Python Package,Protected Regions"
                    String filesToGenerate = "XMI   file,Code files";
                    //  If python HL, add python HL specific options
                    String language = pogoClass.getDescription().getLanguage();
                    if (language.startsWith(strLang[Python])) {
                        filesToGenerate += getPythonGeneratedFile(pogoClass);
                    }
                    deviceClass.getPogoDeviceClass().getDescription().setFilestogenerate(filesToGenerate);
                    OAWutils.getInstance().generate(pogoClass);
                }
            }
        } catch (PogoException e) {
           System.err.println(e.getMessage());
            pogoException = e;
        } catch (Exception e) {
            e.printStackTrace();
            pogoException = new PogoException(e.toString());
        }
    }
    //===============================================================
    /**
     * Generate HTML files for specified inputs.
     */
    //===============================================================
    public void generateHtmlDocumentation() {
        try {
            for (String filename : sourceFiles) {
                File file = new File(filename);
                filename = file.getAbsolutePath();

                System.out.println("===============================================================");
                System.out.println("\tBuild HTML from " + filename);
                System.out.println("===============================================================");

                //	Read source files
                deviceClass = new DeviceClass(filename);
                PogoDeviceClass pogoClass = deviceClass.getPogoDeviceClass();

                String filesToGenerate = "XMI   file, html";
                //  If python HL, add python HL specific options
                String language = deviceClass.getPogoDeviceClass().getDescription().getLanguage();
                if (language.startsWith(strLang[Python])) {
                    filesToGenerate += getPythonGeneratedFile(pogoClass);
                }

                    //	Set the file list to be generated and generate
                deviceClass.getPogoDeviceClass().getDescription().setFilestogenerate(filesToGenerate);
                OAWutils.getInstance().generate(pogoClass);

                //	Check if it is from old Pogo model (not generated with OAW)
                if (deviceClass.isOldPogoModel()) {
                    //  Try to get old description and add it.
                    deviceClass.generateDocFromOldModel(filename, null);   //  same place
                }
            }
        } catch (PogoException e) {
            System.err.println(e.getMessage());
            pogoException = e;
        } catch (Exception e) {
            e.printStackTrace();
            pogoException = new PogoException(e.toString());
        }
    }
    //===============================================================
    /**
     * Generate Sphinx files for specified inputs.
     */
    //===============================================================
    public void generateSphinxDocumentation() {
        try {
            for (String filename : sourceFiles) {
                //	Read source files
                File file = new File(filename);
                filename = file.getAbsolutePath();
                deviceClass = new DeviceClass(filename);
                PogoDeviceClass pogoClass = deviceClass.getPogoDeviceClass();

                //  If python HL, generate sphinx files
                String language = deviceClass.getPogoDeviceClass().getDescription().getLanguage();
                if (language.startsWith(strLang[Python])) {

                    System.out.println("===============================================================");
                    System.out.println("\tBuild Sphinx from " + filename);
                    System.out.println("===============================================================");

                    //  If python HL, add python HL specific options
                    String filesToGenerate = "XMI   file,Sphinx";
                    filesToGenerate += getPythonGeneratedFile(pogoClass);
                    deviceClass.getPogoDeviceClass().getDescription().setFilestogenerate(filesToGenerate);
                    OAWutils.getInstance().generate(pogoClass);
                }
                else
                    throw new PogoException("Sphinx documentation requires a Python or PythonHL source code");
            }
        } catch (PogoException e) {
            System.err.println(e.getMessage());
            pogoException = e;
        } catch (Exception e) {
            e.printStackTrace();
            pogoException = new PogoException(e.toString());
        }
    }

    //===============================================================
    //===============================================================
    private void startPogoGUI() {
        try {
            if (sourceFiles.size() == 0)
                new PogoGUI(null);
            else
                new PogoGUI(sourceFiles.get(0));
        } catch (Exception e) {
            Utils.getInstance().stopSplashRefresher();
            PogoException.popup(new JFrame(), e);
            System.exit(-1);
        } catch (Error e) {
            Utils.getInstance().stopSplashRefresher();
            JOptionPane.showMessageDialog(new JFrame(),
                    e.toString(), "Error Window",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
    }

    //===============================================================
    //===============================================================
    private void startPogoMulti() {
        try {
            String s = System.getenv("TEST_MODE");
            boolean test = s!=null && s.equals("true");
            if (!Utils.osIsUnix() && !test)
                throw new PogoException("Multi classes project is available only on Linux");
            if (sourceFiles.size() == 0)
                new MultiClassesPanel(new JFrame(), null).setVisible(true);
            else
                new MultiClassesPanel(new JFrame(), sourceFiles.get(0)).setVisible(true);
        } catch (Exception e) {
            Utils.getInstance().stopSplashRefresher();
            PogoException.popup(new JFrame(), e);
            System.exit(-1);
        } catch (Error e) {
            Utils.getInstance().stopSplashRefresher();
            JOptionPane.showMessageDialog(new JFrame(),
                    e.toString(), "Error Window",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
    }


    //===============================================================
    //===============================================================
    private int manageArgs(String[] args) {
        int action = -1;
        //	Check all arguments
        for (String arg : args) {
            boolean found = false;
            for (int j = 0; !found && j < known_actions.length; j++) {
                if ((found = arg.equals(known_actions[j]))) {
                    action = j;
                }
            }

            if (!found)
                sourceFiles.add(arg);
        }
        return action;
    }

    //===============================================================
    //===============================================================
    private static void displaySyntax() {
        System.out.println("Syntax:");
        System.out.println("pogo <action> <filename1> <filename2>....");
        System.out.println();
        System.out.println("Without option, pogo start the Graphic User Interface");
        System.out.println();
        System.out.println("Actions:");
        System.out.println("	-src:	 will re-generate the device server source files.");
        System.out.println("	-multi:	 will start Pogo for multi class server.");
        System.out.println("	-html:	 will generate the device server html documentation.");
        System.out.println("	-sphinx: will generate the device server Sphinx documentation.");
        System.out.println();
    }

    //===============================================================
    //===============================================================
    public static void main(String args[]) {
        try {

            Pogo pogo = new Pogo();

            //	Check command line
            switch (pogo.manageArgs(args)) {
                case GENE_SRC:
                    pogo.generateSourceFiles();
                    System.exit(0);
                    break;
                case GENE_HTML:
                    pogo.generateHtmlDocumentation();
                    System.exit(0);
                    break;
                case GENE_SPHINX:
                    pogo.generateSphinxDocumentation();
                    System.exit(0);
                    break;
                case MULTI:
                    pogo.startPogoMulti();
                    break;
                case HELP:
                    Pogo.displaySyntax();
                    System.exit(0);
                    break;

                default:
                    pogo.startPogoGUI();
            }
        } catch (PogoException e) {
            System.err.println(e.getMessage());
            System.exit(-1);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
    //===============================================================
    //===============================================================
}
