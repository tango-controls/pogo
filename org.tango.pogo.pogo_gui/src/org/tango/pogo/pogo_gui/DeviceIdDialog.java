//+======================================================================
//
// Project:   Tango
//
// Description:  Basic Dialog Class manage class identification
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


import fr.esrf.tango.pogo.pogoDsl.ClassIdentification;
import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;
import org.tango.pogo.pogo_gui.tools.*;
import org.eclipse.emf.common.util.EList;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.util.List;


//===============================================================

/**
 * JDialog Class to display and get device identification
 * It is kept as JDialog to be edited with netbeans,
 * but only centerPanel and data management are used
 *
 * @author Pascal Verdier
 */
//===============================================================

@SuppressWarnings("MagicConstant")
public class DeviceIdDialog extends JDialog {
    private int retVal = JOptionPane.OK_OPTION;
    private ClassIdentification id = null;
    private List<String> keyWordList = new ArrayList<>();
    private static final String HelpMessage =
            "During TANGO meeting in Kobe (Japan)\n" +
                    "It has been decided to create a\n" +
                    "device class identification for all TANGO classes.\n\n" +
                    "The goal of this device class identification\n" +
                    "is to sort and find class by key words.\n\n" +
                    "Do not be afraid to be spammed,\n" +
                    "the email for contact will not appear clearly in html pages";

    //===============================================================
    //===============================================================
    private void updateComboBox(JComboBox<String> comboBox, List<String> list) {
        comboBox.removeAllItems();
        for (String item : list)
            comboBox.addItem(item);
    }
    //===============================================================
    /**
     * Creates new form DeviceIdDialog
     *
     * @param parent the parent frame
     */
    //===============================================================
    public DeviceIdDialog(JFrame parent) {
        super(parent, true);
        initComponents();

        updateComboBox(familyComboBox, PogoProperty.classFamilies);
        updateComboBox(platformComboBox, PogoProperty.platformNames);
        updateComboBox(busComboBox, PogoProperty.busNames);
        if (PogoProperty.siteName != null &&
                PogoProperty.siteName.length() > 0 &&
                PogoProperty.siteClassFamilies != null &&
                PogoProperty.siteClassFamilies.size() > 0) {

            siteButton.setText(PogoProperty.siteName + " Specific");
        } else {
            siteButton.setVisible(false);
        }

        //	Add a little help button
        topPanel.add(new javax.swing.JLabel("        "));
        javax.swing.JButton btn = new javax.swing.JButton("Help");
        btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });
        topPanel.add(btn);

        //	Fill email field if possible
        String mail = java.lang.System.getenv("EMAIL");
        if (mail == null || mail.length() == 0)
            mail = PogoProperty.contactAddress;
        contactTxt.setText(mail);
        manufacturerTxt.setText("none");
        buildKeyWordsTooltip();

        pack();
        setReferenceVisible(false);
        ATKGraphicsUtils.centerDialog(this);
    }
    //===============================================================

    /**
     * Creates new form DeviceIdDialog
     *
     * @param parent the parent frame
     * @param id     the device class identification object
     */
    //===============================================================
    public DeviceIdDialog(JFrame parent, ClassIdentification id) {
        this(parent);
        this.id = id;

        if (id != null) {
            //	Set fields from ID
            if (siteButton.isVisible() &&
                    PogoProperty.siteName != null &&
                    id.getSiteSpecific() != null &&
                    id.getSiteSpecific().equals(PogoProperty.siteName)) {
                siteButton.setSelected(true);
                updateComboBox(familyComboBox, PogoProperty.siteClassFamilies);
            }

            //  For compatibility with beta release.
            if (Utils.isSet(id.getAuthor()))
                contactTxt.setText(id.getAuthor() + "@" + id.getEmailDomain());
            else {
                String mail = java.lang.System.getenv("EMAIL");
                if (mail == null || mail.length() == 0)
                    mail = PogoProperty.contactAddress;
                contactTxt.setText(mail);
            }
            platformComboBox.setSelectedItem(id.getPlatform());
            familyComboBox.setSelectedItem(id.getClassFamily());
            busComboBox.setSelectedItem(id.getBus());
            manufacturerTxt.setText(id.getManufacturer());
            referenceTxt.setText(id.getReference());
            if (id.getManufacturer()!=null)
                setReferenceVisible(!id.getManufacturer().isEmpty() &&
                        !id.getManufacturer().equals("none"));

            EList<String> keyWords = id.getKeyWords();
            if (keyWords!=null) {
                for (String keyWord : keyWords)
                    if (!alreadyInList(keyWord, keyWordList))
                        keyWordList.add(keyWord);
            }
            buildKeyWordsTooltip();
        }
    }

    //===============================================================
    //===============================================================
    private boolean alreadyInList(String str, List<String> list) {
        for (String item : list)
            if (item.equalsIgnoreCase(str))
                return true;
        return false;
    }
    //===============================================================
    //===============================================================
    private void buildKeyWordsTooltip() {
        if (keyWordList.size()>0) {
            StringBuilder   sb = new StringBuilder();
            for (String kewWord : keyWordList) {
                sb.append(kewWord).append("\n");
            }
            String title = "Key Word";
            if (keyWordList.size()>1)
                title += "s";
            addKeyWordsButton.setToolTipText(Utils.buildToolTip(title, sb.toString()));
        }
        else
            addKeyWordsButton.setToolTipText(Utils.buildToolTip("No key words"));
    }
    //===============================================================
    //===============================================================
    public JPanel getCenterPanel() {
        return centerPanel;
    }
    //===============================================================
    //===============================================================
    private void setReferenceVisible(boolean b) {
        //referenceTxt.setVisible(b);
        //referenceLabel.setVisible(b);
        referenceTxt.setEditable(b);
        if (b)
            referenceTxt.setBackground(Color.white);
        else
            referenceTxt.setBackground(Color.lightGray);
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

        centerPanel = new javax.swing.JPanel();
        javax.swing.JLabel contactLabel = new javax.swing.JLabel();
        javax.swing.JLabel platformLabel = new javax.swing.JLabel();
        javax.swing.JLabel busLabel = new javax.swing.JLabel();
        javax.swing.JLabel manufacturerLabel = new javax.swing.JLabel();
        javax.swing.JLabel referenceLabel = new javax.swing.JLabel();
        contactTxt = new javax.swing.JTextField();
        manufacturerTxt = new javax.swing.JTextField();
        referenceTxt = new javax.swing.JTextField();
        platformComboBox = new javax.swing.JComboBox<String>();
        busComboBox = new javax.swing.JComboBox<String>();
        familyComboBox = new javax.swing.JComboBox<String>();
        javax.swing.JLabel familyLabel = new javax.swing.JLabel();
        siteButton = new javax.swing.JRadioButton();
        topPanel = new javax.swing.JPanel();
        javax.swing.JLabel titleLabel = new javax.swing.JLabel();
        addKeyWordsButton = new javax.swing.JButton();
        javax.swing.JPanel bottomPanel = new javax.swing.JPanel();
        javax.swing.JButton okBtn = new javax.swing.JButton();
        javax.swing.JButton cancelBtn = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        centerPanel.setLayout(new java.awt.GridBagLayout());

        contactLabel.setText("Contact email *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        centerPanel.add(contactLabel, gridBagConstraints);

        platformLabel.setText("Platform *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        centerPanel.add(platformLabel, gridBagConstraints);

        busLabel.setText("Bus *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        centerPanel.add(busLabel, gridBagConstraints);

        manufacturerLabel.setText("Manufacturer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        centerPanel.add(manufacturerLabel, gridBagConstraints);

        referenceLabel.setText("Product Reference");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        centerPanel.add(referenceLabel, gridBagConstraints);

        contactTxt.setColumns(20);
        contactTxt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        contactTxt.setToolTipText("Programmer or contact email address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 10);
        centerPanel.add(contactTxt, gridBagConstraints);

        manufacturerTxt.setColumns(20);
        manufacturerTxt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        manufacturerTxt.setToolTipText("manufacturer name");
        manufacturerTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manufacturerTxtKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        centerPanel.add(manufacturerTxt, gridBagConstraints);

        referenceTxt.setColumns(20);
        referenceTxt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        centerPanel.add(referenceTxt, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        centerPanel.add(platformComboBox, gridBagConstraints);

        busComboBox.setEditable(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        centerPanel.add(busComboBox, gridBagConstraints);

        familyComboBox.setEditable(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        centerPanel.add(familyComboBox, gridBagConstraints);

        familyLabel.setText("Class family *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        centerPanel.add(familyLabel, gridBagConstraints);

        siteButton.setText("Site button");
        siteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 35, 0);
        centerPanel.add(siteButton, gridBagConstraints);

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titleLabel.setText("Device Class Identification");
        topPanel.add(titleLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        centerPanel.add(topPanel, gridBagConstraints);

        addKeyWordsButton.setText("Add Key Words For Search Engine");
        addKeyWordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addKeyWordsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 10);
        centerPanel.add(addKeyWordsButton, gridBagConstraints);

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
    private void manufacturerTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manufacturerTxtKeyReleased

        String s = manufacturerTxt.getText();
        setReferenceVisible(s.length() > 0 && !s.equals("none"));
    }//GEN-LAST:event_manufacturerTxtKeyReleased

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

        try {
            checkInputs();
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
    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(new JFrame(), HelpMessage,
                "Help Window", JOptionPane.INFORMATION_MESSAGE);
    }

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
    private void siteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteButtonActionPerformed
        manageSiteFamilies();
    }//GEN-LAST:event_siteButtonActionPerformed

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void addKeyWordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addKeyWordsButtonActionPerformed
        KeyWordsDialog  dialog = new KeyWordsDialog(this, keyWordList);
        if (dialog.showDialog()==JOptionPane.OK_OPTION) {
            keyWordList = dialog.getKeyWords();
            buildKeyWordsTooltip();
        }
    }//GEN-LAST:event_addKeyWordsButtonActionPerformed

    //===============================================================
    //===============================================================
    private void manageSiteFamilies() {
        if (PogoProperty.siteName != null &&
                PogoProperty.siteName.length() > 0 &&
                PogoProperty.siteClassFamilies != null &&
                PogoProperty.siteClassFamilies.size() > 0) {

            siteButton.setText(PogoProperty.siteName + " Specific");
            siteButton.setVisible(true);
        } else {
            siteButton.setVisible(false);
        }

        //  Get selection, update the list, and re-do the selection
        String family = (String) familyComboBox.getSelectedItem();
        if (siteButton.getSelectedObjects() == null)
            updateComboBox(familyComboBox, PogoProperty.classFamilies);
        else
            updateComboBox(familyComboBox, PogoProperty.siteClassFamilies);

        familyComboBox.setSelectedItem(family);
    }
    //===============================================================
    //===============================================================


    //===============================================================
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
    public void checkInputs() throws PogoException {

        //	Check if Contact email is coherent
        String contact = contactTxt.getText().trim();
        int pos = contact.indexOf('@');
        if (pos <= 0)
            throw new PogoException("email is not available");

        int pos2 = contact.indexOf('.', pos);
        if (pos2 <= 0 || contact.length() - pos2 < 3)
            throw new PogoException("email is not available");

        String family = (String) familyComboBox.getSelectedItem();
        if (family == null || family.trim().length() == 0)
            throw new PogoException("Class family is not available");

        String bus = (String) busComboBox.getSelectedItem();
        if (bus == null || bus.trim().length() == 0)
            throw new PogoException("Bus is not available");

        //System.out.println(getInputs());
    }

    //===============================================================
    //===============================================================
    public static void buildIdContact(ClassIdentification id, String str) {
        StringTokenizer stk = new StringTokenizer(str, "@");
        id.setAuthor(stk.nextToken());
        id.setEmailDomain(stk.nextToken());
        id.setContact("at " + id.getEmailDomain() + " - " + id.getAuthor());
    }

    //===============================================================
    //===============================================================
    public ClassIdentification getInputs() {
        if (id == null)
            id = OAWutils.factory.createClassIdentification();

        String platform = (String) platformComboBox.getSelectedItem();
        String family = (String) familyComboBox.getSelectedItem();
        String bus = (String) busComboBox.getSelectedItem();

        String site = "";
        if (siteButton.isVisible() &&
                siteButton.getSelectedObjects() != null)
            site = PogoProperty.siteName;

        buildIdContact(id, contactTxt.getText().trim());
        id.setClassFamily(family);
        id.setSiteSpecific(site);
        id.setPlatform(platform);
        id.setBus(bus);
        id.setManufacturer(manufacturerTxt.getText().trim());
        id.setReference(referenceTxt.getText().trim());
        EList<String> keyWords = id.getKeyWords();
        keyWords.clear();
        for (String keyWord : keyWordList)
            keyWords.add(keyWord);
        return id;
    }

    //===============================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addKeyWordsButton;
    private javax.swing.JComboBox<String> busComboBox;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JComboBox<String> familyComboBox;
    private javax.swing.JTextField manufacturerTxt;
    private javax.swing.JComboBox<String> platformComboBox;
    private javax.swing.JTextField referenceTxt;
    private javax.swing.JRadioButton siteButton;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
    //===============================================================
}
