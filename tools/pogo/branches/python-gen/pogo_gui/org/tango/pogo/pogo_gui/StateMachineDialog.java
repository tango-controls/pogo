//+======================================================================
//
// Project:   Tango
//
// Description:  java source code for state machchine swing class.
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

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import org.eclipse.emf.common.util.EList;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.State;

import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;

//===============================================================
/**
 *	Class Description: Basic Dialog Class to display info
 *
 *	@author  root
 */
//===============================================================


@SuppressWarnings({"serial"})
public class StateMachineDialog extends JDialog implements PogoConst
{
    private PogoDeviceClass	pogo_class;
	private int		retVal = JOptionPane.OK_OPTION;
	private Buttons	buttons = new Buttons();
    private static final int    COMMAND         = 0;
    private static final int    READ_ATTRIBUTE  = 1;
    private static final int    WRITE_ATTRIBUTE = 2;

	//===============================================================
	//===============================================================
    private class Buttons extends Vector<BtnLine>
    {
        private BtnLine getLine(String name, int type)
        {
            for (BtnLine line : this)
                if (line.name.equals(name) && line.type==type)
                    return line;
            return null;
        }
    }
	//===============================================================
	//===============================================================
    private class BtnLine extends Vector<AllowedBtn>
    {
        String  name;
        int     type;
        private BtnLine(String name, int type)
        {
            this.name = name;
            this.type = type;
        }
    }
	//===============================================================
	//===============================================================
    private class AllowedBtn extends JRadioButton
    {
        String  name;
        private AllowedBtn(String txt, String name)
        {
            setText(txt);
            this.name = name;
        }
    }
    //===============================================================
    //===============================================================



	//===============================================================
	/**
	 *	Creates new form StateMachineDialog
     * @param parent     parent form
     * @param pogo_class Pogo class to edit state machine
     */
	//===============================================================
	public StateMachineDialog(JFrame parent, PogoDeviceClass pogo_class)
    {
		super(parent, true);
		this.pogo_class = pogo_class;
		initComponents();
		createOwnComponents();
        titleLabel.setText(pogo_class.getName() + " State Machine");
		pack();
 		ATKGraphicsUtils.centerDialog(this);
	}
	//===============================================================
	//===============================================================
	private void addColumnHeader(int y, String str1, String str2, EList<State> states)
	{
		Font	font = new Font("Dialog", 1, 16);
        int     x = 0;
		GridBagConstraints	gbc = new GridBagConstraints ();
		gbc.anchor = GridBagConstraints.WEST;

		JLabel
        lbl = new JLabel(str1);
		lbl.setFont(font);
		gbc.insets = new Insets(15, 20, 0, 20);
		gbc.gridx = x;
		gbc.gridy = y++;
		mainPanel.add(lbl, gbc);

        lbl = new JLabel(str2);
		lbl.setFont(font);
		gbc.insets = new Insets(0, 20, 0, 20);
		gbc.gridx = x++;
		gbc.gridy = y;
		mainPanel.add(lbl, gbc);

        if (states!=null)
            for (State state : states)
            {
                lbl = new JLabel(state.getName());
                lbl.setFont(font);
                gbc.insets = new Insets(0, 20, 0, 20);
                gbc.gridx = x++;
                gbc.gridy = y;
                mainPanel.add(lbl, gbc);
            }
	}
	//===============================================================
	//===============================================================
	private void addLineHeader(int y, String str)
	{
		GridBagConstraints	gbc = new GridBagConstraints ();
		gbc.anchor = GridBagConstraints.WEST;

		JLabel	lbl = new JLabel(str);
		lbl.setFont(new Font("Dialog", 0, 12));
		gbc.insets = new Insets(0, 20, 0, 0);
		gbc.gridx = 0;
		gbc.gridy = y;
		mainPanel.add(lbl, gbc);
	}	
	//===============================================================
	//===============================================================
	private AllowedBtn addAllowedButton(int x, int y,
						State state, 
						EList<String> excludedStates)
	{
		GridBagConstraints	gbc = new GridBagConstraints ();
		AllowedBtn	btn = new AllowedBtn("", state.getName());
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.insets = new Insets(0, 5, 0, 5);
		btn.setSelected(true);
		btn.setFont(new Font("Dialog", 0, 10));
		mainPanel.add(btn, gbc);

		//	Check if is excluded for state
		for (String excluded : excludedStates)
			if (state.getName().equals(excluded))
				btn.setSelected(false);
		return btn;		
	}
	//===============================================================
	/**
	 *	Creates own components
	 */
	//===============================================================
	private void createOwnComponents()
	{
        EList<State>	states = pogo_class.getStates();
        int	y = 0;

  		//-------------------------
		//	Commands
		//-------------------------
        addColumnHeader(y, "Select Allowed", "Commands", states);
        y += 2;
		EList<Command>	commands = pogo_class.getCommands();
		for (Command command : commands)
		{
			if (! command.getName().equals("State") &&
				! command.getName().equals("Status") )
			{
                addCommandLine(y++, command, states);
			}
		}

		//-------------------------
		//	Attributes
		//-------------------------
        addColumnHeader(y, "Select Allowed", "Attributes", states);
        y += 2;
		EList<Attribute>	attributes = pogo_class.getAttributes();
		for (Attribute attribute : attributes)
		{
            addAttributeLine(y++, attribute, READ_ATTRIBUTE, states);
            if (!attribute.getRwType().equals(AttrRWtypeArray[READ]))
                addAttributeLine(y++, attribute, WRITE_ATTRIBUTE, states);
		}

        //  Dummy to have insets at bottom
        GridBagConstraints	gbc = new GridBagConstraints ();
        gbc.insets = new Insets(20, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = y;
        mainPanel.add(new JLabel("  "), gbc);
	}

	//===============================================================
	//===============================================================
    private void addCommandLine(int y, Command cmd, EList<State> states)
    {
        //	Create label with command name
        addLineHeader(y, "  " + cmd.getName());

        BtnLine	line = new BtnLine(cmd.getName(), COMMAND);
        EList<String>	excludedStates = cmd.getExcludedStates();
        //	Create radio button and store instance in vector
        int x = 1;
        for (State state : states)
            line.add(addAllowedButton(x++, y, state, excludedStates));

        //	store radio button instances in a vector
        buttons.add(line);
    }
	//===============================================================
	//===============================================================
    private void addAttributeLine(int y, Attribute att, int attType, EList<State> states)
    {
        String  rwStr;
        EList<String>	excludedStates;
        if (attType==READ_ATTRIBUTE)
        {
            rwStr = " (Read)";
            excludedStates = att.getReadExcludedStates();
        }
        else
        {
            rwStr = " (Write)";
            excludedStates = att.getWriteExcludedStates();
        }
         //	Create label with attribute name
        addLineHeader(y, "  " + att.getName() + rwStr);
        BtnLine line = new BtnLine(att.getName(), attType);

        //	Create radio button and store instance in vector
        int x = 1;
        for (State state : states)
            line.add(addAllowedButton(x++, y, state, excludedStates));

        //	store radio button instances in a vector
        buttons.add(line);
    }
	//===============================================================
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
	//===============================================================
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JButton okBtn = new javax.swing.JButton();
        javax.swing.JButton cancelBtn = new javax.swing.JButton();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        jPanel1.add(okBtn);

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 18));
        titleLabel.setText("State Machine");
        jPanel2.add(titleLabel);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        mainPanel.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(mainPanel);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

	//===============================================================
	//===============================================================
	@SuppressWarnings({"UnusedDeclaration"})
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

		retVal = JOptionPane.OK_OPTION;
		doClose();
    }//GEN-LAST:event_okBtnActionPerformed

	//===============================================================
	//===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
		retVal = JOptionPane.CANCEL_OPTION;
		doClose();
	}//GEN-LAST:event_cancelBtnActionPerformed

	//===============================================================
	//===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
		retVal = JOptionPane.CANCEL_OPTION;
		doClose();
	}//GEN-LAST:event_closeDialog

	//===============================================================
	/**
	 *	Closes the dialog
	 */
	//===============================================================
	private void doClose()
	{
		setVisible(false);
		dispose();
	}
	//===============================================================
	//===============================================================
	public int showDialog()
	{
		setVisible(true);
		return retVal;
	}
	//===============================================================
	//===============================================================
	public PogoDeviceClass getPogoClass()
	{
        EList<Command>  commands = pogo_class.getCommands();
        for (Command command : commands)
        {
            BtnLine line = buttons.getLine(command.getName(), COMMAND);
			if (line!=null)
			{
            	EList<String>   excluded = command.getExcludedStates();
            	excluded.clear();
            	for (AllowedBtn btn : line)
                	if (btn.getSelectedObjects()==null)
                    	excluded.add(btn.name);
			}
        }

        EList<Attribute>  attributes = pogo_class.getAttributes();
        for (Attribute attribute : attributes)
        {
            BtnLine line = buttons.getLine(attribute.getName(), READ_ATTRIBUTE);
			if (line!=null)
			{
				EList<String>   read_excluded = attribute.getReadExcludedStates();
				read_excluded.clear();
	            for (AllowedBtn btn : line)
               		if (btn.getSelectedObjects()==null)
                    	read_excluded.add(btn.name);
 			}
            //  Write part
            if (!attribute.getRwType().equals(AttrRWtypeArray[READ]))
            {
                 line = buttons.getLine(attribute.getName(), WRITE_ATTRIBUTE);
                 if (line!=null)
                 {
                     EList<String>   write_excluded = attribute.getWriteExcludedStates();
                     write_excluded.clear();
                     for (AllowedBtn btn : line)
                         if (btn.getSelectedObjects()==null)
                            write_excluded.add(btn.name);
                 }
            }
        }
        return pogo_class;
	}
	//===============================================================
	//===============================================================
	//===============================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
	//===============================================================

}
