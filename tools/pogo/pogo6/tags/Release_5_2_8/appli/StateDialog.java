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
// Revision 3.5  2005/06/14 08:48:39  pascal_verdier
// SuperClass is replaced by AbstractClass.
//
// Revision 3.4  2005/03/02 14:01:54  pascal_verdier
// Managing Abstract Classes and inherited classes.
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
// Revision 1.1  2000/03/03 09:43:00  verdier
// Initial revision
//
// Revision 1.1  2000/02/28 15:41:38  verdier
// Initial revision
//
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.appli;


import pogo.gene.DevState;
import pogo.gene.PogoClass;
import pogo.gene.PogoDefs;

import javax.swing.*;

//===============================================================
/**
 *	A Dialog Class to get the State parameters.
 */
//===============================================================
public class StateDialog extends javax.swing.JDialog implements PogoAppliDefs, PogoDefs {

	private static int returnStatus = PogoAppliDefs.RET_CANCEL;
	private JFrame		parent;
	private PogoClass	server;
	private int			state_idx = -1;
//===============================================================
/**
*	Initializes the Form
*/
//===============================================================
	public StateDialog(JFrame parent, PogoClass server, DevState state, int action)
	{
		super (parent, true);
		this.parent = parent;
		this.server = server;
		initComponents ();
		//  init comboboxes
		//-----------------------
		for (int i=0 ; i<TangoStatesArray.length ; i++)
			jComboBox1.addItem(TangoStatesArray[i]);
		initializeWindow(state);

		if (action==CREATING)
			state_idx = -1;
		else
		for (int i=0 ; i<server.states.size() ; i++)
			if (server.states.stateAt(i) == state)
				state_idx = i;
		pack ();
	}

 //===============================================================
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the FormEditor.
   */
 //===============================================================
  private void initComponents () {//GEN-BEGIN:initComponents
    setBackground (new java.awt.Color (198, 178, 168));
    setTitle ("Edit State Window");
    addWindowListener (new java.awt.event.WindowAdapter () {
        public void windowClosing (java.awt.event.WindowEvent evt) {
          closeDialog (evt);
        }
      }
    );
    getContentPane ().setLayout (new java.awt.BorderLayout ());

    jPanel1 = new javax.swing.JPanel ();
    jPanel1.setLayout (new java.awt.FlowLayout (2, 5, 5));

      okBtn = new javax.swing.JButton ();
      okBtn.setText ("OK");
      okBtn.addActionListener (new java.awt.event.ActionListener () {
          public void actionPerformed (java.awt.event.ActionEvent evt) {
            okBtnActionPerformed (evt);
          }
        }
      );
      jPanel1.add (okBtn);

      cancelBtn = new javax.swing.JButton ();
      cancelBtn.setText ("Cancel");
      cancelBtn.setActionCommand ("Cancel");
      cancelBtn.addActionListener (new java.awt.event.ActionListener () {
          public void actionPerformed (java.awt.event.ActionEvent evt) {
            cancelBtnActionPerformed (evt);
          }
        }
      );
      jPanel1.add (cancelBtn);

    getContentPane ().add (jPanel1, "South");

    jPanel2 = new javax.swing.JPanel ();
    jPanel2.setLayout (new java.awt.GridBagLayout ());
    java.awt.GridBagConstraints gridBagConstraints1;

      nameLbl = new javax.swing.JLabel ();
      nameLbl.setText ("State Name:    ");
      nameLbl.setForeground (java.awt.Color.black);
      gridBagConstraints1 = new java.awt.GridBagConstraints ();
      gridBagConstraints1.gridx = 1;
      gridBagConstraints1.gridy = 1;
      gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
      jPanel2.add (nameLbl, gridBagConstraints1);

      jLabel5 = new javax.swing.JLabel ();
      jLabel5.setText (" ");
      jLabel5.setForeground (java.awt.Color.black);
      gridBagConstraints1 = new java.awt.GridBagConstraints ();
      gridBagConstraints1.gridx = 1;
      gridBagConstraints1.gridy = 6;
      jPanel2.add (jLabel5, gridBagConstraints1);

      jLabel6 = new javax.swing.JLabel ();
      jLabel6.setText ("State Description:  ");
      jLabel6.setForeground (java.awt.Color.black);
      gridBagConstraints1 = new java.awt.GridBagConstraints ();
      gridBagConstraints1.gridx = 1;
      gridBagConstraints1.gridy = 8;
      gridBagConstraints1.gridwidth = 2;
      gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
      jPanel2.add (jLabel6, gridBagConstraints1);

		descText = new javax.swing.JTextArea ();
		descText.setColumns(80);
		descText.setPreferredSize(new java.awt.Dimension(1000, 400));
		descText.setMinimumSize (new java.awt.Dimension(0, 100));

		//	Added by hand due to forte backward compatibility problem.
		scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new java.awt.Dimension(500,150));
		scrollPane.setViewportView (descText);

		gridBagConstraints1 = new java.awt.GridBagConstraints ();
		gridBagConstraints1.gridx = 1;
		gridBagConstraints1.gridy = 9;
		gridBagConstraints1.gridwidth = 2;
		gridBagConstraints1.gridheight = 5;
		gridBagConstraints1.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints1.weightx = 1.0;
		gridBagConstraints1.weighty = 1.0;
		jPanel2.add (scrollPane, gridBagConstraints1);

      jComboBox1 = new javax.swing.JComboBox ();
      gridBagConstraints1 = new java.awt.GridBagConstraints ();
      gridBagConstraints1.gridx = 2;
      gridBagConstraints1.gridy = 1;
      jPanel2.add (jComboBox1, gridBagConstraints1);

    getContentPane ().add (jPanel2, "Center");

  }//GEN-END:initComponents



	//======================================================
	//======================================================
	private void cancelBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
		doClose(PogoAppliDefs.RET_CANCEL);
	}//GEN-LAST:event_cancelBtnActionPerformed

	//======================================================
	//======================================================
	private void okBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
		//	Check if state already exists
		String	name = jComboBox1.getSelectedItem().toString();
		for (int i=0 ; i<server.states.size() ; i++)
		{
			DevState	state = server.states.stateAt(i);
			if (state.name.equals(name) && i!=state_idx)
			{
				app_util.PopupError.show(this, "State " + name + " Already Exists !");
				return;
			}
		}
		doClose(PogoAppliDefs.RET_OK);
	}//GEN-LAST:event_okBtnActionPerformed

	//======================================================
	/** Closes the dialog */
	//======================================================
	private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
		doClose(PogoAppliDefs.RET_CANCEL);
	}//GEN-LAST:event_closeDialog
	//======================================================
	//======================================================
	private void doClose(int retStatus)
	{
		returnStatus = retStatus;
		setVisible (false);
		dispose ();
	}

	//======================================================
	//======================================================
	private void initializeWindow(DevState state)
	{
		if (state!=null)
		{
			//  Initialize Window with input parameters
			//-----------------------------------------------
			for (int i=0 ; i<TangoStatesArray.length ; i++)
			if (TangoStatesArray[i].equals(state.name))
				jComboBox1.setSelectedIndex(i);

			if (state.description!=null)
				descText.setText(state.description);
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
	public DevState  getInput()
	{
		return new DevState(
			jComboBox1.getSelectedItem().toString(), descText.getText());
	}
	//======================================================
	public String  getInputName()
	{
		return jComboBox1.getSelectedItem().toString();
	}
	//======================================================
	public String  getInputDescription()
	{
		return descText.getText();
	}

// Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JButton okBtn;
  private javax.swing.JButton cancelBtn;
  private javax.swing.JLabel nameLbl;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JTextArea descText;
  private javax.swing.JComboBox jComboBox1;
  private JScrollPane			scrollPane;
// End of variables declaration//GEN-END:variables


}
