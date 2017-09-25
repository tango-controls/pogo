//+======================================================================
//
// Project:   Tango
//
// Description: java code for parsing utilities.
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

package org.tango.pogo.pogo_gui.tools;


import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;

import javax.swing.*;
import java.awt.*;
import java.util.StringTokenizer;

public class  PogoException extends Exception {
    private String description;
    private StackTraceElement[] stackTraceElements;
    private String origin;
    //===============================================================
    //===============================================================
    public PogoException(String desc) {
        this.description = desc;
        this.origin = getCurrentCodeLine();
    }
    //===============================================================
    /**
     * Returns the current code line (used as origin to throw a PogoException)
     *
     * @return the current code line (used as origin to throw a PogoException)
     */
    //===============================================================
    private String getCurrentCodeLine() {
        //  index 0:    Thread.getTrace()
        //  index 1:    The following line.
        //  index 2:    The PogoException line.
        //  index 3:    the calling line.
        stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[3].toString();
    }
    //===============================================================
    //===============================================================
    public void popup(Component component) {
        ErrorPane   errorPane;
        if (component instanceof JFrame)
            errorPane = new ErrorPane((JFrame)component);
        else
        if (component instanceof JDialog)
            errorPane = new ErrorPane((JDialog)component);
        else
            errorPane = new ErrorPane((JFrame)null);
        ATKGraphicsUtils.centerDialog(errorPane);
        errorPane.setVisible(true);
    }
    //===============================================================
    //===============================================================
    @SuppressWarnings("UnusedDeclaration") //   Externally used by class2www  package
    public void print_exception() {
        System.err.println("PogoException:");
        System.err.println("    Description: "+ description);
        System.err.println("    Origin:      "+ origin);
    }
    //===============================================================
    //===============================================================
    public void printStackTrace() {
        StringBuilder   sb = new StringBuilder(description +"\n");
        int  i=0;
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            if (i++>0 && !stackTraceElement.toString().contains("PogoException"))
                sb.append(stackTraceElement).append("\n");
        }
        System.err.println(sb);
    }
    //===============================================================
    //===============================================================
    public static void popup(Component component, Exception exception) {
        popup(component, exception.toString());
    }
    //===============================================================
    //===============================================================
    public static void popup(Component component, String message) {
        PogoException   pogoException = new PogoException(message);
        pogoException.popup(component);
    }
    //===============================================================
    //===============================================================
    public String getMessage() {
        return "PogoException: " + description;
    }
    //===============================================================
    //===============================================================
    public String toString() {
        return "PogoException: " + description;
    }
    //===============================================================
    //===============================================================



    //===============================================================
    //===============================================================
    private class ErrorPane extends JDialog {

        private JTextArea descriptionText;
        private JScrollPane stackScrollPane;
        private JTextArea stackText;
        //===========================================================
        private ErrorPane(JFrame frame) {
            super(frame, true);
            initComponents();
            displayError();
        }
        //===========================================================
        private ErrorPane(JDialog dialog) {
            super(dialog, true);
            initComponents();
            displayError();
        }
        //===========================================================
        private void displayError() {
            StringBuilder   sb = new StringBuilder("\n");

            //  Split description to know lines number
            StringTokenizer stk = new StringTokenizer(description, "\n");
            while (stk.hasMoreTokens()) {
                String  line = stk.nextToken();
                sb.append(line).append(" \n");
            }
            descriptionText.setText(sb.toString());
            descriptionText.setRows(2 + stk.countTokens());

            //  Display stack trace (without PogoException related lines)
            sb = new StringBuilder(description +"\n");
            int  i=0;
            for (StackTraceElement stackTraceElement : stackTraceElements) {
                if (i++>0 && !stackTraceElement.toString().contains("PogoException"))
                    sb.append(stackTraceElement).append("\n");
            }
            stackText.setText(sb.toString());

            //  Fix stack display size
            int rows = stackTraceElements.length;
            if (rows>25)    rows = 25;
            stackText.setRows(rows);
            pack();
        }
        //===========================================================
        private void initComponents() {

            setTitle("PogoException");
            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    closeDialog();
                }
            });

            //  create description and icon area
            descriptionText = new JTextArea();
            descriptionText.setEditable(false);
            descriptionText.setFont(new Font("Dialog", Font.BOLD, 14));
            descriptionText.setBackground(getContentPane().getBackground());

            //  Add them in a top panel
            JPanel topPanel = new JPanel();
            topPanel.setLayout(new java.awt.BorderLayout());
            topPanel.add(new JLabel(Utils.getInstance().errorIcon), BorderLayout.WEST);
            topPanel.add(descriptionText, BorderLayout.CENTER);
            getContentPane().add(topPanel, BorderLayout.NORTH);

            //  Add stack area
            stackText = new JTextArea();
            stackText.setEditable(false);
            stackScrollPane = new JScrollPane();
            stackScrollPane.setViewportView(stackText);
            stackScrollPane.setVisible(false);
            getContentPane().add(stackScrollPane, java.awt.BorderLayout.CENTER);

            //  Add 2 buttons
            JPanel bottomPanel = new JPanel();
            JButton okButton = new JButton("OK");
            okButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cancelBtnActionPerformed();
                }
            });
            bottomPanel.add(okButton);

            JButton detailsBtn = new JButton("Details...");
            detailsBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    detailsBtnActionPerformed();
                }
            });
            bottomPanel.add(detailsBtn);
            getContentPane().add(bottomPanel, java.awt.BorderLayout.SOUTH);
        }

        //===========================================================
        private void detailsBtnActionPerformed() {
            stackScrollPane.setVisible(!stackScrollPane.isVisible());
            pack();
        }
        //===========================================================
        private void cancelBtnActionPerformed() {
            setVisible(false);
            dispose();
        }
        //==========================================================
        private void closeDialog() {
            setVisible(false);
            dispose();
        }
    }
    //===============================================================
    //===============================================================
}
