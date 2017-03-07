//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  Basic Dialog Class to display info
//
// $Author$
//
// $Revision$
// $Log$
// Revision 3.2  2005/01/13 08:09:07  pascal_verdier
// Do not fix the scroll pane size (done at pack()).
//
//
//
// Copyleft 2005 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.appli;

import pogo.gene.Attrib;
import pogo.gene.Cmd;
import pogo.gene.DevState;
import pogo.gene.PogoClass;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;


//===============================================================
/**
 *	Class Description: Basic Dialog Class to display info
 *
 *	@author  root
 */
//===============================================================


public class StateMachineDialog extends JDialog {
	private int			retVal = JOptionPane.OK_OPTION;
	private PogoClass	server;

	//===============================================================
	/**
	 *	Creates new form StateMachineDialog
	 */
	//===============================================================
	public StateMachineDialog(JFrame parent, PogoClass server) {
		super(parent, true);
		this.server = server;
		initComponents();
		createOwnComponents();

		pack();
		PogoAppli.centerDialog(this, parent);
	}
	//===============================================================
	/**
	 *	Creates own components
	 */
	//===============================================================
	private Vector	cmdBtn = new Vector();
	private Vector	attBtn = new Vector();
	private void createOwnComponents()
	{
		//-------------------------
		//	Commands
		//-------------------------
		int	y = 1;
		GridBagConstraints	gbc = new GridBagConstraints ();
		gbc.anchor = GridBagConstraints.WEST;

		//	First a left merge
		gbc.gridx = 0;
		gbc.gridy = 0;
		mainPanel.add(new JLabel("   "), gbc);

		//	A title
		JLabel	lbl = new JLabel("Commands :");
		gbc.gridx = 1;
		gbc.gridy = y++;
		lbl.setFont(new Font("Dialog", 0, 18));
		mainPanel.add(lbl, gbc);

		//	And state names
		int	x = 2;
		for (int i=0 ; i<server.states.size() ; i++)
		{
			gbc.gridx = x++;
			gbc.gridy = y;
			mainPanel.add(new JLabel("   "), gbc);

			DevState	state = server.states.stateAt(i);
			gbc.gridx = x++;
			gbc.gridy = y;
			mainPanel.add(new JLabel(state.name), gbc);
		}
		//	And finaly a right merge
		gbc.gridx = x++;
		gbc.gridy = y;
		mainPanel.add(new JLabel("   "), gbc);

		y++;
		for (int i=2 ; i<server.commands.size() ; i++, y++)
		{
			//	Create label with command name
			x = 1;
			Cmd	cmd = server.commands.cmdAt(i);
			gbc.gridx = x++;
			gbc.gridy = y;
			mainPanel.add(new JLabel(cmd.name), gbc);

			Vector	r_btn = new Vector();
			for (int st=0 ; st<server.states.size() ; st++)
			{
				DevState	state = server.states.stateAt(st);
				gbc.gridx = x++;
				gbc.gridy = y;
				mainPanel.add(new JLabel("   "), gbc);

				//	Create radio button and store instance in vector
				gbc.gridx = x++;
				gbc.gridy = y;
				JRadioButton	btn = new JRadioButton("Allowed");
				btn.setSelected(true);
				btn.setFont(new Font("Dialog", 0, 10));
				r_btn.add(btn);
				mainPanel.add(btn, gbc);
				
				//	Check if cmd allowed for state
				for (int naf=0 ; naf<cmd.notAllowedFor.size() ; naf++)
				{
					if (state.name.equals(cmd.notAllowedFor.stateAt(naf).name))
						btn.setSelected(false);
				}
			}
			//	store radio button instances in a vector
			cmdBtn.add(r_btn);
		}

		//	Create Dummy label as separator
		for (int i=0 ; i<4 ; i++, y++)
		{
			x = 1;
			gbc.gridx = x;
			gbc.gridy = y;
			mainPanel.add(new JLabel(" "), gbc);
		}



		//-------------------------
		//	Attributes
		//-------------------------
		gbc.gridx = 1;
		gbc.gridy = y++;
		lbl = new JLabel("Attributes :");
		lbl.setFont(new Font("Dialog", 0, 18));
		mainPanel.add(lbl, gbc);
		x = 2;
		for (int i=0 ; i<server.states.size() ; i++)
		{
			gbc.gridx = x++;
			gbc.gridy = y;
			mainPanel.add(new JLabel("   "), gbc);

			DevState	state = server.states.stateAt(i);
			gbc.gridx = x++;
			gbc.gridy = y;
			mainPanel.add(new JLabel(state.name), gbc);
		}
		y++;
		for (int i=0 ; i<server.attributes.size() ; i++, y++)
		{
			//	Create label with attribute name
			x = 1;
			Attrib	att = server.attributes.attributeAt(i);
			gbc.gridx = x++;
			gbc.gridy = y;
			mainPanel.add(new JLabel(att.name), gbc);

			Vector	r_btn = new Vector();
			for (int st=0 ; st<server.states.size() ; st++)
			{
				DevState	state = server.states.stateAt(st);
				gbc.gridx = x++;
				gbc.gridy = y;
				mainPanel.add(new JLabel("   "), gbc);

				//	Create radio button and store instance in vector
				gbc.gridx = x++;
				gbc.gridy = y;
				JRadioButton	btn = new JRadioButton("Allowed");
				btn.setFont(new Font("Dialog", 0, 10));
				btn.setSelected(true);
				r_btn.add(btn);
				mainPanel.add(btn, gbc);
				
				//	Check if cmd allowed for state
				for (int naf=0 ; naf<att.notAllowedFor.size() ; naf++)
				{
					if (state.name.equals(att.notAllowedFor.stateAt(naf).name))
						btn.setSelected(false);
				}
			}
			//	store radio button instances in a vector
			attBtn.add(r_btn);
		}

		//	Create Dummy label as separator
		for (int i=0 ; i<2 ; i++, y++)
		{
			x = 1;
			gbc.gridx = x;
			gbc.gridy = y;
			mainPanel.add(new JLabel(" "), gbc);
		}
//		jScrollPane1.setPreferredSize(new java.awt.Dimension(640, 480));
	}

	//===============================================================
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
	//===============================================================
        private void initComponents() {//GEN-BEGIN:initComponents
              jPanel1 = new javax.swing.JPanel();
              okBtn = new javax.swing.JButton();
              cancelBtn = new javax.swing.JButton();
              jPanel2 = new javax.swing.JPanel();
              titleLabel = new javax.swing.JLabel();
              jScrollPane1 = new javax.swing.JScrollPane();
              mainPanel = new javax.swing.JPanel();
              
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
              
              jPanel1.add(okBtn);
              
              cancelBtn.setText("Cancel");
              cancelBtn.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                      cancelBtnActionPerformed(evt);
                  }
              });
              
              jPanel1.add(cancelBtn);
              
              getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);
              
              titleLabel.setFont(new java.awt.Font("Dialog", 1, 18));
              titleLabel.setText("State Machine");
              jPanel2.add(titleLabel);
              
              getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);
              
              mainPanel.setLayout(new java.awt.GridBagLayout());
              java.awt.GridBagConstraints gridBagConstraints1;
              
              jScrollPane1.setViewportView(mainPanel);
              
              getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
            
            pack();
        }//GEN-END:initComponents

	//===============================================================
	//===============================================================
	private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
		retVal = JOptionPane.OK_OPTION;

		//	Get selected radion buttons for commands
		for (int i=0 ; i<cmdBtn.size() ; i++)
		{
			Cmd	cmd = server.commands.cmdAt(i+2);
			cmd.notAllowedFor.clear();
			Vector	v = (Vector)cmdBtn.elementAt(i);
			for (int j=0 ; j<v.size() ; j++)
			{
				JRadioButton	b = (JRadioButton) v.elementAt(j);
				if (b.getSelectedObjects()==null)
				{
					DevState	state = server.states.stateAt(j);
					cmd.notAllowedFor.add(state);
				}
			}
		}

		//	Get selected radion buttons for attributes
		for (int i=0 ; i<attBtn.size() ; i++)
		{
			Attrib	att = server.attributes.attributeAt(i);
			att.notAllowedFor.clear();
			Vector	v = (Vector)attBtn.elementAt(i);
			for (int j=0 ; j<v.size() ; j++)
			{
				JRadioButton	b = (JRadioButton) v.elementAt(j);
				if (b.getSelectedObjects()==null)
				{
					DevState	state = server.states.stateAt(j);
					att.notAllowedFor.add(state);
				}
			}
		}
		
		doClose();
	}//GEN-LAST:event_okBtnActionPerformed

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
	/**
	 *	Closes the dialog
	 */
	//===============================================================
	private void doClose()
	{
		setVisible(false);
		dispose();
	}
	//===============================================================
	//===============================================================
	public int showDialog()
	{
		setVisible(true);
		return retVal;
	}

	//===============================================================
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel jPanel1;
        private javax.swing.JButton okBtn;
        private javax.swing.JButton cancelBtn;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JLabel titleLabel;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JPanel mainPanel;
        // End of variables declaration//GEN-END:variables
	//===============================================================

}
