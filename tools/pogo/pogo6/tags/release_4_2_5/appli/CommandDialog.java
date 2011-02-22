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
// Revision 3.7  2005/01/25 15:29:09  pascal_verdier
// ATTR_SOLEIL param added to do not force upper case at befinig of attribute name.
//
// Revision 3.6  2004/12/08 10:03:32  pascal_verdier
// Bug on ComboBox fixed.
//
// Revision 3.5  2004/11/29 09:53:50  pascal_verdier
// NotAllowedDialog constructor call has been modified for title.
//
// Revision 3.4  2004/11/22 11:12:06  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
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
 *	A Dialog Class to get the Command parameters.
 */
//===============================================================
public class CommandDialog extends javax.swing.JDialog  implements PogoAppliDefs {

	/**
	 *	Used to keep the previous input as command name
	 */
	private static String	cmd_gotten = "";

	private JFrame 			parent;
	private DevStateTable	notAllowedFor;
	private int 			returnStatus = PogoAppliDefs.RET_CANCEL;
	private	int				poll_period = 0;
	private PogoClass		server;
	private	int				cmd_idx = -1;
	
//===================================================================
/**
 *	 Initializes the Form 
 */
//===================================================================
	public CommandDialog(JFrame parent, PogoClass server, Cmd cmd, int action)
	{
		super (parent, true);
		this.parent = parent;
		this.server = server;
		initComponents ();
		//	Problem with forte !! 
		//	Use code by hand.
		//-----------------------
		addElements();
	
	    //  init comboboxes
		//-----------------------
		for (int i=0 ; i<standardCommandNames.length ; i++)
			nameComboBox.addItem(standardCommandNames[i]);
		for (int i=0 ; i<TangoTypesArray.length ; i++)
		{
			arginComboBox.addItem(TangoTypesArray[i]);
			argoutComboBox.addItem(TangoTypesArray[i]);
		}
		arginComboBox.setMaximumRowCount(12);
		argoutComboBox.setMaximumRowCount(12);
		if (cmd==null || action==pogo.gene.PogoDefs.CREATING)
			cmd_idx = -1;
		else
		for (int i=0 ; i<server.commands.size() ; i++)
			if (server.commands.cmdAt(i) == cmd)
				cmd_idx = i;
		initializeDialogFromCmd(cmd);
		pack ();
	}

//===================================================================
/**
 *	 Add components in window
 */
//===================================================================
	private void addElements()
	{
		//	Add radio box for expert/operator
		//-------------------------------------------------------------
		levelBtn = new javax.swing.JRadioButton ();
		levelBtn.setToolTipText ("Display Level (expert or operator)");
		levelBtn.setText (" Expert Only  ");

		//	Manage grid bag layout
		GridBagConstraints gbc = new GridBagConstraints ();
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		jPanel2.add (new JLabel("  "), gbc);
		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		jPanel2.add (levelBtn, gbc);
		
		//	Add radio box for command polled
		//-------------------------------------------------------------
		polledBtn = new javax.swing.JRadioButton ();
		polledBtn.setToolTipText ("Command polled.");
		polledBtn.setText (" Polled  ");
		gbc.gridx = 4;
		gbc.gridy = 1;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		jPanel2.add (polledBtn, gbc);
		
		polledBtn.addActionListener (new java.awt.event.ActionListener () {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				polledBtnActionPerformed (evt);
				}
			});

		//	Add an action performed method because
		//	polled btn must be active only if argin is void.
		//-------------------------------------------------------
		arginComboBox.addActionListener (new java.awt.event.ActionListener () {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				arginCBActionPerformed (evt);
				}
			});

		//	Add components for period polling
		periodLabel = new JLabel("Period :");
		periodLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		gbc.gridx = 2;
		gbc.gridy = 2;
		jPanel2.add (periodLabel, gbc);
		
		periodText = new JTextField();
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		jPanel2.add (periodText, gbc);
		periodText.setRequestFocusEnabled(true);

		periodUnitLabel = new JLabel(" ms  ");
		gbc.gridx = 5;
		gbc.gridy = 2;
		jPanel2.add (periodUnitLabel, gbc);
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
              nameLbl = new javax.swing.JLabel();
              jLabel1 = new javax.swing.JLabel();
              arginComboBox = new javax.swing.JComboBox();
              jLabel2 = new javax.swing.JLabel();
              argoutComboBox = new javax.swing.JComboBox();
              jLabel8 = new javax.swing.JLabel();
              arginDescText = new javax.swing.JTextField();
              jLabel4 = new javax.swing.JLabel();
              argoutDescText = new javax.swing.JTextField();
              jLabel5 = new javax.swing.JLabel();
              jLabel6 = new javax.swing.JLabel();
              allowedBtn = new javax.swing.JButton();
              jScrollPane1 = new javax.swing.JScrollPane();
              cmdDescText = new javax.swing.JTextArea();
              nameComboBox = new javax.swing.JComboBox();
              jLabel3 = new javax.swing.JLabel();
              jLabel7 = new javax.swing.JLabel();
              arginDescBtn = new javax.swing.JButton();
              argoutDecBtn = new javax.swing.JButton();
              
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
              
              jPanel2.setMinimumSize(new java.awt.Dimension(220, 230));
              nameLbl.setText("Command Name:");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 0;
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(nameLbl, gridBagConstraints1);
              
              jLabel1.setText("Argin Type:");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 4;
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(jLabel1, gridBagConstraints1);
              
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 1;
              gridBagConstraints1.gridy = 4;
              jPanel2.add(arginComboBox, gridBagConstraints1);
              
              jLabel2.setText("Argout Type:");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 7;
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(jLabel2, gridBagConstraints1);
              
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 1;
              gridBagConstraints1.gridy = 7;
              jPanel2.add(argoutComboBox, gridBagConstraints1);
              
              jLabel8.setText("Argin Description:");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 5;
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(jLabel8, gridBagConstraints1);
              
              arginDescText.setColumns(20);
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 1;
              gridBagConstraints1.gridy = 5;
              gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
              jPanel2.add(arginDescText, gridBagConstraints1);
              
              jLabel4.setText("Argout Description:  ");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 8;
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(jLabel4, gridBagConstraints1);
              
              argoutDescText.setColumns(20);
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 1;
              gridBagConstraints1.gridy = 8;
              gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
              jPanel2.add(argoutDescText, gridBagConstraints1);
              
              jLabel5.setText(" ");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 6;
              jPanel2.add(jLabel5, gridBagConstraints1);
              
              jLabel6.setText("Command Description:  ");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 13;
              jPanel2.add(jLabel6, gridBagConstraints1);
              
              allowedBtn.setText("Command Allowed For States....");
              allowedBtn.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
              allowedBtn.setPreferredSize(new java.awt.Dimension(167, 30));
              allowedBtn.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                      allowedBtnActionPerformed(evt);
                  }
              });
              
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 12;
              gridBagConstraints1.gridwidth = 2;
              gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
              jPanel2.add(allowedBtn, gridBagConstraints1);
              
              jScrollPane1.setForeground(java.awt.Color.lightGray);
                jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 150));
                cmdDescText.setColumns(80);
                cmdDescText.setMinimumSize(new java.awt.Dimension(0, 100));
                cmdDescText.setPreferredSize(new java.awt.Dimension(880, 400));
                jScrollPane1.setViewportView(cmdDescText);
                
                gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 14;
              gridBagConstraints1.gridwidth = 6;
              gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
              gridBagConstraints1.weightx = 1.0;
              jPanel2.add(jScrollPane1, gridBagConstraints1);
              
              nameComboBox.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                      nameComboBoxActionPerformed(evt);
                  }
              });
              
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 1;
              gridBagConstraints1.gridy = 0;
              jPanel2.add(nameComboBox, gridBagConstraints1);
              
              jLabel3.setText("    ");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 11;
              jPanel2.add(jLabel3, gridBagConstraints1);
              
              jLabel7.setText(" ");
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 0;
              gridBagConstraints1.gridy = 1;
              jPanel2.add(jLabel7, gridBagConstraints1);
              
              arginDescBtn.setText("....");
              arginDescBtn.setMargin(new java.awt.Insets(2, 8, 2, 8));
              arginDescBtn.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                      arginDescBtnActionPerformed(evt);
                  }
              });
              
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 2;
              gridBagConstraints1.gridy = 5;
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(arginDescBtn, gridBagConstraints1);
              
              argoutDecBtn.setText("....");
              argoutDecBtn.setMargin(new java.awt.Insets(2, 8, 2, 8));
              argoutDecBtn.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                      argoutDecBtnActionPerformed(evt);
                  }
              });
              
              gridBagConstraints1 = new java.awt.GridBagConstraints();
              gridBagConstraints1.gridx = 2;
              gridBagConstraints1.gridy = 8;
              gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
              jPanel2.add(argoutDecBtn, gridBagConstraints1);
              
              getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);
            
        }//GEN-END:initComponents

//===================================================================
//===================================================================
	private void arginDescBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arginDescBtnActionPerformed
		EditDialog	dialog = new EditDialog(parent, arginDescText.getText());
		if (dialog.showDialog()==PogoAppliDefs.RET_OK)
		{
			arginDescText.setText(dialog.getText());
		}
	}//GEN-LAST:event_arginDescBtnActionPerformed

//===================================================================
//===================================================================
	private void argoutDecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_argoutDecBtnActionPerformed
		EditDialog	dialog = new EditDialog(parent, argoutDescText.getText());
		if (dialog.showDialog()==PogoAppliDefs.RET_OK)
		{
			argoutDescText.setText(dialog.getText());
		}
	}//GEN-LAST:event_argoutDecBtnActionPerformed

//===================================================================
//===================================================================
	private void polledBtnActionPerformed (java.awt.event.ActionEvent evt) {
		boolean state = (polledBtn.getSelectedObjects()!=null);
		setPeriodEnabled(state);
		if (state==true)
		{
			periodText.selectAll();
			periodText.requestFocus();
		}
	}
//===================================================================
//===================================================================
	private void arginCBActionPerformed (java.awt.event.ActionEvent evt) {

		//	if argin is not void --> command cannot be polled
 		switch(arginComboBox.getSelectedIndex())
		{
		case 0:	//	void 
			polledBtn.setEnabled(true);
			break;
		default:
			polledBtn.setEnabled(false);
			polledBtn.setSelected(false);
			setPeriodEnabled(false);
			break;
		}
	}
//===================================================================
//===================================================================
	private void nameComboBoxActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameComboBoxActionPerformed
		String cmd_name = 	
				nameComboBox.getSelectedItem().toString();
		//	If "Define a Specific Command" command
		//	Get the command name
		//--------------------------------------------
		if (cmd_name.equals(specif_cmd))
		{
			String	newCmd = null;
			do
			{
				newCmd = (String)	JOptionPane.showInputDialog(this,
												"Command Name", 
												"Input Dialog",
												JOptionPane.INFORMATION_MESSAGE,
												null, null, cmd_gotten);
				if (newCmd==null)
				{
					//	set previous item
					boolean	found = false;
					for (int i=0 ; i<nameComboBox.getItemCount() ; i++)
					{
						String	item = (String) nameComboBox.getItemAt(i);
						if (item.equals(cmd_gotten))
						{
							nameComboBox.setSelectedIndex(i);
							found = true;
						}
					}
					if (!found)
						nameComboBox.setSelectedIndex(0);
					return;
				}

				cmd_gotten = newCmd;
			}
			while (newCmd==null);
			initializeCmdComboBox(newCmd);
		}
	}//GEN-LAST:event_nameComboBoxActionPerformed



//===================================================================
//===================================================================
	public void initializeCmdComboBox(String cmd)
	{
        //  Initialize Window with Command's parameters
        //-----------------------------------------------
        //nameText.setText(cmd.command);
		boolean	std_cmd = false;
		for (int i=0 ; i<standardCommandNames.length ; i++)
			if (standardCommandNames[i].equals(cmd))
			{
		  		std_cmd = true;
				nameComboBox.setSelectedIndex(i);
			}
		if (std_cmd)
			return;

		//	If not Standard Check if already exists
		//--------------------------------------------
		for (int i=0 ; i<nameComboBox.getItemCount() ; i++)
		{
			String	item = ((String) nameComboBox.getItemAt(i)).toLowerCase();
			if (item.equals(cmd.toLowerCase()))
			{
				nameComboBox.setSelectedIndex(i);
				return;
			}
		}

		//	Else insert it.nearly the end of list
		//--------------------------------------------
		int pos = nameComboBox.getItemCount()-1;
	    nameComboBox.insertItemAt(cmd, pos);
		nameComboBox.setSelectedIndex(pos);
	}
//===================================================================
//===================================================================
  public int showDialog()
  {
	PogoAppli.centerDialog(this, parent);
	setVisible(true);
	return returnStatus;
  }

//===================================================================
//===================================================================
	private void initializeDialogFromCmd(Cmd cmd)
	{
		if (cmd!=null)
		{
			initializeCmdComboBox(cmd.name);

			//	Args in/out types
			//--------------------------------
			for (int i=0 ; i<TangoTypesArray.length ; i++)
			{
				if (TangoTypesArray[i].equals(cmd.argin.cpp_code_str))
					arginComboBox.setSelectedIndex(i);
				if (TangoTypesArray[i].equals(cmd.argout.cpp_code_str))
					argoutComboBox.setSelectedIndex(i);
			}
			//	descriptions
			//-------------------------------
			if (cmd.argin.description!=null)
				arginDescText.setText(cmd.argin.description);
			if (cmd.argout.description!=null)
				argoutDescText.setText(cmd.argout.description);
			if (cmd.description!=null)
				cmdDescText.setText(cmd.description);

			//	State for allowance
			notAllowedFor = new DevStateTable(cmd.notAllowedFor);

			//	Display level
			if (cmd.level==DispLevel.EXPERT)
				levelBtn.setSelected(true);

			//	Check if command polled
			if ((poll_period=cmd.polled_period)>0)
			{
				polledBtn.setSelected(true);
				setPeriodEnabled(true);
			}
			else
				setPeriodEnabled(false);
		}
	}
//===================================================================
//===================================================================

	private void allowedBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allowedBtnActionPerformed
		if (server.states.size()==0)
		{
			JOptionPane.showMessageDialog(this,
						"There is no state defined !",
						"Error Window",
						JOptionPane.ERROR_MESSAGE);
			return;
		}
		String	cmd_name = 
				nameComboBox.getSelectedItem().toString();
		NotAllowedDialog	dialog =
			new NotAllowedDialog(parent, "Command " + cmd_name, server.states);
		int ret = dialog.showDialog(notAllowedFor);

		if (ret==PogoAppliDefs.RET_OK)
			notAllowedFor = dialog.getInput();

	}//GEN-LAST:event_allowedBtnActionPerformed
//===================================================================
//===================================================================
	private void nameTextActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
	}//GEN-LAST:event_nameTextActionPerformed


//===================================================================
//===================================================================
	private void cancelBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
		doClose(PogoAppliDefs.RET_CANCEL);
	}//GEN-LAST:event_cancelBtnActionPerformed

//===================================================================
//===================================================================
	private int controlPeriodText()
	{
		//	If command must be polled control if period polling is correct
		if (polledBtn.getSelectedObjects()!=null)
		{
			String	s = periodText.getText();
			try {
				poll_period = Integer.parseInt(s);

				//	Control if value not too small
				if (poll_period < PogoAppliDefs.POLLING_PERIOD_MIN)
				{
					app_util.PopupError.show(parent,
									"The polling period minimum value is  " +
									PogoAppliDefs.POLLING_PERIOD_MIN + " ms");
					return PogoAppliDefs.RET_ERROR;
				}
				else
					return PogoAppliDefs.RET_OK;
			}
			catch(Exception e)
			{
				app_util.PopupError.show(parent,  e.toString() +
									"\n\nBad Value in Polling period field !");
				return PogoAppliDefs.RET_ERROR;
			}
		}
		return PogoAppliDefs.RET_OK;
	}
//===================================================================
//===================================================================
	private	String	cmd_name;
	private void okBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

		cmd_name = nameComboBox.getSelectedItem().toString();
		try
		{
			cmd_name = PogoUtil.checkCmdAttrName(cmd_name,
						server.commands, server.attributes, cmd_idx, COMMANDS);
		}
		catch(PogoException e)
		{
			JOptionPane.showMessageDialog(this,
						e.toString(),
						"Error Window",
						JOptionPane.INFORMATION_MESSAGE);
			//nameComboBox.setSelectedIndex(0);
			return;
		}
		cmd_gotten = new String(cmd_name);

		if (controlPeriodText()==PogoAppliDefs.RET_OK)
			doClose(PogoAppliDefs.RET_OK);
	
	}//GEN-LAST:event_okBtnActionPerformed

//===================================================================
  /** Closes the dialog */
//===================================================================
	private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
		doClose(PogoAppliDefs.RET_CANCEL);
	}//GEN-LAST:event_closeDialog

//===================================================================
//===================================================================
	private void doClose(int retStatus)
	{
		returnStatus = retStatus;
		setVisible (false);
		dispose ();
	}

//===================================================================
//===================================================================
 public Cmd  getInput()
  {
	DispLevel	level = (levelBtn.getSelectedObjects()==null) ? 
						DispLevel.OPERATOR : DispLevel.EXPERT ;

	//	Create a new Cmd object
	//--------------------------------
    Cmd		cmd =  new Cmd(	cmd_name,
							cmd_name +"Cmd",
							arginComboBox.getSelectedItem().toString(),
							argoutComboBox.getSelectedItem().toString(),
							arginDescText.getText(),
							argoutDescText.getText(),
							cmdDescText.getText(), level);
	//	Add allowed states
	if (notAllowedFor==null)
		notAllowedFor = new DevStateTable();
	cmd.setNotAllowedFor(notAllowedFor);

	//	Add polling period or reset it
	if (polledBtn.getSelectedObjects()!=null)
		cmd.polled_period = poll_period;
	else
		cmd.polled_period = 0;

	return cmd;
  }
//===================================================================
//===================================================================
	private void setPeriodEnabled(boolean state)
	{
		periodLabel.setVisible(state);
		periodText.setVisible(state);
		periodUnitLabel.setVisible(state);
		if (state==true)
		{
			//	Default value if never set
			String	txt;
			if (poll_period==0)
				txt = "2000";
			else
				txt = "" + poll_period;
			periodText.setText(txt);
		}
	}
//===================================================================
//===================================================================

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel jPanel1;
        private javax.swing.JButton okBtn;
        private javax.swing.JButton cancelBtn;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JLabel nameLbl;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JComboBox arginComboBox;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JComboBox argoutComboBox;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JTextField arginDescText;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JTextField argoutDescText;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JButton allowedBtn;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea cmdDescText;
        private javax.swing.JComboBox nameComboBox;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JButton arginDescBtn;
        private javax.swing.JButton argoutDecBtn;
        // End of variables declaration//GEN-END:variables

	//	Added components.
	private JRadioButton	levelBtn;
	private JRadioButton	polledBtn;
	private JLabel			periodLabel;
	private JLabel			periodUnitLabel;
	private JTextField		periodText;
}
