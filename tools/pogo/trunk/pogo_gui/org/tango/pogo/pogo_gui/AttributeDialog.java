//+======================================================================
//
// Project:   Tango
//
// Description:  Basic Dialog Class to edit attributes.
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

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.util.Vector;

import javax.swing.*;

import fr.esrf.tango.pogo.pogoDsl.*;
import org.tango.pogo.pogo_gui.tools.OAWutils;
import org.tango.pogo.pogo_gui.tools.PopupTable;
import org.tango.pogo.pogo_gui.tools.Utils;

import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;
import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;
import fr.esrf.tangoatk.widget.util.ErrorPane;

//===============================================================
/**
 *	A Dialog Class to get the Attribute parameters.
 */
//===============================================================
public class AttributeDialog extends JDialog implements org.tango.pogo.pogo_gui.PogoConst
{
	private int					retVal = JOptionPane.OK_OPTION;
	private PogoGUI				pogo_gui;
    private InheritanceStatus   orig_status = null;
    private boolean             isDynamic   = false;
	private	int				    poll_period = 0;

    private JRadioButton        dataReadyEvtCode;
    private JRadioButton        changeEvtCode;
    private JRadioButton        changeEvtChecked;
    private JRadioButton        archiveEvtCode;
    private JRadioButton        archiveEvtChecked;

	private Attribute		    attribute;
	private static final String	defaultDataType = AttrDataArray[9];	//	Efault is double

	private static final int	EMPTY_FIELD    = -1;
	private static final int	NEGATIVE_FIELD = -2;
	private static final int	INVALID_FIELD  = -3;


	///===================================================================
	/**
	 * Initializes the Form for creation
     * @param parent    the parent frame object
     * @param attType   attribute type
     * @param isDynamic the created attribute will be a dynamic one
     */
	//===================================================================
	public AttributeDialog(PogoGUI parent, int attType, boolean isDynamic)
	{
		this(parent, null);
        this.isDynamic = isDynamic;
		attrTypeCB.setSelectedIndex(attType);
		updateWindow();
        dynamicLbl.setVisible(isDynamic);
	}
	///===================================================================
	/**
	 * Initializes the Form for edit
     * @param parent    the parent frame object
     * @param attribute specified attribute object
	 */
	//===================================================================
	public AttributeDialog(PogoGUI parent, Attribute attribute)
	{
 		super (parent, true);
		this.pogo_gui  = parent;
		this.attribute = attribute;
        if (attribute!=null) {
            orig_status = attribute.getStatus();
            isDynamic = Utils.isTrue(attribute.getIsDynamic());
        }
		initComponents ();

		initOwnComponents();
		initializeWindow();
        manageInheritanceStatus(attribute);
		pack ();
		ATKGraphicsUtils.centerDialog(this);
	}
	//===================================================================
	/**
	 *	 Add components in window
	 */
	//===================================================================
	private void initOwnComponents()
	{
		//  init combo box
		//-----------------------
        for (String s : AttrDataArray)
            dataTypeCB.addItem(s);
		dataTypeCB.setSelectedItem(defaultDataType);
		for (String s : AttrTypeArray)
            attrTypeCB.addItem(s);
        for (String s : AttrRWtypeArray)
            rwTypeCB.addItem(s);

		//	add components for polling ang and display level
		//	Add radio box for expert/operator
		//-------------------------------------------------------------
        JLabel  lbl;
        int y = 14;
        GridBagConstraints gbc = new GridBagConstraints ();
        lbl = new JLabel("Controlled by : ");
        gbc.gridx = 0;
        gbc.gridy = ++y;
        gbc.insets = new java.awt.Insets(0, 10, 0, 0);
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        definitionPanel.add (lbl, gbc);

        levelBtn = new javax.swing.JRadioButton ();
		levelBtn.setToolTipText(Utils.buildToolTip("Display Level","Expert or Operator"));
		levelBtn.setText (" Expert Only  ");
		gbc.gridx = 1;
		gbc.gridy = y;
        gbc.insets = new java.awt.Insets(0, 0, 0, 0);
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		definitionPanel.add (levelBtn, gbc);

        //  Add Buttons for change event management
        //-------------------------------------------------------------
        lbl = new JLabel("Change Event : ");
        gbc.gridx = 0;
        gbc.gridy = ++y;
        gbc.insets = new java.awt.Insets(10, 10, 0, 0);
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        definitionPanel.add (lbl, gbc);
        changeEvtCode = new JRadioButton ("Pushed by code");
        gbc.gridx = 1;
        gbc.gridy = y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        gbc.insets = new java.awt.Insets(10, 0, 0, 0);
        definitionPanel.add (changeEvtCode, gbc);
        changeEvtCode.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                evtByCodeBtnActionPerformed (evt);
                }
            });

        changeEvtChecked = new JRadioButton ("Event criteria checked by library");
        changeEvtChecked.setSelected(true);
        changeEvtChecked.setVisible(false);
        gbc.gridx = 1;
        gbc.gridy = ++y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        definitionPanel.add (changeEvtChecked, gbc);

        //  Add Buttons for archive event management
        //-------------------------------------------------------------
        lbl = new JLabel("Archive Event : ");
        gbc.gridx = 0;
        gbc.gridy = ++y;
        gbc.insets = new java.awt.Insets(0, 10, 0, 0);
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        definitionPanel.add (lbl, gbc);
        archiveEvtCode = new JRadioButton ("Pushed by code");
        gbc.gridx = 1;
        gbc.gridy = y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        gbc.insets = new java.awt.Insets(0, 0, 0, 0);
        definitionPanel.add (archiveEvtCode, gbc);
        archiveEvtCode.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                evtByCodeBtnActionPerformed (evt);
                }
            });

        archiveEvtChecked = new JRadioButton ("Event criteria checked by library");
        archiveEvtChecked.setSelected(true);
        archiveEvtChecked.setVisible(false);
        gbc.gridx = 1;
        gbc.gridy = ++y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        definitionPanel.add (archiveEvtChecked, gbc);

        //  Add Buttons for DataReady event management
        //-------------------------------------------------------------
        lbl = new JLabel("DataReady Event : ");
        gbc.gridx = 0;
        gbc.gridy = ++y;
        gbc.insets = new java.awt.Insets(0, 10, 0, 0);
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        definitionPanel.add (lbl, gbc);
        dataReadyEvtCode = new JRadioButton ("Pushed by code");
        gbc.gridx = 1;
        gbc.gridy = y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        gbc.insets = new java.awt.Insets(0, 0, 0, 0);
        definitionPanel.add (dataReadyEvtCode, gbc);
        dataReadyEvtCode.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                evtByCodeBtnActionPerformed (evt);
                }
            });


        //	Add radio box btn for attribute polled
		//-------------------------------------------------------------
		polledBtn = new javax.swing.JRadioButton ();
		polledBtn.setToolTipText (Utils.buildToolTip("Attribute polled"));
		polledBtn.setText ("Polled");
		gbc.gridx = 1;
		gbc.gridy = ++y;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
        gbc.insets = new java.awt.Insets(10, 0, 0, 0);
		definitionPanel.add (polledBtn, gbc);
		polledBtn.addActionListener (new java.awt.event.ActionListener () {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				polledBtnActionPerformed (evt);
				}
			});
		
		//	Add components for period polling
		periodLabel = new JLabel("  Polling Period :");
		periodLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		gbc.gridx = 0;
		gbc.gridy = ++y;
        gbc.insets = new java.awt.Insets(0, 0, 0, 0);
		definitionPanel.add (periodLabel, gbc);
		
		periodText = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = y;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		definitionPanel.add (periodText, gbc);
		periodText.setRequestFocusEnabled(true);

		periodUnitLabel = new JLabel(" ms  ");
		gbc.gridx = 2;
		gbc.gridy = y;
		definitionPanel.add (periodUnitLabel, gbc);

		//	Add a dummy label
		gbc.gridx = 1;
		gbc.gridy = ++y;
		definitionPanel.add (new JLabel(" "), gbc);
		setPeriodEnabled(false);

		//	Add radio btn to memorized and memorized int
		//-------------------------------------------------------------
		memorizedBtn = new JRadioButton ();
		memorizedBtn.setToolTipText(Utils.buildToolTip(
                "Attribute memorized",
                "The write attribute value will be stored in database\n"+
                "And at next startup, the write attribute value will\n"+
                 "be set to this stored value."));
		memorizedBtn.setText (" Memorized  ");
		memorizedBtn.setVisible(false);
		gbc.gridx = 0;
		gbc.gridy = ++y;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		definitionPanel.add (memorizedBtn, gbc);
		
		memorizedBtn.addActionListener (new java.awt.event.ActionListener () {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				memorizedBtnActionPerformed (evt);
				}
			});

		memorizedInitBtn = new javax.swing.JRadioButton ();
		memorizedInitBtn.setToolTipText(
                Utils.buildToolTip("Write at init",
                        "At each device initialization\n" +
                        "the write attribute method will be called\n" +
                        "with the value stored in database at previous write."));
		memorizedInitBtn.setText (" Write hardware at init ");
		memorizedInitBtn.setVisible(false);
		gbc.gridx = 1;
		gbc.gridy = y;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		definitionPanel.add (memorizedInitBtn, gbc);
 	}
	//===================================================================
	//===================================================================
    private void evtByCodeBtnActionPerformed(ActionEvent evt)
    {
        Object  o = evt.getSource();
        if (o == changeEvtCode)
            changeEvtChecked.setVisible(changeEvtCode.getSelectedObjects()!=null);
        else
        if (o == archiveEvtCode)
            archiveEvtChecked.setVisible(archiveEvtCode.getSelectedObjects()!=null);
        /*
        else
        if (o == dataReadyEvtCode)
            System.out.println("DataReady Event: "+ (dataReadyEvtCode.getSelectedObjects()!=null));
        */
        pack();
    }
	//===================================================================
	//===================================================================
	private void setPeriodEnabled(boolean state)
	{
		periodLabel.setVisible(state);
		periodText.setVisible(state);
		periodUnitLabel.setVisible(state);
		if (state)
		{
			//	Default value if never set
			String	txt;
			if (poll_period==0)
				txt = "2000";
			else
				txt = "" + poll_period;
			periodText.setText(txt);
			pack();
		}
	}
	//===============================================================
	//===============================================================
    private void manageAbstractOverloadButtons() {

        abstractBtn.setSelected(Utils.isTrue(orig_status.getAbstract()));

        if (isDynamic) {
            overloadBtn.setVisible(false);
            abstractBtn.setVisible(false);
            setEditable(true);
        }
        else
        if (Utils.isTrue(orig_status.getInherited()) ) {
            //  Is inherited (cannot be created as abstract)
            abstractBtn.setVisible(false);
            overloadBtn.setVisible(true);
            //  is Already overloaded
            boolean oveload = Utils.isTrue(orig_status.getConcreteHere());
            overloadBtn.setSelected(oveload);
            setEditable(false);
        }
        else  {
            //  Not inherited -> full edition
            overloadBtn.setVisible(false);
            abstractBtn.setVisible(true);
            abstractBtn.setSelected(Utils.isTrue(orig_status.getAbstract()));
            setEditable(true);
        }
    }
	//===============================================================
	//===============================================================
    private void manageInheritanceStatus(Attribute attribute)
    {
        if (attribute!=null) {
            //	Manage inheritance status
            manageAbstractOverloadButtons();
        }
        else {
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
        if (name!=null)  {
            jcb.removeAllItems();
            jcb.addItem(name);
        }
    }
    //===============================================================
    //===============================================================
    private void setEditable(boolean b)
    {
		nameText.setEditable(b);
        //  if not editable -> get only selected one
        if (!b) {
            setNotEditable(attrTypeCB);
            setNotEditable(dataTypeCB);
            setNotEditable(rwTypeCB);
        }
	}
	//===================================================================
	//===================================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void memorizedBtnActionPerformed (java.awt.event.ActionEvent evt) {

		memorizedInitBtn.setVisible(
			(memorizedBtn.getSelectedObjects()!=null) );
	}
	//===================================================================
	//===================================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void polledBtnActionPerformed (java.awt.event.ActionEvent evt) {
		boolean state = (polledBtn.getSelectedObjects()!=null);
		setPeriodEnabled(state);
		if (state) {
			periodText.selectAll();
			periodText.requestFocus();
		}
	}

	 //===================================================================
	 /** This method is called from within the constructor to
	  * initialize the form.
	  * WARNING: Do NOT modify this code. The content of this method is
	  * always regenerated by the FormEditor.
	  */
	//===================================================================
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JPanel bottomPanel = new javax.swing.JPanel();
        javax.swing.JButton okBtn = new javax.swing.JButton();
        javax.swing.JButton cancelBtn = new javax.swing.JButton();
        javax.swing.JTabbedPane tabbedPane = new javax.swing.JTabbedPane();
        definitionPanel = new javax.swing.JPanel();
        javax.swing.JLabel nameLbl = new javax.swing.JLabel();
        attrTypeCB = new javax.swing.JComboBox();
        javax.swing.JLabel attTypeLbl = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        javax.swing.JLabel dataTypeLbl = new javax.swing.JLabel();
        dataTypeCB = new javax.swing.JComboBox();
        xDataLBL = new javax.swing.JLabel();
        yDataLBL = new javax.swing.JLabel();
        xDataTF = new javax.swing.JTextField();
        yDataTF = new javax.swing.JTextField();
        rwTypeCB = new javax.swing.JComboBox();
        assAttrLBL = new javax.swing.JLabel();
        assAttrTF = new javax.swing.JTextField();
        javax.swing.JLabel rwTypeLBL = new javax.swing.JLabel();
        abstractBtn = new javax.swing.JRadioButton();
        overloadBtn = new javax.swing.JRadioButton();
        javax.swing.JLabel allocateLbl = new javax.swing.JLabel();
        allocateBtn = new javax.swing.JRadioButton();
        dynamicLbl = new javax.swing.JLabel();
        javax.swing.JPanel propertyPanel = new javax.swing.JPanel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        attrPropLabel = new javax.swing.JTextField();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        attrPropUnit = new javax.swing.JTextField();
        attrPropStdUnit = new javax.swing.JTextField();
        attrPropDispUnit = new javax.swing.JTextField();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel15 = new javax.swing.JLabel();
        attrPropFormat = new javax.swing.JTextField();
        attrPropMaxValue = new javax.swing.JTextField();
        attrPropMinValue = new javax.swing.JTextField();
        attrPropMaxAlarm = new javax.swing.JTextField();
        attrPropMinAlarm = new javax.swing.JTextField();
        javax.swing.JLabel jLabel16 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane = new javax.swing.JScrollPane();
        attrPropDescription = new javax.swing.JTextArea();
        javax.swing.JLabel jLabel20 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel21 = new javax.swing.JLabel();
        attrPropDeltaTime = new javax.swing.JTextField();
        attrPropDeltaValue = new javax.swing.JTextField();
        javax.swing.JLabel jLabel22 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel23 = new javax.swing.JLabel();
        attrPropMaxWarning = new javax.swing.JTextField();
        attrPropMinWarning = new javax.swing.JTextField();

        setTitle("Edit Attribute Window");
        setBackground(new java.awt.Color(198, 178, 168));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        bottomPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

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

        definitionPanel.setLayout(new java.awt.GridBagLayout());

        nameLbl.setFont(new java.awt.Font("Arial", 1, 12));
        nameLbl.setText("Attribute name: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        definitionPanel.add(nameLbl, gridBagConstraints);

        attrTypeCB.setFont(new java.awt.Font("Arial", 1, 12));
        attrTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attrTypeCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(attrTypeCB, gridBagConstraints);

        attTypeLbl.setFont(new java.awt.Font("Arial", 1, 12));
        attTypeLbl.setText("Attribute Type: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        definitionPanel.add(attTypeLbl, gridBagConstraints);

        nameText.setFont(new java.awt.Font("Arial", 1, 12));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(nameText, gridBagConstraints);

        dataTypeLbl.setFont(new java.awt.Font("Arial", 1, 12));
        dataTypeLbl.setText("Data Type: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        definitionPanel.add(dataTypeLbl, gridBagConstraints);

        dataTypeCB.setFont(new java.awt.Font("Arial", 1, 12));
        dataTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTypeCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(dataTypeCB, gridBagConstraints);

        xDataLBL.setFont(new java.awt.Font("Arial", 1, 12));
        xDataLBL.setText("Maximum X data size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        definitionPanel.add(xDataLBL, gridBagConstraints);

        yDataLBL.setFont(new java.awt.Font("Arial", 1, 12));
        yDataLBL.setText("Maximum Y data size: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        definitionPanel.add(yDataLBL, gridBagConstraints);

        xDataTF.setFont(new java.awt.Font("Arial", 1, 12));
        xDataTF.setMinimumSize(new java.awt.Dimension(100, 20));
        xDataTF.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(xDataTF, gridBagConstraints);

        yDataTF.setFont(new java.awt.Font("Arial", 1, 12));
        yDataTF.setMinimumSize(new java.awt.Dimension(100, 20));
        yDataTF.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(yDataTF, gridBagConstraints);

        rwTypeCB.setFont(new java.awt.Font("Arial", 1, 12));
        rwTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rwTypeCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(rwTypeCB, gridBagConstraints);

        assAttrLBL.setFont(new java.awt.Font("Arial", 1, 12));
        assAttrLBL.setText("Associated Attribute:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 0);
        definitionPanel.add(assAttrLBL, gridBagConstraints);

        assAttrTF.setFont(new java.awt.Font("Arial", 1, 12));
        assAttrTF.setMinimumSize(new java.awt.Dimension(100, 20));
        assAttrTF.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 3);
        definitionPanel.add(assAttrTF, gridBagConstraints);

        rwTypeLBL.setFont(new java.awt.Font("Arial", 1, 12));
        rwTypeLBL.setText("Read/Write Type: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        definitionPanel.add(rwTypeLBL, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        definitionPanel.add(abstractBtn, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        definitionPanel.add(overloadBtn, gridBagConstraints);

        allocateLbl.setFont(new java.awt.Font("Arial", 1, 12));
        allocateLbl.setText("Allocate:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 10);
        definitionPanel.add(allocateLbl, gridBagConstraints);

        allocateBtn.setFont(new java.awt.Font("Arial", 1, 12));
        allocateBtn.setSelected(true);
        allocateBtn.setText("Read data member");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 3);
        definitionPanel.add(allocateBtn, gridBagConstraints);

        dynamicLbl.setFont(new java.awt.Font("Arial", 1, 12));
        dynamicLbl.setText("Dynamic Attribute (Add/Remove attribute will be done by code)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 15, 0);
        definitionPanel.add(dynamicLbl, gridBagConstraints);

        tabbedPane.addTab("Definition", definitionPanel);

        propertyPanel.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel6.setText("Default Attribute Properties");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        propertyPanel.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel7.setText("Label");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropLabel, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel8.setText("Unit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel9.setText("Standard Unit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel10.setText("Display Unit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropUnit, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropStdUnit, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropDispUnit, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel11.setText("Display Format       ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel12.setText("Max. Value");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel12, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel13.setText("Min. Value");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel13, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel14.setText("Max. Alarm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel14, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel15.setText("Min. Alarm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropFormat, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMaxValue, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMinValue, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMaxAlarm, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMinAlarm, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel16.setText("Description :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel16, gridBagConstraints);

        jScrollPane.setPreferredSize(new java.awt.Dimension(350, 100));

        attrPropDescription.setColumns(80);
        attrPropDescription.setRows(20);
        jScrollPane.setViewportView(attrPropDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        propertyPanel.add(jScrollPane, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel20.setText("Delta time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel20, gridBagConstraints);

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel21.setText("Delta value   ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel21, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropDeltaTime, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropDeltaValue, gridBagConstraints);

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel22.setText("Max Warning");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel22, gridBagConstraints);

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel23.setText("Min Warning");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel23, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMaxWarning, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMinWarning, gridBagConstraints);

        tabbedPane.addTab("Properties", propertyPanel);

        getContentPane().add(tabbedPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

	//==============================================================
	//==============================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

		String	message = null;

		//	Control if Name has been filled.correctly
		String	name = nameText.getText();

		try	{
            boolean overload = overloadBtn.getSelectedObjects()!=null;
			name = Utils.checkNameSyntax(name, false);
			if (pogo_gui.itemAlreadyExists(name, PogoConst.SCALAR_ATTRIBUTE))
				Except.throw_exception("AttributeExists",
						"Attribute \"" + name + "\" Already Exists !",
						"AttributeDislaog.okBtnActionPerformed()");
		}
		catch(DevFailed e) {
			ErrorPane.showErrorMessage(this, null, e);
			return;
		}
		nameText.setText(name);

		//	Control if  xSize and ySize fields have been filled.
		int attrType = attrTypeCB.getSelectedIndex();
		switch(attrType)
		{
		case SCALAR:
			if (rwTypeCB.getSelectedItem().equals("READ_WITH_WRITE")) {
				String  associatedAttribute = assAttrTF.getText();
                if (associatedAttribute.length()==0)
                    message = "READ_WITH_WRITE  attribute must have an associated attribute";
            }
			break;
		case SPECTRUM:
			switch(checkIntField(xDataTF.getText())) {
                case EMPTY_FIELD:
                    message = "Spectrum Attribute needs an X length of data";
                    break;
                case NEGATIVE_FIELD:
                    message = "Spectrum Attribute needs a POSITIVE X length of data";
                    break;
                case INVALID_FIELD:
                    message = "Cannot parse an integer value for X length !";
                    break;
			}
			break;
		case IMAGE:
			switch(checkIntField(xDataTF.getText())) {
                case EMPTY_FIELD:
                    message = "Image Attribute needs an X length of data";
                    break;
                case NEGATIVE_FIELD:
                    message = "Image Attribute needs a POSITIVE X length of data";
                    break;
                case INVALID_FIELD:
                    message = "Cannot parse an integer value for X length !";
                    break;
			}
			switch(checkIntField(yDataTF.getText())) {
                case EMPTY_FIELD:
                    message = "Image Attribute needs an Y length of data";
                    break;
                case NEGATIVE_FIELD:
                    message = "Image Attribute needs a POSITIVE Y length of data";
                    break;
                case INVALID_FIELD:
                    message = "Cannot parse an integer value for Y length !";
                    break;
			}
		}

		//	Check polled period if set
		if (polledBtn.getSelectedObjects()!=null) {
			String strval = periodText.getText();
			try {
				poll_period = Integer.parseInt(strval);
				//	Control if value not too small
				if (poll_period < 20  &&
					poll_period != 0) {	//	if 0 means externally filling mode (by code)

					message = "The polling period minimum value is  " +
									20 + " ms";
				}
			}
			catch (NumberFormatException e) {
				 message = e.toString() + "\n\nBad Value in Polling period field !";
			}
		}
		if (message!=null)
			JOptionPane.showMessageDialog(this,  message, "Error Window",
														JOptionPane.ERROR_MESSAGE);
		else
			doClose(JOptionPane.OK_OPTION);
	}//GEN-LAST:event_okBtnActionPerformed
	//==============================================================
	//==============================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void rwTypeCBActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rwTypeCBActionPerformed
		if (isVisible())
			updateWindow();
	}//GEN-LAST:event_rwTypeCBActionPerformed

	//==============================================================
	//==============================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void dataTypeCBActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTypeCBActionPerformed
		if (isVisible())
			updateWindow();
	}//GEN-LAST:event_dataTypeCBActionPerformed

	//==============================================================
	//==============================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void attrTypeCBActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attrTypeCBActionPerformed
		if (isVisible())
			updateWindow();

		//	Check if JComboBox initialized
		if (rwTypeCB.getItemCount()==0)
			return;
		//	Add/Remove read with write
		String	item = "Tango::"+AttrRWtypeArray[AttrRWtypeArray.length-1];
		switch (attrTypeCB.getSelectedIndex()) {
            case SCALAR:
                if (rwTypeCB.getItemCount() < AttrRWtypeArray.length)
                    rwTypeCB.addItem(item);
                break;
            default:
                if (rwTypeCB.getItemCount()>=AttrRWtypeArray.length)
                    rwTypeCB.removeItem(item);
                break;
		}
	}//GEN-LAST:event_attrTypeCBActionPerformed



	//==============================================================
	//==============================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void cancelBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
		doClose(JOptionPane.CANCEL_OPTION);
	}//GEN-LAST:event_cancelBtnActionPerformed

	//==============================================================
	//==============================================================
	private int checkIntField(String s)
	{
		int	value;
		int end = s.indexOf('.');
		if (end>=0)
			s = s.substring(0, end);

		try {
			if (s.length()==0)
				return EMPTY_FIELD;
			else
			if ((value=Integer.parseInt(s)) < 0)
				return NEGATIVE_FIELD;
			else
				return value;
		}
		catch (NumberFormatException e) {
			return INVALID_FIELD;
		}
	}

	//======================================================
	//======================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
		doClose(JOptionPane.CANCEL_OPTION);
	}//GEN-LAST:event_closeDialog

    //======================================================
    //======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void abstractBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abstractBtnActionPerformed

    }//GEN-LAST:event_abstractBtnActionPerformed

    //======================================================
    //======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void overloadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overloadBtnActionPerformed

    }//GEN-LAST:event_overloadBtnActionPerformed

    //======================================================
    //======================================================    //======================================================
    //======================================================
	private void doClose(int retStatus)
	{
	  retVal = retStatus;
	  setVisible (false);
	  dispose ();
	}

	//======================================================
	//======================================================
	public int showDialog()
	{
		setVisible(true);
		return retVal;
	}
	//======================================================
	//======================================================
	private void setDescriptionText(String desc)
	{
		String	text = Utils.strReplace(desc, "\\n", "\n");
        text = Utils.strReplaceSpecialCharToDisplay(text);
		attrPropDescription.setText(text);
	}
	//======================================================
	/**
	 *	Initialise Window
	 */
	//======================================================
	private void initializeWindow()
	{
        if (attribute==null) {
			return;
        }
		//  Initialize Window with input parameters
		nameText.setText(attribute.getName());
		xDataTF.setText(attribute.getMaxX());
		yDataTF.setText(attribute.getMaxY());
		assAttrTF.setText(attribute.getAssociatedAttr());

		attrTypeCB.setSelectedItem(attribute.getAttType());
		rwTypeCB.setSelectedItem(attribute.getRwType());

        allocateBtn.setVisible(rwTypeCB.getSelectedIndex()!=WRITE);
        allocateBtn.setSelected(Utils.isTrue(attribute.getAllocReadMember()));

		//	Update combo box
		String	dataType =  OAWutils.pogo2tangoType(
				attribute.getDataType().toString());
        if (dataType.equals("State"))
            dataType = "DevState"; //    Sorry.

		for (int i=0 ; i<dataTypeCB.getItemCount() ; i++) {
			String	type = (String)dataTypeCB.getItemAt(i);
			if (type.equals(dataType))
				dataTypeCB.setSelectedIndex(i);
		}
		//	Set the default attribute property values
		AttrProperties	prop = attribute.getProperties();
		if (prop!=null) {
            String  desc = Utils.strReplaceSpecialCharToCode(prop.getDescription());
			setDescriptionText(desc);
			attrPropLabel.setText(prop.getLabel());
			attrPropUnit.setText(prop.getUnit());
			attrPropStdUnit.setText(prop.getStandardUnit());
			attrPropDispUnit.setText(prop.getDisplayUnit());
			attrPropFormat.setText(prop.getFormat());
			attrPropMaxValue.setText(prop.getMaxValue());
			attrPropMinValue.setText(prop.getMinValue());
			attrPropMaxAlarm.setText(prop.getMaxAlarm());
			attrPropMinAlarm.setText(prop.getMinAlarm());
			attrPropMaxWarning.setText(prop.getMaxWarning());
			attrPropMinWarning.setText(prop.getMinWarning());
			attrPropDeltaTime.setText(prop.getDeltaTime());
			attrPropDeltaValue.setText(prop.getDeltaValue());
		}
		//	Update window (what is visible or not)
		updateWindow();

		//	Display level
		if (attribute.getDisplayLevel() != null &&
			attribute.getDisplayLevel().equals(PogoConst.strLevel[PogoConst.EXPERT]))
			levelBtn.setSelected(true);

		//	Check if attribute polled
		setPeriodEnabled(false);
		String	strPeriod = attribute.getPolledPeriod();
		if (strPeriod!=null && strPeriod.length()>0)
		{
			try {
				int	period = Integer.parseInt(strPeriod);
				if (period>0) {
					polledBtn.setSelected(true);
					poll_period = period;
					setPeriodEnabled(true);
				}
			}
			catch (NumberFormatException e) {
				System.err.println(e);
			}
		}

		//	memorized
		if (attribute.getRwType().equals(AttrRWtypeArray[READ_WRITE]) ||
			attribute.getRwType().equals(AttrRWtypeArray[WRITE]) ) {
            
			String	s = attribute.getMemorized();
			if (s!=null && s.equals("true")) {
				memorizedBtn.setSelected(true);
				memorizedInitBtn.setVisible(true);
				s = attribute.getMemorizedAtInit();
				if (s!=null && s.equals("true"))
					memorizedInitBtn.setSelected(true);
			}
		}

        //  Set event fire management
        FireEvents  changeEvents = attribute.getChangeEvent();
        if (changeEvents!=null) {
            changeEvtCode.setSelected(Utils.isTrue(changeEvents.getFire()));
            changeEvtChecked.setVisible(Utils.isTrue(changeEvents.getFire()));
            changeEvtChecked.setSelected(Utils.isTrue(changeEvents.getLibCheckCriteria()));
         }
        FireEvents  archiveEvents = attribute.getArchiveEvent();
        if (archiveEvents!=null) {
            archiveEvtCode.setSelected(Utils.isTrue(archiveEvents.getFire()));
            archiveEvtChecked.setVisible(Utils.isTrue(archiveEvents.getFire()));
            archiveEvtChecked.setSelected(Utils.isTrue(archiveEvents.getLibCheckCriteria()));
        }
        FireEvents  dataReadyEvents = attribute.getDataReadyEvent();
        if (dataReadyEvents!=null) {
            dataReadyEvtCode.setSelected(Utils.isTrue(dataReadyEvents.getFire()));
        }

        if (isDynamic) {
            abstractBtn.setVisible(false);
            overloadBtn.setVisible(false);
        }
        dynamicLbl.setVisible(isDynamic);
	}

  //======================================================
  //======================================================
	public Attribute  getAttribute()
	{
		Attribute	attr = OAWutils.factory.createAttribute();
		attr.setName(nameText.getText().trim());

		String  attType = (String) attrTypeCB.getSelectedItem();
		attr.setAttType(attType);

		attr.setRwType((String) rwTypeCB.getSelectedItem());
        if (rwTypeCB.getSelectedItem().equals("READ_WITH_WRITE")) {
            attr.setAssociatedAttr(assAttrTF.getText().trim());
        }

		String	tangoDataType = (String) dataTypeCB.getSelectedItem();
		Type	pogoDataType  = OAWutils.tango2pogoType(tangoDataType);
		attr.setDataType(pogoDataType);

		attr.setMaxX(xDataTF.getText().trim());
		attr.setMaxY(yDataTF.getText().trim());

		//	Attribute properties
		AttrProperties	prop = OAWutils.factory.createAttrProperties();
		prop.setDescription(attrPropDescription.getText());
		prop.setLabel(attrPropLabel.getText().trim());
		prop.setUnit(attrPropUnit.getText().trim());
		prop.setStandardUnit(attrPropStdUnit.getText().trim());
		prop.setDisplayUnit(attrPropDispUnit.getText().trim());
		prop.setFormat(attrPropFormat.getText().trim());
		prop.setMaxValue(attrPropMaxValue.getText().trim());
		prop.setMinValue(attrPropMinValue.getText().trim());
		prop.setMaxAlarm(attrPropMaxAlarm.getText().trim());
		prop.setMinAlarm(attrPropMinAlarm.getText().trim());
		prop.setMaxWarning(attrPropMaxWarning.getText().trim());
		prop.setMinWarning(attrPropMinWarning.getText().trim());
		prop.setDeltaTime(attrPropDeltaTime.getText().trim());
		prop.setDeltaValue(attrPropDeltaValue.getText().trim());
		attr.setProperties(prop);

		//	Polling period
		if (polledBtn.getSelectedObjects()!=null)
			attr.setPolledPeriod(periodText.getText().trim());

		//	Display level
		if (levelBtn.getSelectedObjects()!=null)
			attr.setDisplayLevel(PogoConst.strLevel[PogoConst.EXPERT]);

		//	memorized
		if (attr.getRwType().equals(AttrRWtypeArray[READ_WRITE]) ||
			attr.getRwType().equals(AttrRWtypeArray[WRITE]) ) {
			if (memorizedBtn.getSelectedObjects()!=null) {
				attr.setMemorized("true");
				if (memorizedInitBtn.getSelectedObjects()!=null)
					attr.setMemorizedAtInit("true");
			}
		}

        //  Is it a dynamic attribute ?
        if (isDynamic) {
            attr.setIsDynamic("true");
        }
        else {
            attr.setIsDynamic("false");

            //	Inheritance status
            if (Utils.isTrue(orig_status.getInherited())) {
                if (overloadBtn.getSelectedObjects()!=null)
                    orig_status.setConcreteHere("true");
                else
                    orig_status.setConcreteHere("false");
            }
            else {
                if (abstractBtn.getSelectedObjects()!=null) {
                    orig_status.setAbstract("true");
                    orig_status.setConcrete("false");
                    orig_status.setConcreteHere("false");
                }
                else {
                    orig_status.setAbstract("false");
                    orig_status.setConcrete("true");
                    orig_status.setConcreteHere("true");
                }
            }
        }
        attr.setStatus(orig_status);
        if (allocateBtn.getSelectedObjects()!=null)
            if (attr.getRwType().equals(AttrRWtypeArray[WRITE]))
                attr.setAllocReadMember("false");
            else
                attr.setAllocReadMember("true");
        else
            attr.setAllocReadMember("false");

        //  Set event fire management
        FireEvents  changeEvents = OAWutils.factory.createFireEvents();
        changeEvents.setFire(
                Utils.strBoolean(changeEvtCode.getSelectedObjects()!=null));
        changeEvents.setLibCheckCriteria(
                Utils.strBoolean(changeEvtChecked.getSelectedObjects()!=null));
        attr.setChangeEvent(changeEvents);

        FireEvents  archiveEvents = OAWutils.factory.createFireEvents();
        archiveEvents.setFire(
                Utils.strBoolean(archiveEvtCode.getSelectedObjects()!=null));
        archiveEvents.setLibCheckCriteria(
                Utils.strBoolean(archiveEvtChecked.getSelectedObjects()!=null));
        attr.setArchiveEvent(archiveEvents);

        FireEvents  dataReadyEvents = OAWutils.factory.createFireEvents();
        dataReadyEvents.setFire(
                Utils.strBoolean(dataReadyEvtCode.getSelectedObjects()!=null));
        dataReadyEvents.setLibCheckCriteria("true");
        attr.setDataReadyEvent(dataReadyEvents);
        return attr;
	}
	//===============================================================
    /**
     * Clone the specified attribute
     * @param srcAttribute  attribute to cloned.
     * @return  the new object copyed from the specied one.
     */
      //===============================================================
      public static Attribute cloneAttribute(Attribute srcAttribute)
      {
          Attribute	newAttribute = OAWutils.cloneAttribute(srcAttribute);

          //	Inheritance status
          //  For a clone item, there is no inheritance.
          InheritanceStatus   inher_status = newAttribute.getStatus();
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
          newAttribute.setStatus(inher_status);
          return newAttribute;
      }
  //======================================================
  /**
   *	Update Window . Depends on attribute type
   */
  //======================================================
    private void updateWindow()
    {
        xDataTF.setVisible(false);
        yDataTF.setVisible(false);
        xDataLBL.setVisible(false);
        yDataLBL.setVisible(false);
        assAttrTF.setVisible(false);
        assAttrLBL.setVisible(false);
        memorizedBtn.setVisible(false);
        memorizedInitBtn.setVisible(false);

        //    Special case for DevEncoded type
        String    dataType = dataTypeCB.getSelectedItem().toString();
        if (dataType.equals("DevEncoded"))
            attrTypeCB.setSelectedIndex(SCALAR);//    Attribute only scalar

        switch(attrTypeCB.getSelectedIndex()) {
            case SCALAR:
                switch(rwTypeCB.getSelectedIndex())
                {
                case READ_WITH_WRITE:
                    assAttrTF.setVisible(true);
                    assAttrLBL.setVisible(true);
                    break;
                case WRITE:
                case READ_WRITE:
                    if (memorizedBtn!=null)
                    {
                        memorizedBtn.setVisible(true);
                        memorizedInitBtn.setVisible(false);
                    }
                    break;
                }
                break;
            case SPECTRUM:
                xDataTF.setVisible(true);
                xDataLBL.setVisible(true);
                break;
            case IMAGE:
                xDataTF.setVisible(true);
                yDataTF.setVisible(true);
                xDataLBL.setVisible(true);
                yDataLBL.setVisible(true);
                break;
            }
            //    Special case for DevEncoded type
            if (dataType.equals("Tango::DEV_ENCODED")) {
                //    Attribute not memorized
                memorizedBtn.setSelected(false);
                memorizedBtn.setVisible(false);
                memorizedInitBtn.setVisible(false);
        }
        allocateBtn.setVisible(rwTypeCB.getSelectedIndex()!=WRITE);

        pack();
    }
  //======================================================

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abstractBtn;
    private javax.swing.JRadioButton allocateBtn;
    private javax.swing.JLabel assAttrLBL;
    private javax.swing.JTextField assAttrTF;
    private javax.swing.JTextField attrPropDeltaTime;
    private javax.swing.JTextField attrPropDeltaValue;
    private javax.swing.JTextArea attrPropDescription;
    private javax.swing.JTextField attrPropDispUnit;
    private javax.swing.JTextField attrPropFormat;
    private javax.swing.JTextField attrPropLabel;
    private javax.swing.JTextField attrPropMaxAlarm;
    private javax.swing.JTextField attrPropMaxValue;
    private javax.swing.JTextField attrPropMaxWarning;
    private javax.swing.JTextField attrPropMinAlarm;
    private javax.swing.JTextField attrPropMinValue;
    private javax.swing.JTextField attrPropMinWarning;
    private javax.swing.JTextField attrPropStdUnit;
    private javax.swing.JTextField attrPropUnit;
    private javax.swing.JComboBox attrTypeCB;
    private javax.swing.JComboBox dataTypeCB;
    private javax.swing.JPanel definitionPanel;
    private javax.swing.JLabel dynamicLbl;
    private javax.swing.JTextField nameText;
    private javax.swing.JRadioButton overloadBtn;
    private javax.swing.JComboBox rwTypeCB;
    private javax.swing.JLabel xDataLBL;
    private javax.swing.JTextField xDataTF;
    private javax.swing.JLabel yDataLBL;
    private javax.swing.JTextField yDataTF;
    // End of variables declaration//GEN-END:variables


	//	Added components.
	private JRadioButton	levelBtn;
	private JRadioButton	polledBtn;
	private JRadioButton	memorizedBtn;
	private JRadioButton	memorizedInitBtn;
	private JLabel			periodLabel;
	private JLabel			periodUnitLabel;
	private JTextField		periodText;

  //======================================================




	//===============================================================
	/*
	 *	Manage the popup summary methods
	 */
	//===============================================================
    private static int[] columnSize = {
            140, 70, 130, 60, 80, 40, 40, 400
    };
    private static String[] columnTitle = {
            "Name",
            "Type",
            "DataType",
            "Size",
            "Level",
            "Inherited",
            "Abstract",
            "Description"
         };
	//===============================================================
	//===============================================================
    public static void popupSummary(JFrame parent, Vector<Attribute> va)
    {
		Vector<Vector<String>>	summary = buildSummary(va);
		String	title = Integer.toString(va.size()) + "  Attributes";

		PopupTable  ppt =
			new PopupTable(parent, title, columnTitle, summary);
		int nb = va.size();
		if (nb>35)	nb = 35;
		ppt.setPreferredSize(columnSize, nb);
		ppt.setVisible(true);
   }
	//===============================================================
	//===============================================================
	private static Vector<Vector<String>> buildSummary(Vector<Attribute> va)
	{
        Vector<Vector<String>>  result = new Vector<Vector<String>>();
		for (Attribute attribute : va)
		{
            Vector<String>  line = new Vector<String>();
			line.add(attribute.getName());
            line.add(attribute.getAttType());
            line.add(OAWutils.pogo2tangoType(attribute.getDataType().toString()));
            if (attribute.getAttType().equals("Scalar"))
                line.add("1");
            else
            if (attribute.getAttType().equals("Spectrum"))
                line.add(attribute.getMaxX());
            else
            if (attribute.getAttType().equals("Image"))
                line.add(attribute.getMaxX()+ " x "+attribute.getMaxY());

			String	level = attribute.getDisplayLevel();
			if (level==null || level.length()==0)
				level = "OPERATOR";
			line.add(level);

            InheritanceStatus	status = attribute.getStatus();
            line.add(Utils.strBoolean(status.getInherited()));
            boolean concreate = Utils.isTrue(status.getConcrete()) ||
                                Utils.isTrue(status.getConcreteHere());
            line.add(""+(!concreate));
 
            AttrProperties  prop = attribute.getProperties();
            line.add(Utils.strReplace(prop.getDescription(), "\\n", "\n"));
			result.add(line);
		}

		return result;
	}
}
