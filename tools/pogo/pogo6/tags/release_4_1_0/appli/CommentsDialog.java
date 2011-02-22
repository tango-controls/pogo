//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  Dialog Class to Edit Comments.
//
// $Author$
//
// $Revision$
//
// $Log$
//
// Copyleft 2003 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================


package pogo.appli;

import fr.esrf.TangoDs.*;
import pogo.gene.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

import java.beans.*;
import javax.swing.table.*;
import com.braju.format.Format;


//===============================================================
/**
 *	Class Description: Dialog Class to edit comments for commands,
 *		attributes, States and Properties..
 *	This class uses the JTable, MultiLineCellEditor and
 *		MultiLineCellRenderer classes.
 *
 *	@author  verdier
 */
//===============================================================


public class CommentsDialog extends JDialog implements TangoConst,PogoAppliDefs {
	/**
	 *	Events Table 
	 */
	private DataTableModel	model;
	/**
	 *	Commands vector
	 */
	private CmdTable	cmd_vector;
	/**
	 *	Attribute vector
	 */
	private AttribTable	attr_vector;
	/**
	 *	Property vector
	 */
	private PropertyTable prop_vector;
	/**
	 *	States vector
	 */
	private DevStateTable state_vector;
    /**
	 *	Names of the columns in the table
	 */
    private String[] COL_NAMES = {
        "Name",
		"Description",
		"Input arg. description",
		"Output arg. description"
    };
    /**
	 *	Width of the columns in the table
	 */
	private static final	int col_width[] = { 100, 400, 200, 200 };

	private static final	int NAME = 0;
	private static final	int DESCRIPTION = 1;
	private static final	int ARGIN_DESC  = 2;
	private static final	int ARGOUT_DESC = 3;

	private static final	boolean	modal   = true;
	private static 			boolean	modified= false;

	private static JFrame	parent;
	private static int		manage;
	//private CmdTable		tmp_cmd_vector   = null;
	private Vector			tmp_cmd_vector   = null;
	private Vector			tmp_attr_vector  = null;
	private Vector			tmp_prop_vector  = null;
	private Vector			tmp_state_vector = null;
	//===============================================================
	//===============================================================
	private void componentFactory()
	{
		COL_NAMES[1] = collec_names[manage] + "  " + COL_NAMES[1];

		initComponents();
		initMyComponents();
		titleLabel.setText(collec_names[manage] + " Description");

		pack();
		PogoAppli.centerDialog(this, parent);
	}
	//===============================================================
	/**
	 *	Creates new form CommentsDialog for table
	 */
	//===============================================================
	public CommentsDialog(JFrame parent, CmdTable cmd_vector)
	{
		super(parent, modal);

		this.parent     = parent;
		this.cmd_vector = cmd_vector;
		this.manage     = COMMANDS;
		componentFactory();
 	}
	//===============================================================
	/**
	 *	Creates new form CommentsDialog for Attribute
	 */
	//===============================================================
	public CommentsDialog(JFrame parent, AttribTable attr_vector)
	{
		super(parent, modal);

		this.parent      = parent;
		this.attr_vector = attr_vector;
		this.manage      = ATTRIBUTES;
		componentFactory();
	}
	//===============================================================
	/**
	 *	Creates new form CommentsDialog for Attribute
	 */
	//===============================================================
	public CommentsDialog(JFrame parent, DevStateTable state_vector)
	{
		super(parent, modal);

		this.parent       = parent;
		this.state_vector = state_vector;
		this.manage       = STATES;
		componentFactory();
	}
	//===============================================================
	/**
	 *	Creates new form CommentsDialog for Properties
	 */
	//===============================================================
	public CommentsDialog(JFrame parent, PropertyTable prop_vector, int manage)
	{
		super(parent, modal);

		this.parent      = parent;
		this.prop_vector = prop_vector;
		this.manage      = manage;
		componentFactory();
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
		cancelBtn = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		titleLabel = new javax.swing.JLabel();

		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				closeDialog(evt);
			}
		});

		JButton	applyBtn = new JButton("Apply");
		applyBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				applyBtnActionPerformed(evt);
			}
		});
		jPanel1.add(applyBtn);

		cancelBtn.setText("Dismiss");
		cancelBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelBtnActionPerformed(evt);
			}
		});

		jPanel1.add(cancelBtn);

		getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

		titleLabel.setFont(new java.awt.Font("Dialog", 1, 18));
		titleLabel.setText("Dialog Title");
		jPanel2.add(titleLabel);

		getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

		pack();
	}//GEN-END:initComponents

	//===============================================================
	//===============================================================
	private static JTable	descTable;
	private void initMyComponents()
	{
		try
		{
 			//	Initialise the final XML objects
        	model    = new DataTableModel();

   	  		 // Create the table
        	final JTable table = new JTable(model);
			descTable = table;
			displayDescriptions();

			final Enumeration cenum = table.getColumnModel().getColumns();
			TableColumn tc;
			int	width = 0;
			for (int i=0 ; cenum.hasMoreElements() ; i++)
			{ 
				tc = (TableColumn)cenum.nextElement();
				tc.setPreferredWidth(col_width[i]);
				width += col_width[i];
			}


			//	Create multi line Editor
			MultiLineCellEditor editor = new MultiLineCellEditor(table);
			table.setDefaultEditor(String.class, editor);

			//	Get table size to fix Scroll pane size
			int	height = 20;	//descTable.getTableHeader().getHeight();
			for (int i=0 ; i<descTable.getModel().getRowCount() ; i++)
				height += descTable.getRowHeight(i);

			if (height>500)	height = 500;
			if (height<100)	height = 100;

			scrollPane = new JScrollPane(table);
			scrollPane.setPreferredSize(new Dimension(width, height));
			getContentPane().add(scrollPane, BorderLayout.CENTER);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			app_util.PopupError.show(parent, e.toString() +
							"\nCommentsDialog.initMyComponents()");
		}
	}
	//===============================================================
	//===============================================================
	private void displayDescriptions()
	{
		switch(manage)
		{
		case COMMANDS:
			if (tmp_cmd_vector==null)
				tmp_cmd_vector = new Vector();
			else
				tmp_cmd_vector.clear();
			for (int i=2 ; i<cmd_vector.size() ; i++)
			{
				Cmd	cmd = cmd_vector.cmdAt(i);
				String[]	tmp = new String[ARGOUT_DESC+1];
				tmp[0] = new String(cmd.name);
				tmp[1] = new String(cmd.description);
				tmp[2] = new String(cmd.argin.description);
				tmp[3] = new String(cmd.argout.description);
				tmp_cmd_vector.add(tmp);
			}

			//	And set  the JTable model
			model.fireTableDataChanged();
			break;
		case ATTRIBUTES:
			if (tmp_attr_vector==null)
				tmp_attr_vector = new Vector();
			else
				tmp_attr_vector.clear();
			for (int i=0 ; i<attr_vector.size() ; i++)
			{
				Attrib		attr = attr_vector.attributeAt(i);
				String[]	tmp  = new String[DESCRIPTION+1];
				tmp[NAME]        = new String(attr.name);

				if (attr.properties!=null && attr.properties[9]!=null)
				{
					tmp[DESCRIPTION] = new String(attr.properties[9]);
					
					//	For description the "\n" String must be replaced by Cr char
					StringBuffer	sb = new StringBuffer();
					for (int j=0 ; j<tmp[DESCRIPTION].length() ; j++)
						if (tmp[DESCRIPTION].charAt(j)=='\\' &&
							tmp[DESCRIPTION].charAt(j+1)=='n')
						{
							sb.append("\n");
							j++;
						}
						else
							sb.append((char)tmp[DESCRIPTION].charAt(j));
					tmp[DESCRIPTION] = sb.toString();
				}
				else
					tmp[DESCRIPTION] = "";
				tmp_attr_vector.add(tmp);
			}
			break;
		case CLASS_PROPERTIES:
		case DEV_PROPERTIES:
			if (tmp_prop_vector==null)
				tmp_prop_vector = new Vector();
			else
				tmp_prop_vector.clear();
			for (int i=0 ; i<prop_vector.size() ; i++)
			{
				Property	prop = prop_vector.propertyAt(i);
				String[]	tmp  = new String[DESCRIPTION+1];
				tmp[NAME]        = new String(prop.name);

				if (prop.description!=null)
					tmp[DESCRIPTION] = prop.description;
				else
					tmp[DESCRIPTION] = "";
				tmp_prop_vector.add(tmp);
			}
			break;
		case STATES:
			if (tmp_state_vector==null)
				tmp_state_vector = new Vector();
			else
				tmp_state_vector.clear();
			for (int i=0 ; i<state_vector.size() ; i++)
			{
				DevState	state = state_vector.stateAt(i);
				String[]	tmp   = new String[DESCRIPTION+1];
				tmp[NAME]         = new String(state.name);

				if (state.description!=null)
					tmp[DESCRIPTION] = state.description;
				else
					tmp[DESCRIPTION] = "";
				tmp_state_vector.add(tmp);
			}
			break;
		}
	}
	//===============================================================
	//===============================================================
	private void applyBtnActionPerformed(java.awt.event.ActionEvent evt) {

		///	Apply the Server object
		switch(manage)
		{
		case COMMANDS:
			for (int i=0 ; i<tmp_cmd_vector.size() ; i++)
			{
				Cmd			cmd     = cmd_vector.cmdAt(i+2);
				String[]	str = (String[])tmp_cmd_vector.elementAt(i);

				cmd.description        = str[DESCRIPTION];
				cmd.argin.description  = str[ARGIN_DESC];
				cmd.argout.description = str[ARGOUT_DESC];
			}
			break;
		case ATTRIBUTES:
			for (int i=0 ; i<tmp_attr_vector.size() ; i++)
			{
				Attrib		attr = attr_vector.attributeAt(i);
				String[]	str  = (String[])tmp_attr_vector.elementAt(i);
				//	Check if already created
				if (str[DESCRIPTION].length()>0)
				{
					if (attr.properties==null)
						attr.properties = new String[10];
					attr.properties[9] = str[DESCRIPTION];
					StringBuffer	sb = new StringBuffer();
					for (int j=0 ; j<str[DESCRIPTION].length() ; j++)
						if (str[DESCRIPTION].charAt(j)=='\n')
							sb.append("\\n");
						else
							sb.append((char)str[DESCRIPTION].charAt(j));
					attr.properties[9] = sb.toString();
				}
			}
			break;
		case CLASS_PROPERTIES:
		case DEV_PROPERTIES:
			for (int i=0 ; i<tmp_prop_vector.size() ; i++)
			{
				Property	prop = prop_vector.propertyAt(i);
				String[]	str  = (String[])tmp_prop_vector.elementAt(i);

				prop.description = str[DESCRIPTION];
			}
			break;
		case STATES:
			for (int i=0 ; i<tmp_state_vector.size() ; i++)
			{
				DevState	state = state_vector.stateAt(i);
				String[]	str  = (String[])tmp_state_vector.elementAt(i);

				state.description = str[DESCRIPTION];
			}
			break;
		}
		modified = true;
	}
	//===============================================================
	//===============================================================
	boolean getModified()
	{
		return modified;
	}
	//===============================================================
	//===============================================================
	private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {
		doClose();
	}

	//===============================================================
	/**
	 *	Closes the dialog
	 */
	//===============================================================
	private void closeDialog(java.awt.event.WindowEvent evt) {
		doClose();
	}

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
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel jPanel1;
        private javax.swing.JButton cancelBtn;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JLabel titleLabel;
		private javax.swing.JScrollPane scrollPane;
        // End of variables declaration//GEN-END:variables
	//===============================================================
	//=========================================================================
	/**
	 *	A renderer class to update table
	 */
	//=========================================================================
	public class ResultTableRowRenderer extends DefaultTableCellRenderer {
        
      
    	//=========================================================================
    	//=========================================================================
        ResultTableRowRenderer ()
		{
			//setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
		}
        
    	//=========================================================================
    	//=========================================================================
        public Component getTableCellRendererComponent(JTable table,
                                                       Object value,
                                                       boolean isSelected,
                                                       boolean hasFocus,
                                                       int row,
                                                       int col)
        {
            String col_header = (String)table.getColumnModel().getColumn(col).getHeaderValue();
            return super.getTableCellRendererComponent(table,
                                                       value,
                                                       isSelected,
                                                       hasFocus,
                                                       row, 
                                                       col);
        }
    }



	//=========================================================================
	/**
	 *	Data table model.
	 */
	//=========================================================================
    public class DataTableModel extends AbstractTableModel
	{
 		//==========================================================
 		//==========================================================
		public int getColumnCount()
		{
			switch(manage)
			{
			case COMMANDS:
				return COL_NAMES.length;

			default:
				return 2;
			}
		}
		//==========================================================
		//==========================================================
		public int getRowCount()
		{
			switch(manage)
			{
			case COMMANDS:
				if (tmp_cmd_vector==null)
					return 0;
				else
					return tmp_cmd_vector.size();
			case ATTRIBUTES:
				if (tmp_attr_vector==null)
					return 0;
				else
					return tmp_attr_vector.size();
		case CLASS_PROPERTIES:
		case DEV_PROPERTIES:
				if (tmp_prop_vector==null)
					return 0;
				else
					return tmp_prop_vector.size();
			case STATES:
				if (tmp_state_vector==null)
					return 0;
				else
					return tmp_state_vector.size();
			default:
				return 0;
			}
		}
		//==========================================================
		//==========================================================
		public String getColumnName(int aCol) {
			return COL_NAMES[aCol];
		}
		//==========================================================
		//==========================================================
		public void setValueAt(Object obj, int row, int col)
		{
			String[]	str;
			switch(manage)
			{
			case COMMANDS:
				str = (String[])tmp_cmd_vector.elementAt(row);
				str[col] = obj.toString();
				break;
			case ATTRIBUTES:
				str = (String[])tmp_attr_vector.elementAt(row);
				str[col] = obj.toString();
				break;
		case CLASS_PROPERTIES:
		case DEV_PROPERTIES:
				str = (String[])tmp_prop_vector.elementAt(row);
				str[col] = obj.toString();
				break;
			case STATES:
				str = (String[])tmp_state_vector.elementAt(row);
				str[col] = obj.toString();
				break;
			}
		}
		//==========================================================
		//==========================================================
		public Object getValueAt(int row, int col)
		{
			String[]	str;
			switch(manage)
			{
			case COMMANDS:
				str = (String[])tmp_cmd_vector.elementAt(row);
				return str[col];
			case ATTRIBUTES:
				str = (String[])tmp_attr_vector.elementAt(row);
				return str[col];
		case CLASS_PROPERTIES:
		case DEV_PROPERTIES:
				str = (String[])tmp_prop_vector.elementAt(row);
				return str[col];
			case STATES:
				str = (String[])tmp_state_vector.elementAt(row);
				return str[col];
			}
			return null;
		}
		//==========================================================
		//==========================================================
		public boolean isCellEditable(int row, int col)
		{
			return (col!=NAME);
		}
		//==========================================================
		//==========================================================
		public Class getColumnClass(int columnIndex)
		{
			return String.class;
		}
	}

}
