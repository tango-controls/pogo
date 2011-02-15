//+======================================================================
//
// Project:   Tango
//
// Description:  java source code for a panel containing JTree.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009, 2010
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

import javax.swing.*;

//=======================================================
/**
 *	JPanel Class to manage pogo model JTree.
 *  It will be displayed in the main pogo frame.
 *
 * @author  Pascal Verdier
 */
//=======================================================
public class ClassPanel extends JPanel
{
	private PogoGUI		parent;
	private ClassTree	tree;
	private JScrollPane	scrollPane;
    private String      name;
	//=======================================================
	//=======================================================
	public ClassPanel(PogoGUI parent)
	{
		this.parent = parent;
		setLayout(new java.awt.BorderLayout());
        scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new java.awt.Dimension(350, 600));
        add(scrollPane, java.awt.BorderLayout.CENTER);
	}
	//=======================================================
    /**
     * Bulid the inheritances class tree.
     * @param devclass  class to display hineritances
     * @param isInheritedClass true if this class is an inherited one
     */
	//=======================================================
	public void setTree(DeviceClass devclass, boolean isInheritedClass)
	{
        name = devclass.getPogoDeviceClass().getName();
         //	Build users_tree to display info
		tree = new ClassTree(parent, devclass, isInheritedClass);
		scrollPane.setViewportView(tree);
	}
	//=======================================================
	//=======================================================
	public ClassTree getTree()
	{
		return tree;
	}
    //=======================================================
    //=======================================================
    public String getName()
    {
        return name;
    }
    //=======================================================
    //=======================================================
    public String toString()
    {
        String  ret = name;
        if (tree!=null && tree.getModified())
            ret += " *";
        return ret;
    }
}
