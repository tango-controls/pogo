//+======================================================================
//
// Project:   Tango
//
// Description:  Basic Dialog Class to display inheritance.
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


import org.tango.pogo.pogo_gui.tools.Utils;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


//===============================================================

/**
 * A JPanel to draw an inheritance diagram
 */
//===============================================================

class InheritancePanel extends JPanel {
    private List<JTextPane> textPanes = new ArrayList<>();
    private PogoGUI gui = null;
    private long t0 = 0;

    private static final Color classBtnBG = new java.awt.Color(255, 230, 200);
    private static final Color selectedClassBtnBG = new java.awt.Color(255, 150, 100);
    private static final String deviceImpl = "Tango DeviceImpl";

    //===============================================================
    //===============================================================
    public InheritancePanel(DeviceClass devclass) {
        setLayout(new java.awt.GridBagLayout());
        addAncestorPanes(devclass);
    }

    //===============================================================
    //===============================================================
    public InheritancePanel(DeviceClass devclass, PogoGUI gui) {
        this.gui = gui;
        setLayout(new java.awt.GridBagLayout());
        addAncestorPanes(devclass);
    }

    //===============================================================
    //===============================================================
    private void addInheritanceIcon(int y) {
        GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = y;
        JLabel lbl = new JLabel("");
        lbl.setIcon(Utils.getInstance().inheritanceIcon);
        add(lbl, gbc);
    }

    //===============================================================
    //===============================================================
    private void addClassPane(DeviceClass dc, int y, boolean addInher) {
        GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = y;

        //	Build pane for class
        ClassPane cp = new ClassPane(dc);
        if (gui != null)
            cp.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    textPaneMouseClicked(evt);
                }
            });

        //	and store instance
        add(cp, gbc);
        textPanes.add(cp);
        if (addInher)
            addInheritanceIcon(y + 1);
    }

    //===============================================================
    //===============================================================
    private void addAncestorPanes(DeviceClass dc) {
        List<DeviceClass> ancestors = dc.getAncestors();
        int y = 0;
        addClassPane(null, y += 2, true);
        //for (int i=ancestors.size()-1 ; i>=0 ; i--)
        for (DeviceClass ancestor : ancestors)
            addClassPane(ancestor, y += 2, true);
        y += 2;
        addClassPane(dc, y, false);

        //	Set last one looks like selected.
        textPanes.get(textPanes.size() - 1).setBackground(selectedClassBtnBG);
    }
    //===============================================================
    /**
     * Set GUI panel selection as clicked JTextPane
     *
     * @param evt the mouse event to retrieve which component as been clicked
     */
    //===============================================================
    private void textPaneMouseClicked(java.awt.event.MouseEvent evt) {
        JTextPane tp = (JTextPane) evt.getSource();
        String classname = tp.getName();

        if (classname.equals(deviceImpl)) {
            //  Check if double click
            long t = evt.getWhen();
            if (t - t0 < 1000)
                if (JOptionPane.showConfirmDialog(this,
                        "Launch a WEB browser on DeviceImpl documentation ?",
                        "Confirmation Window",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    Utils.showInHtmBrowser(PogoConst.tangoHTTP[PogoConst.KERNEL_PAGES]);
                }
            t0 = t;
            return;
        }
        boolean found = false;
        for (ClassPanel panel : gui.getClassPanels())
            if (panel.getName().equals(classname)) {
                found = true;
                gui.setTabbedPaneSelection(panel);
            }

        //  Cannot found if DeviceImpl
        if (found)
            for (JTextPane pane : textPanes)
                if (pane == tp)
                    pane.setBackground(selectedClassBtnBG);
                else
                    pane.setBackground(classBtnBG);
    }
    //===============================================================
    /**
     * set JTextPane selected as the GUI panel one
     *
     * @param name selected GUI panel containing edited class
     */
    //===============================================================
    public void setSelected(String name) {
        for (JTextPane b : textPanes)
            if (b.getName().equals(name))
                b.setBackground(selectedClassBtnBG);
            else
                b.setBackground(classBtnBG);
    }
    //===============================================================
    //===============================================================


    //===============================================================
    /**
     * A little class inherited from JTextPane to represent
     * a DeviceClass Object as aButton.
     */
    //===============================================================
    private class ClassPane extends JTextPane {
        private DeviceClass devClass;

        //============================================================
        //============================================================
        private ClassPane(DeviceClass dc) {
            devClass = dc;
            String classname;
            if (dc == null)
                classname = deviceImpl;
            else
                classname = devClass.getPogoDeviceClass().getName();
            setEditable(false);
            setName(classname);
            setFont(new Font("monospaced", Font.BOLD, 10));
            setBackground(classBtnBG);
            insertIcon(Utils.getInstance().classIcon);
            setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));


            String path = null;
            if (devClass == null)
                setToolTipText(Utils.buildToolTip("TANGO DeviceImpl model",
                        "See: " + PogoConst.tangoHTTP[PogoConst.KERNEL_PAGES]));
            else if (devClass.getPogoDeviceClass() != null)
                if (devClass.getPogoDeviceClass().getDescription() != null)
                    path = devClass.getPogoDeviceClass().getDescription().getSourcePath();

            if (path != null)
                setToolTipText(Utils.buildToolTip(
                        devClass.getPogoDeviceClass().getName(), "Read at: " + path));


            //	Display classname and few commands
            showMsg(" " + classname + " ", true);
            showMsg("\n + State\n + Status\n + ---", false);
        }
        //============================================================
        /**
         * Insert the message in the TextPane with its attributes
         *
         * @param msg   message to be displayed
         * @param title format as title if true
         */
        //============================================================
        private void showMsg(String msg, boolean title) {
            Document doc = getDocument();
            SimpleAttributeSet attrs = new SimpleAttributeSet();
            int fs = StyleConstants.getFontSize(attrs);

            try {
                StyleConstants.setBold(attrs, title);
                StyleConstants.setUnderline(attrs, title);

                if (title) {
                    StyleConstants.setFontSize(attrs, fs + 2);
                } else {
                    StyleConstants.setFontSize(attrs, fs - 2);
                }
                doc.insertString(doc.getLength(), msg, attrs);
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
    }
    //===============================================================
    //===============================================================
}
