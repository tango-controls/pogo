//+======================================================================
//
// Project:   Tango
//
// Description:  Basic Dialog Class to edit device class.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009, 2010
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

import java.awt.*;
import java.io.File;
import java.util.StringTokenizer;

import javax.swing.*;

import fr.esrf.tango.pogo.pogoDsl.ClassDescription;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;

import fr.esrf.Tango.DevFailed;
import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;
import fr.esrf.tangoatk.widget.util.ErrorPane;
import org.tango.pogo.pogo_gui.tools.PogoFileFilter;
import org.tango.pogo.pogo_gui.tools.Utils;

//===============================================================
/**
 *	A Dialog Class to get the Class definitions.
 */
//===============================================================
public class ClassDialog extends JDialog
{

	private static int		    returnStatus;
	private DeviceClass		    devclass;
    private String              origClassName = null;
    private InheritancePanel    inheritance_panel;
    private JRadioButton[]      langBtn;
    private boolean             hasForcedGenerate = false;
    static private JFileChooser chooser = null;


	/**
	 *	It is kept as JDialog to be edited with netbeans,
	 *	but only centerPanel and data nmanagement are used
	 */
	private DeviceIdDialog	IDdialog;

    /**
     * Get ClassTree instance to do save in case of class name changed
     */
    private ClassTree   classTree;

	//===================================================================
	/**
	 *	 Initializes the ClassDialog object
     * @param parent   The parent frame object
     * @param classTree instance to do save in case of class name changed
     * @param dc       The device class object to be edited
     * @param isInheritedClass true if this class is an inherited one
     */
	//===================================================================
	public ClassDialog(JFrame parent, ClassTree classTree, DeviceClass dc, boolean isInheritedClass)
	{
		super (parent, true);
        this.classTree = classTree;
		initComponents ();
        langBtn = new JRadioButton[3];
        langBtn[PogoConst.Cpp]    = cppBtn;
        langBtn[PogoConst.Java]   = javaBtn;
        langBtn[PogoConst.Python] = pythonBtn;

        if (dc==null)   //  Creating a new class
            this.devclass = new DeviceClass("", null);
        else {
			//	Edit the specified class
	    	this.devclass = dc;
            origClassName = dc.getPogoDeviceClass().getName();
            //  remove the add inheritance class button
            addInheritanceBtn.setVisible(false);
            if (PogoGUI.dbg_java) {
                ClassDescription desc = dc.getPogoDeviceClass().getDescription();
                if (desc!=null)
                    setLanguage(desc.getLanguage());
            }
            else
                setLanguage(Utils.getLanguage(PogoConst.Cpp));
        }

		//	Fill fields with data if any
		PogoDeviceClass	pogo_class = devclass.getPogoDeviceClass();
		nameText.setText(pogo_class.getName());
		descText.setText(pogo_class.getDescription().getDescription());
		descText.setToolTipText("Description for device server documentation.");
		projectText.setText(pogo_class.getDescription().getTitle());
		projectText.setToolTipText("Short description for documentation header");

		IDdialog = new DeviceIdDialog(parent, pogo_class.getDescription().getIdentification());
        horizontalPanel.setLeftComponent(IDdialog.getCenterPanel());

		//	Build a panel to display inheritance
        if (devclass.getPogoDeviceClass().getName().length()==0)
            devclass.getPogoDeviceClass().setName("New Tango Class");
        inheritance_panel = new InheritancePanel(devclass);
        inheritanceScrollPane.setViewportView(inheritance_panel);

        if (isInheritedClass)
            nameText.setEditable(false);

		pack ();
		ATKGraphicsUtils.centerDialog(this);
        nameText.requestFocus();
	}
	//===================================================================
	/**
	 *	 Initializes the ClassDialog object
     * @param parent   The parent frame object
     */
	//===================================================================
	public ClassDialog(JFrame parent)
	{
		this(parent, null, null, false);
	}
    //===================================================================
    //===================================================================
    private void setLanguage(String lang)
    {
        int langCode = Utils.getLanguage(lang);
        if (langCode<0)
            langCode = PogoConst.Cpp;
        for (int i=0 ; i<langBtn.length ; i++) {
            langBtn[i].setSelected(i==langCode);
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
        horizontalPanel = new javax.swing.JSplitPane();
        javax.swing.JPanel centerPanel = new javax.swing.JPanel();
        addInheritanceBtn = new javax.swing.JButton();
        javax.swing.JLabel nameLbl = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        javax.swing.JLabel titleLbl = new javax.swing.JLabel();
        projectText = new javax.swing.JTextField();
        javax.swing.JLabel descLbl = new javax.swing.JLabel();
        javax.swing.JScrollPane descScrollPane = new javax.swing.JScrollPane();
        descText = new javax.swing.JTextArea();
        javax.swing.JLabel languageLbl = new javax.swing.JLabel();
        javax.swing.JPanel languagePanel = new javax.swing.JPanel();
        cppBtn = new javax.swing.JRadioButton();
        javaBtn = new javax.swing.JRadioButton();
        pythonBtn = new javax.swing.JRadioButton();
        inheritanceScrollPane = new javax.swing.JScrollPane();

        setTitle("Class Definition Window");
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

        centerPanel.setLayout(new java.awt.GridBagLayout());

        addInheritanceBtn.setText("Add Inheritance Class");
        addInheritanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInheritanceBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        centerPanel.add(addInheritanceBtn, gridBagConstraints);

        nameLbl.setFont(new java.awt.Font("Dialog", 1, 18));
        nameLbl.setText("Class Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        centerPanel.add(nameLbl, gridBagConstraints);

        nameText.setFont(new java.awt.Font("Dialog", 1, 18));
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        centerPanel.add(nameText, gridBagConstraints);

        titleLbl.setText("Project Title :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        centerPanel.add(titleLbl, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        centerPanel.add(projectText, gridBagConstraints);

        descLbl.setText("Class Description:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        centerPanel.add(descLbl, gridBagConstraints);

        descScrollPane.setForeground(java.awt.Color.lightGray);
        descScrollPane.setPreferredSize(new java.awt.Dimension(500, 250));

        descText.setColumns(80);
        descText.setMinimumSize(new java.awt.Dimension(0, 100));
        descText.setPreferredSize(new java.awt.Dimension(880, 400));
        descScrollPane.setViewportView(descText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        centerPanel.add(descScrollPane, gridBagConstraints);

        languageLbl.setText("Language :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 3, 10, 0);
        centerPanel.add(languageLbl, gridBagConstraints);

        cppBtn.setFont(new java.awt.Font("Dialog", 1, 10));
        cppBtn.setSelected(true);
        cppBtn.setText("Cpp");
        cppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageActionPerformed(evt);
            }
        });
        languagePanel.add(cppBtn);

        javaBtn.setFont(new java.awt.Font("Dialog", 1, 10));
        javaBtn.setText("Java");
        javaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageActionPerformed(evt);
            }
        });
        languagePanel.add(javaBtn);

        pythonBtn.setFont(new java.awt.Font("Dialog", 1, 10));
        pythonBtn.setText("Python");
        pythonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageActionPerformed(evt);
            }
        });
        languagePanel.add(pythonBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        centerPanel.add(languagePanel, gridBagConstraints);

        horizontalPanel.setRightComponent(centerPanel);

        getContentPane().add(horizontalPanel, java.awt.BorderLayout.CENTER);

        inheritanceScrollPane.setForeground(java.awt.Color.lightGray);
        inheritanceScrollPane.setPreferredSize(new java.awt.Dimension(230, 250));
        getContentPane().add(inheritanceScrollPane, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

	//===================================================================
	//===================================================================
	private void manageOK()
	{
		String	classname = checkClassName();
		if (classname==null ||
			classname.length()==0)
			return;
        try {
            IDdialog.checkInputs();
        }
        catch (DevFailed e)  {
            ErrorPane.showErrorMessage(this, null, e);
			return;
        }
		nameText.setText(classname);
        //  Check if class name has changed
        if (checkClassNameChanged(classname))
    		doClose(JOptionPane.OK_OPTION);
	}
	//===================================================================
	//===================================================================
    private boolean checkClassNameChanged(String className)
    {
        //  Check if it has changed
        if (classTree==null)        //  it is a new one
            return true;
        if (origClassName==null)    //  it is a new one
            return true;
        if (devclass.getPogoDeviceClass().getDescription().getSourcePath()==null)
            return true;    //  Not already saved
        if (className.equals(origClassName))    //   no change
            return true;


        //  Ask to choose.
        Object[] options = {"Change Class name",
                            "Create new class files",
                            "Cancel"};
        int choice = JOptionPane.showOptionDialog(this,
                    "Class name has changed",
                    "Confirmation Window",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);
        switch (choice) {
            case 0:
                System.out.println("Will generate");
                return manageClassNameChanged(className);
            case 1:
                return true;
        }
        return false;
    }
    //===================================================================
    //===================================================================
    private boolean manageClassNameChanged(String className)
    {
        if (JOptionPane.showConfirmDialog(this,
                "The " + className + " files (xmi and code) will be generated",
                "Confirmation Window",
                JOptionPane.YES_NO_OPTION)!=JOptionPane.OK_OPTION)
            return false;

        setCursor(new Cursor(Cursor.WAIT_CURSOR));
        Utils.getInstance().startSplashRefresher(
                            "Generate class: " + className);

        try {
            DeviceClass deviceClass = classTree.getDeviceClass();
            deviceClass.generateWithNewName(className, classTree.getModified(),
                    classTree.getDeletedObjects(), classTree.getRenamedObjects());

            classTree.setModified(false);
            hasForcedGenerate = true;
            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            Utils.getInstance().stopSplashRefresher();
        }
        catch (Exception e) {
            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            Utils.getInstance().stopSplashRefresher();
            ErrorPane.showErrorMessage(this, null, e);
            return false;
        }
        return true;
    }
	//===================================================================
	//===================================================================
    public boolean hasForcedToGenerate()
    {
        return hasForcedGenerate;
    }
	//===================================================================
	//===================================================================
	@SuppressWarnings({"UnusedDeclaration"})
	private void nameTextActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed

		manageOK();
	}//GEN-LAST:event_nameTextActionPerformed

	//===================================================================
	//===================================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void okBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

		manageOK();
	}//GEN-LAST:event_okBtnActionPerformed


	//===================================================================
	//===================================================================
	@SuppressWarnings({"UnusedDeclaration"})
	private void cancelBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
		doClose(JOptionPane.CANCEL_OPTION);
	}//GEN-LAST:event_cancelBtnActionPerformed

	//===================================================================
	//===================================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
		doClose(JOptionPane.CANCEL_OPTION);
	}//GEN-LAST:event_closeDialog

	//===================================================================
	//===================================================================
	private void languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageActionPerformed

		JRadioButton	btn = (JRadioButton) evt.getSource();

		//	If action performed to reset -> force it
		if (btn.getSelectedObjects()==null)
			btn.setSelected(true);

        //  Check if inheritance -> cannot have another language.
        if (devclass.getAncestors().size()>0) {
            btn.setSelected(false);
            JOptionPane.showMessageDialog(this,
                    devclass.getPogoDeviceClass().getName() + " inherite  for "+
                    devclass.getAncestors().get(0).getPogoDeviceClass().getName() +
                    ".\n It must be generated in same language !",
                        "Error Window",
                        JOptionPane.ERROR_MESSAGE);
        }
        else
		//	Check the language
		if (btn==cppBtn) {
            setLanguage(btn.getText());
		}
		else
		if (btn==javaBtn) {
            if (PogoGUI.dbg_java) {
                setLanguage(btn.getText());
            }
            else {
    			btn.setSelected(false);
	    		JOptionPane.showMessageDialog(this,
						btn.getText()+" language is not available !",
						"Error Window",
						JOptionPane.ERROR_MESSAGE);
            }
		}
		else
		if (btn==pythonBtn) {
            if (PogoGUI.dbg_python) {
                setLanguage(btn.getText());
            }
            else {
    			btn.setSelected(false);
	    		JOptionPane.showMessageDialog(this,
						btn.getText()+" language is not available !",
						"Error Window",
						JOptionPane.ERROR_MESSAGE);
            }
		}
	}//GEN-LAST:event_languageActionPerformed

    //===================================================================
    //===================================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void addInheritanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInheritanceBtnActionPerformed

        
		//	Initialize chooser if not already done.
		if (chooser==null) {
			String path = System.getenv("SOURCE_PATH");
			if (path==null) {
				path = System.getProperty("SOURCE_PATH");
				if (path==null)
					path = new File("").getAbsolutePath();
			}
			chooser = new JFileChooser(new File(path).getAbsolutePath());

			PogoFileFilter	filter = new PogoFileFilter("xmi", "Tango Classes");
			filter.setExtensionListInDescription(false);
			chooser.setFileFilter(filter);
		}
		
		//	Start the file chooser
		int	retval = chooser.showOpenDialog(this);
		if (retval== JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			if (file!=null) {
				if (!file.isDirectory()) {
					try {
						//	Try to load class
						DeviceClass	dc = new DeviceClass(file.getAbsolutePath());
                        devclass.addAncestor(dc);
                
						//	Then Remove old inheritance panel
                        inheritanceScrollPane.remove(inheritance_panel);

                        //  Check if Class name has been typed
                        String  name = nameText.getText();
                        if (name.length()>0)
                            devclass.getPogoDeviceClass().setName(name);

                        //  Then build a new panel and display
                        inheritance_panel = new InheritancePanel(devclass);
                        inheritanceScrollPane.setViewportView(inheritance_panel);
                        addInheritanceBtn.setVisible(false);
                        
					}
					catch (DevFailed e) {
						if (!e.errors[0].reason.equals("CANCEL"))
							ErrorPane.showErrorMessage(this, file.getAbsolutePath(), e);
					}
				}
			}
		}
		
    }//GEN-LAST:event_addInheritanceBtnActionPerformed
    //===================================================================
    //===================================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void nameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyPressed
        if (evt.getKeyCode()==27) {  // Escape
            doClose(JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_nameTextKeyPressed

	//===================================================================
	//===================================================================
	public int showDialog()
	{
		setVisible(true);
		return returnStatus;
	}

	//===========================================================
	/**
	 *	Close th dialog and set the reurn status.
	 *
	 *	@param	retStatus	value to b used to set the return status.
	 */
	//===========================================================
	private void doClose(int retStatus)
	{
		returnStatus = retStatus;
		setVisible (false);
		dispose ();
	}
	//===========================================================
	//===========================================================
	DeviceClass getInputs()
	{
		PogoDeviceClass	pogo_class = devclass.getPogoDeviceClass();
		pogo_class.setName(nameText.getText());
		pogo_class.getDescription().setTitle(projectText.getText());
		pogo_class.getDescription().setDescription(descText.getText());
        pogo_class.getDescription().setIdentification(IDdialog.getInputs());
		if (pythonBtn.getSelectedObjects()!=null)
			pogo_class.getDescription().setLanguage(PogoConst.strLang[PogoConst.Python]);
		else
		if (javaBtn.getSelectedObjects()!=null)
			pogo_class.getDescription().setLanguage(PogoConst.strLang[PogoConst.Java]);
		else
			pogo_class.getDescription().setLanguage(PogoConst.strLang[PogoConst.Cpp]);
		return devclass;
	}
	//===========================================================
	/**
	*	Read class name text field.
	*
	*	@return the String read in class name text field.
	*/
	//===========================================================
	private String  checkClassName()
	{
		if (nameText.getText().length()==0)
		return null;

        //  Check if char are OK
        String  name = nameText.getText().toLowerCase();
        if (name.charAt(0)<'a' || name.charAt(0)>'z') {
            Utils.popupError(this, "First char of class name must be a letter");
            return null;
        }
        for (int i=0 ; i<name.length() ; i++) {
            if ((name.charAt(i)<'a' || name.charAt(i)>'z') &&
                (name.charAt(i)<'0' || name.charAt(i)>'9') &&
                    name.charAt(i)!='_'){
                Utils.popupError(this, "Char \'" + name.charAt(i) + "\' is not authorized in class name");
                return null;
            }
        }

		//	Take off space char if exist
		//--------------------------------------
		StringTokenizer stk = new StringTokenizer(nameText.getText());
		name = "";
		while(stk.hasMoreTokens()) {
			String	tmp = stk.nextToken();
			//	Check if first char is upcase else set it
			if (tmp.length()>1)
				name += tmp.substring(0, 1).toUpperCase() + tmp.substring(1);
			else
				name += tmp.toUpperCase();
		}
		if (name.length()==0)
			return null;
		else
			return name;
	}

	//===================================================================
	//===================================================================

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInheritanceBtn;
    private javax.swing.JRadioButton cppBtn;
    private javax.swing.JTextArea descText;
    private javax.swing.JSplitPane horizontalPanel;
    private javax.swing.JScrollPane inheritanceScrollPane;
    private javax.swing.JRadioButton javaBtn;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField projectText;
    private javax.swing.JRadioButton pythonBtn;
    // End of variables declaration//GEN-END:variables
}
