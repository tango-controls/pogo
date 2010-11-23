//+======================================================================
//
// Project:   Tango
//
// Description:  Basic Dialog Class to edit commands.
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

import java.util.Vector;

import javax.swing.*;

import org.tango.pogo.pogo_gui.tools.OAWutils;
import org.tango.pogo.pogo_gui.tools.PopupTable;
import org.tango.pogo.pogo_gui.tools.Utils;

import fr.esrf.tango.pogo.pogoDsl.Argument;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.InheritanceStatus;
import fr.esrf.tango.pogo.pogoDsl.Type;

import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;
import fr.esrf.TangoDs.TangoConst;
import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;
import fr.esrf.tangoatk.widget.util.ErrorPane;

//===============================================================
/**
 *	JDialog Class to display info
 *
 *	@author  Pascal Verdier
 */
//===============================================================


public class CommandDialog extends JDialog
{
	private int		retVal = JOptionPane.OK_OPTION;
	private static String[]	commandNames = {
			"Reset",
			"Off",
			"Warmup",
			"Standby",
			"On",
			"Start",
			"Stop",
			"Open",
			"Close",
			"Local",
			"Remote",
	};

	private PogoGUI			    pogo_gui;
    private InheritanceStatus   orig_status = null;
	//===============================================================
	/**
	 *	Creates new form CommandDialog
     * @param parent The parent frame object
     * @param cmd   the specified command object
     */
	//===============================================================
	public CommandDialog(PogoGUI parent, Command cmd)
	{
		super(parent, true);
		pogo_gui = parent;
		initComponents();
		setCommand(cmd);
        manageInheritanceStatus(cmd);

		pack();
 		ATKGraphicsUtils.centerDialog(this);
	}

	//===============================================================
	//===============================================================
    private void manageInheritanceStatus(Command cmd)
    {
        if (cmd!=null)
        {
            //	Manage inheritance status
            orig_status = cmd.getStatus();
            if (Utils.isTrue(orig_status.getInherited()))
            {
                //  Is inherited (cannot be created as abstract)
                abstractBtn.setVisible(false);
                overloadBtn.setVisible(true);
                //  is Already overloaded
                boolean oveload = Utils.isTrue(orig_status.getConcreteHere());
                overloadBtn.setSelected(oveload);
                setEditable(false);
            }
            else
            {
                //  Not inherited -> full edition
                overloadBtn.setVisible(false);
                abstractBtn.setVisible(true);
                abstractBtn.setSelected(Utils.isTrue(orig_status.getAbstract()));
                setEditable(true);
            }
        }
        else
        {
            //  Create a new command
            overloadBtn.setVisible(false);
            abstractBtn.setSelected(false);
            orig_status = OAWutils.factory.createInheritanceStatus();
            orig_status.setAbstract("false");
            orig_status.setInherited("false");
            orig_status.setConcrete("true");
            orig_status.setConcreteHere("true");
            setEditable(true);
       }
    }
    //===============================================================
    //===============================================================
    private void setNotEditable(JComboBox jcb)
    {
        String name = (String)jcb.getSelectedItem();
        if (name!=null)
        {
            jcb.removeAllItems();
            jcb.addItem(name);
        }
    }
    //===============================================================
    //===============================================================
    private void setEditable(boolean b)
    {
        nameComboBox.setEditable(b);
        //  if not editable -> get only selected one
        if (!b)
        {
            setNotEditable(nameComboBox);
            setNotEditable(arginComboBox);
            setNotEditable(argoutComboBox);
        }
    }
	//===============================================================
	//===============================================================
	private void setCommand(Command cmd)
	{
		//	Initialize ComboBoxes
		for (String name : commandNames)
			nameComboBox.addItem(name);
		for (String type : TangoConst.Tango_CmdArgTypeName)
		{
			arginComboBox.addItem(type);
			argoutComboBox.addItem(type);
		}

		polledTxt.setEnabled(false);
		polledTxt.setText("3000");

		if (cmd!=null)
		{
			for (String name : commandNames)
				if (name.equals(cmd.getName()))
					nameComboBox.setSelectedItem(name);
			//	Check if found
			if (nameComboBox.getSelectedIndex()==0)
			{
				String	name = cmd.getName();
				nameComboBox.addItem(name);
				nameComboBox.setSelectedItem(name);
			}

            //  Manage descriptions
			descTxt.setText(cmd.getDescription());
            String  desc = Utils.strReplaceSpecialCharToDisplay(cmd.getArgin().getDescription());
			arginDescTxt.setText(desc);
            desc = Utils.strReplaceSpecialCharToDisplay(cmd.getArgout().getDescription());
			argoutDescTxt.setText(desc);

            //  Manage argin / argout
			String	argin =  OAWutils.pogo2tangoType(
					cmd.getArgin().getType().toString());
			String	argout = OAWutils.pogo2tangoType(
					cmd.getArgout().getType().toString());
			for (String type : TangoConst.Tango_CmdArgTypeName)
			{
				if (type.equals(argin))
					arginComboBox.setSelectedItem(type);
				if (type.equals(argout))
					argoutComboBox.setSelectedItem(type);
			}

            //  manage display level
            if (Utils.isEquals(cmd.getDisplayLevel(),
                    PogoConst.strLevel[PogoConst.EXPERT]))
                levelBtn.setSelected(true);

            //  Manage polling
			if (cmd.getPolledPeriod()!=null &&
				cmd.getPolledPeriod().length()>0)
			{
				polledBtn.setSelected(true);
				polledTxt.setEnabled(true);
				polledLbl.setVisible(true);
				polledTxt.setText(cmd.getPolledPeriod());
			}
		}
		else
		{
			String	name = "";
			nameComboBox.addItem(name);
			nameComboBox.setSelectedItem(name);
		}
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
        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JPanel bottomPanel = new javax.swing.JPanel();
        javax.swing.JButton okBtn = new javax.swing.JButton();
        javax.swing.JButton cancelBtn = new javax.swing.JButton();
        javax.swing.JPanel centerPanel = new javax.swing.JPanel();
        javax.swing.JLabel descLbl = new javax.swing.JLabel();
        javax.swing.JLabel arginLbl = new javax.swing.JLabel();
        javax.swing.JLabel argoutLbl = new javax.swing.JLabel();
        descTxt = new javax.swing.JTextField();
        arginDescTxt = new javax.swing.JTextField();
        argoutDescTxt = new javax.swing.JTextField();
        arginComboBox = new javax.swing.JComboBox();
        argoutComboBox = new javax.swing.JComboBox();
        cmdDescBtn = new javax.swing.JButton();
        arginDescBtn = new javax.swing.JButton();
        argoutDescBtn = new javax.swing.JButton();
        javax.swing.JPanel polledPanel = new javax.swing.JPanel();
        polledBtn = new javax.swing.JRadioButton();
        polledTxt = new javax.swing.JTextField();
        polledLbl = new javax.swing.JLabel();
        javax.swing.JPanel levelPanel = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        levelBtn = new javax.swing.JRadioButton();
        javax.swing.JPanel toipPanel = new javax.swing.JPanel();
        javax.swing.JLabel nameLbl = new javax.swing.JLabel();
        nameComboBox = new javax.swing.JComboBox();
        abstractBtn = new javax.swing.JRadioButton();
        overloadBtn = new javax.swing.JRadioButton();

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
        bottomPanel.add(okBtn);

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        bottomPanel.add(cancelBtn);

        getContentPane().add(bottomPanel, java.awt.BorderLayout.SOUTH);

        centerPanel.setLayout(new java.awt.GridBagLayout());

        descLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        descLbl.setText("Command description:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 10);
        centerPanel.add(descLbl, gridBagConstraints);

        arginLbl.setFont(new java.awt.Font("Arial", 1, 12));
        arginLbl.setText("Input Argument:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(25, 20, 0, 10);
        centerPanel.add(arginLbl, gridBagConstraints);

        argoutLbl.setFont(new java.awt.Font("Arial", 1, 12));
        argoutLbl.setText("Output Argument:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 0, 10);
        centerPanel.add(argoutLbl, gridBagConstraints);

        descTxt.setColumns(30);
        descTxt.setFont(new java.awt.Font("Arial", 1, 12));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        centerPanel.add(descTxt, gridBagConstraints);

        arginDescTxt.setColumns(30);
        arginDescTxt.setFont(new java.awt.Font("Arial", 1, 12));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        centerPanel.add(arginDescTxt, gridBagConstraints);

        argoutDescTxt.setColumns(30);
        argoutDescTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        centerPanel.add(argoutDescTxt, gridBagConstraints);

        arginComboBox.setFont(new java.awt.Font("Arial", 1, 12));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        centerPanel.add(arginComboBox, gridBagConstraints);

        argoutComboBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        centerPanel.add(argoutComboBox, gridBagConstraints);

        cmdDescBtn.setText("...");
        cmdDescBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdDescBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        centerPanel.add(cmdDescBtn, gridBagConstraints);

        arginDescBtn.setText("...");
        arginDescBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        arginDescBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        centerPanel.add(arginDescBtn, gridBagConstraints);

        argoutDescBtn.setText("...");
        argoutDescBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        argoutDescBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        argoutDescBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        centerPanel.add(argoutDescBtn, gridBagConstraints);

        polledBtn.setFont(new java.awt.Font("Arial", 1, 12));
        polledBtn.setText("Polled");
        polledBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        polledBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        polledBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polledBtnActionPerformed(evt);
            }
        });
        polledPanel.add(polledBtn);

        polledTxt.setColumns(8);
        polledTxt.setFont(new java.awt.Font("Arial", 1, 12));
        polledPanel.add(polledTxt);

        polledLbl.setText("ms");
        polledPanel.add(polledLbl);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        centerPanel.add(polledPanel, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("Controlled by : ");
        levelPanel.add(jLabel1);

        levelBtn.setFont(new java.awt.Font("Arial", 1, 12));
        levelBtn.setText("Expert Only");
        levelPanel.add(levelBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        centerPanel.add(levelPanel, gridBagConstraints);

        getContentPane().add(centerPanel, java.awt.BorderLayout.CENTER);

        nameLbl.setFont(new java.awt.Font("Arial", 1, 12));
        nameLbl.setText("Command Name:");
        toipPanel.add(nameLbl);

        nameComboBox.setEditable(true);
        nameComboBox.setFont(new java.awt.Font("Arial", 1, 12));
        toipPanel.add(nameComboBox);

        abstractBtn.setFont(new java.awt.Font("Arial", 1, 12));
        abstractBtn.setText("Abstract");
        abstractBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        abstractBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        abstractBtn.setMargin(new java.awt.Insets(2, 12, 2, 12));
        abstractBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abstractBtnActionPerformed(evt);
            }
        });
        toipPanel.add(abstractBtn);

        overloadBtn.setFont(new java.awt.Font("Arial", 1, 12));
        overloadBtn.setText("Overload");
        overloadBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        overloadBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        overloadBtn.setMargin(new java.awt.Insets(2, 12, 2, 12));
        overloadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overloadBtnActionPerformed(evt);
            }
        });
        toipPanel.add(overloadBtn);

        getContentPane().add(toipPanel, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

	//===============================================================
	//===============================================================
	@SuppressWarnings({"UnusedDeclaration"})
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

		try
		{
			//	Check The inputs first
			String	name = (String)nameComboBox.getSelectedItem();
            boolean overload = overloadBtn.getSelectedObjects()!=null;
			name = Utils.checkNameSyntax(name, overload);

			if (pogo_gui.itemAlreadyExists(name, PogoConst.COMMANDS))
				Except.throw_exception("CommandExists",
						"Command \"" + name + "\" Already Exists !",
						"CommandDialog.okBtnActionPerformed()");
			
			if (polledBtn.getSelectedObjects()!=null)
			{
				//noinspection NestedTryStatement
				try	{
					Integer.parseInt(polledTxt.getText());
				}
				catch (NumberFormatException e)	{
					Except.throw_exception(e.toString(),
							"Bad polling period.",
							"CommandDialog.okBtnActionPerformed()");
				}
			}
		}
		catch (Exception e)
		{
			ErrorPane.showErrorMessage(this, null, e);
			return;
		}
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
	//===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void descBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descBtnActionPerformed

		//	Get the specified text
		JButton	btn = (JButton) evt.getSource();
		String	text;
		if (btn==arginDescBtn)
			text = arginDescTxt.getText();
		else
		if (btn==argoutDescBtn)
			text = argoutDescTxt.getText();
		else
		if (btn==cmdDescBtn)
			text = descTxt.getText();
		else
			return;

		//	Edit in dialog.
		EditDialog	dlg = new EditDialog(this, text);
		if (dlg.showDialog()==JOptionPane.OK_OPTION)
		{
			//	Put new text in field
			if (btn==arginDescBtn)
				arginDescTxt.setText(dlg.getText());
			else
			if (btn==argoutDescBtn)
				argoutDescTxt.setText(dlg.getText());
			else
			if (btn==cmdDescBtn)
				descTxt.setText(dlg.getText());
		}
	}//GEN-LAST:event_descBtnActionPerformed

	//===============================================================
	//===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void polledBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polledBtnActionPerformed

		boolean polled = polledBtn.getSelectedObjects()!=null;
		polledTxt.setEnabled(polled);
	}//GEN-LAST:event_polledBtnActionPerformed

	//===============================================================
	//===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void abstractBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abstractBtnActionPerformed


	}//GEN-LAST:event_abstractBtnActionPerformed

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void overloadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overloadBtnActionPerformed

        //boolean overload = (overloadBtn.getSelectedObjects()!=null);
        //okBtn.setVisible(overload);

    }//GEN-LAST:event_overloadBtnActionPerformed

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
	Command getCommand()
	{
		Command	cmd = OAWutils.factory.createCommand();
		String	name = (String) nameComboBox.getSelectedItem();
		try	{
			//	Re-check name for syntax
            boolean overload = overloadBtn.getSelectedObjects()!=null;
			name = Utils.checkNameSyntax(name, overload);
		} catch(DevFailed e) {
			/*	Already verified */
		}
		cmd.setName(name);
	    cmd.setExecMethod(Utils.buildExcecMethodName(name));
	    cmd.setDescription(descTxt.getText());

		//	Argin/argout management
		Argument	argin  = OAWutils.factory.createArgument();
	    Argument	argout = OAWutils.factory.createArgument();
		Type	arginType = OAWutils.tango2pogoType(
				arginComboBox.getSelectedItem().toString());
		Type	argoutType = OAWutils.tango2pogoType(
				argoutComboBox.getSelectedItem().toString());
		argin.setType(arginType);
	    argout.setType(argoutType);

        String  desc = Utils.strReplaceSpecialCharToCode(arginDescTxt.getText());
		argin.setDescription(desc);
        desc = Utils.strReplaceSpecialCharToCode(argoutDescTxt.getText());
	    argout.setDescription(desc);
	    cmd.setArgin(argin);
	    cmd.setArgout(argout);

        if (levelBtn.getSelectedObjects() == null)
		    cmd.setDisplayLevel(PogoConst.strLevel[PogoConst.OPERATOR]);
        else
		    cmd.setDisplayLevel(PogoConst.strLevel[PogoConst.EXPERT]);

        //	Inheritance status
        if (Utils.isTrue(orig_status.getInherited()))
        {
            if (overloadBtn.getSelectedObjects()!=null)
                orig_status.setConcreteHere("true");
            else
                orig_status.setConcreteHere("false");
        }
        else
        {
            if (abstractBtn.getSelectedObjects()!=null)
            {
                orig_status.setAbstract("true");
                orig_status.setConcrete("false");
                orig_status.setConcreteHere("false");
            }
            else
            {
                orig_status.setAbstract("false");
                orig_status.setConcrete("true");
                orig_status.setConcreteHere("true");
            }
        }
        cmd.setStatus(orig_status);

		if (polledBtn.getSelectedObjects()!=null)
			cmd.setPolledPeriod(polledTxt.getText());
		return cmd;
	}
	//===============================================================
	//===============================================================
	public static Command cloneCommand(Command srcCmd) {

        Command	newCmd = OAWutils.cloneCommand(srcCmd);

        //	Inheritance status
        //  For a clone item, there is no inheritance.
        InheritanceStatus   inher_status = newCmd.getStatus();
        if (!Utils.isTrue(inher_status.getAbstract())) {
            inher_status.setAbstract("false");
            inher_status.setInherited("false");
            inher_status.setConcrete("true");
            inher_status.setConcreteHere("true");
        }
        if (Utils.isTrue(inher_status.getInherited())) {
            inher_status.setAbstract("false");
            inher_status.setInherited("false");
            inher_status.setConcrete("true");
            inher_status.setConcreteHere("true");
        }

        newCmd.setStatus(inher_status);
		return newCmd;
	}
	//===============================================================
	//===============================================================
	public int showDialog()
	{
		setVisible(true);
		return retVal;
	}

	//===============================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abstractBtn;
    private javax.swing.JComboBox arginComboBox;
    private javax.swing.JButton arginDescBtn;
    private javax.swing.JTextField arginDescTxt;
    private javax.swing.JComboBox argoutComboBox;
    private javax.swing.JButton argoutDescBtn;
    private javax.swing.JTextField argoutDescTxt;
    private javax.swing.JButton cmdDescBtn;
    private javax.swing.JTextField descTxt;
    private javax.swing.JRadioButton levelBtn;
    private javax.swing.JComboBox nameComboBox;
    private javax.swing.JRadioButton overloadBtn;
    private javax.swing.JRadioButton polledBtn;
    private javax.swing.JLabel polledLbl;
    private javax.swing.JTextField polledTxt;
    // End of variables declaration//GEN-END:variables
	//===============================================================


	//===============================================================
	/*
	 *	Manage the popup summary methods
	 */
	//===============================================================
    private static int[] columnSize = {
            140, 130, 130, 80, 40, 40, 400
    };
    private static String[] columnTitle = {
            "Name",
            "Input Arg",
            "Output Arg",
            "Level",
            "Inherited",
            "Abstract",
            "Description",
         };
	//===============================================================
	//===============================================================
    public static void popupSummary(JFrame parent, Vector<Command> vc)
    {
		Vector<Vector<String>>	summary = buildSummary(vc);
		String	title = Integer.toString(vc.size()) + "  Commands";

		PopupTable  ppt =
			new PopupTable(parent, title, columnTitle, summary);

		int nb = vc.size();
		if (nb>35)	nb = 35;
		ppt.setPreferredSize(columnSize, nb);
		ppt.setVisible(true);
   }
	//===============================================================
	//===============================================================
	public static Vector<Vector<String>> buildSummary(Vector<Command> vc)
	{
        Vector<Vector<String>>  result = new Vector<Vector<String>>();
		for (Command command : vc)
		{
            Vector<String>  line = new Vector<String>();
 			line.add(command.getName());
			line.add(OAWutils.pogo2tangoType(command.getArgin().getType().toString()));
			line.add(OAWutils.pogo2tangoType(command.getArgout().getType().toString()));
            if (Utils.isEquals(command.getDisplayLevel(),
                    PogoConst.strLevel[PogoConst.EXPERT]))
                line.add(PogoConst.strLevel[PogoConst.EXPERT]);
            else
                line.add(PogoConst.strLevel[PogoConst.OPERATOR]);

            InheritanceStatus	status = command.getStatus();
            line.add(Utils.strBoolean(status.getInherited()));
            boolean concreate = Utils.isTrue(status.getConcrete()) ||
                                Utils.isTrue(status.getConcreteHere());
            line.add(""+(!concreate));
            line.add(Utils.strReplace(command.getDescription(), "\\n", "\n"));
			result.add(line);
		}
		return result;
	}
	//===============================================================
	//===============================================================
}
