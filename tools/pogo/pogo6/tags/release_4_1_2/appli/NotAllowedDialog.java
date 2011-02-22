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
// Revision 3.2  2004/09/07 12:02:44  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.1  2004/08/26 07:25:35  pascal_verdier
// Attributes are now generated as class.
// Look and field changed.
//
// Revision 3.0  2003/04/29 10:42:13  pascal_verdier
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
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================
package pogo.appli;



import java.awt.*;
import java.util.*;
import javax.swing.*;
import pogo.gene.*;

//===============================================================
/**
 *	A Dialog Class to get  <i>DevStateTable</i> where a
 *	<i> Cmd</i> object (a command) is NOT allowed.
 */
//===============================================================
public class NotAllowedDialog extends javax.swing.JDialog implements PogoAppliDefs, PogoDefs {

	private static int returnStatus = PogoAppliDefs.RET_CANCEL;
	private	Vector	stVector;

//===============================================================
/**
 * Initializes the Form
 */
//===============================================================
	public NotAllowedDialog(JFrame parent, String allow_what, Vector stVect)
	{
		super (parent, true);
		stVector = stVect;
		initComponents ();
		setTitle (allow_what + " Allowed For States");
		nameLbl.setText(allow_what + " Allowed For States:");
		pack ();

		PogoAppli.centerDialog(this, parent);
	}

//===============================================================
/**
 * This method is called from within the constructor to initialize the form.
 */
 //===============================================================
 private void initComponents () {
    jPanel1 = new javax.swing.JPanel ();
    okBtn = new javax.swing.JButton ();
    cancelBtn = new javax.swing.JButton ();
    jPanel2 = new javax.swing.JPanel ();
    nameLbl = new javax.swing.JLabel ();
    setBackground (new java.awt.Color (198, 178, 168));
    setTitle ("Command Allowed Window");
    addWindowListener (new java.awt.event.WindowAdapter () {
      public void windowClosing (java.awt.event.WindowEvent evt) {
        closeDialog (evt);
      }
    }
    );

    jPanel1.setLayout (new java.awt.FlowLayout (2, 5, 5));

      okBtn.setText ("OK");
      okBtn.addActionListener (new java.awt.event.ActionListener () {
        public void actionPerformed (java.awt.event.ActionEvent evt) {
          okBtnActionPerformed (evt);
        }
      }
      );
  
      jPanel1.add (okBtn);
  
      cancelBtn.setText ("Cancel");
      cancelBtn.addActionListener (new java.awt.event.ActionListener () {
        public void actionPerformed (java.awt.event.ActionEvent evt) {
          cancelBtnActionPerformed (evt);
        }
      }
      );
  
      jPanel1.add (cancelBtn);
  

    getContentPane ().add (jPanel1, java.awt.BorderLayout.SOUTH);

    jPanel2.setLayout (new java.awt.GridBagLayout ());
    java.awt.GridBagConstraints gridBagConstraints1;

		//	Title Label
		//-----------------------
		nameLbl.setText ("Command Allowed for Selected States: ");
		nameLbl.setForeground (java.awt.Color.black);
		nameLbl.setFont (new java.awt.Font ("Arial", 1, 14));
		nameLbl.setPreferredSize (new java.awt.Dimension(400, 40));
		//nameLbl.setMinimumSize (new java.awt.Dimension(20, 30));

		gridBagConstraints1 = new java.awt.GridBagConstraints ();
		gridBagConstraints1.gridx = 1;
		gridBagConstraints1.gridy = 1;
		gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
		jPanel2.add (nameLbl, gridBagConstraints1);

		//	Create a JRadio Button for each state
		//---------------------------------------------
		radioBtn = new JRadioButton[stVector.size()];
		for (int i=0 ; i<stVector.size() ; i++)
		{
			DevState	state = (DevState) stVector.elementAt(i);
			radioBtn[i] = new JRadioButton(state.name);
			radioBtn[i].setFont (new java.awt.Font ("Arial", 1, 12));
			radioBtn[i].setSelected(true);
			gridBagConstraints1.gridx = 1;
			gridBagConstraints1.gridy = i+2;
			gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
			jPanel2.add(radioBtn[i], gridBagConstraints1);
		}

		getContentPane ().add (jPanel2, java.awt.BorderLayout.CENTER);
	}



   //===============================================================================
	private void cancelBtnActionPerformed (java.awt.event.ActionEvent evt)
	{
		doClose(PogoAppliDefs.RET_CANCEL);
	}

    //===============================================================================
	private void okBtnActionPerformed (java.awt.event.ActionEvent evt)
	{
		doClose(PogoAppliDefs.RET_OK);
	}

   //===============================================================================
	/** Closes the dialog */
	private void closeDialog(java.awt.event.WindowEvent evt)
	{
		doClose(PogoAppliDefs.RET_CANCEL);
	}

   //===============================================================================
	public int showDialog(DevStateTable stTable)
	{
		if (stTable!=null)
			for (int i=0 ; i<stTable.size() ; i++)
				for (int j=0 ; j<radioBtn.length ; j++)
				{
					DevState	state = (DevState) stTable.elementAt(i);
					if (state.name.equals(radioBtn[j].getText())==true)
						radioBtn[j].setSelected(false);
				}
		setVisible(true);
		return returnStatus;
	}
	//===============================================================================
	private void doClose(int retStatus)
	{
		returnStatus = retStatus;
		setVisible (false);
		dispose ();
	}

	//===============================================================================
	public DevStateTable  getInput()
	{
		Vector forbStates = new Vector();

		for (int i=0 ; i<stVector.size() ; i++)
			if (radioBtn[i].getSelectedObjects()==null)
				forbStates.addElement(stVector.elementAt(i));
	    return	new DevStateTable(forbStates);
	}
	//======================================================

  private JRadioButton	radioBtn[];
  private javax.swing.JPanel jPanel1;
  private javax.swing.JButton okBtn;
  private javax.swing.JButton cancelBtn;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel nameLbl;

}
