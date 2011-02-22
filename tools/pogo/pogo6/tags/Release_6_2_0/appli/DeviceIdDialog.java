//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  Basic Dialog Class to display info
//
// $Author$
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009
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
// $Revision$
//
// $Log$
//
//-======================================================================

package pogo.appli;


import pogo.gene.*;

import java.io.File;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Point;


//===============================================================
/**
 *	JDialog Class to display and get device identification
 *
 *	@author  Pascal Verdier
 */
//===============================================================

public class DeviceIdDialog extends JDialog
{
	private JFrame	parent;
	private int		retVal = JOptionPane.OK_OPTION;
	private boolean exit_on_close;
	private String	classname = "";
	private static final String	HelpMessage = 
		"During TANGO meeting in Kobe (Japan)\n"+
		"It has been decided to create a\n" +
		"device class identification for all TANGO classes.\n\n" +
		"The goal of this device class identification\n" +
		"is to sort and find class by key words.\n\n" +
		"Do not be afraid to be spammed,\n" +
		"the email for contact will not appear clearly in html pages";

	//===============================================================
	/**
	 *	Creates new form DeviceIdDialog
	 */
	//===============================================================
	public DeviceIdDialog(JFrame parent, String classname, boolean exit_on_close)
	{
		super(parent, true);
		this.parent    = parent;
		this.classname = classname;
		this.exit_on_close = exit_on_close;
		initComponents();
        
		familyComboBox.setModel(new DefaultComboBoxModel(DeviceIdProperties.classFamilies));
		platformComboBox.setModel(new DefaultComboBoxModel(DeviceIdProperties.platformNames));
		busComboBox.setModel(new DefaultComboBoxModel(DeviceIdProperties.busNames));
		if (DeviceIdProperties.siteName!=null          &&
			DeviceIdProperties.siteName.length()>0     &&
			DeviceIdProperties.siteClassFamilies!=null &&
			DeviceIdProperties.siteClassFamilies.length>0 )
		{
			siteButton.setText("Specific " + DeviceIdProperties.siteName);
		}
		else
			siteButton.setVisible(false);

		//	Add a little help button
		topPanel.add(new javax.swing.JLabel("        "));
		javax.swing.JButton	btn = new javax.swing.JButton("Help");
		btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });
		topPanel.add(btn);

		//	Fill email field if possible
		String mail = System.getenv("EMAIL");
		if (mail!=null)
			contactTxt.setText(mail);
		manufacturerTxt.setText("none");
        
		if (classname!=null && classname.length()>0)
			titleLabel.setText(classname+" Class Identification");

		pack();
		centerWindow();
		setReferenceVisible(false);
	}
	//===============================================================
	/**
	 *	Creates new form DeviceIdDialog
	 */
	//===============================================================
	public DeviceIdDialog(JFrame parent, DeviceID id, boolean exit_on_close)
	{
		this(parent, id.classname, exit_on_close);
		
		if (id!=null)
		{
			//	Set fields from ID
			if (siteButton.isVisible()  &&
				DeviceIdProperties.siteName != null &&
				id.site.equals(DeviceIdProperties.siteName))
			{
				siteButton.setSelected(true);
				familyComboBox.setModel(new DefaultComboBoxModel(DeviceIdProperties.siteClassFamilies));
			}

			contactTxt.setText(id.contact);
			platformComboBox.setSelectedItem(id.platform);
			familyComboBox.setSelectedItem(id.family);
			busComboBox.setSelectedItem(id.bus);
			manufacturerTxt.setText(id.manufacturer);
			referenceTxt.setText(id.reference);
			setReferenceVisible(id.manufacturer.length()>0 &&
								 id.manufacturer.equals("none")==false);

		}
	}
	//===============================================================
	//===============================================================
	private void centerWindow()
	{
		if (parent.isVisible())
			PogoAppli.centerDialog(this, parent);
		else
		{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Dimension scrsize = toolkit.getScreenSize();
			Dimension appsize = getSize();
			Point	p = new Point();
			p.x = (scrsize.width  - appsize.width)/2;
			p.y = (scrsize.height - appsize.height)/2;
			setLocation(p);
		}
	}
	//===============================================================
	//===============================================================
	private void setReferenceVisible(boolean b)
	{
		referenceTxt.setVisible(b);
		referenceLabel.setVisible(b);
	}
	//===============================================================
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
	//===============================================================
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bottomPanel = new javax.swing.JPanel();
        okBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        topPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        contactLabel = new javax.swing.JLabel();
        platformLabel = new javax.swing.JLabel();
        busLabel = new javax.swing.JLabel();
        manufacturerLabel = new javax.swing.JLabel();
        referenceLabel = new javax.swing.JLabel();
        contactTxt = new javax.swing.JTextField();
        manufacturerTxt = new javax.swing.JTextField();
        referenceTxt = new javax.swing.JTextField();
        platformComboBox = new javax.swing.JComboBox();
        busComboBox = new javax.swing.JComboBox();
        familyComboBox = new javax.swing.JComboBox();
        familyLabel = new javax.swing.JLabel();
        siteButton = new javax.swing.JRadioButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

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

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 18));
        titleLabel.setText("Device Class Identification");
        topPanel.add(titleLabel);

        getContentPane().add(topPanel, java.awt.BorderLayout.NORTH);

        centerPanel.setLayout(new java.awt.GridBagLayout());

        contactLabel.setText("Contact email *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        centerPanel.add(contactLabel, gridBagConstraints);

        platformLabel.setText("Platform *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        centerPanel.add(platformLabel, gridBagConstraints);

        busLabel.setText("Bus *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        centerPanel.add(busLabel, gridBagConstraints);

        manufacturerLabel.setText("Manufacturer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        centerPanel.add(manufacturerLabel, gridBagConstraints);

        referenceLabel.setText("Product Reference");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 20, 0);
        centerPanel.add(referenceLabel, gridBagConstraints);

        contactTxt.setColumns(20);
        contactTxt.setFont(new java.awt.Font("Dialog", 1, 12));
        contactTxt.setToolTipText("Programmer or contact email address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 20);
        centerPanel.add(contactTxt, gridBagConstraints);

        manufacturerTxt.setColumns(20);
        manufacturerTxt.setFont(new java.awt.Font("Dialog", 1, 12));
        manufacturerTxt.setToolTipText("manufacturer name");
        manufacturerTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manufacturerTxtKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 20);
        centerPanel.add(manufacturerTxt, gridBagConstraints);

        referenceTxt.setColumns(20);
        referenceTxt.setFont(new java.awt.Font("Dialog", 1, 12));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 20);
        centerPanel.add(referenceTxt, gridBagConstraints);

        platformComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Platforms", "Unix Like", "Windows" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 20);
        centerPanel.add(platformComboBox, gridBagConstraints);

        busComboBox.setEditable(true);
        busComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Not Applicable", "Compact PCI", "Data Socket", "Ethernet", "FireWire", "GPIB", "Modbus", "PCI", "PCI Express", "Serial Line", "Socket", "TCP/UDP", "USB", "VME" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 20);
        centerPanel.add(busComboBox, gridBagConstraints);

        familyComboBox.setEditable(true);
        familyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Miscellaneous", "AbstractClasses", "Acquisition", "Application", "BeamDiag", "Calculation", "Communication", "Controllers", "InputOutput", "Instrumentation", "Interlock", "Motion", "PowerSupply", "Process", "RadioProtection", "Sequencer", "Simulators", "Training", "Vacuum" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 20);
        centerPanel.add(familyComboBox, gridBagConstraints);

        familyLabel.setText("Class family *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        centerPanel.add(familyLabel, gridBagConstraints);

        siteButton.setText("Site");
        siteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        centerPanel.add(siteButton, gridBagConstraints);

        getContentPane().add(centerPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

	//===============================================================
	//===============================================================	//===============================================================
	private void manufacturerTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manufacturerTxtKeyReleased

		String	s = manufacturerTxt.getText();
		setReferenceVisible(s.length()>0 && s.equals("none")==false);
	}//GEN-LAST:event_manufacturerTxtKeyReleased
	//===============================================================
	//===============================================================
	void writeFile(String filename)
	{
		try
		{
			pogo.gene.PogoUtil.writeFile(filename, getInputs().toString());
		}
		catch(Exception e)
		{
            app_util.PopupError.show(this, e);
		}
	}
	//===============================================================
	//===============================================================
	private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

		try
		{
			checkInputs();
			if (exit_on_close)
			{
				writeFile(DeviceID.getFilename(""));
				app_util.PopupMessage.show(this,
					DeviceID.getFilename("") + "   generated.");
			}
		}
		catch (Exception e)
		{
            app_util.PopupError.show(this, e);
			return;
		}

		retVal = JOptionPane.OK_OPTION;
		doClose();
	}//GEN-LAST:event_okBtnActionPerformed

	//===============================================================
	//===============================================================
	private void helpBtnActionPerformed(java.awt.event.ActionEvent evt)
	{
		app_util.PopupMessage.show(this, HelpMessage);
	}
	//===============================================================
	//===============================================================
	private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
		retVal = JOptionPane.CANCEL_OPTION;
		doClose();
	}//GEN-LAST:event_cancelBtnActionPerformed

	//===============================================================
	/**
	 *	Closes the dialog
	 */
	//===============================================================
	private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
		retVal = JOptionPane.CANCEL_OPTION;
		doClose();
	}//GEN-LAST:event_closeDialog

	//===============================================================
	//===============================================================
	private void siteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteButtonActionPerformed

		String	family = (String)familyComboBox.getSelectedItem();

		if (siteButton.getSelectedObjects()==null)
			familyComboBox.setModel(new DefaultComboBoxModel(DeviceIdProperties.classFamilies));
		else
			familyComboBox.setModel(new DefaultComboBoxModel(DeviceIdProperties.siteClassFamilies));

			familyComboBox.setSelectedItem(family);

	}//GEN-LAST:event_siteButtonActionPerformed
	//===============================================================
	//===============================================================



	//===============================================================
	/**
	 *	Closes the dialog
	 */
	//===============================================================
	private void doClose()
	{
		setVisible(false);
		dispose();
		if (exit_on_close)
			System.exit(0);
	}
	//===============================================================
	//===============================================================
	public int showDialog()
	{
		setVisible(true);
		return retVal;
	}
	//===============================================================
	//===============================================================
	private void checkInputs() throws PogoException
	{
		//	Check if Contact email is coherent
		String	 contact = contactTxt.getText().trim();
		int		pos = contact.indexOf('@');
		if (pos<=0)
			throw new PogoException("email is not available");

		int		pos2 = contact.indexOf('.', pos);
		if (pos2<=0 || contact.length()-pos2<3)
			throw new PogoException("email is not available");

		String	family = (String)familyComboBox.getSelectedItem();
		if (family==null || family.trim().length()==0)
			throw new PogoException("Class family is not available");
		
		String	 bus = (String)busComboBox.getSelectedItem();
		if (bus==null || bus.trim().length()==0)
			throw new PogoException("Bus is not available");
		
		//System.out.println(getInputs());
	}
	//===============================================================
	//===============================================================
	public DeviceID getInputs()
	{
		String	platform = (String)platformComboBox.getSelectedItem();
		String	family   = (String)familyComboBox.getSelectedItem();
		String	bus      = (String)busComboBox.getSelectedItem();
		
		String	site = "";
		if (siteButton.isVisible()  &&
			siteButton.getSelectedObjects()!=null)
			site = DeviceIdProperties.siteName;

		return new DeviceID(classname,
					contactTxt.getText().trim(),
					family,
					site,
					platform,
					bus,
					manufacturerTxt.getText().trim(),
					referenceTxt.getText().trim());
	}






	//===============================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JComboBox busComboBox;
    private javax.swing.JLabel busLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JComboBox familyComboBox;
    private javax.swing.JLabel familyLabel;
    private javax.swing.JLabel manufacturerLabel;
    private javax.swing.JTextField manufacturerTxt;
    private javax.swing.JButton okBtn;
    private javax.swing.JComboBox platformComboBox;
    private javax.swing.JLabel platformLabel;
    private javax.swing.JLabel referenceLabel;
    private javax.swing.JTextField referenceTxt;
    private javax.swing.JRadioButton siteButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
	//===============================================================




	//===============================================================
	/**
	* @param args the command line arguments
	*/
	//===============================================================
	public static void main(String args[]) {
		
		//	Check if class name is in args
		if (args.length==0)
		{
			System.out.println("Class name ?");
			System.exit(-1);
		}
		
		//	Show dialog
		try
		{
			if (new File(DeviceID.getFilename("")).exists())
			{
				String		code = pogo.gene.PogoUtil.readFile(DeviceID.getFilename(""));
				DeviceID	id = new DeviceID(code);
				id.classname = args[0];
				new DeviceIdDialog(new JFrame(), id, true).setVisible(true);
			}
			else
				new DeviceIdDialog(new JFrame(), args[0], true).setVisible(true);
		}
		catch(Exception e)
		{
            app_util.PopupError.show(new JFrame(), e);
			e.printStackTrace();
		}
	}

}
