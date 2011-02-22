//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Pogo class definition .
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.5  2005/03/11 14:15:36  pascal_verdier
// Super class management is not only in test mode.
//
// Revision 3.4  2005/03/02 14:01:53  pascal_verdier
// Managing Super Classes and inherited classes.
//
// Revision 3.3  2004/10/21 06:54:46  pascal_verdier
// Check for non double item definitions
// for add, edit and clone item.
//
// Revision 3.2  2004/09/07 12:02:44  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.1  2004/08/26 07:25:35  pascal_verdier
// Attributes are now generated as class.
// Look and field changed.
//
// Revision 3.0  2003/04/29 10:42:14  pascal_verdier
// TANGO 3.0 compatibility
// little bugs fixed.
//
// Revision 1.33  2003/01/16 14:32:36  verdier
// Tango classe files detected for open JFileChooser.
//
// Revision 1.32  2002/10/03 13:54:27  verdier
// Pogo has been used without known bug.
// Put class description as class property.
//
// Revision 1.31  2002/04/25 12:05:08  verdier
// IDL 2 implemented for c++ servers
//
// Revision 1.30  2002/02/06 15:21:23  verdier
// Java code generation updated.
//
// Revision 1.26  2001/12/18 10:13:30  verdier
// Attribute user default property code added.
//
// Revision 1.25  2001/11/09 09:46:57  verdier
// Many bugs fixed.
//
// Revision 1.24  2001/04/04 12:22:58  verdier
// Property management added for cpp.
//
// Revision 1.23  2000/10/24 06:21:22  verdier
// The compatibility with TANGO2 has been tested on DatabaseDs.
//
// Revision 1.22  2000/10/02 05:52:20  verdier
// Attribute code generated is now compatible with Tango 2.
//
// Revision 1.21  2000/09/22 08:54:31  verdier
// DevState & DevStatus are virtual.
// First tests with Tango2
// Taco import utility added.
//
// Revision 1.20  2000/07/07 13:30:10  verdier
// Utilities added after first users.
//
// Revision 1.18  2000/06/20 06:57:35  verdier
// Right button double click management added for :
// editing src code, creating item, editing class....
// Little bugs fixed on generation/re-read src code.
//
// Revision 1.17  2000/05/12 07:37:10  verdier
//  Attributes management added for java generation.
//
// Revision 1.16  2000/04/26 06:04:00  verdier
// The save/restore file (.pogo) does not exist anymore.
// DevStates and DevStates allowed management is now available for java.
//
// Revision 1.15  2000/04/18 08:12:47  verdier
// Management of DevStates to allow command added.
//
// Revision 1.14  2000/04/12 09:25:43  verdier
// Methods to manage attributes are now generated
//  Only if at leat one attribute exists.
//
// Revision 1.13  2000/04/11 09:35:07  verdier
// Attributes management added.
//
// Revision 1.2  2000/03/29 13:11:48  verdier
// Doc generation added.
//
// Revision 1.1  2000/02/28 15:41:38  verdier
// Initial revision
//
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.appli;


import java.awt.*;
import java.util.*;
import javax.swing.*;
import pogo.gene.*;
import fr.esrf.Tango.*;

//===============================================================
/**
 *	A Dialog Class to get the Class definitions.
 */
//===============================================================
public class ClassDialog extends javax.swing.JDialog implements PogoAppliDefs {

	private static int returnStatus = PogoAppliDefs.RET_CANCEL;
	private static final String		impl_txt = "Tango Device";

//===================================================================
/**
 *	 Initializes the Form 
 */
//===================================================================
	private String[]	class_list = null;
	public ClassDialog(JFrame parent, ServerDefinitions defs)
	{
		super (parent, true);
		initComponents ();
		nameText.setText(defs.name);
		descText.setText(defs.description);
		descText.setToolTipText("Description for device server documentation.");
		projectText.setText(defs.project_title);
		projectText.setToolTipText("Short description for documentation header");

		//	Add superclass list in combo box if any
		/******
		if (PogoUtil.is_test_mode()==false)
		{
			superClassComboBox.setVisible(false);
			inheritedLabel.setVisible(false);
		}
		else
		*********/
		{
			String[]	tmp;
			String		impl_txt = "Tango Device";
			//	Check if inheritance has already been fixed.
			if (defs.inherited_from==null)
			{
				tmp =  PogoUtil.superClassList();

				//	Store full path and name
				class_list = new String[tmp.length+1];
				class_list[0] = impl_txt;
				for (int i=0 ; i<tmp.length ; i++)
					class_list[i+1] = tmp[i];
			}
			else
			{
				class_list = new String[1];
				if (defs.inherited_from==null ||
					defs.inherited_from.equals(PogoDefs.tangoDeviceImpl))
					class_list[0] = impl_txt;
				else
					class_list[0] = defs.inherited_from;
			}

			//	Take of path and extention to keep only classname
			for (int i=0 ; i<class_list.length ; i++)
			{
				int	start = class_list[i].lastIndexOf("/");
				start++;
				int end = class_list[i].lastIndexOf(".");
				String	classname;
				if (end>start)
					classname= class_list[i].substring(start, end);
				else
					classname= class_list[i].substring(start);
				superClassComboBox.addItem(classname);

			}
		}

		pack ();
		PogoAppli.centerDialog(this, parent);
	}

//===================================================================
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the FormEditor.
   */
//===================================================================
        private void initComponents() {//GEN-BEGIN:initComponents
              jPanel1 = new javax.swing.JPanel();
              okBtn = new javax.swing.JButton();
              cancelBtn = new javax.swing.JButton();
              jPanel2 = new javax.swing.JPanel();
              jLabel8 = new javax.swing.JLabel();
              nameText = new javax.swing.JTextField();
              jLabel4 = new javax.swing.JLabel();
              projectText = new javax.swing.JTextField();
              inheritedLabel = new javax.swing.JLabel();
              superClassComboBox = new javax.swing.JComboBox();
              jLabel6 = new javax.swing.JLabel();
              jLabel1 = new javax.swing.JLabel();
              jLabel7 = new javax.swing.JLabel();
              jScrollPane1 = new javax.swing.JScrollPane();
              descText = new javax.swing.JTextArea();
              
              setTitle("Command Window");
              setBackground(new java.awt.Color(198, 178, 168));
              addWindowListener(new java.awt.event.WindowAdapter() {
                  public void windowClosing(java.awt.event.WindowEvent evt) {
                      closeDialog(evt);
                  }
              });
              
              jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
              
              okBtn.setText("OK");
              okBtn.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                      okBtnActionPerformed(evt);
                  }
              });
              
              jPanel1.add(okBtn);
              
              cancelBtn.setText("Cancel");
              cancelBtn.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                      cancelBtnActionPerformed(evt);
                  }
              });
              
              jPanel1.add(cancelBtn);
              
              getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);
              
              jPanel2.setLayout(new java.awt.GridBagLayout());
              java.awt.GridBagConstraints gridBagConstraints1;
              
              jLabel8.setFont(new java.awt.Font("Dialog", 1, 18));
              jLabel8.setText("Class Name :");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 0;
              gridBagConstraints1.insets = new java.awt.Insets(0, 3, 0, 0);
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(jLabel8, gridBagConstraints1);
              
              nameText.setFont(new java.awt.Font("Dialog", 1, 18));
              nameText.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                      nameTextActionPerformed(evt);
                  }
              });
              
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 1;
              gridBagConstraints1.gridy = 0;
              gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
              gridBagConstraints1.insets = new java.awt.Insets(0, 0, 0, 3);
              jPanel2.add(nameText, gridBagConstraints1);
              
              jLabel4.setText("Project Title :");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 5;
              gridBagConstraints1.insets = new java.awt.Insets(0, 3, 0, 0);
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(jLabel4, gridBagConstraints1);
              
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 1;
              gridBagConstraints1.gridy = 5;
              gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
              gridBagConstraints1.insets = new java.awt.Insets(0, 0, 0, 3);
              jPanel2.add(projectText, gridBagConstraints1);
              
              inheritedLabel.setText(" Inherited from class:");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 2;
              gridBagConstraints1.insets = new java.awt.Insets(0, 3, 0, 0);
              jPanel2.add(inheritedLabel, gridBagConstraints1);
              
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 1;
              gridBagConstraints1.gridy = 2;
              jPanel2.add(superClassComboBox, gridBagConstraints1);
              
              jLabel6.setText("Class Description:  ");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 6;
              gridBagConstraints1.insets = new java.awt.Insets(0, 3, 0, 0);
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(jLabel6, gridBagConstraints1);
              
              jLabel1.setText(" ");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 1;
              jPanel2.add(jLabel1, gridBagConstraints1);
              
              jLabel7.setText(" ");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 3;
              jPanel2.add(jLabel7, gridBagConstraints1);
              
              jScrollPane1.setForeground(java.awt.Color.lightGray);
                jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 150));
                descText.setColumns(80);
                descText.setMinimumSize(new java.awt.Dimension(0, 100));
                descText.setPreferredSize(new java.awt.Dimension(880, 400));
                jScrollPane1.setViewportView(descText);
                
                gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 7;
              gridBagConstraints1.gridwidth = 2;
              gridBagConstraints1.fill = java.awt.GridBagConstraints.BOTH;
              gridBagConstraints1.insets = new java.awt.Insets(0, 3, 0, 3);
              gridBagConstraints1.weightx = 1.0;
              gridBagConstraints1.weighty = 1.0;
              jPanel2.add(jScrollPane1, gridBagConstraints1);
              
              getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);
            
        }//GEN-END:initComponents

//===================================================================
//===================================================================
  public int showDialog()
  {
	setVisible(true);
	return returnStatus;
  }

//===================================================================
//===================================================================
//===================================================================
//===================================================================
	private void nameTextActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
		String	classname = checkClassName();
		if (classname==null)
			return;
 		doClose(PogoAppliDefs.RET_OK);
	}//GEN-LAST:event_nameTextActionPerformed

//===================================================================
//===================================================================
	private void okBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
		String	classname = checkClassName();
		if (classname==null)
			return;
 		doClose(PogoAppliDefs.RET_OK);
	}//GEN-LAST:event_okBtnActionPerformed


//===================================================================
//===================================================================
	private void cancelBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
		doClose(PogoAppliDefs.RET_CANCEL);
	}//GEN-LAST:event_cancelBtnActionPerformed

//===================================================================
  /** Closes the dialog */
//===================================================================
	private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
		doClose(PogoAppliDefs.RET_CANCEL);
	}//GEN-LAST:event_closeDialog

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
	ServerDefinitions getInput()
	{
		String	classname = checkClassName();
		if (classname==null)
			return null;
		//	Get inheritance class
		String	inherited_from = null;
		if (class_list!=null)
		{
			String	str = class_list[superClassComboBox.getSelectedIndex()];
			if (str.equals(impl_txt))
				inherited_from = PogoDefs.tangoDeviceImpl;
			else
				inherited_from = str;
			
			/*
			if (superClassComboBox.getSelectedIndex()==0)
				inherited_from = PogoDefs.tangoDeviceImpl;
			else
				inherited_from =
					class_list[superClassComboBox.getSelectedIndex()];
			*/
		}
		//	And return input data
		return new ServerDefinitions(classname,
			inherited_from,
			descText.getText(), projectText.getText());
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

	//	Take of space char if exist
	//--------------------------------------
	StringTokenizer stk = new StringTokenizer(nameText.getText());
	String	name = "";
	for (int i=0 ; stk.hasMoreTokens() ; i++)
	{
		String	tmp = stk.nextToken();
		//	Check if first char is upcase else set it
		//-------------------------------------------------
		if (tmp.charAt(0) >='a' || tmp.charAt(0) >='z')
		{
			char	car = (char)(tmp.charAt(0)-('a'-'A'));
			tmp = new String(car + tmp.substring(1));
			name += tmp;
		}
		else
			name += tmp;
	}
	if (name.length()==0)
	{
		//System.out.println("name.length() : " + name.length());
		return null;
	}
	else
		return name;
  }

//===================================================================
//===================================================================

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JButton okBtn;
  private javax.swing.JButton cancelBtn;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JTextField nameText;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JTextField projectText;
  private javax.swing.JLabel inheritedLabel;
  private javax.swing.JComboBox superClassComboBox;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea descText;
  // End of variables declaration//GEN-END:variables
}
