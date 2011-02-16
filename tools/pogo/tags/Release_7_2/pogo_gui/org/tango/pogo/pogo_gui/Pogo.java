//+======================================================================
//
// Project:   Tango
//
// Description:  java source code for main pogo class.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011
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


/** 
 *	This class is able to manage shell command line before Pogo statup.
 *
 * @author  verdier
 */

import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tangoatk.widget.util.ErrorPane;
import org.tango.pogo.pogo_gui.tools.OAWutils;
import org.tango.pogo.pogo_gui.tools.PogoProperty;
import org.tango.pogo.pogo_gui.tools.Utils;

import javax.swing.*;
import java.util.Vector;


@SuppressWarnings({"UnusedDeclaration"})    //  Public methods
public class  Pogo
{
	private static final int		GENE_SRC = 0;
	private static final int		GENE_DOC = 1;
	private static final int		MULTI    = 2;
	private static final int		HELP     = 3;
	private static final String[]	known_actions = { "-src", "-doc", "-multi", "-?" };

    private DeviceClass     deviceClass = null;
    private DevFailed       devFailed   = null;
    private Vector<String>	sourcefiles = new Vector<String>();
    //===============================================================
    //===============================================================
    public Pogo() throws DevFailed
    {
        PogoProperty.init().displayProperties();	//	Load them
    }
    //===============================================================
    //===============================================================
    public Pogo(String filename) throws DevFailed
    {
        this();
        sourcefiles.add(filename);
    }
    //===============================================================
    /**
     * Return the DeviceClass object loaded (mainly used by class2www classes)
     * @return  the DeviceClass loaded object if any.
     */
    //===============================================================
    public DeviceClass getDeviceClass()
    {
        return deviceClass;
    }

    //===============================================================
    /**
     * Check if generate doe/doc has failed
     * @return return true if generate doe/doc has failed
     */
    //===============================================================
    public boolean hasFailed() {
        return (devFailed!=null);
    }
    //===============================================================
    /**
     *
     * @return DevFailed Object if generate doe/doc has failed
     */
    //===============================================================
    public DevFailed getDevFailed() {
        return devFailed;
    }
	//===============================================================
    /**
     * Generate source files for specified inputs.
     */
	//===============================================================
	public void generateSourceFiles()
	{
		try {
			for (String filename : sourcefiles) {
				//	Read source files
				deviceClass = new DeviceClass(filename);
				PogoDeviceClass	pogoclass = deviceClass.getPogoDeviceClass();

				//	Check is from old Pogo model (not generated with OAW)
				if (deviceClass.isOldPogoModel()) {
					deviceClass.generateFromOldModel(filename, true);
				}
				else {
					//	Set the file list to be generated and generate
					deviceClass.getPogoDeviceClass().getDescription().setFilestogenerate("Code files");
					OAWutils.getInstance().generate(pogoclass);
				}
			}
		}
		catch(DevFailed e) {
			Except.print_exception(e);
            devFailed = e;
		}
		catch(Exception e) {
			e.printStackTrace();
            devFailed = buildDevFailed(e.toString());
		}
	}
	//===============================================================
    /**
     * Generate doc files for specified inputs.
     */
	//===============================================================
	public void generateDocumentation()
	{
		try {
			for (String filename : sourcefiles) {
                System.out.println("===============================================================");
                System.out.println("\tBuild doc from "+filename);
                System.out.println("===============================================================");

				//	Read source files
				deviceClass  = new DeviceClass(filename);
				PogoDeviceClass	pogoclass = deviceClass.getPogoDeviceClass();

                //	Set the file list to be generated and generate
                deviceClass.getPogoDeviceClass().getDescription().setFilestogenerate("html");
                OAWutils.getInstance().generate(pogoclass);

                //	Check if it is from old Pogo model (not generated with OAW)
                if (deviceClass.isOldPogoModel())  {
                    //  Try to get old description and add it.
                    deviceClass.generateDocFromOldModel(filename, null);   //  same place
                }
			}
		}
		catch(DevFailed e) {
			Except.print_exception(e);
            devFailed = e;
		}
		catch(Exception e) {
			e.printStackTrace();
            devFailed = buildDevFailed(e.toString());
		}
	}
	//===============================================================
	//===============================================================
	private void startPogoGUI()
	{
		try {
			if (sourcefiles.size()==0)
				new PogoGUI(null);
			else
				new PogoGUI(sourcefiles.get(0));
		}
		catch (Exception e) {
			Utils.getInstance().stopSplashRefresher();
			ErrorPane.showErrorMessage(new JFrame(), null, e);
			System.exit(-1);
		}
		catch (Error e) {
			Utils.getInstance().stopSplashRefresher();
			JOptionPane.showMessageDialog(new JFrame(),
						e.toString(), "Error Window",
						JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
	}
	//===============================================================
	//===============================================================
	private void startPogoMulti()
	{
		try {
            if (!Utils.osIsUnix())
                Except.throw_exception("BAD_OS",
                        "Running only on Linux",
                        "Pogo.startPogoMulti()");
			if (sourcefiles.size()==0)
				new MultiClassesPanel(new JFrame(), null).setVisible(true);
			else
				new MultiClassesPanel(new JFrame(), sourcefiles.get(0)).setVisible(true);
		}
		catch (Exception e) {
			Utils.getInstance().stopSplashRefresher();
			ErrorPane.showErrorMessage(new JFrame(), null, e);
			System.exit(-1);
		}
		catch (Error e) {
			Utils.getInstance().stopSplashRefresher();
			JOptionPane.showMessageDialog(new JFrame(),
						e.toString(), "Error Window",
						JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
	}
    //===============================================================
    //===============================================================
    private DevFailed buildDevFailed(String desc) {
        try {
            Except.throw_exception("POGO_FAILED",
                    desc, "Pogo class");
        }
        catch (DevFailed e) {
            return e;
        }
        return null;    //  Cannot occur.
    }
	//===============================================================
	//===============================================================
	private int manageArgs(String[] args)
	{
		int action = -1;
		//	Check all arguments
        for (String arg : args) {
            boolean found = false;
            for (int j=0 ; !found && j<known_actions.length ; j++) {
                if ((found = arg.equals(known_actions[j]))) {
                    action = j;
                }
            }

            if (!found)
                sourcefiles.add(arg);
        }
		return action;
	}
	//===============================================================
	//===============================================================
	private static void displaySyntax()
	{
		System.out.println("Syntax:");
		System.out.println("pogo <action> <filename1> <filename2>....");
		System.out.println();
		System.out.println("Without option, pogo start the Graphic User Interface");
		System.out.println();
		System.out.println("Actions:");
		System.out.println("	-src:	will re-generate the device server source files.");
		System.out.println("	-multi:	will start Pogo for multi class server.");
		System.out.println("	-doc:	will generate the device server documentation.");
		System.out.println();
	}
    //===============================================================
    //===============================================================
    public static void main(String args[])
    {
        try {

            Pogo    pogo = new Pogo();

            //	Check command line
            switch (pogo.manageArgs(args))
            {
            case GENE_SRC:
                pogo.generateSourceFiles();
                System.exit(0);
                break;
            case GENE_DOC:
                pogo.generateDocumentation();
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
        }
        catch(DevFailed e) {
            Except.print_exception(e);
            System.exit(-1);
        }
        catch(Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
    //===============================================================
    //===============================================================
}
