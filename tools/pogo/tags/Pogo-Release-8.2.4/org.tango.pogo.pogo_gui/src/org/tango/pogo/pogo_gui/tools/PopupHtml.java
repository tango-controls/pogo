//+======================================================================
//
// Project:   Tango
//
// Description:	java source code to popup a simple HTML viewer.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013
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

package org.tango.pogo.pogo_gui.tools;


import fr.esrf.TangoDs.TangoConst;
import fr.esrf.tangoatk.widget.util.ErrorPane;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Class Description:
 * This class display a dialog with a list of command to be send to
 * the selected server.
 *
 * @author verdier
 */

public class PopupHtml extends JDialog implements TangoConst {

    protected JFrame parent;
    protected JEditorPane pane;
    private String urlFile;

    private static final String header =
            "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 3.2//EN\">\n" +
                    "<HTML>\n" +
                    "<HEAD>\n" +
                    "<Title> title </Title>\n" +
                    "</HEAD>\n" +
                    "<BODY TEXT=\"#000000\" BGCOLOR=\"#FFFFFF\" LINK=\"#0000FF\" VLINK=\"#7F00FF\" ALINK=\"#FF0000\">\n" +
                    "<P><!-------TITLE------></P>\n";
    private static final String footer =
            "</Body>\n" +
                    "</Html>\n";

    //===============================================================

    /**
     * Initializes the Form
     *
     * @param parent the parent form instance
     */
    //===============================================================
    public PopupHtml(JFrame parent) {
        super(parent, true);
        initComponents();

        this.parent = parent;
        pack();

        if (parent != null && parent.isVisible() && parent.getWidth() > 0) {
            Point p = parent.getLocationOnScreen();
            p.x += 10;
            p.y += 10;
            setLocation(p);
        }
    }

    //===============================================================

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    //===============================================================
    private void initComponents() {//GEN-BEGIN:initComponents
        javax.swing.JPanel jPanel1;
        javax.swing.JLabel jLabel1;
        javax.swing.JButton cancelBtn;
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        setBackground(new java.awt.Color(198, 178, 168));
        setTitle("");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setLayout(new java.awt.FlowLayout(2, 5, 5));

        jLabel1.setText("                     ");
        jPanel1.add(jLabel1);

        cancelBtn.setText("Dismiss");
        cancelBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dismissBtnActionPerformed(evt);
            }
        });

        jPanel1.add(cancelBtn);
        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

    }

    //======================================================
    //======================================================
    protected synchronized void setPage(URL url) {
        try {
            //	And Try to display page
            pane.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            pane.setPage(url);
        } catch (IOException e) {
            ErrorPane.showErrorMessage(parent, null, e);
        }
        pane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    //======================================================
    //======================================================
    private String buildTmpFile(String code) {
        String urlstr = null;
        try {
            int random_value = new java.util.Random().nextInt(30000);
            String tmpdir = System.getProperty("java.io.tmpdir");
            urlFile = tmpdir + "/html." + random_value;
            ParserTool.writeFile(urlFile, header + code + footer);

            urlstr = "file:" + urlFile;
        } catch (Exception e) {
            ErrorPane.showErrorMessage(parent, null, e);
            e.printStackTrace();
        }
        return urlstr;
    }

    //======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void closeDialog(java.awt.event.WindowEvent evt) {
        doClose();
    }

    //======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void dismissBtnActionPerformed(java.awt.event.ActionEvent evt) {
        doClose();
    }

    //======================================================
    private void doClose() {
        try {
            if (!new File(urlFile).delete())
                System.err.println("Cannot delete " + urlFile);
        } catch (Exception e) {
            ErrorPane.showErrorMessage(parent, null, e);
        }
        setVisible(false);
        dispose();
    }
    //======================================================

    /**
     * Show the dialog window.
     *
     * @param code an URL address or HTML page source code.
     */
    //======================================================
    public void show(String code) {
        show(code, 700, 750);
    }
    //======================================================

    /**
     * Show the dialog window.
     *
     * @param code   an URL address or HTML page source code.
     * @param width  dialog size
     * @param height dialog size
     */
    //======================================================
    public void show(String code, int width, int height) {
        try {
            pane = new JEditorPane();
            pane.setEditable(false);
            //	add an hyperlink listener
            pane.addHyperlinkListener(new HyperlinkListener() {
                public void hyperlinkUpdate(HyperlinkEvent evt) {
                }
            });
            getContentPane().add(new JScrollPane(pane), java.awt.BorderLayout.CENTER);
            setSize(width, height);

            URL url = new URL(buildTmpFile(code));
            setPage(url);
        } catch (IOException e) {
            e.printStackTrace(System.err);
            return;
        }
        setVisible(true);
    }


    //===============================================================
    //===============================================================
    public static void main(String args[]) {
        //new PopupHtml(new JFrame()).show(admin.astor.ReleaseNote.str, 400, 200);
    }
}
