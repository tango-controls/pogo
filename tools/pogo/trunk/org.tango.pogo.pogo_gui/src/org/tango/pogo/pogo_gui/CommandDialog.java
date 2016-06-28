//+======================================================================
//
// Project:   Tango
//
// Description:  Basic Dialog Class to edit commands.
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

import fr.esrf.TangoDs.TangoConst;
import fr.esrf.tango.pogo.pogoDsl.Argument;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.InheritanceStatus;

import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;
import org.eclipse.emf.common.util.EList;
import org.tango.pogo.pogo_gui.tools.OAWutils;
import org.tango.pogo.pogo_gui.tools.PogoException;
import org.tango.pogo.pogo_gui.tools.PopupTable;
import org.tango.pogo.pogo_gui.tools.Utils;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//===============================================================
/**
 * JDialog Class to display info
 *
 * @author Pascal Verdier
 */
//===============================================================


@SuppressWarnings("MagicConstant")
public class CommandDialog extends JDialog {
    private int retVal = JOptionPane.OK_OPTION;
    private static String[] commandNames = {
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

    private PogoGUI pogo_gui;
    private InheritanceStatus orig_status = null;
    private boolean isStateStatus = false;
    private Command command;
    private boolean isDynamic = false;
    ///===================================================================
    /**
     * Initializes the Form for creation
     *
     * @param parent    the parent frame object
     * @param isDynamic the created command will be a dynamic one
     */
    //===================================================================
    public CommandDialog(PogoGUI parent, boolean isDynamic) {
        this(parent, null);
        this.isDynamic = isDynamic;
        dynamicLbl.setVisible(isDynamic);
        pack();
    }
    //===============================================================
    /**
     * Creates new form CommandDialog
     *
     * @param parent The parent frame object
     * @param cmd    the specified command object
     */
    //===============================================================
    public CommandDialog(PogoGUI parent, Command cmd) {
        super(parent, true);
        this.command = cmd;
        pogo_gui = parent;
        if (command!=null)
            isDynamic = Utils.isTrue(command.getIsDynamic());

        initComponents();
        setCommand(cmd);
        manageInheritanceStatus(cmd);

        pack();
        ATKGraphicsUtils.centerDialog(this);
    }

    //===============================================================
    //===============================================================
    private void manageInheritanceStatus(Command cmd) {
        if (cmd != null) {
            //	Manage inheritance status
            orig_status = cmd.getStatus();
            if (isDynamic) {
                overloadBtn.setVisible(false);
                abstractBtn.setVisible(false);
                setEditable(true);
            } else
            if (Utils.isTrue(orig_status.getInherited())) {
                //  Is inherited (cannot be created as abstract)
                abstractBtn.setVisible(false);
                overloadBtn.setVisible(true);
                //  is Already overloaded
                boolean overload = Utils.isTrue(orig_status.getConcreteHere());
                overloadBtn.setSelected(overload);
                setEditable(false);
            } else {
                //  Not inherited -> full edition
                overloadBtn.setVisible(false);
                abstractBtn.setVisible(true);
                abstractBtn.setSelected(Utils.isTrue(orig_status.getAbstract()));
                setEditable(true);
            }
        } else {
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
    private void setNotEditable(JComboBox<String> comboBox) {
        String name = (String) comboBox.getSelectedItem();
        if (name != null) {
            comboBox.removeAllItems();
            comboBox.addItem(name);
        }
    }

    //===============================================================
    //===============================================================
    private void setEditable(boolean b) {
        nameComboBox.setEditable(b);
        //  if not editable -> get only selected one
        if (!b) {
            setNotEditable(nameComboBox);
            setNotEditable(arginComboBox);
            setNotEditable(argoutComboBox);

            levelBtn.setEnabled(false);
            arginDescBtn.setEnabled(false);
            arginDescText.setEditable(false);
            argoutDescBtn.setEnabled(false);
            argoutDescText.setEditable(false);

            descText.setEditable(false);
        }
    }

    //===============================================================
    //===============================================================
    private void setCommand(Command cmd) {
        //	Initialize ComboBoxes
        for (String name : commandNames)
            nameComboBox.addItem(name);

        for (int i = 0; i < TangoConst.Tango_CmdArgTypeName.length ; i++) {
            if (i != TangoConst.Tango_DEV_UCHAR &&
                i != TangoConst.Tango_DEV_INT &&
                i != TangoConst.Tango_DEVVAR_BOOLEANARRAY) {
                String typeName = TangoConst.Tango_CmdArgTypeName[i];
                arginComboBox.addItem(typeName);
                argoutComboBox.addItem(typeName);
            }
        }

        polledTxt.setEnabled(false);
        polledTxt.setText("3000");

        if (cmd != null) {
            for (String name : commandNames)
                if (name.equals(cmd.getName()))
                    nameComboBox.setSelectedItem(name);
            //	Check if found
            if (nameComboBox.getSelectedIndex() == 0) {
                String name = cmd.getName();
                nameComboBox.addItem(name);
                nameComboBox.setSelectedItem(name);
            }

            //  Manage descriptions
            String desc = Utils.strReplace(cmd.getDescription(), "\\n", "\n"); // For pb fixed.
            desc = Utils.strReplaceSpecialCharToDisplay(desc);
            descText.setText(desc);

            desc = Utils.strReplace(cmd.getArgin().getDescription(), "\\n", "\n"); // For pb fixed.
            desc = Utils.strReplaceSpecialCharToDisplay(desc);
            arginDescText.setText(desc);

            desc = Utils.strReplace(cmd.getArgout().getDescription(), "\\n", "\n"); // For pb fixed.
            desc = Utils.strReplaceSpecialCharToDisplay(desc);
            argoutDescText.setText(desc);

            //  Manage argin / argout
            String argin = OAWutils.pogo2tangoType(
                    cmd.getArgin().getType().toString());
            String argout = OAWutils.pogo2tangoType(
                    cmd.getArgout().getType().toString());
            for (String type : TangoConst.Tango_CmdArgTypeName) {
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
            if (cmd.getPolledPeriod() != null &&
                cmd.getPolledPeriod().length() > 0 &&
                !cmd.getPolledPeriod().equals("0")) {
                polledBtn.setSelected(true);
                polledTxt.setEnabled(true);
                polledLbl.setVisible(true);
                polledTxt.setText(cmd.getPolledPeriod());
            }

            //  Cannot poll state or status
            if (cmd.getName().toLowerCase().equals("state") ||
                    cmd.getName().toLowerCase().equals("status")) {

                isStateStatus = true;

                //polledBtn.setEnabled(false);
                //polledBtn.setSelected(false);

                levelBtn.setEnabled(false);
                levelBtn.setSelected(false);
            }
        } else {
            String name = "";
            nameComboBox.addItem(name);
            nameComboBox.setSelectedItem(name);
        }
        if (isDynamic) {
            abstractBtn.setVisible(false);
            overloadBtn.setVisible(false);
        }
        dynamicLbl.setVisible(isDynamic);
    }
    //===============================================================
    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    //===============================================================
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    @SuppressWarnings("Convert2Diamond")
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JPanel centerPanel = new javax.swing.JPanel();
        dynamicLbl = new javax.swing.JLabel();
        javax.swing.JLabel nameLbl = new javax.swing.JLabel();
        nameComboBox = new javax.swing.JComboBox<String>();
        abstractBtn = new javax.swing.JRadioButton();
        overloadBtn = new javax.swing.JRadioButton();
        javax.swing.JLabel arginLbl = new javax.swing.JLabel();
        javax.swing.JLabel argoutLbl = new javax.swing.JLabel();
        arginComboBox = new javax.swing.JComboBox<String>();
        argoutComboBox = new javax.swing.JComboBox<String>();
        arginDescBtn = new javax.swing.JButton();
        argoutDescBtn = new javax.swing.JButton();
        javax.swing.JPanel polledPanel = new javax.swing.JPanel();
        polledBtn = new javax.swing.JRadioButton();
        polledTxt = new javax.swing.JTextField();
        polledLbl = new javax.swing.JLabel();
        javax.swing.JPanel levelPanel = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        levelBtn = new javax.swing.JRadioButton();
        javax.swing.JLabel descLbl = new javax.swing.JLabel();
        javax.swing.JScrollPane descScrollPane = new javax.swing.JScrollPane();
        descText = new javax.swing.JTextArea();
        javax.swing.JScrollPane arginScrollPane = new javax.swing.JScrollPane();
        arginDescText = new javax.swing.JTextArea();
        javax.swing.JScrollPane argoutScrollPane = new javax.swing.JScrollPane();
        argoutDescText = new javax.swing.JTextArea();
        javax.swing.JPanel bottomPanel = new javax.swing.JPanel();
        javax.swing.JButton okBtn = new javax.swing.JButton();
        javax.swing.JButton cancelBtn = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        centerPanel.setLayout(new java.awt.GridBagLayout());

        dynamicLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dynamicLbl.setText("Dynamic Command (Add/Remove command will be done by code)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 16, 21, 6);
        centerPanel.add(dynamicLbl, gridBagConstraints);

        nameLbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nameLbl.setText("Command Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        centerPanel.add(nameLbl, gridBagConstraints);

        nameComboBox.setEditable(true);
        nameComboBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        centerPanel.add(nameComboBox, gridBagConstraints);

        abstractBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        abstractBtn.setText("Abstract Command");
        abstractBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        abstractBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        abstractBtn.setMargin(new java.awt.Insets(2, 12, 2, 12));
        abstractBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abstractBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 0);
        centerPanel.add(abstractBtn, gridBagConstraints);

        overloadBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        overloadBtn.setText("Overload Command");
        overloadBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        overloadBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        overloadBtn.setMargin(new java.awt.Insets(2, 12, 2, 12));
        overloadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overloadBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 0);
        centerPanel.add(overloadBtn, gridBagConstraints);

        arginLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        arginLbl.setText("Input Argument:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 10, 0, 10);
        centerPanel.add(arginLbl, gridBagConstraints);

        argoutLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        argoutLbl.setText("Output Argument:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 10);
        centerPanel.add(argoutLbl, gridBagConstraints);

        arginComboBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        arginComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arginComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        centerPanel.add(arginComboBox, gridBagConstraints);

        argoutComboBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        centerPanel.add(argoutComboBox, gridBagConstraints);

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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        centerPanel.add(argoutDescBtn, gridBagConstraints);

        polledBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        polledBtn.setText("Polled  ");
        polledBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        polledBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        polledBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polledBtnActionPerformed(evt);
            }
        });
        polledPanel.add(polledBtn);

        polledTxt.setColumns(8);
        polledTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        polledPanel.add(polledTxt);

        polledLbl.setText("ms");
        polledPanel.add(polledLbl);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 15, 0);
        centerPanel.add(polledPanel, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Controlled by : ");
        levelPanel.add(jLabel1);

        levelBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        levelBtn.setText("Expert Only");
        levelPanel.add(levelBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        centerPanel.add(levelPanel, gridBagConstraints);

        descLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        descLbl.setText("Command description:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 10);
        centerPanel.add(descLbl, gridBagConstraints);

        descScrollPane.setPreferredSize(new java.awt.Dimension(326, 150));

        descText.setColumns(35);
        descText.setRows(1);
        descScrollPane.setViewportView(descText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 10, 10);
        centerPanel.add(descScrollPane, gridBagConstraints);

        arginScrollPane.setPreferredSize(new java.awt.Dimension(246, 70));

        arginDescText.setColumns(30);
        arginDescText.setRows(2);
        arginScrollPane.setViewportView(arginDescText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        centerPanel.add(arginScrollPane, gridBagConstraints);

        argoutScrollPane.setPreferredSize(new java.awt.Dimension(246, 70));

        argoutDescText.setColumns(30);
        argoutDescText.setRows(2);
        argoutScrollPane.setViewportView(argoutDescText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        centerPanel.add(argoutScrollPane, gridBagConstraints);

        getContentPane().add(centerPanel, java.awt.BorderLayout.CENTER);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

        try {
            //	Check The inputs first
            String name = (String) nameComboBox.getSelectedItem();
            boolean overload = overloadBtn.getSelectedObjects() != null;
            name = Utils.checkNameSyntax(name, "name", isStateStatus);


            if (pogo_gui.itemAlreadyExists(name, PogoConst.COMMANDS))
                throw new PogoException("Command \"" + name + "\" Already Exists !");

            if (polledBtn.getSelectedObjects() != null) {
                //noinspection NestedTryStatement
                try {
                    //noinspection ResultOfMethodCallIgnored
                    Integer.parseInt(polledTxt.getText());
                } catch (NumberFormatException e) {
                    throw new PogoException("Bad polling period.");
                }
            }
        } catch (PogoException e) {
            e.popup(this);
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
        JButton btn = (JButton) evt.getSource();
        String text;
        if (btn == arginDescBtn)
            text = arginDescText.getText();
        else if (btn == argoutDescBtn)
            text = argoutDescText.getText();
        else
            return;

        //	Edit in dialog.
        EditDialog dlg = new EditDialog(this, text);
        if (dlg.showDialog() == JOptionPane.OK_OPTION) {
            //	Put new text in field
            if (btn == arginDescBtn)
                arginDescText.setText(dlg.getText());
            else if (btn == argoutDescBtn)
                argoutDescText.setText(dlg.getText());
        }
    }//GEN-LAST:event_descBtnActionPerformed

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void polledBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polledBtnActionPerformed

        boolean polled = polledBtn.getSelectedObjects() != null;
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
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void arginComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arginComboBoxActionPerformed

        if (isVisible()) {
            //  Only if argin is void, a command can be polled
            boolean canBePolled =(arginComboBox.getSelectedIndex() == 0);
            if (!canBePolled) {
                polledBtn.setSelected(false);
                polledTxt.setEnabled(false);
            }
            polledBtn.setEnabled(canBePolled);
        }
    }//GEN-LAST:event_arginComboBoxActionPerformed


	//===============================================================
	/**
	 *	Closes the dialog
	 */
    //===============================================================
    private void doClose() {
        setVisible(false);
        dispose();
    }

    //===============================================================
    //===============================================================
    Command getCommand() {
        Command cmd = OAWutils.factory.createCommand();
        String name = (String) nameComboBox.getSelectedItem();
        try {
            //	Re-check name for syntax
            boolean overload = overloadBtn.getSelectedObjects() != null;
            name = Utils.checkNameSyntax(name, "name", overload);
        } catch (PogoException e) {
            /*	Already verified */
        }
        cmd.setName(name);
        cmd.setExecMethod(Utils.buildCppExecuteMethodName(name));
        String desc = Utils.strReplaceSpecialCharToCode(descText.getText());
        cmd.setDescription(desc);

        //	Argin/argout management
        Argument argin = OAWutils.factory.createArgument();
        Argument argout = OAWutils.factory.createArgument();
        fr.esrf.tango.pogo.pogoDsl.Type arginType = OAWutils.tango2pogoType(
                arginComboBox.getSelectedItem().toString());
        fr.esrf.tango.pogo.pogoDsl.Type argoutType = OAWutils.tango2pogoType(
                argoutComboBox.getSelectedItem().toString());
        argin.setType(arginType);
        argout.setType(argoutType);

        desc = Utils.strReplaceSpecialCharToCode(arginDescText.getText());
        argin.setDescription(desc);
        desc = Utils.strReplaceSpecialCharToCode(argoutDescText.getText());
        argout.setDescription(desc);
        cmd.setArgin(argin);
        cmd.setArgout(argout);

        if (levelBtn.getSelectedObjects() == null)
            cmd.setDisplayLevel(PogoConst.strLevel[PogoConst.OPERATOR]);
        else
            cmd.setDisplayLevel(PogoConst.strLevel[PogoConst.EXPERT]);

        //  Is it a dynamic attribute ?
        if (isDynamic) {
            cmd.setIsDynamic("true");
        } else {
            cmd.setIsDynamic("false");

            //	Inheritance status
            if (Utils.isTrue(orig_status.getInherited())) {
                if (overloadBtn.getSelectedObjects() != null) {
                    orig_status.setConcrete("true");
                    orig_status.setConcreteHere("true");
                } else {
                    orig_status.setConcreteHere("false");
                }
            } else {
                if (abstractBtn.getSelectedObjects() != null) {
                    orig_status.setAbstract("true");
                    orig_status.setConcrete("false");
                    orig_status.setConcreteHere("false");
                } else {
                    orig_status.setAbstract("false");
                    orig_status.setConcrete("true");
                    orig_status.setConcreteHere("true");
                }
            }
        }
        cmd.setStatus(orig_status);

        if (polledBtn.getSelectedObjects() != null)
            cmd.setPolledPeriod(polledTxt.getText());
        else
            cmd.setPolledPeriod("0");

        //  Excluded states
        if (command!=null) {
            EList<String> srcExcluded = command.getExcludedStates();
            EList<String> newExcluded = cmd.getExcludedStates();
            for (String s : srcExcluded)
                newExcluded.add(s);
        }
        return cmd;
    }

    //===============================================================
    //===============================================================
    public static Command cloneCommand(Command srcCmd) {

        Command newCmd = OAWutils.cloneCommand(srcCmd);

        //	Inheritance status
        //  For a clone item, there is no inheritance.
        InheritanceStatus inheritanceStatus = newCmd.getStatus();
        if (!Utils.isTrue(inheritanceStatus.getAbstract())) {
            inheritanceStatus.setAbstract("false");
            inheritanceStatus.setInherited("false");
            inheritanceStatus.setConcrete("true");
            inheritanceStatus.setConcreteHere("true");
        }
        if (Utils.isTrue(inheritanceStatus.getInherited())) {
            inheritanceStatus.setAbstract("false");
            inheritanceStatus.setInherited("false");
            inheritanceStatus.setConcrete("true");
            inheritanceStatus.setConcreteHere("true");
        }

        newCmd.setStatus(inheritanceStatus);
        return newCmd;
    }

    //===============================================================
    //===============================================================
    public int showDialog() {
        setVisible(true);
        return retVal;
    }

    //===============================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abstractBtn;
    private javax.swing.JComboBox<String> arginComboBox;
    private javax.swing.JButton arginDescBtn;
    private javax.swing.JTextArea arginDescText;
    private javax.swing.JComboBox<String> argoutComboBox;
    private javax.swing.JButton argoutDescBtn;
    private javax.swing.JTextArea argoutDescText;
    private javax.swing.JTextArea descText;
    private javax.swing.JLabel dynamicLbl;
    private javax.swing.JRadioButton levelBtn;
    private javax.swing.JComboBox<String> nameComboBox;
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
    public static void popupSummary(JFrame parent, List<Command> commandList) {
        List<List<String>> summary = buildSummary(commandList);
        String title = Integer.toString(commandList.size()) + "  Commands";

        PopupTable ppt = new PopupTable(parent, title, columnTitle, summary);

        int nb = commandList.size();
        if (nb > 35) nb = 35;
        ppt.setPreferredSize(columnSize, nb);
        ppt.setVisible(true);
    }
    //===============================================================
    //===============================================================
    public static List<List<String>> buildSummary(List<Command> commandList) {
        List<List<String>> result = new ArrayList<>();
        for (Command command : commandList) {
            List<String> line = new ArrayList<>();
            line.add(command.getName());
            line.add(OAWutils.pogo2tangoType(command.getArgin().getType().toString()));
            line.add(OAWutils.pogo2tangoType(command.getArgout().getType().toString()));
            if (Utils.isEquals(command.getDisplayLevel(),
                    PogoConst.strLevel[PogoConst.EXPERT]))
                line.add(PogoConst.strLevel[PogoConst.EXPERT]);
            else
                line.add(PogoConst.strLevel[PogoConst.OPERATOR]);

            InheritanceStatus status = command.getStatus();
            line.add(Utils.strBoolean(status.getInherited()));
            boolean concreate = Utils.isTrue(status.getConcrete()) ||
                    Utils.isTrue(status.getConcreteHere());
            line.add("" + (!concreate));
            line.add(Utils.strReplace(command.getDescription(), "\\n", "\n"));
            result.add(line);
        }
        return result;
    }
    //===============================================================
    //===============================================================
}
