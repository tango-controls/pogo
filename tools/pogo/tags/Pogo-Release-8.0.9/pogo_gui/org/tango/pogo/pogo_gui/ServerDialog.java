//+======================================================================
// $Source:  $
//
// Project:   Tango
//
// Description:  Basic Dialog Class to display info
//
// $Author: pascal_verdier $
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

import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;
import org.tango.pogo.pogo_gui.tools.TangoServer;

import javax.swing.*;


//===============================================================

/**
 * JDialog Class to display info
 *
 * @author Pascal Verdier
 */
//===============================================================


public class ServerDialog extends JDialog {
    private TangoServer server;
    private int retVal = JOptionPane.OK_OPTION;
    //===============================================================

    /**
     * Creates new form ServerDialog
     *
     * @param parent parent frame instance.
     * @param server server to edit.
     */
    //===============================================================
    public ServerDialog(JFrame parent, TangoServer server) {
        super(parent, true);
        this.server = server;
        initComponents();

        titleLabel.setText("Tango Server definition");
        if (server != null) {
            nameText.setText(server.name);
            descriptionText.setText(server.description);
        }
        pack();
        ATKGraphicsUtils.centerDialog(this);
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
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JPanel topPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        javax.swing.JPanel centerPanel = new javax.swing.JPanel();
        javax.swing.JLabel nameLable = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        javax.swing.JLabel descritpionLabel = new javax.swing.JLabel();
        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextArea();
        javax.swing.JPanel bottomPanel = new javax.swing.JPanel();
        javax.swing.JButton okBtn = new javax.swing.JButton();
        javax.swing.JButton cancelBtn = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 18));
        titleLabel.setText("Dialog Title");
        topPanel.add(titleLabel);

        getContentPane().add(topPanel, java.awt.BorderLayout.NORTH);

        centerPanel.setLayout(new java.awt.GridBagLayout());

        nameLable.setText("Server Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        centerPanel.add(nameLable, gridBagConstraints);

        nameText.setColumns(30);
        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        centerPanel.add(nameText, gridBagConstraints);

        descritpionLabel.setText("Description:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        centerPanel.add(descritpionLabel, gridBagConstraints);

        descriptionText.setColumns(40);
        descriptionText.setRows(8);
        scrollPane.setViewportView(descriptionText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        centerPanel.add(scrollPane, gridBagConstraints);

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
        server.name = nameText.getText();
        server.description = descriptionText.getText();
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
    private void nameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyPressed
        if (evt.getKeyCode() == 27) {  //  Escape
            retVal = JOptionPane.CANCEL_OPTION;
            doClose();
        }
    }//GEN-LAST:event_nameTextKeyPressed

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
    public TangoServer getTangoServer() {
        return server;
    }
    //===============================================================
    //===============================================================

    //===============================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descriptionText;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
    //===============================================================

}



