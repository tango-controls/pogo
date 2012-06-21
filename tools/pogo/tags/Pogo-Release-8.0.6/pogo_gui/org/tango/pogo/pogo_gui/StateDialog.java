//+======================================================================
//
// Project:   Tango
//
// Description:  java source code for State swing class.
//
// $Author: verdier $
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

import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;
import fr.esrf.TangoDs.TangoConst;
import fr.esrf.tango.pogo.pogoDsl.InheritanceStatus;
import fr.esrf.tango.pogo.pogoDsl.State;
import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;
import fr.esrf.tangoatk.widget.util.ErrorPane;
import org.tango.pogo.pogo_gui.tools.OAWutils;
import org.tango.pogo.pogo_gui.tools.PopupTable;
import org.tango.pogo.pogo_gui.tools.Utils;

import javax.swing.*;
import java.util.ArrayList;


//===============================================================

/**
 * A Dialog Class to get the State parameters.
 */
//===============================================================
public class StateDialog extends JDialog {
    private JTextArea descText;
    private JComboBox typeComboBox;
    private PogoGUI pogo_gui;
    private InheritanceStatus orig_status;
    private int retVal = JOptionPane.OK_OPTION;
    //===============================================================

    /**
     * Initializes the Form
     *
     * @param parent the parent object
     * @param state  the state to be edited
     */
    //===============================================================
    public StateDialog(PogoGUI parent, State state) {
        super(parent, true);
        pogo_gui = parent;
        initComponents();
        //  init combo boxe
        for (String stateName : TangoConst.Tango_DevStateName)
            typeComboBox.addItem(stateName);
        setState(state);

        manageInheritanceStatus(state);
        pack();
        ATKGraphicsUtils.centerDialog(this);
    }

    //===============================================================
    //===============================================================
    private void manageInheritanceStatus(State state) {
        if (state != null) {
            //	Manage inheritance status
            orig_status = state.getStatus();

            if (Utils.isTrue(orig_status.getInherited())) {
                setEditable(false);
            } else
                setEditable(true);
        } else {
            orig_status = OAWutils.factory.createInheritanceStatus();
            orig_status.setAbstract("false");
            orig_status.setInherited("false");
            orig_status.setConcrete("true");
            orig_status.setConcreteHere("true");
        }
    }

    //===============================================================
    //===============================================================
    private void setNotEditable(JComboBox jcb) {
        String name = (String) jcb.getSelectedItem();
        if (name != null) {
            jcb.removeAllItems();
            jcb.addItem(name);
        }
    }

    //===============================================================
    //===============================================================
    private void setEditable(boolean b) {
        //  if not editable -> get only selected one
        if (!b)
            setNotEditable(typeComboBox);
    }
    //===============================================================

    /**
     * This method is called from within the constructor to
     * initialize the form.
     */
    //===============================================================
    private void initComponents() {
        setBackground(new java.awt.Color(198, 178, 168));
        setTitle("Edit State Window");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        getContentPane().setLayout(new java.awt.BorderLayout());

        JPanel jPanel1 = new javax.swing.JPanel();
        jPanel1.setLayout(new java.awt.FlowLayout(2, 5, 5));

        JButton okBtn = new javax.swing.JButton();
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        jPanel1.add(okBtn);

        JButton cancelBtn = new javax.swing.JButton();
        cancelBtn.setText("Cancel");
        cancelBtn.setActionCommand("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn);

        getContentPane().add(jPanel1, "South");

        JPanel centerPanel = new javax.swing.JPanel();
        centerPanel.setLayout(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gbc;

        JLabel nameLbl = new javax.swing.JLabel();
        nameLbl.setText("State Name:    ");
        nameLbl.setForeground(java.awt.Color.black);
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        centerPanel.add(nameLbl, gbc);

        JLabel jLabel5 = new javax.swing.JLabel();
        jLabel5.setText(" ");
        jLabel5.setForeground(java.awt.Color.black);
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        centerPanel.add(jLabel5, gbc);

        JLabel jLabel6 = new javax.swing.JLabel();
        jLabel6.setText("State Description:  ");
        jLabel6.setForeground(java.awt.Color.black);
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        centerPanel.add(jLabel6, gbc);

        descText = new javax.swing.JTextArea();
        descText.setColumns(80);
        descText.setPreferredSize(new java.awt.Dimension(1000, 400));
        descText.setMinimumSize(new java.awt.Dimension(0, 100));

        //	Added by hand due to forte backward compatibility problem.
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new java.awt.Dimension(500, 150));
        scrollPane.setViewportView(descText);

        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.gridheight = 5;
        gbc.fill = java.awt.GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        centerPanel.add(scrollPane, gbc);

        typeComboBox = new javax.swing.JComboBox();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        centerPanel.add(typeComboBox, gbc);

        getContentPane().add(centerPanel, "Center");
    }


    //======================================================
    //======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {
        doClose(JOptionPane.CANCEL_OPTION);
    }

    //======================================================
    //======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            //	Check if not already defined.
            String name = typeComboBox.getSelectedItem().toString();
            if (pogo_gui.itemAlreadyExists(name, PogoConst.STATES))
                Except.throw_exception("StateExists",
                        "State \"" + name + "\" Already Exists !",
                        "StateDialog.okBtnActionPerformed()");

            doClose(JOptionPane.OK_OPTION);
        } catch (DevFailed e) {
            ErrorPane.showErrorMessage(this, null, e);
        }
    }

    //======================================================
    //======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void closeDialog(java.awt.event.WindowEvent evt) {
        doClose(JOptionPane.CANCEL_OPTION);
    }

    //======================================================
    //======================================================
    private void doClose(int retVal) {
        this.retVal = retVal;
        setVisible(false);
        dispose();
    }

    //======================================================
    //======================================================
    private void setState(State state) {
        if (state != null) {
            //  Initialize Window with input parameters
            for (String stateName : TangoConst.Tango_DevStateName)
                if (stateName.equals(state.getName()))
                    typeComboBox.setSelectedItem(stateName);

            descText.setText(state.getDescription());
        }
    }

    //======================================================
    //======================================================
    public int showDialog() {
        setVisible(true);
        return retVal;
    }

    //======================================================
    //======================================================
    public State getState() {
        State state = OAWutils.factory.createState();
        state.setName(typeComboBox.getSelectedItem().toString());
        state.setDescription(descText.getText());
        //	Inheritance status
        state.setStatus(orig_status);
        return state;
    }

    //===============================================================
    //===============================================================
    public static State cloneState(State srcState) {
        State newState = OAWutils.cloneState(srcState);

        //	Inheritance status
        //  For a clone item, there is no inheritance.
        InheritanceStatus inher_status = newState.getStatus();
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
        newState.setStatus(inher_status);
        return newState;
    }
    //======================================================
    //======================================================


    //===============================================================
    /*
      *	Manage the popup summary methods
      */
    //===============================================================
    private static int[] columnSize = {
            140, 40, 400
    };
    private static String[] columnTitle = {
            "Name",
            "Inherited",
            "Description"
    };

    //===============================================================
    //===============================================================
    public static void popupSummary(JFrame parent, ArrayList<State> vs) {
        ArrayList<ArrayList<String>> summary = buildSummary(vs);
        String title = Integer.toString(vs.size()) + "  States";

        PopupTable ppt =
                new PopupTable(parent, title, columnTitle, summary);
        ppt.setPreferredSize(columnSize, vs.size());
        ppt.setVisible(true);
    }

    //===============================================================
    //===============================================================
    private static ArrayList<ArrayList<String>> buildSummary(ArrayList<State> vs) {
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        for (State state : vs) {
            ArrayList<String> line = new ArrayList<String>();
            line.add(state.getName());
            InheritanceStatus status = state.getStatus();
            line.add(Utils.strBoolean(status.getInherited()));
            line.add(Utils.strReplace(state.getDescription(), "\\n", "\n"));
            result.add(line);
        }

        return result;
    }
}
