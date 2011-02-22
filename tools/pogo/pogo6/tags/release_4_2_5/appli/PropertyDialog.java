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
// Revision 3.4  2004/11/22 11:12:06  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.3  2004/10/21 06:54:47  pascal_verdier
// Check for non double item definitions
// for add, edit and clone item.
//
// Revision 3.2  2004/09/07 12:02:45  pascal_verdier
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
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.appli;


import java.util.*;
import javax.swing.*;
import pogo.gene.*;
import fr.esrf.Tango.*;
import fr.esrf.TangoDs.*;


//===============================================================
/**
 *	A Dialog Class to get the State parameters.
 */
//===============================================================
public class PropertyDialog extends javax.swing.JDialog implements PogoAppliDefs, PogoDefs {

	private static int returnStatus = PogoAppliDefs.RET_CANCEL;
	private JFrame	parent;

//===============================================================
/**
*	Initializes the Form
*/
//===============================================================
	public PropertyDialog(JFrame parent, Property property, String title) {
		super (parent, true);
		this.parent = parent;
		initComponents ();

		//  init comboboxes with data type except void type
		//----------------------------------------------------
		for (int i=0 ; i<TangoPropertyTypesArray.length ; i++)
			typeBox.addItem(TangoPropertyTypesArray[i]);

		initializeWindow(property);
		jScrollPane2.setVisible(false);
		jLabel1.setVisible(false);
		
		titleLabel.setText(title);
		pack ();
	}

//===============================================================
/** This method is called from within the constructor to
 * initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is
 * always regenerated by the FormEditor.
 */
//===============================================================
        private void initComponents() {//GEN-BEGIN:initComponents
              jPanel1 = new javax.swing.JPanel();
              okBtn = new javax.swing.JButton();
              cancelBtn = new javax.swing.JButton();
              jPanel2 = new javax.swing.JPanel();
              typeLbl = new javax.swing.JLabel();
              descLbl = new javax.swing.JLabel();
              typeBox = new javax.swing.JComboBox();
              nameLbl = new javax.swing.JLabel();
              nameText = new javax.swing.JTextField();
              jLabel1 = new javax.swing.JLabel();
              jScrollPane1 = new javax.swing.JScrollPane();
              descText = new javax.swing.JTextArea();
              jScrollPane2 = new javax.swing.JScrollPane();
              valTxt = new javax.swing.JTextArea();
              jLabel2 = new javax.swing.JLabel();
              jLabel3 = new javax.swing.JLabel();
              jPanel5 = new javax.swing.JPanel();
              titleLabel = new javax.swing.JLabel();
              
              setTitle("Edit Property Window");
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
              
              typeLbl.setText("Property type");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 2;
              gridBagConstraints1.insets = new java.awt.Insets(0, 3, 0, 0);
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(typeLbl, gridBagConstraints1);
              
              descLbl.setText("Property Description:  ");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 4;
              gridBagConstraints1.insets = new java.awt.Insets(0, 3, 0, 0);
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(descLbl, gridBagConstraints1);
              
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 1;
              gridBagConstraints1.gridy = 2;
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(typeBox, gridBagConstraints1);
              
              nameLbl.setText("Property name");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.insets = new java.awt.Insets(0, 3, 0, 0);
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(nameLbl, gridBagConstraints1);
              
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 1;
              gridBagConstraints1.gridy = 0;
              gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
              jPanel2.add(nameText, gridBagConstraints1);
              
              jLabel1.setText("Default value :");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 7;
              gridBagConstraints1.insets = new java.awt.Insets(0, 3, 0, 0);
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(jLabel1, gridBagConstraints1);
              
              jScrollPane1.setForeground(java.awt.Color.lightGray);
                jScrollPane1.setPreferredSize(new java.awt.Dimension(450, 150));
                descText.setColumns(80);
                descText.setMinimumSize(new java.awt.Dimension(0, 100));
                descText.setPreferredSize(new java.awt.Dimension(1408, 400));
                jScrollPane1.setViewportView(descText);
                
                gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 5;
              gridBagConstraints1.gridwidth = 3;
              gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
              gridBagConstraints1.insets = new java.awt.Insets(0, 3, 0, 3);
              gridBagConstraints1.weightx = 1.0;
              jPanel2.add(jScrollPane1, gridBagConstraints1);
              
              jScrollPane2.setForeground(java.awt.Color.lightGray);
                jScrollPane2.setPreferredSize(new java.awt.Dimension(450, 100));
                valTxt.setColumns(80);
                valTxt.setMinimumSize(new java.awt.Dimension(0, 100));
                valTxt.setPreferredSize(new java.awt.Dimension(880, 400));
                jScrollPane2.setViewportView(valTxt);
                
                gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 8;
              gridBagConstraints1.gridwidth = 3;
              gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
              gridBagConstraints1.insets = new java.awt.Insets(0, 3, 0, 3);
              jPanel2.add(jScrollPane2, gridBagConstraints1);
              
              jLabel2.setText("  ");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 3;
              jPanel2.add(jLabel2, gridBagConstraints1);
              
              jLabel3.setText("   ");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 6;
              jPanel2.add(jLabel3, gridBagConstraints1);
              
              getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);
              
              titleLabel.setFont(new java.awt.Font("Dialog", 1, 18));
              titleLabel.setText("jLabel4");
              jPanel5.add(titleLabel);
              
              getContentPane().add(jPanel5, java.awt.BorderLayout.NORTH);
            
        }//GEN-END:initComponents

	//======================================================
	/**
	 *	check if default value is coherent (mas o menos).
	 */
	//======================================================
	private String verifyDefaultValue()
	{
		String err_mess = null;
		String		type = typeBox.getSelectedItem().toString().toLowerCase();
		String[]	def_val  = 
			new PogoString(valTxt.getText().trim()).string2array();

		//	is it an array or a single property
		if (type.indexOf("array")<0 && def_val.length>1)
			err_mess = "Property's default value " +
						"is not coherent with selected type !";
		//	Check type
		for (int i=0 ; i<def_val.length ; i++)
		{
			try
			{
				if (type.indexOf("float")>=0 || type.indexOf("double")>=0)
					Double.parseDouble(def_val[i]);
				else
				if (type.indexOf("short")>=0 || type.indexOf("long")>=0)
					Integer.parseInt(def_val[i]);
				else
				if (type.indexOf("boolean")>=0)
					if (def_val[i].toLowerCase().equals("true")==false &&
						def_val[i].toLowerCase().equals("false")==false )
							err_mess = "Property's default value " + 
								"is not coherent with selected type !\n" +
								"A boolean value must be  false or true";
			}
			catch(Exception e)
			{
				err_mess = "Property's default value " + 
							"is not coherent with selected type !\n" +
							e.toString();

			}
		}
		return err_mess;
	}
	//======================================================
	//======================================================
	private void okBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

		//	Check it at least the property name has been filled.
		//---------------------------------------------------------
		String	err_mess = null;
		if (nameText.getText().length()<=0)
			err_mess = "Property's name must be filled in !";
		else
			err_mess = verifyDefaultValue();

		if (err_mess!=null)
			JOptionPane.showMessageDialog(this,
					err_mess, "Error Window", JOptionPane.ERROR_MESSAGE);
		else
			doClose(PogoAppliDefs.RET_OK);
	}//GEN-LAST:event_okBtnActionPerformed

	//======================================================
	//======================================================
	private void cancelBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
		doClose(PogoAppliDefs.RET_CANCEL);
	}//GEN-LAST:event_cancelBtnActionPerformed
	//======================================================
	/** Closes the dialog */
	//======================================================
	private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
		doClose(PogoAppliDefs.RET_CANCEL);
	}//GEN-LAST:event_closeDialog
	//======================================================
	private void doClose(int retStatus)
	{
		returnStatus = retStatus;
		setVisible (false);
		dispose ();
	}

	//======================================================
	//======================================================
	private void initializeWindow(Property property)
	{
		if (property!=null)
		{
			//	Special case for string
			//(string supported and Tango_DEV_STRING not supported)
			//------------------------------------------------------------
			if (property.type.code == Tango_CONST_DEV_STRING	||
				property.type.code == TangoConst.Tango_DEV_STRING)
				property.type.cpp_code_str = new String("string");

			//  Initialize Window with input parameters
			//-----------------------------------------------
			nameText.setText(property.name);
			for (int i=0 ; i<TangoPropertyTypesArray.length ; i++)
			{
				//System.out.println(TangoPropertyTypesArray[i]+" == " + 
				//		property.type.cpp_code_str);
				if (TangoPropertyTypesArray[i].equals(property.type.cpp_code_str))
					typeBox.setSelectedIndex(i);
			}
			if (property.description!=null)
				descText.setText(property.description);
			//	Display default value if any
			if (property.default_value!=null)
			{
				String	s = "";
				for (int i=0 ; i<property.default_value.length ; i++)
					s += property.default_value[i] + "\n";
				//	remove last Cr
				s = s.trim();
				//	and display
				valTxt.setText(s);
			}
		}
	}
	//======================================================
	//======================================================
	public int showDialog()
	{
		PogoAppli.centerDialog(this, parent);
		setVisible(true);
		return returnStatus;
	}

	//======================================================
	//======================================================
	public Property  getInput()
	{
		//	Take of space char if exist
		//--------------------------------------
		StringTokenizer stk = new StringTokenizer(nameText.getText());
		String	name = stk.nextToken();

		//	Check if first char is upcase else set it
		//-------------------------------------------------
		if (name.charAt(0) >='a' || name.charAt(0) >='z')
		{
			char	car = (char)(name.charAt(0)-('a'-'A'));
			name = new String(car + name.substring(1));
		}
		String	type = typeBox.getSelectedItem().toString();
		String[]	def_val  = 
			new PogoString(valTxt.getText().trim()).string2array();

		return new Property(name, type, descText.getText(), def_val);
	}

//======================================================
//======================================================

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel jPanel1;
        private javax.swing.JButton okBtn;
        private javax.swing.JButton cancelBtn;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JLabel typeLbl;
        private javax.swing.JLabel descLbl;
        private javax.swing.JComboBox typeBox;
        private javax.swing.JLabel nameLbl;
        private javax.swing.JTextField nameText;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea descText;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTextArea valTxt;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JLabel titleLabel;
        // End of variables declaration//GEN-END:variables

//======================================================
//======================================================
}
