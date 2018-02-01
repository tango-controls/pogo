//+======================================================================
//
// Project:   Tango
//
// Description:  java source code for state machchine swing class.
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

import fr.esrf.tango.pogo.pogoDsl.*;
import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;
import org.eclipse.emf.common.util.EList;
import org.tango.pogo.pogo_gui.tools.StateMachineTable;

import javax.swing.*;

/**
 * Class Description: Basic Dialog Class to display info
 *
 * @author root
 */

@SuppressWarnings("MagicConstant")
public class StateMachineDialog extends JDialog implements PogoConst {
    private PogoDeviceClass pogoClass;
    private StateMachineTable commandTable;
    private StateMachineTable attributeTable;
    private StateMachineTable pipeTable;
    private int retVal = JOptionPane.OK_OPTION;
    //===============================================================
    /**
     * Creates new form StateMachineDialog
     *
     * @param parent     parent form
     * @param pogo_class Pogo class to edit state machine
     */
    //===============================================================
    public StateMachineDialog(JFrame parent, PogoDeviceClass pogo_class) {
        super(parent, true);
        this.pogoClass = pogo_class;
        initComponents();
        createOwnComponents();
        titleLabel.setText(pogo_class.getName() + " State Machine");
        pack();
        ATKGraphicsUtils.centerDialog(this);
    }
    //===============================================================
    /**
     * Creates own components
     */
    //===============================================================
    private void createOwnComponents() {
        int paneIndex = 0;
        JScrollPane commandScrollPane = null;
        JScrollPane attributeScrollPane = null;
        JScrollPane pipeScrollPane = null;

        //  Manage commands and dynamic commands
        EList<Command> commands = pogoClass.getCommands();
        EList<Command> dynCommands = pogoClass.getDynamicCommands();
        if (commands.size()>2 || !dynCommands.isEmpty()) {
            commandTable = new StateMachineTable(pogoClass, StateMachineTable.COMMAND);
            commandScrollPane = new JScrollPane(commandTable);
            tabbedPane.add(commandScrollPane);
            tabbedPane.setTitleAt(paneIndex++, "Allowed Commands");
        }

        //  Manage attributes and dynamic attributes
        EList<Attribute> attributes = pogoClass.getAttributes();
        EList<Attribute> dynAttributes = pogoClass.getDynamicAttributes();
        if (!attributes.isEmpty() || !dynAttributes.isEmpty()) {
            attributeTable = new StateMachineTable(pogoClass, StateMachineTable.ATTRIBUTE);
            attributeScrollPane = new JScrollPane(attributeTable);
            tabbedPane.add(attributeScrollPane);
            tabbedPane.setTitleAt(paneIndex++, "Allowed Attributes");
        }

        //  Manage pipes
        EList<Pipe> pipes = pogoClass.getPipes();
        if (!pipes.isEmpty()) {
            pipeTable = new StateMachineTable(pogoClass, StateMachineTable.PIPE);
            pipeScrollPane = new JScrollPane(pipeTable);
            tabbedPane.add(pipeScrollPane);
            tabbedPane.setTitleAt(paneIndex, "Allowed Pipes");
        }
        pack();
        if (commandScrollPane!=null)
            commandScrollPane.setPreferredSize(commandTable.getDimension());
        if (attributeScrollPane!=null)
            attributeScrollPane.setPreferredSize(attributeTable.getDimension());
        if (pipeScrollPane!=null)
            pipeScrollPane.setPreferredSize(pipeTable.getDimension());
    }
    //===============================================================
    //===============================================================

    //===============================================================
    /**
     * This method is called from within the constructor to
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
        tabbedPane = new javax.swing.JTabbedPane();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        getContentPane().setLayout(new java.awt.BorderLayout());

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

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titleLabel.setText("State Machine");
        jPanel2.add(titleLabel);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);
        getContentPane().add(tabbedPane, java.awt.BorderLayout.CENTER);

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
     * Closes the dialog
     */
    //===============================================================
    private void doClose() {
        setVisible(false);
        dispose();
    }

    //===============================================================
    //===============================================================
    public int showDialog() {
        setVisible(true);
        return retVal;
    }

    //===============================================================
    //===============================================================
    public PogoDeviceClass getPogoClass() {
        if (commandTable!=null)     commandTable.updateExcluded();
        if (attributeTable!=null)   attributeTable.updateExcluded();
        if (pipeTable!=null)        pipeTable.updateExcluded();
        return pogoClass;
    }
    //===============================================================
    //===============================================================
    //===============================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
    //===============================================================

}
