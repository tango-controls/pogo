//+======================================================================
// $Source:  $
//
// Project:   Tango
//
// Description:  Basic Dialog Class to display info
//
// $Author: pascal_verdier $
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

import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;
import org.eclipse.emf.common.util.EList;
import org.tango.pogo.pogo_gui.tools.OAWutils;
import org.tango.pogo.pogo_gui.tools.PogoFileFilter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Vector;


//===============================================================
/**
 * JDialog Class to display info
 *
 * @author Pascal Verdier
 */
//===============================================================


public class AdditionalFilesDialog extends JDialog {
    private String path;
    private String fileExtension;
    private EList<AdditionalFile> fileList;

    private int returnValue = JOptionPane.CANCEL_OPTION;

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    public AdditionalFilesDialog(JFrame parent, EList<AdditionalFile> fileList, String path, String fileExtension) {
        super(parent, true);
        this.fileList = fileList;
        this.path = path;
        this.fileExtension = fileExtension;
        initForm();
    }

    //===============================================================
    //===============================================================
    public AdditionalFilesDialog(JDialog parent, EList<AdditionalFile> fileList, String path, String fileExtension) {
        super(parent, true);
        this.fileList = fileList;
        this.path = path;
        this.fileExtension = fileExtension;
        initForm();
    }

    //===============================================================
    //===============================================================
    private void initForm() {
        initComponents();
        fillJList();
        additionalList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                listSelectionPerformed(e);
            }
        });

        removeBtn.setEnabled(false);
        if (fileList.size() == 0)
            listScrollPane.setPreferredSize(new Dimension(500, 50));
        pack();
        ATKGraphicsUtils.centerDialog(this);
    }

    //===============================================================
    //===============================================================
    private void fillJList() {
        additionalList.removeAll();
        Vector<String> strList = new Vector<String>();
        for (AdditionalFile file : fileList) {
            strList.add(file.getPath());
        }
        additionalList.setListData(strList);
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
        javax.swing.JLabel titleLabel = new javax.swing.JLabel();
        listScrollPane = new javax.swing.JScrollPane();
        additionalList = new javax.swing.JList();
        javax.swing.JPanel rightPanel = new javax.swing.JPanel();
        javax.swing.JButton addBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        javax.swing.JPanel bottomPanel = new javax.swing.JPanel();
        javax.swing.JButton okBtn = new javax.swing.JButton();
        javax.swing.JButton cancelBtn = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titleLabel.setText("Programmer's  Additional  files");
        topPanel.add(titleLabel);

        getContentPane().add(topPanel, java.awt.BorderLayout.NORTH);

        listScrollPane.setViewportView(additionalList);

        getContentPane().add(listScrollPane, java.awt.BorderLayout.CENTER);

        rightPanel.setLayout(new java.awt.GridBagLayout());

        addBtn.setText("Add File");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        rightPanel.add(addBtn, gridBagConstraints);

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        rightPanel.add(removeBtn, gridBagConstraints);

        getContentPane().add(rightPanel, java.awt.BorderLayout.LINE_END);

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
    private void listSelectionPerformed(MouseEvent evt) {
        removeBtn.setEnabled(true);
    }

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        returnValue = JOptionPane.OK_OPTION;
        doClose();
    }//GEN-LAST:event_okBtnActionPerformed

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        returnValue = JOptionPane.CANCEL_OPTION;
        doClose();
    }//GEN-LAST:event_closeDialog

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        JFileChooser chooser = new JFileChooser(path);
        PogoFileFilter filter = new PogoFileFilter(fileExtension, "Additional Code Files");
        chooser.setFileFilter(filter);

        int retval = chooser.showOpenDialog(this);
        if (retval == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file != null) {
                if (!file.isDirectory()) {
                    //  get name without extension and path
                    String name = file.getName();
                    String path = file.getAbsolutePath();
                    int pos = name.lastIndexOf(".");
                    if (pos > 0) name = name.substring(0, pos);

                    //  Update list
                    AdditionalFile addFile = OAWutils.factory.createAdditionalFile();
                    addFile.setName(name);
                    addFile.setPath(path);
                    fileList.add(addFile);
                    fillJList();
                }
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        String item = (String) additionalList.getSelectedValue();
        if (JOptionPane.showConfirmDialog(this,
                "Remove  " + item + " ?",
                "Confirmation Window",
                JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

            int idx = additionalList.getSelectedIndex();
            fileList.remove(idx);
            fillJList();

            removeBtn.setEnabled(false);
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        returnValue = JOptionPane.CANCEL_OPTION;
        doClose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    //===============================================================
    //===============================================================
    public int showDialog() {
        setVisible(true);
        return returnValue;
    }
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList additionalList;
    private javax.swing.JScrollPane listScrollPane;
    private javax.swing.JButton removeBtn;
    // End of variables declaration//GEN-END:variables
    //===============================================================

}
