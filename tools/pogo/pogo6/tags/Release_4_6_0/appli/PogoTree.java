//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:	java source code for the Pogo class definition .
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.17  2006/09/19 13:19:55  pascal_verdier
// Allow boolean attribute for java servers.
// Bug in command factory for abstract class generation fixed.
// Bug in changing class name fixed.
// Abstarct classes sorted.
//
// Revision 3.16  2006/06/26 09:24:53  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.15  2006/01/30 11:00:22  pascal_verdier
// Revision and cvs root displayed in tooltip.
//
// Revision 3.14  2005/11/24 08:27:11  pascal_verdier
// Analized with intelliJid.
// Bug on command rename fixed.
//
// Revision 3.13  2005/06/14 08:48:39  pascal_verdier
// SuperClass is replaced by AbstractClass.
//
// Revision 3.12  2005/03/29 15:01:26  pascal_verdier
// Bug on change class name fixed.
//
// Revision 3.11  2005/03/11 15:04:52  pascal_verdier
// Pathes have been changed.
//
// Revision 3.10  2005/03/02 14:01:53  pascal_verdier
// Managing Abstract Classes and inherited classes.
//
// Revision 3.9  2005/01/13 08:07:35  pascal_verdier
// take off trace messages.
//
// Revision 3.8  2005/01/12 12:48:47  pascal_verdier
// State Machine Dialog added.
//
// Revision 3.7  2004/11/22 15:28:08  pascal_verdier
// Javadoc tags correction.
//
// Revision 3.6  2004/11/22 11:12:06  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.5  2004/10/21 06:55:43  pascal_verdier
// Check for non double item definitions
// for add, edit and clone item.
//
// Revision 3.4  2004/09/07 12:02:45  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.3  2004/09/02 06:43:12  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
//
// Revision 3.2  2004/08/26 07:25:35  pascal_verdier
// Attributes are now generated as class.
// Look and field changed.
//
// Revision 3.1  2003/09/10 08:08:02  pascal_verdier
// Minor changes
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
// Revision 1.3  2000/03/29 13:11:48  verdier
// Doc generation added.
//
// Revision 1.2  2000/03/03 09:43:00  verdier
// States management added
//
// Revision 1.1  2000/02/28 15:41:38  verdier
// Initial revision
//
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================

package pogo.appli;


import pogo.gene.*;

import javax.swing.*;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

//===========================================================
/**
 *	This Class manage the JTree used to display, create and modify the 
 *	<a href=../gene/PogoClass.htme> PogoClass</a> object.
 */
//===========================================================
public class  PogoTree  extends JTree implements PogoAppliDefs, PogoDefs
{
/**
 *	Root node.
 */
	private DefaultMutableTreeNode	root;
/**
 *	Collection for the first node level after root.
 */
	private DefaultMutableTreeNode[]	collection;

/**
 *	JFrame parent used for cration..
 */
	private PogoAppli			parent;
/**
 *	The model used to manage the JTree object.
 */
	private DefaultTreeModel	treeModel;
/**
 * Edited Pogo class
 */
 	PogoClass			server;
/**
 *	check if the PogoClass object has been modified.
 */
	private boolean				modified;

    /**
     *	Popup menu to be used on right button clicked.
     */
    private TreePopupMenu		pMenu;

//======================================================
/**
 *	Constructor for Pogotree Object.
 *
 *	@param	parent	PogoAppli(JFrame) object 
 */
//======================================================
	public PogoTree(PogoAppli parent)
	{
		this.parent = parent;
		Color background = new Color(0xff, 0xff, 0xcc);
		setBackground(background);

		//	Create the default tree
		root       = new DefaultMutableTreeNode("Tango Device Server");
		collection = new DefaultMutableTreeNode[collec_names.length];
		for (int i=0 ; i<collec_names.length ; i++)
		{
			collection[i] = new DefaultMutableTreeNode(collec_names[i]);
			root.add(collection[i]);
		}

		//Create a tree that allows one selection at a time.
		getSelectionModel().setSelectionMode
        		(TreeSelectionModel.SINGLE_TREE_SELECTION);

		//	Create Tree and Tree model
		//------------------------------------
		treeModel = new DefaultTreeModel(root);
		setModel(treeModel);

		ToolTipManager.sharedInstance().registerComponent(this);
		setCellRenderer(new PogoRenderer(background));

		//	Listen for collapse tree
		addTreeExpansionListener(new TreeExpansionListener () {
			public void treeCollapsed(TreeExpansionEvent e) {
				collapsedPerfomed(e);
			}
			public void treeExpanded(TreeExpansionEvent e) {
				//expandedPerfomed(e);
			}
		});

		//	Add Action listener
		//------------------------------------
		addMouseListener (new java.awt.event.MouseAdapter () {
			public void mouseClicked (java.awt.event.MouseEvent evt) {
				treeMouseClicked (evt);
			}
		});
		pMenu = new TreePopupMenu(parent, this);
    }
//======================================================
//======================================================
	int getCollectionIdx(String name)
	{
		for (int i=0 ; i<collec_names.length ; i++)
			if (collec_names[i].equals(name))
				return i;
		return 0;
	}
//======================================================
/**
 *	Create e new leaf whith an object in collection called colName.
 *
 *	@param	parent_node		Collection node.
 *	@param	obj			Object to be put in the leaf.
 */
//======================================================
	private void createLeaf(DefaultMutableTreeNode parent_node, Object obj)
	{
		//	Build new leaf and insert.
		DefaultMutableTreeNode	node = new DefaultMutableTreeNode(obj);
		treeModel.insertNodeInto(node, parent_node, parent_node.getChildCount());
	}
//======================================================
/**
 *	Clone the node.
 *	if it is a class property, clone it as device property
 *	if it is a device property, clone it as class property
 *	else edit the object before cloning.
 *
 *	@param	node	Object to be cloned.
 */
//======================================================
	void cloneLeaf(DefaultMutableTreeNode node)
	{
		//	Get parent node and node position.
		DefaultMutableTreeNode	parent_node =
					(DefaultMutableTreeNode)node.getParent();
		DefaultMutableTreeNode	new_node = null;

		if (parent_node==collection[CLASS_PROPERTIES])
		{
			//	Build new leaf to be inserted later.
			new_node = new DefaultMutableTreeNode(node.getUserObject());
			parent_node = collection[DEV_PROPERTIES];

		}
		else
		if (parent_node==collection[DEV_PROPERTIES])
		{
			//	Build new leaf to be inserted later.
			new_node = new DefaultMutableTreeNode(node.getUserObject());
			parent_node = collection[CLASS_PROPERTIES];
		}
		else
			//	NOT a property
			//	Edit the object to be inserted
			createItem(node);

		//	if properties clone to the other collection
		if (new_node!=null)
		{
			//	Check if already exists
			Property	prop = (Property)node.getUserObject();
			for (int i=0 ; i<parent_node.getChildCount() ; i++)
				if (parent_node.getChildAt(i).toString().equals(prop.name))
				{
					app_util.PopupError.show(parent, prop.name + " Already Exists !");
					return;
				}

			//	Else add new node
			treeModel.insertNodeInto(new_node, parent_node, parent_node.getChildCount());
			TreeNode[]	path = new_node.getPath();
			setSelectionPath(new TreePath(path));
			modified = true;
		}		
	}
//===============================================================
/**
 *	Replace an old leaf by a new one containing the new object.
 */
//===============================================================
	private void changeLeaf(DefaultMutableTreeNode node, Object obj)
	{
		//	Get parent node and node position.
		DefaultMutableTreeNode	parent_node =
							(DefaultMutableTreeNode)node.getParent();
		int	pos =0;
		for (int i=0 ; i<parent_node.getChildCount() ; i++)
			if (parent_node.getChildAt(i).equals(node))
				pos = i;

		//	Build ne node and insert
		DefaultMutableTreeNode	new_node = new DefaultMutableTreeNode(obj);
		treeModel.insertNodeInto(new_node, parent_node, pos);

		//	Remove old one
		treeModel.removeNodeFromParent(node);
		modified = true;
		setSelectionNode(new_node);
	}
//===============================================================
//===============================================================
	void setSelectionNode(DefaultMutableTreeNode node)
	{
		TreeNode[]	path = node.getPath();
		setSelectionPath(new TreePath(path));
	}
//===============================================================
//===============================================================
	DefaultMutableTreeNode getSelectedNode()
	{
		return (DefaultMutableTreeNode) getLastSelectedPathComponent();
	}
//===============================================================
//===============================================================
	boolean isLeafSelected()
	{
		DefaultMutableTreeNode node = getSelectedNode();
		if (node!=null)
		{
			TreeNode[]	path = node.getPath();
			//	Is it an object (Cmd, attrib,...) or a simple collection tittle
			return (path.length==LEAF_ITEM+1);
		}
		else
			return (getSelectedNode()!=null);
	}
//===============================================================
//===============================================================
	void moveSelection(String direction)
	{
		DefaultMutableTreeNode node = getSelectedNode();
		//	Get parent node and node position.
		DefaultMutableTreeNode	parent_node =
							(DefaultMutableTreeNode)node.getParent();
		int	pos =0;
		for (int i=0 ; i<parent_node.getChildCount() ; i++)
			if (parent_node.getChildAt(i).equals(node))
				pos = i;

		//	get position min and max (special case for commands state and status)
		int	pos_min = 0;
		int pos_max = parent_node.getChildCount()-1;
		if (parent_node.equals(collection[COMMANDS]))
			pos_min = 2;

		if (direction.equals("Up"))
		{
			if (pos>pos_min)
			{
				treeModel.removeNodeFromParent(node);
				treeModel.insertNodeInto(node, parent_node, pos-1);
			}
		}
		else
			if (pos<pos_max)
			{
				treeModel.removeNodeFromParent(node);
				treeModel.insertNodeInto(node, parent_node, pos+1);
			}

		setSelectionNode(node);
		modified = true;
	}
//======================================================
//======================================================
	void removeLeaf(DefaultMutableTreeNode node)
	{
		treeModel.removeNodeFromParent(node);
		modified = true;
	}
//======================================================
//======================================================
	private static final String	remove_message =
		"The ITEM NAME" +
		" has been taken off the ITEM factory.\n\n"+
		"But, for safety reason, if code for this ITEM has been already generated,"+
		"\nthe \'METHOD\' method will not be automaticaly removed !!!\n"+
		"Please do it by yourself.";

	void removeSelectedLeaf()
	{
		DefaultMutableTreeNode node = getSelectedNode();
		Object[] options = { "OK", "CANCEL" };
		if (JOptionPane.showOptionDialog(parent,
				"Click OK to confirm delete " + node + " !",
				"Warning",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE,
				null, options, options[0])!=JOptionPane.OK_OPTION)
		return;

		//	Remove and display message if command or attribute
		removeLeaf(node);
		PogoString	pgs = null;
		switch (instanceOf(node.getUserObject()))
		{
		case COMMANDS:
			Cmd	cmd = (Cmd)node.getUserObject();
			pgs =  new PogoString(remove_message);
			pgs.replace("ITEM",   "command");
			pgs.replace("ITEM",   "command");
			pgs.replace("ITEM",   "command");
			pgs.replace("NAME",   cmd.name);
			pgs.replace("METHOD", cmd.exec_method);
			break;
		case ATTRIBUTES:
			Attrib	attr = (Attrib)node.getUserObject();
			pgs =  new PogoString(remove_message);
			pgs.replace("ITEM",   "attribute");
			pgs.replace("ITEM",   "attribute");
			pgs.replace("ITEM",   "attribute");
			pgs.replace("NAME",   attr.name);
			pgs.replace("METHOD", "read_"+attr.name);
			break;
		}
		if (pgs!=null)
			JOptionPane.showMessageDialog(this, pgs.str, "Info Window",
											JOptionPane.INFORMATION_MESSAGE);
	}
//======================================================
/**
 *	Clear all leaves
 */
//======================================================
	public void clear()
	{
		for (int i=0 ; i<collection.length ; i++)
		{
			int	nb = collection[i].getChildCount();
			for (int j=0 ; j<nb ; j++)
				removeLeaf((DefaultMutableTreeNode)collection[i].getChildAt(0));
			collection[i].removeAllChildren();
		}

		root.setUserObject("");
		modified = false;
	}

//======================================================
/**
 *	Build the JTree coresponding to the <i> PogoClass</i> object.
 *
 *	@param	server	The <i> PogoClass</i> object to display architecture.
 */
//======================================================
	public void setPogoTree(PogoClass server)
	{
		this.server = server;
          clear();
		root.setUserObject(new ServerDefinitions(server.class_name,
											server.inherited_from,
											server.class_desc, server.title));

		//	Create Class Properties leaves
		//----------------------------------
		int		nb_rows = collec_names.length;
		if (server.class_properties!=null)
			for (int i=0 ; i<server.class_properties.size() ; i++, nb_rows++)
			{
				Property	prop = server.class_properties.propertyAt(i);
				createLeaf(collection[CLASS_PROPERTIES], prop);
			}
		
		//	Create Device Properties leaves
		//----------------------------------
		if (server.dev_properties!=null)
			for (int i=0 ; i<server.dev_properties.size() ; i++, nb_rows++)
			{
				Property	prop = server.dev_properties.propertyAt(i);
				createLeaf(collection[DEV_PROPERTIES], prop);
			}
		
		//	Create Command leaves
		//----------------------------------
		if (server.commands!=null)
			for (int i=0 ; i<server.commands.size() ; i++, nb_rows++)
			{
				Cmd		cmd = server.commands.cmdAt(i);
				createLeaf(collection[COMMANDS], cmd);
			}
		
		//	Create Attribute leaves
		//----------------------------------
		if (server.attributes!=null)
			for (int i=0 ; i<server.attributes.size() ; i++, nb_rows++)
			{
				Attrib	attr = server.attributes.attributeAt(i);
				createLeaf(collection[ATTRIBUTES], attr);
			}

		//	Create State leaves
		//----------------------------------
		if (server.states!=null)
			for (int i=0 ; i<server.states.size() ; i++, nb_rows++)
			{
				DevState	state = server.states.stateAt(i);
				createLeaf(collection[STATES], state);
			}

		//	Open the tree
		for (int i=0 ; i<nb_rows ; i++)
			expandRow(i);
		modified = false;
	}
//======================================================
/**
 *	check if the PogoClass object has been modified.
 *
 *	@return true if at least one of the leaf has been modified.
 */
//======================================================
	public boolean hasBeenModified()
	{
		return modified;
	}
//======================================================
/**
 *	Set the modified boolean flag.
 */
//======================================================
	public void setModified(boolean state)
	{
		modified = state;
	}
//======================================================
/**
 *	@return the  object architecture displayed
 *				as a <i>PogoClass</i> object.
 */
//======================================================
	public PogoClass getPogoClass()
	{
		PogoClass	server = null;
		try
		{
			//	Create the server from server definitions
			ServerDefinitions sd = (ServerDefinitions)root.getUserObject();
			server = new PogoClass(sd, parent.getLanguage(),
							this.server.projectFiles.getPath());
			//	Take Off virtuals
			server.commands.clear();

			//	And Add command, attribute and so on....
			for (int i=0 ; i<collection.length ; i++)
			{
				int	nb = collection[i].getChildCount();
				for (int j=0 ; j<nb ; j++)
				{
					DefaultMutableTreeNode	node =
						(DefaultMutableTreeNode)collection[i].getChildAt(j);
					Object obj = node.getUserObject();
					switch (instanceOf(obj))
					{
					case COMMANDS:
						server.addCommand((Cmd)obj);
						break;
					case ATTRIBUTES:
						server.addAttribute((Attrib)obj);
						break;
					case STATES:
						server.addState((DevState)obj);
						break;
					case PROPERTY:
						if (i==CLASS_PROPERTIES)
							server.addClassProperty((Property) obj);
						else
							server.addDevProperty((Property) obj);
						break;
					default:
						System.out.println(obj.toString() +"\n Object unknown !");
						throw new PogoException(obj.toString() +
											"\n Object unknown !");
					}
				}
			}
			server.is_abstractclass = this.server.is_abstractclass;
            server.revision         = this.server.revision;
            server.author           = this.server.author;
            server.cvs_repository   = this.server.cvs_repository;
            server.projectFiles     = this.server.projectFiles;

			//	store the new one
			this.server = server;
		}
		catch (PogoException e)
		{
			JOptionPane.showMessageDialog(this, e.toString(),
								"Error Window",
								JOptionPane.ERROR_MESSAGE);
		}
		return server;
	}
//===============================================================
/**
 *	Check object instance
 */
//===============================================================
	int instanceOf(Object obj)
	{
		if (obj instanceof ServerDefinitions)
			return CLASS_ROOT;
		else
		if (obj instanceof Property)
			return PROPERTY;
		else
		if (obj instanceof Cmd)
			return COMMANDS;
		else
		if (obj instanceof Attrib)
			return ATTRIBUTES;
		else
		if (obj instanceof DevState)
			return STATES;
		else
		if (obj instanceof String)
			return STRING_NODE;
		else
			return -1;
	}
//===============================================================
//===============================================================








//======================================================
/**
 *	Manage event on clicked mouse on PogoTree object.
 */
//======================================================
	private void treeMouseClicked (java.awt.event.MouseEvent evt)
	{
		//	Get kind of click
		int mask = evt.getModifiers();
		if ((mask & MouseEvent.BUTTON2_MASK)!=0)
		{
			System.out.println(" BTN 2");
			return;
		}

		int selRow = getRowForLocation(evt.getX(), evt.getY());
		TreePath	path = getPathForLocation(evt.getX(), evt.getY());
		if (path==null)
			return;

		setSelectionPath(path);

		//	If not double click -> display menu
		//-------------------------------------
		if(evt.getClickCount() != 2)
		{
			if ((mask & MouseEvent.BUTTON3_MASK)!=0)
				switch (path.getPathCount()-1)
				{
                case TREE_ROOT:
                case COLLECTION:
				case LEAF_ITEM:
					pMenu.showMenu(evt);
					break;
				}
			return;
		}
		
		//
		//	Else Double click
		//
		
		//	Check if at least one cell is selected
		//----------------------------------------------
		if (selRow == -1)
			return;

		//	Get path from event

		//	If a collection is selected with BTN3 -> Create a new item
		//----------------------------------------------------------------
		if ((mask & MouseEvent.BUTTON3_MASK)!=0)
		{
			switch (path.getPathCount()-1)
			{
			case TREE_ROOT:
				//	Edit Class Dialog
				editClassObject();
				break;
			case COLLECTION:
				createItem();
				break;
			case LEAF_ITEM:
				//pMenu.showMenu(evt);
				//editCode();
				break;
			}
		}
		else
		{
			evt.consume();
			switch(path.getPathCount())
			{
			case 1:
				editClassObject();
				break;
			case 2:
				createItem();
				break;
			case 3:
				editItem();
				break;
			}
		}
	}
//======================================================
//======================================================
	public void collapsedPerfomed(TreeExpansionEvent e)
	{
		DefaultMutableTreeNode node = getSelectedNode();
		if (node==null)
			return;

		//	Check if collapse on selected node
		TreePath	path = e.getPath();
		DefaultMutableTreeNode	c =
			(DefaultMutableTreeNode)path.getPathComponent(path.getPathCount()-1);
		if (c.equals(node)==false)
			return;

		if (node.getChildCount()>0)
		{
			//	Cancel collapse tree
			DefaultMutableTreeNode	leaf = 
					(DefaultMutableTreeNode)node.getChildAt(0);
			TreeNode[]	leaf_path = leaf.getPath();
			setExpandedState(new TreePath(leaf_path), true);
		}
	}
//===============================================================
//===============================================================
	void editStateMachine(DefaultMutableTreeNode node)
	{
		if (server.states.size()<2)
		{
			JOptionPane.showMessageDialog(this, 
								"Create more than one states before !",
								"Error Window",
								JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (server.commands.size()==0 && server.attributes.size()==0)
		{
			JOptionPane.showMessageDialog(this, 
								"Create commands or attributes before !",
								"Error Window",
								JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		new StateMachineDialog(parent, server).showDialog();
	}
//===============================================================
//===============================================================
	void editDescriptions(DefaultMutableTreeNode node)
	{
		CommentsDialog	dlg = null;
		if (node.equals(collection[CLASS_PROPERTIES]))
			dlg = new CommentsDialog(parent, server.class_properties, CLASS_PROPERTIES);
		else
		if (node.equals(collection[DEV_PROPERTIES]))
			dlg = new CommentsDialog(parent, server.dev_properties, DEV_PROPERTIES);
		else
		if (node.equals(collection[COMMANDS]))
			dlg = new CommentsDialog(parent, server.commands);
		else
		if (node.equals(collection[ATTRIBUTES]))
			dlg = new CommentsDialog(parent, server.attributes);
		else
		if (node.equals(collection[STATES]))
			dlg = new CommentsDialog(parent, server.states);
		
		if (dlg!=null)
		{
			dlg.setVisible(true);
			modified = dlg.getModified();
		}
	}
//===============================================================
/**
 *	Sort leaves inside a collection
 */
//===============================================================
	void sortItems(DefaultMutableTreeNode node)
	{
		server = getPogoClass();
		int	start_idx = 0;
		if (node.equals(collection[COMMANDS]))
			start_idx = 2;	//	virtual methods cannot be sorted

		//	Copy nodes in a vector
		Vector	vector = new Vector();
		for (int i=start_idx ; i<node.getChildCount() ; i++)
			vector.add(node.getChildAt(i));

		//	Remove them
		while (node.getChildCount() > start_idx)
			removeLeaf((DefaultMutableTreeNode)node.getChildAt(start_idx));

		//	sort nodes
		MyCompare	comp = new MyCompare();
		Collections.sort(vector, comp);

		//	and re-put them in JTree
		DefaultMutableTreeNode	leaf = null;
		for (int i=0 ; i<vector.size() ; i++)
		{
			leaf = (DefaultMutableTreeNode)vector.elementAt(i);
			treeModel.insertNodeInto(leaf, node, node.getChildCount());
		}
		TreeNode[]	path = leaf.getPath();
		setExpandedState(new TreePath(path), true);
		modified = true;
	}
//===============================================================
/**
 *	Edit command item
 */
//===============================================================
	private void editCommand(DefaultMutableTreeNode node)
	{
		Cmd	cmd = (Cmd) node.getUserObject();
		if(cmd.virtual_method)	// Virtual status cmd
		{
			if (cmd.override_method==ALREADY_OVERRIDED ||
				cmd.override_method==OVERRIDE)
				JOptionPane.showMessageDialog(this,
					"This command's method override a method from DeviceImpl class !\n"+
					"You cannot change it's signature !",
					"Info Window",
					JOptionPane.INFORMATION_MESSAGE);
			else
			//	Ask if command's methuds must be overrided
			//------------------------------------------------
			if (JOptionPane.showConfirmDialog(this, 
					"This command's method is already defined in the DeviceImpl class !\n\n" +
					"Are you sure to want to override it ?",
					"Info Window",
					JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
				cmd.override_method = OVERRIDE;
			else
				cmd.override_method = NOT_OVERRIDE;
		}
		else	//	Normal command
		{
			//	Open Dialog to get cmd parameters
			//----------------------------------------------
			CommandDialog	dialog =
				new CommandDialog(parent, server, cmd, MODIFYING);
			if (dialog.showDialog()==PogoAppliDefs.RET_OK)
			{
				System.out.println(dialog.getInput());
				Cmd newCmd = dialog.getInput();
				if (cmd.equals(newCmd)==false)
				{
					//	Modify selected leaf
					changeLeaf(node, newCmd);
					modified = true;
				}
			}
		}
	}
//===============================================================
/**
 *	Edit the item to change parameters
 */
//===============================================================
	void editItem()
	{
		DefaultMutableTreeNode node = getSelectedNode();
		if (node == null) return;
		Object obj = node.getUserObject();
		server = getPogoClass();
		switch (instanceOf(obj))
		{
		case COMMANDS:
			editCommand(node);
			break;
		case ATTRIBUTES:
			//	Edit Attribute
			Attrib	attr = (Attrib) obj;
			AttributeDialog	att_dialog =
				new AttributeDialog(parent, server, attr, MODIFYING);
			if (att_dialog.showDialog()==PogoAppliDefs.RET_OK)
			{
				Attrib newAttr = att_dialog.getInput();
				if (attr.equals(newAttr)==false)
				{
					//	Modify selected leaf
					changeLeaf(node, newAttr);
					modified = true;
				}
			}
			break;
		case STATES:
			//	Edit State
			DevState	state = (DevState) obj;
			StateDialog	st_dialog =
				new StateDialog(parent, server, state, MODIFYING);
			if (st_dialog.showDialog()==PogoAppliDefs.RET_OK)
			{
				DevState newState = st_dialog.getInput();
				if (state.equals(newState)==false)
				{
					//	Modify selected leaf
					changeLeaf(node, newState);
					modified = true;
				}
			}
			break;
		case PROPERTY:
			Property		property = (Property)obj;
			PropertyDialog	prop_dialog =
				new PropertyDialog(parent, property, node.getParent().toString());
			if (prop_dialog.showDialog()==PogoAppliDefs.RET_OK)
			{
				Property	newProp = prop_dialog.getInput();
				if (property.equals(newProp)==false)
				{
					//	Modify selected leaf
					changeLeaf(node, newProp);
					modified = true;
				}
			}
			break;
		}
	}
//===============================================================
/**
 *	create a new item.as a node clone
 */
//===============================================================
	void createItem(DefaultMutableTreeNode node)
	{
		Object	obj = node.getUserObject();
		if (obj instanceof Cmd)
		{
			//	Create Command
			CommandDialog	dialog =
				new CommandDialog(parent, server, (Cmd)obj, CREATING);
			if (dialog.showDialog()==PogoAppliDefs.RET_OK)
			{
				Cmd newCmd = dialog.getInput();
				server.commands.add(newCmd);
				newCmd.cmd_class = newCmd.name + "Class";
				//	Add the new leaf
				createLeaf((DefaultMutableTreeNode)node.getParent(), newCmd);
				modified = true;
			}
		}
		else
		if (obj instanceof Attrib)
		{
			//	Create Attribute
			AttributeDialog	att_dialog =
				new AttributeDialog(parent, server, (Attrib)obj, CREATING);
			if (att_dialog.showDialog()==PogoAppliDefs.RET_OK)
			{
				//	Modify selected leaf
				Attrib	new_attr = att_dialog.getInput();
				server.attributes.add(new_attr);
				createLeaf((DefaultMutableTreeNode)node.getParent(), new_attr);
				modified = true;
			}
		}
		else
		if (obj instanceof DevState)
		{
			//	Create Attribute
			StateDialog	dialog =
				new StateDialog(parent, server, (DevState)obj, CREATING);
			if (dialog.showDialog()==PogoAppliDefs.RET_OK)
			{
				//	Modify selected leaf
				DevState	state = dialog.getInput();
				server.states.add(state);
				createLeaf((DefaultMutableTreeNode)node.getParent(), state);
				modified = true;
			}
		}
		else
			System.out.println("Unknown: " + obj);
	}
//===============================================================
/**
 *	create a new item.
 */
//===============================================================
	void createItem()
	{
		DefaultMutableTreeNode node = getSelectedNode();
		//	get witch item
		int	item = 0;
		for (int i=0 ; i<collection.length ; i++)
			if (collection[i].equals(node))
				item = i;
		server = getPogoClass();
		switch(item)
		{
		case COMMANDS:
			//	Create Command
			CommandDialog	dialog =
				new CommandDialog(parent, server, null, CREATING);
			if (dialog.showDialog()==PogoAppliDefs.RET_OK)
			{
				Cmd newCmd = dialog.getInput();
				newCmd.cmd_class = newCmd.name + "Class";
				server.commands.add(newCmd);
				//	Add the new leaf
				createLeaf(node, newCmd);
				modified = true;
			}
			break;
		case ATTRIBUTES:
			//	Create Attribute
			AttributeDialog	att_dialog =
				new AttributeDialog(parent, server, null, CREATING);
			if (att_dialog.showDialog()==PogoAppliDefs.RET_OK)
			{
				//	Modify selected leaf
				Attrib	newAtt = att_dialog.getInput();
				server.attributes.add(newAtt);
				createLeaf(node, newAtt);
				modified = true;
			}
			break;
		case STATES:
			//	Create State
			StateDialog	st_dialog = 
				new StateDialog(parent, server, null, CREATING);
			if (st_dialog.showDialog()==PogoAppliDefs.RET_OK)
			{
					//	Modify selected leaf
				DevState	state = st_dialog.getInput();
				server.states.add(state);
				createLeaf(node, state);
				modified = true;
			}
			break;
		case CLASS_PROPERTIES:
		case DEV_PROPERTIES:
			//	Create property
			PropertyDialog	prop_dialog =
				new PropertyDialog(parent, null, collection[item].toString());
			if (prop_dialog.showDialog()==PogoAppliDefs.RET_OK)
			{
				//	Modify selected leaf
				createLeaf(node, prop_dialog.getInput());
				modified = true;
			}
			break;
			
		}
	}
//===============================================================
/**
 *	Edit the item code from source file if exists.
 */
//===============================================================
	void editCode()
	{
		DefaultMutableTreeNode node = getSelectedNode();
		if (node == null) return;
		Object obj = node.getUserObject();
		
		String	mess = null;
		//	Start edit class and fixe object to edit
		EditPogoCode	ed = new EditPogoCode(getPogoClass());
		try
		{
			switch (instanceOf(obj))
			{
			case COMMANDS:
				Cmd cmd = (Cmd)obj;
				ed.setCommandTarget(cmd.name);
				break;
			case ATTRIBUTES:
				Attrib	attr = (Attrib)obj;
				ed.setAttributeTarget(attr.name);
				break;
			case PROPERTY:
				TreeNode[]	path = node.getPath();
				if (path[COLLECTION].toString().equals(collec_names[CLASS_PROPERTIES]))
					ed.setPropertiesTarget(CLASS_PROPERTIES);
				else
					ed.setPropertiesTarget(DEV_PROPERTIES);
				break;
			case STATES:
					ed.setStateTarget();
				break;
			}
			ed.start();
		}
		catch(FileNotFoundException	e)
		{
			mess = ed.getSrcFilename() + "\nSource File Not Found !";
		}
		catch(IOException	e)
		{
			mess = e.toString();
		}
		catch(PogoException	e)
		{
			mess = e.toString();
		}
		if (mess!=null)
			JOptionPane.showMessageDialog(this, mess,
								"Error Window",
								JOptionPane.ERROR_MESSAGE);
	}

//======================================================
//======================================================
    void editAbstractClass()
    {
        new PogoAppli(server.inherited_from+".h").setVisible(true);
    }
//======================================================
/**
 *	Display ClassDialog Object to edit class parameters.
 */
//======================================================
	public void editClassObject()
	{
		//  Open Dialog
		//------------------
		ServerDefinitions sd = (ServerDefinitions)root.getUserObject();
		ClassDialog  dialog = new ClassDialog(parent, sd);
		if (dialog.showDialog()==PogoAppliDefs.RET_OK)
		{
			sd = dialog.getInput();
			root.setUserObject(sd);
            modified = true;
		}
	}
//===============================================================
//===============================================================
	void setLanguage(int language)
	{
		server.language = language;
	}
//===============================================================
//===============================================================
	void setHomeDir(String path)
	{
		server.setProjectPath(path);
	}
//===============================================================
//===============================================================
	void setOutputModel(boolean is_abstractclass)
	{
		server.is_abstractclass = is_abstractclass;
	}
//===============================================================
//===============================================================






//===============================================================
/**
 *	Class Description:
 *	A TreeCellRenderer class to be used by POGO tree.
 */
//===============================================================
	class PogoRenderer extends DefaultTreeCellRenderer
	{
		private	Font[]		fonts;
		private ImageIcon[]	icons;

	//======================================================
	//======================================================
		public PogoRenderer(Color background)
		{
			//	A little bit of colors just for fun.
			//-----------------------------------------
			setTextSelectionColor(Color.black);
			setBorderSelectionColor(Color.red);
			setBackgroundSelectionColor(Color.lightGray);

			setTextNonSelectionColor(Color.blue);
			setBackgroundNonSelectionColor(background);

			icons = new ImageIcon[LEAF_ITEM+1];
			icons[TREE_ROOT] =
				new ImageIcon(getClass().getResource(img_path + "tg_class.jpg"));
			icons[COLLECTION] =
				new ImageIcon(getClass().getResource(img_path + "arrow.gif"));
			icons[LEAF_ITEM] =
				new ImageIcon(getClass().getResource(img_path + "or_diam.gif"));

			fonts = new Font[LEAF_ITEM+1];
			fonts[TREE_ROOT]  = new Font("helvetica", Font.BOLD, 22);
			fonts[COLLECTION] = new Font("helvetica", Font.BOLD, 18);
			fonts[LEAF_ITEM]  = new Font("helvetica", Font.BOLD, 12);
		}


	//======================================================
	//======================================================
		public Component getTreeCellRendererComponent(JTree tree, Object value,
										boolean sel,  boolean expanded,
										boolean leaf, int row, boolean hasFocus)
		{
			super.getTreeCellRendererComponent(
                                	  tree, value, sel,
                                	  expanded, leaf, row,
                                	  hasFocus);

			TreePath	tp = tree.getPathForRow(row);
			if (tp==null) return this;
			Icon	icon;
			Font	font;
			Color	color;
			String	tip = "";

            DefaultMutableTreeNode node = (DefaultMutableTreeNode)value;
            Object obj = node.getUserObject();
			if (row==0)
			{
                if (server==null)
    				tip = "double double click to edit class (name, description...)";
                else
                {
                    tip = "Inherited from :  " + server.inheritedClassName() + "\n"+
                          "Revision       :  " + server.revision + "\n"+
                          "Author         :  " + server.author;
                    if (server.cvs_repository!=null)
                 tip += "\nCvs Repository :  " + server.cvs_repository;
                }
				icon  = icons[TREE_ROOT];
				font  = fonts[TREE_ROOT];
				color = Color.blue;
			}
			else
			{
				//	Collection management
				if (obj instanceof String)
				{
					tip = "double click to create a new item";
					icon  = icons[COLLECTION];
					font  = fonts[COLLECTION];
					color = Color.blue;
				}
				else
				{
					//	LEAF management
					//	Get the collection name (parent name)
					Object o = node.getUserObject();
					String collectionName = o.toString();

					//	Display tool tip for collection
					tip = buildToolTipText(collectionName, value);
					icon  = icons[LEAF_ITEM];
					font  = fonts[LEAF_ITEM];
					color = Color.black;
				}
			}

			setIcon(icon);
			setFont(font);
			setForeground(color);
			setToolTipText(tip);
			return this;
		}
	//======================================================
	//======================================================
		private String buildToolTipText(String collname, Object item)
		{
			DefaultMutableTreeNode node = (DefaultMutableTreeNode)item;
			Object obj = node.getUserObject();
			String	tooltip;
			if (obj instanceof Cmd)
			{
				Cmd	cmd = (Cmd) obj;
				tooltip = cmd.buildCppExecCmdMethodSignature(server.class_name);
			}
			else
			if (obj instanceof Attrib)
			{
				String[]	att_type = { "Scalar", "Spectrum", "Image"};
				Attrib	attr = (Attrib) obj;
				tooltip = attr.dataType.cpp + "  " + attr.toString() +
								"  (" + att_type[attr.attrType] +")";
			}
			else
			{
				tooltip = "Edit the " + item.toString() + " " + collname;
			}
			return tooltip;
		}
	}
	//======================================================
	/**
	 *	MyCompare class to sort collection
	 */
	//======================================================
	class  MyCompare implements Comparator
	{
		public int compare(Object o1, Object o2)
		{
			String	s1 = o1.toString().toLowerCase();
			String	s2 = o2.toString().toLowerCase();
			return s1.compareTo(s2);
			//return o1.toString().compareTo(o2.toString());
		}
	}
}
