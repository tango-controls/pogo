//+======================================================================
// $Source$
//
// Project:   Pogo
//
// Description:  java source code for the TreePopupMenu class definition .
//
// $Author$
//
// $Revision$
//
// $Log$
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
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.appli;

import pogo.gene.*;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class TreePopupMenu extends JPopupMenu  implements PogoAppliDefs
{
	private DefaultMutableTreeNode	node_cut    = null;
	private PogoAppli	appli;
	private PogoTree	parent;
	private Point		evt_position;
	private boolean		osIsUnix;

	static private String[]	pMenuLabels = {
									"Edit Item",
									"Edit code",
									"Clone",
									"Delete",
									"Move Up",
									"Move Down",
									"Create new ",
									"Sort items",
									"Edit State Machine",
									"Edit descriptions"
									};
	
	static private final int	OFFSET       = 2;		//	Label And separator
	static private final int	EDIT_ITEM    = 0;
	static private final int	EDIT_CODE    = 1;
	static private final int	CLONE_OBJ    = 2;
	static private final int	DELETE_ITEM  = 3;
	static private final int	MOVE_UP      = 4;
	static private final int	MOVE_DOWN    = 5;
	static private final int	NEW_ITEM     = 6;
	static private final int	SORT_ITEMS   = 7;
	static private final int	EDIT_ST_MACH = 8;
	static private final int	EDIT_DESC    = 9;


 	//===============================================================
	//===============================================================
	public TreePopupMenu(PogoAppli appli, PogoTree parent)
	{
		super();
		this.appli  = appli;
		this.parent = parent;

		osIsUnix = pogo.gene.PogoUtil.osIsUnix();
		buildBtnPopupMenu();
	}
	//===============================================================
	/**
	 *	Create a Popup menu for host control
	 */
	//===============================================================
	private void buildBtnPopupMenu()
	{
		JLabel	title = new JLabel("Edit Menu :");
        title.setFont(new java.awt.Font("Dialog", 1, 16));
		add(title);
		add(new JPopupMenu.Separator());

		for (int i=0 ; i<pMenuLabels.length ; i++)
		{
			JMenuItem	btn = new JMenuItem(pMenuLabels[i]);
   			btn.addActionListener (new java.awt.event.ActionListener () {
				public void actionPerformed (ActionEvent evt) {
            		hostActionPerformed(evt);
				}
			});
			add(btn);
		}
	}
	//======================================================
	//======================================================
	public void showMenu(MouseEvent evt)
	{
		DefaultMutableTreeNode node = parent.getSelectedNode();
		if (node==null)
			return;

		Object obj = node.getUserObject();
		JMenuItem	new_item     = (JMenuItem)getComponent(OFFSET+NEW_ITEM);
		JMenuItem	sort_items   = (JMenuItem)getComponent(OFFSET+SORT_ITEMS);
		JMenuItem	edit_st_mach = (JMenuItem)getComponent(OFFSET+EDIT_ST_MACH);
		JMenuItem	edit_desc    = (JMenuItem)getComponent(OFFSET+EDIT_DESC);

		JMenuItem	clone_item  = (JMenuItem)getComponent(OFFSET+CLONE_OBJ);
		clone_item.setText("Clone");

		//	Check witch items are enabled
		switch(parent.instanceOf(obj))
		{
		case COMMANDS:
			Cmd	cmd = (Cmd)obj;
			boolean	enabled = !(cmd.virtual_method);
			((JMenuItem)getComponent(OFFSET+CLONE_OBJ)).setEnabled(enabled);
			((JMenuItem)getComponent(OFFSET+DELETE_ITEM)).setEnabled(enabled);
			((JMenuItem)getComponent(OFFSET+MOVE_UP)).setEnabled(enabled);
			((JMenuItem)getComponent(OFFSET+MOVE_DOWN)).setEnabled(enabled);

			enabled = (enabled || cmd.override_method==PogoDefs.NOT_OVERRIDE);
			((JMenuItem)getComponent(OFFSET+EDIT_ITEM)).setEnabled(enabled);

			enabled = (enabled || cmd.override_method==PogoDefs.ALREADY_OVERRIDED);
			((JMenuItem)getComponent(OFFSET+EDIT_CODE)).setEnabled(enabled && osIsUnix);

			new_item.setVisible(false);
			sort_items.setVisible(false);
			edit_desc.setVisible(false);
			break;
		case STATES:
			boolean	edit_state = osIsUnix && (appli.getLanguage()==PogoDefs.cppLang);
			((JMenuItem)getComponent(OFFSET+EDIT_ITEM)).setEnabled(true);
			((JMenuItem)getComponent(OFFSET+EDIT_CODE)).setEnabled(edit_state);
			((JMenuItem)getComponent(OFFSET+CLONE_OBJ)).setEnabled(true);
			((JMenuItem)getComponent(OFFSET+DELETE_ITEM)).setEnabled(true);
			((JMenuItem)getComponent(OFFSET+MOVE_UP)).setEnabled(true);
			((JMenuItem)getComponent(OFFSET+MOVE_DOWN)).setEnabled(true);
			new_item.setVisible(false);
			sort_items.setVisible(false);
			edit_desc.setVisible(false);
			break;
		case ATTRIBUTES:
		case PROPERTY:
			((JMenuItem)getComponent(OFFSET+EDIT_ITEM)).setEnabled(true);
			((JMenuItem)getComponent(OFFSET+EDIT_CODE)).setEnabled(osIsUnix);
			((JMenuItem)getComponent(OFFSET+CLONE_OBJ)).setEnabled(true);
			((JMenuItem)getComponent(OFFSET+DELETE_ITEM)).setEnabled(true);
			((JMenuItem)getComponent(OFFSET+MOVE_UP)).setEnabled(true);
			((JMenuItem)getComponent(OFFSET+MOVE_DOWN)).setEnabled(true);
			new_item.setVisible(false);
			sort_items.setVisible(false);
			edit_desc.setVisible(false);
			
			//	Special management for properties
			if (node.getParent().toString().indexOf("Class")>=0)
				clone_item.setText("Clone as Device Property");
			else
				clone_item.setText("Clone as Class Property");
			break;
		case STRING_NODE:
			String[]	items = {
							"Class Property",
							"Device Property",
							"Command" ,
							"Attribute",
							"State"
							};
			if (node.getParent().getChildCount()>2)
				sort_items.setVisible(true);
			else
				sort_items.setVisible(false);
			String	item = items[parent.getCollectionIdx(obj.toString())];
			new_item.setVisible(true);
			new_item.setText(pMenuLabels[NEW_ITEM] + item);
			edit_desc.setVisible(true);

			((JMenuItem)getComponent(OFFSET+EDIT_ITEM)).setEnabled(false);
			((JMenuItem)getComponent(OFFSET+EDIT_CODE)).setEnabled(false);
			((JMenuItem)getComponent(OFFSET+CLONE_OBJ)).setEnabled(false);
			((JMenuItem)getComponent(OFFSET+DELETE_ITEM)).setEnabled(false);
			((JMenuItem)getComponent(OFFSET+MOVE_UP)).setEnabled(false);
			((JMenuItem)getComponent(OFFSET+MOVE_DOWN)).setEnabled(false);
			break;
		}
		evt_position = new Point(evt.getX(), evt.getY());
		show(parent, evt.getX(), evt.getY());
	}
	//===============================================================
	//===============================================================
	private void hostActionPerformed(ActionEvent evt)
	{
		DefaultMutableTreeNode node = parent.getSelectedNode();
		String  cmd = evt.getActionCommand();
		if (cmd.equals(pMenuLabels[EDIT_ITEM]))
			parent.editItem();
		else
		if (cmd.equals(pMenuLabels[EDIT_CODE]))
			parent.editCode();
		else
		if (cmd.indexOf(pMenuLabels[CLONE_OBJ])==0)
			parent.cloneLeaf(node);
		else
		if (cmd.equals(pMenuLabels[DELETE_ITEM]))
			parent.removeSelectedLeaf();
		else
		if (cmd.equals(pMenuLabels[MOVE_UP]))
			parent.moveSelection("Up");
		else
		if (cmd.equals(pMenuLabels[MOVE_DOWN]))
			parent.moveSelection("Down");
		else
		if (cmd.startsWith(pMenuLabels[NEW_ITEM]))
			parent.createItem();
		else
		if (cmd.startsWith(pMenuLabels[SORT_ITEMS]))
			parent.sortItems(node);
		else
		if (cmd.startsWith(pMenuLabels[EDIT_ST_MACH]))
			parent.editStateMachine(node);
		else
		if (cmd.startsWith(pMenuLabels[EDIT_DESC]))
			parent.editDescriptions(node);
	}
}

