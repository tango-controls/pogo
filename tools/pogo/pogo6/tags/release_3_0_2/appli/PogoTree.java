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
// Copyright 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================

package pogo.appli;


import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.*;
import javax.swing.tree.*;
import javax.swing.event.*;

import pogo.gene.*;

//===========================================================
/**
 *	This Class manage the JTree used to display, create and modify the 
 *	<a href=../gene/PogoClass.htme> PogoClass</a> object.
 */
//===========================================================
public class  PogoTree  extends JPanel implements PogoAppliDefs, PogoDefs {


/**
 *	Collection for the first node level after root.
 */
 	static String[]	collec = {  "Class  Properties",
								"Device Properties",
								"Commands" ,
								"Attributes",
								"States"
							};

/**
 *	JFrame parent used for cration..
 */
	private JFrame				frame;
/**
 *	The javax.swing.JTree Object to display project.
 */
	private JTree				tree;
/**
 *	The model used to manage the JTree object.
 */
	private DefaultTreeModel	treeModel;
/**
 *	Vector to store command nodes.
 */
	private Vector				cmdNodesVector;
/**
 *	Vector to store states nodes.
 */
	private Vector				stNodesVector;
/**
 *	Vector to store attributes nodes.
 */
	private Vector				attrNodesVector;
/**
 *	Vector to store device property nodes.
 */
	private Vector				devPropNodesVector;
/**
 *	Vector to store device class nodes.
 */
	private Vector				classPropNodesVector;

/**
 *	Vector to store command Objects.
 */
	private Vector				cmdVector;
/**
 *	Vector to store states Objects.
 */
	private Vector				stVector;
/**
 *	Vector to store attributes Objects.
 */
	private Vector				attrVector;
/**
 *	Vector to store device property Objects.
 */
	private Vector				devPropVector;
/**
 *	Vector to store device class Objects.
 */
	private Vector				classPropVector;

/**
 *	Root node.
 */
	private DefaultMutableTreeNode	root;
	private DefaultMutableTreeNode	cmdNode;
	private DefaultMutableTreeNode	attrNode;
	private DefaultMutableTreeNode	stNode;
	private DefaultMutableTreeNode	devPropNode;
	private DefaultMutableTreeNode	classPropNode;

/**
 *	The full path selection.
 */
	private TreePath		selectedPath;
/**
 *	Class name.
 */
	private String			class_name;
/**
 *	Class description.
 */
	private String			classDesc;
/**
 *	Project Title.
 */
	private String			projTitle;

/**
 *	Previous object cut or copied.
 */
	private Object	objCut;
/**
 *	Parent of previous object cut or copied.
 */
	private String	collecObjCut;


private String	homeDir;
private int		language;
/**
 *	check if the PogoClass object has been modified.
 */
private boolean	modified;
/**
 *	Popup Menu used on right mouse button.
 */
private JPopupMenu	pMenu=null;
/**
 *	Labels to display mouse usage.
 */
private JLabel[]	mouseUsage;
/**
 *	Tree background
 */
private	Color		background;
//======================================================
/**
 *	Constructor for Pogotree Object.
 *
 *	@param	f	Parent JFrame object 
 */
//======================================================
	public PogoTree(JFrame parent)
	{
		frame    = parent;
		modified = false;

		root     = new DefaultMutableTreeNode("Tango Device Server Super Class");
		classPropNode = new DefaultMutableTreeNode(collec[PogoAppliDefs.CLASS_PROPERTIES]);
		devPropNode   = new DefaultMutableTreeNode(collec[PogoAppliDefs.DEV_PROPERTIES]);
		cmdNode       = new DefaultMutableTreeNode(collec[PogoAppliDefs.COMMANDS]);
		attrNode      = new DefaultMutableTreeNode(collec[PogoAppliDefs.ATTRIBUTES]);
		stNode        = new DefaultMutableTreeNode(collec[PogoAppliDefs.STATES]);
		root.add(classPropNode);
		root.add(devPropNode);
		root.add(cmdNode);
		root.add(attrNode);
		root.add(stNode);

		background = new java.awt.Color(0xff, 0xff, 0xcc);
		setBackground(background);

		//	Create Tree and Tree model
		//------------------------------------
		tree = new JTree(root);
		treeModel = new DefaultTreeModel(root);
		tree.setModel(treeModel);

		//	Modify Tree Properties
		//------------------------------------
		tree.setBackground(background);
		tree.putClientProperty("JTree.lineStyle", "Angled");
		tree.setFont(new Font("helvetica", Font.BOLD, 12));
		setLayout(new FlowLayout());

		//	instency leafVectors
		//------------------------------------
		classPropNodesVector = new Vector();
		devPropNodesVector = new Vector();
		cmdNodesVector = new Vector();
		attrNodesVector = new Vector();
		stNodesVector = new Vector();
		classPropVector = new Vector();
		devPropVector = new Vector();
		cmdVector = new Vector();
		attrVector = new Vector();
		stVector = new Vector();

//---- ICI
		/*
		DefaultTreeCellRenderer	tcr = 
				(DefaultTreeCellRenderer) tree.getCellRenderer();
		*/
		tree.setCellRenderer(new PogoRenderer(collec, background, cmdVector, attrVector));
		ToolTipManager.sharedInstance().registerComponent(tree);

		//	Add Action listener
		//------------------------------------
		tree.addMouseListener (new java.awt.event.MouseAdapter () {
			public void mouseClicked (java.awt.event.MouseEvent evt) {
				treeMouseClicked (evt);
			}
		});

		//	Add And Set it visible
		//----------------------------
		add (tree);
		setVisible(true);

		//	Create a Popup Menu to displayed on right clicked button.
		//-------------------------------------------------------------
/*
		String	option;
		if ((option=System.getProperty("OPTION"))!=null)
			if (option.equals("-menu"))
*/
			{
				pMenu = new JPopupMenu();
				pMenu.add("Create a new item of:");
				pMenu.add(new JPopupMenu.Separator());
				for (int i=0 ; i<collec.length ; i++)
				{
					JMenuItem	btn = new JMenuItem(collec[i]);
        			btn.addActionListener (new java.awt.event.ActionListener () {
						public void actionPerformed (java.awt.event.ActionEvent evt) {
            				createActionPerformed(evt);
						}
					});
					pMenu.add(btn);
  				}
		
				//	Add action performed mouse for popup menu management
				//-----------------------------------------------------------
				tree.addMouseListener (new java.awt.event.MouseAdapter () {
					public void mousePressed (java.awt.event.MouseEvent evt) {
						frameMouseClicked (evt);
					}
				});
				frame.addMouseListener (new java.awt.event.MouseAdapter () {
					public void mousePressed (java.awt.event.MouseEvent evt) {
						frameMouseClicked (evt);
					}
				});
			}
	}
//======================================================
/**	Add a mouse motion listener to display on labels
 *	the mouse usage.
 *
 *	@param	leftLabel	Label to deisplay left button usage.
 *	@param	rigthLabel	Label to deisplay right button usage.
 */
//======================================================
	public void setMouseUsageListener(JLabel leftLabel, JLabel rightLabel)
	{
		//	Add Action listener
		//------------------------------------
		tree.addMouseMotionListener (new java.awt.event.MouseMotionAdapter () {
			public void mouseMoved (java.awt.event.MouseEvent evt) {
				treeMouseMoved(evt);
			}
		});
		tree.addMouseListener (new java.awt.event.MouseAdapter () {
			public void mouseExited (java.awt.event.MouseEvent evt) {
				treeMouseExited (evt);
			}
		});
		mouseUsage = new JLabel[3];
		mouseUsage[BTN1] = leftLabel;
		mouseUsage[BTN2] = null;
		mouseUsage[BTN3] = rightLabel;
	}
//======================================================
	private void treeMouseExited(MouseEvent evt)
	{
		mouseUsage[BTN1].setText("  ");
		mouseUsage[BTN3].setText("  ");
	}
//======================================================
	private int getCollectionNum(String collecName)
	{
		for (int i=0 ; i<collec.length ; i++)
			if (collecName.equals(collec[i].toString()))
				return i;
		return 0 ;
	}
//======================================================
	private void treeMouseMoved(MouseEvent evt)
	{
		Object[]	path = tree.getClosestPathForLocation(evt.getX(), evt.getY()).getPath();
		String		collName = null;
		int			collNum  = 0;

		//	Get the collection concerned
		//---------------------------------------
		if (path.length-1 >= COLLECTION)
		{
			collName= path[COLLECTION].toString();
			collNum = getCollectionNum(collName);
		}

		//	Display usage in function of node
		//--------------------------------------
		switch (path.length-1)
		{
		case TREE_ROOT:
			mouseUsage[BTN1].setText("Open/Close Tree");
			mouseUsage[BTN3].setText("Edit Class");
			break;
		case COLLECTION:
			if (/*collNum==PogoAppliDefs.DEV_PROPERTIES*/false)
			{
				mouseUsage[BTN1].setText("Not Available");
				mouseUsage[BTN3].setText("Not Available");
			}
			else
			{
				if (getCollectionVector(collName).size()<1)
					mouseUsage[BTN1].setText("Not Available");
				else
					mouseUsage[BTN1].setText("Open/Close Collection");
				mouseUsage[BTN3].setText("Create a new item");
			}
			break;
		case LEAF_ITEM:
			switch(collNum)
			{
			case PogoAppliDefs.CLASS_PROPERTIES:
				mouseUsage[BTN1].setText("Edit Device Property");
				mouseUsage[BTN3].setText("Edit source code");
				break;
			case PogoAppliDefs.DEV_PROPERTIES:
				mouseUsage[BTN1].setText("Edit Device Property");
				mouseUsage[BTN3].setText("Edit source code");
				break;
			case PogoAppliDefs.COMMANDS:
				mouseUsage[BTN1].setText("Edit Command");
				mouseUsage[BTN3].setText("Edit source code");
				break;
			case PogoAppliDefs.ATTRIBUTES:
				mouseUsage[BTN1].setText("Edit Attribute");
				mouseUsage[BTN3].setText("Edit source code");
				break;
			case PogoAppliDefs.STATES:
				mouseUsage[BTN1].setText("Edit State");
				mouseUsage[BTN3].setText("Not Available");
				break;
			default:
				mouseUsage[BTN1].setText("  ");
				mouseUsage[BTN3].setText("  ");
			}
			break;
		default:
			mouseUsage[BTN1].setText("  ");
			mouseUsage[BTN3].setText("  ");
			break;
		}
	}
//======================================================
	private void popupMessage(String mess)
	{
			JOptionPane.showMessageDialog(frame, mess,
								"Error Window",
								JOptionPane.ERROR_MESSAGE);
	}
//======================================================
/**
 *	Get the collection named as String s.
 *
 *	@param	s	Name of collection search.
 *	@return	Node Vector of the collection found.
 */
//======================================================
	protected Vector getCollectionVector(String s)
	{
		for (int i=0 ; i<collec.length ; i++)
			if (s.equals(collec[i].toString()))
				switch(i)
				{
				case PogoAppliDefs.CLASS_PROPERTIES:
					return classPropNodesVector;
				case PogoAppliDefs.DEV_PROPERTIES:
					return devPropNodesVector;
				case PogoAppliDefs.COMMANDS:
					return cmdNodesVector;
				case PogoAppliDefs.ATTRIBUTES:
					return attrNodesVector;
				case PogoAppliDefs.STATES:
					return stNodesVector;
				}
		return null ;
	}
//======================================================
/**
 *	Get the collection named as String s.
 *
 *	@param	s	Name of collection search.
 *	@return	Data Vector of the collection found.
 */
//======================================================
	protected Vector getDataVector(String s)
	{
		for (int i=0 ; i<collec.length ; i++)
			if (s.equals(collec[i].toString()))
				switch(i)
				{
				case PogoAppliDefs.CLASS_PROPERTIES:
					return classPropVector;
				case PogoAppliDefs.DEV_PROPERTIES:
					return devPropVector;
				case PogoAppliDefs.COMMANDS:
					return cmdVector;
				case PogoAppliDefs.ATTRIBUTES:
					return attrVector;
				case PogoAppliDefs.STATES:
					return stVector;
				}
		return null ;
	}
//======================================================
/**
 *	Get the collection named as String s.
 *
 *	@param	s	Name of collection search.
 *	@return	Node of the collection found.
 */
//======================================================
	protected DefaultMutableTreeNode getCollectionNode(String s)
	{
		for (int i=0 ; i<collec.length ; i++)
			if (s.equals(collec[i].toString()))
				switch(i)
				{
				case PogoAppliDefs.CLASS_PROPERTIES:
					return classPropNode;
				case PogoAppliDefs.DEV_PROPERTIES:
					return devPropNode;
				case PogoAppliDefs.COMMANDS:
					return cmdNode;
				case PogoAppliDefs.ATTRIBUTES:
					return attrNode;
				case PogoAppliDefs.STATES:
					return stNode;
				}
		return null ;
	}
//======================================================
/**
 *	Get the item named  s i a Vector of .
 *
 *	@param	leafVector	Vector of nodes.
 *	@param	s			Item's name.
 *	@return	Index of item found.
 */
//======================================================
	private int getItemInCollection(Vector leafVector, String s)
	{
		DefaultMutableTreeNode selNode =
								(DefaultMutableTreeNode) leafVector.elementAt(0);
		for (int i=0 ; i<leafVector.size() ; i++)
		{
			selNode = (DefaultMutableTreeNode) leafVector.elementAt(i);
			if (s.equals(selNode.toString()))
				return i;
		}
		return -1;
	}
//======================================================
/**
 *	Create e new leaf whith an object in collection called colName.
 *
 *	@param	colName		Collection name.
 *	@param	obj			Object to be put in the leaf.
 */
//======================================================
	private void createNewLeaf(String colName, Object obj)
	{
		Vector	leafVector = getCollectionVector(colName);
		Vector	dataVector = getDataVector(colName);
		int		idx = dataVector.size();

		if (leafVector!=null && dataVector!=null)
		{
			String	name = obj.toString();
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(name);
			leafVector.addElement(node);
			dataVector.addElement(obj);
			treeModel.insertNodeInto(node,getCollectionNode(colName), idx);
			modified = true;
		}
		else
			System.err.println("Couln't create leaf for\n"+
						"Collection "+ colName + ". Data: "+obj);
	}
//======================================================
/**
 *	Remove a leaf in a collection.
 *
 *	@param	leafVector		Nodes vector.
 *	@param	dataVector		Objects vector.
 *	@param	vIdx			Index of the leaf in the vectors.
 */
//======================================================
	public void removeLeaf(Vector leafVector, Vector dataVector, int vIdx)
	{
		treeModel.removeNodeFromParent(
						(DefaultMutableTreeNode) leafVector.elementAt(vIdx));
		leafVector.removeElementAt(vIdx);
		dataVector.removeElementAt(vIdx);
		tree.clearSelection();
		selectedPath = null;
		modified = true;
	}
//======================================================
/**
 *	Clear all the tree.
 */
//======================================================
	public void clear()
	{
		for (int i=0 ; i<collec.length  ; i++)
		{
			Vector	leafVector = getCollectionVector(collec[i]);
			Vector	dataVector = getDataVector(collec[i]);
			while (leafVector.size()>0)
				removeLeaf(leafVector, dataVector, 0);
		}
		root.setUserObject("");
		classDesc = "";
		projTitle = "";
		modified = false;
	}
//======================================================
/**
 *	Modify the root leaf.
 *
 *	@param	name	Class name.
 *	@param	desc	Class description.
 */
//======================================================
	private void modifyRootLeaf(String name, String desc, String title)
	{
		root.setUserObject(name);
		classDesc = new String(desc);
		projTitle = new String(title);
		modified = true;
	}
//======================================================
/**
 *	Display ClassDialog Object to edit class parameters.
 *
 */
//======================================================
	public void editClassObject()
	{
		//  Open Dialog
		//------------------
		ClassDialog  classDialog = new ClassDialog(frame, true);
		if (classDialog.showClassDialog(root.toString(),
							classDesc, projTitle)==PogoAppliDefs.RET_OK)
		{
			classDesc = classDialog.getDescription();
			projTitle = classDialog.getProjectTitle();
			modifyRootLeaf(classDialog.getClassName(), classDesc, projTitle);
			modified = true;
		}
	}
//======================================================
/**
 *	Modify the the leaf.
 *
 *	@param	dataVector		Objects vector.
 *	@param	leafVector		Nodes vector.
 *	@param	idx				index of the leaf to be modified.
 *	@param	newData			New object to be put in the leaf.
 */
//======================================================
	public void changeLeaf(Vector dataVector, Vector leafVector, int vIdx, Object newData)
	{
		DefaultMutableTreeNode	selNode =
			(DefaultMutableTreeNode) leafVector.elementAt(vIdx);
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(newData);
		DefaultMutableTreeNode	parent =
							(DefaultMutableTreeNode)selNode.getParent();

		treeModel.removeNodeFromParent(
							(DefaultMutableTreeNode) leafVector.elementAt(vIdx));
		leafVector.removeElementAt(vIdx);
		dataVector.removeElementAt(vIdx);

		treeModel.insertNodeInto(node, parent, vIdx);
		leafVector.insertElementAt(node, vIdx);
		dataVector.insertElementAt(newData, vIdx);
		modified = true;
	}
//======================================================
/**
 *	Start the edition of a leaf.
 */
//======================================================
	private void editCollection()
	{
		// Check if selection available before editing.
		//--------------------------------------------------
		//if (isLeafSelected()==false)
		//	return;
		Object[]	path  = selectedPath.getPath();
		if (path.length<3)
			return;

		//	Check to get the interested leafVector
		//-----------------------------------------
		String	collec = path[PogoAppliDefs.COLLECTION].toString();
		Vector	dataVector = getDataVector(collec);
		Vector	leafVector = getCollectionVector(collec);
		if (leafVector==null)
		{
			System.err.println("--------> Parent's Node not found");
			return;
		}

		//	Check to get the interested leafVector index
		//--------------------------------------------
		DefaultMutableTreeNode selNode =
								(DefaultMutableTreeNode) leafVector.elementAt(0);
		String	s1 = path[LEAF_ITEM].toString();
		int vIdx = 0;
		for (int i=0 ; i<leafVector.size() ; i++)
		{
			selNode = (DefaultMutableTreeNode) leafVector.elementAt(i);
			if (s1.equals(selNode.toString()))
			{
				vIdx = i;
				break;
			}
		}
		if (dataVector==cmdVector)
		{
			Cmd	cmd = (Cmd)cmdVector.elementAt(vIdx);
			if(cmd.virtual_method==true)	// Virtual status cmd
			{
				if (cmd.override_method==ALREADY_OVERRIDED ||
					cmd.override_method==OVERRIDE)
					JOptionPane.showMessageDialog(tree,
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
				editCommand(dataVector, leafVector, vIdx);
		}
		else
		if (dataVector==attrVector)
			editAttribute(dataVector, leafVector, vIdx);
		else
		if (dataVector==stVector)
			editState(dataVector, leafVector, vIdx);
		else
		if (dataVector==devPropVector || dataVector==classPropVector)
			editProperty(dataVector, leafVector, vIdx);
	}
//======================================================
/**
 *	Start the edition of a leaf of property.
 *
 *	@param	dataVector		Objects vector.
  *	@param	leafVector		Nodes vector.
*	@param 	vIdx			Index of the property to be edited.
 */
//======================================================
	private void editProperty(Vector dataVector, Vector leafVector, int vIdx)
	{
		//	Retreve the clicked property and edit it
		//-------------------------------------------------
		PropertyDialog	propDialog = new PropertyDialog(frame, true);
		Property		property = (Property)dataVector.elementAt(vIdx);
			
		if (propDialog.showDialog(property)==RET_OK)
		{
			Property	newProp = propDialog.getInput();
			if (property.equals(newProp)==false)
			{
				changeLeaf(dataVector, leafVector, vIdx, newProp);
				modified = true;
			}
		}
	}
//======================================================
/**
 *	Start the edition of a leaf of command.
 *
 *	@param	dataVector		Objects vector.
  *	@param	leafVector		Nodes vector.
*	@param 	vIdx			Index of the command to be edited.
 */
//======================================================
	private void editCommand(Vector dataVector, Vector leafVector, int vIdx)
	{
		//	Open Dialog to get cmd parameters
		//----------------------------------------------
		CommandDialog	dialog = new CommandDialog(frame, true,
										stVector, cmdVector);
		Cmd cmd = (Cmd)dataVector.elementAt(vIdx);

		if (dialog.showDialog(cmd, vIdx)==PogoAppliDefs.RET_OK)
		{
			Cmd newCmd = dialog.getInputCommand();
			if (cmd.equals(newCmd)==false)
			{
				//	if command's name doesn't change,
				//	the command's class doesn't change too
				//---------------------------------------------
				if (cmd.command.equals(newCmd.command))
					newCmd.cmd_class = new String(cmd.cmd_class);

				//	Modify selected leaf
				//---------------------------------------------
				changeLeaf(dataVector, leafVector, vIdx, newCmd);
				modified = true;
			}
		}
	}
	//======================================================
	private void editAttribute(Vector dataVector, Vector leafVector, int vIdx)
	{
		//	Open Dialog to get Attribute parameters
		//----------------------------------------------
		AttributeDialog	dialog = new AttributeDialog(frame, true);
		Attrib attr = (Attrib)dataVector.elementAt(vIdx);

		if (dialog.showDialog(attr)==PogoAppliDefs.RET_OK)
		{
			Attrib newAttr = dialog.getInput();
			if (attr.equals(newAttr)==false)
			{
				//	Modify selected leaf
				//---------------------------------------------
				changeLeaf(dataVector, leafVector, vIdx, newAttr);
				modified = true;
			}
		}
	}
	//======================================================
	private void editState(Vector dataVector, Vector leafVector, int vIdx)
	{
		//	Open Dialog to get cmd parameters
		//----------------------------------------------
		StateDialog	dialog = new StateDialog(frame, true);
		DevState state = (DevState)dataVector.elementAt(vIdx);

		if (dialog.showStateDialog(state)==PogoAppliDefs.RET_OK)
		{
			DevState newState = dialog.getInput();
			if (state.equals(newState)==false)
			{
				//	Modify selected leaf
				//---------------------------------------------
				changeLeaf(dataVector, leafVector, vIdx, newState);
				modified = true;
			}
		}
	}

	//======================================================
	public boolean isLeafSelected()
	{
		if (tree.isSelectionEmpty())		return false;	// Nothing selected
		if (selectedPath==null)				return false;	 //	No a Path
		if (selectedPath.getPathCount()<3)	return false;	//	NOT a Leaf.

		//	Check if one of 2 dummy status cmds.
		//-----------------------------------------
		Object[]	path  = selectedPath.getPath();
		String	collName = path[PogoAppliDefs.COLLECTION].toString();
		int collNum = getCollectionNum(collName);
		if (collNum==COMMANDS)
		{
			Vector	leafVector = getCollectionVector(collName);
			int		vIdx = getItemInCollection(leafVector,	path[LEAF_ITEM].toString());
			if (vIdx<2)
				return false;		//	StateCmd Or StatusCmd
		}

		return true;
	}
	//======================================================
	private boolean isCollectionSelected()
	{
		//if (tree.isSelectionEmpty())		return false;	// Nothing selected
		if (selectedPath==null)				return false;	 //	No a Path
		if (selectedPath.getPathCount()!=2)	return false;	//	NOT a Colection.
		return true;
	}
	//======================================================
	private boolean isRootSelected()
	{
		//if (tree.isSelectionEmpty())		return false;	// Nothing selected
		if (selectedPath==null)				return false;	 //	No a Path
		if (selectedPath.getPathCount()!=1)	return false;	//	NOT The root
		return true;
	}
	//======================================================
	public void copySelection()
	{
		if (isLeafSelected()==false)
			return;
		Object[]	path  = selectedPath.getPath();

		//	Check to get the interested leafVector
		//-----------------------------------------
		collecObjCut = path[COLLECTION].toString();
		Vector	dataVector = getDataVector(collecObjCut);
		Vector	leafVector = getCollectionVector(collecObjCut);
		int		vIdx = getItemInCollection(leafVector,
								path[LEAF_ITEM].toString());
		objCut = dataVector.elementAt(vIdx);
	}
	//======================================================
	public void cutSelection()
	{
		if (isLeafSelected()==false)
			return;
		Object[]	path  = selectedPath.getPath();

		//	Check to get the interested leafVector
		//-----------------------------------------
		collecObjCut = path[COLLECTION].toString();
		Vector	dataVector = getDataVector(collecObjCut);
		Vector	leafVector = getCollectionVector(collecObjCut);
		int		vIdx = getItemInCollection(leafVector,
								path[LEAF_ITEM].toString());
		objCut = dataVector.elementAt(vIdx);
		removeLeaf(leafVector, dataVector, vIdx);
		modified = true;
	}
	//======================================================
	public boolean objToBePasted()
	{
		return (objCut!=null);
	}
	//======================================================
	public void paste()
	{
		if (objCut!=null)
		{
			createNewLeaf(collecObjCut, objCut);
			modified = true;
		}
	}
	//======================================================
	public void moveUpSelection()
	{
		if (isLeafSelected()==false)
			return;
		Object[]	path  = selectedPath.getPath();

		//	Check to get the interested leafVector
		//-----------------------------------------
		String	collec = path[PogoAppliDefs.COLLECTION].toString();
		Vector	dataVector = getDataVector(collec);
		Vector	leafVector = getCollectionVector(collec);
		int		vIdx = getItemInCollection(leafVector,
								path[PogoAppliDefs.LEAF_ITEM].toString());
		if (vIdx>0)
		{
			Object	data0 = dataVector.elementAt(vIdx-1);
			Object	data1 = dataVector.elementAt(vIdx);
			changeLeaf(dataVector, leafVector, vIdx, data0);
			changeLeaf(dataVector, leafVector, vIdx-1, data1);
			modified = true;
		}
	}
	//======================================================
	public void moveDownSelection()
	{
		if (isLeafSelected()==false)
			return;
		Object[]	path  = selectedPath.getPath();

		//	Check to get the interested leafVector
		//-----------------------------------------
		String	collec = path[PogoAppliDefs.COLLECTION].toString();
		Vector	dataVector = getDataVector(collec);
		Vector	leafVector = getCollectionVector(collec);
		int		vIdx = getItemInCollection(leafVector,
								path[PogoAppliDefs.LEAF_ITEM].toString());
		if (vIdx<dataVector.size()-1)
		{
			Object	data0 = dataVector.elementAt(vIdx+1);
			Object	data1 = dataVector.elementAt(vIdx);
			changeLeaf(dataVector, leafVector, vIdx, data0);
			changeLeaf(dataVector, leafVector, vIdx+1, data1);
			modified = true;
		}
	}
	//======================================================
	public void removeSelectedLeaf()
	{
		if (isLeafSelected()==false)
			return;
		Object[]	path  = selectedPath.getPath();

		//	Check to get the interested leafVector
		//-----------------------------------------
		String	collec = path[PogoAppliDefs.COLLECTION].toString();
		Vector	dataVector = getDataVector(collec);
		Vector	leafVector = getCollectionVector(collec);
		int		vIdx = getItemInCollection(leafVector,
								path[PogoAppliDefs.LEAF_ITEM].toString());

		String	itemName = new 
			String(collec+ " item:  "+ path[PogoAppliDefs.LEAF_ITEM].toString());
		if (JOptionPane.showConfirmDialog(this, 
							"Delete the " + itemName,
							"Warning",
							JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
		{
			int	colNum = getCollectionNum(collec);
			String	infoMessage = null;
			switch(colNum)
			{
			case COMMANDS:				
				Cmd	cmd = (Cmd)dataVector.elementAt(vIdx);
				infoMessage =  new String("The " + itemName +
					" has been taken off the command factory.\n\n"+
					"But, for safety reason, if this command has been already generated,\nthe \'"+
					cmd.exec_method + "\' method will not be automaticaly removed !!!\n"+
					"Please do it by yourself.");
				break;
			}
			removeLeaf(leafVector, dataVector, vIdx);
			modified = true;
			if (infoMessage!=null)
				JOptionPane.showMessageDialog(tree,infoMessage, "Info Window",
													JOptionPane.INFORMATION_MESSAGE);
		}
	}
	//======================================================
	/**
	 *	Create a new objetc for in a coolection.
	 *
	 *	@param	collName	Name of the collection
	 *						where the object must be added.
	 */
	//======================================================
	public void createNewCollectionObject(String collName)
	{
		if (collName.equals(collec[PogoAppliDefs.COMMANDS].toString()))
		{
			//	Create a new Command
			//-----------------------------
			CommandDialog  cmdDialog = new CommandDialog(frame, true,
										stVector, cmdVector);
			if (cmdDialog.showDialog()==PogoAppliDefs.RET_OK)
			{
				Cmd  cmd = cmdDialog.getInputCommand();
				createNewLeaf(collName, cmd);
			}
		}
		else
		if (collName.equals(collec[PogoAppliDefs.ATTRIBUTES].toString()))
		{
			//	Create a new Attributes
			//-----------------------------
			AttributeDialog	dialog = new AttributeDialog(frame, true);
			Attrib	tmpAttr = new Attrib("",ATTR_SCALAR, 
									AttrDataArray[0], ATTR_READ, "");
			if (dialog.showDialog(tmpAttr)==PogoAppliDefs.RET_OK)
			{
				Attrib attr = dialog.getInput();
    			createNewLeaf(collName, attr);
				modified = true;
 			}
		}
		else
		if (collName.equals(collec[PogoAppliDefs.STATES].toString()))
		{
			//	Create a new State
			//-----------------------------
			StateDialog	stateDialog = new StateDialog(frame, true);
			String    	defState = TangoStatesArray[Tango_UNKNOWN];
			DevState    state = new DevState(defState,"");
			if (stateDialog.showStateDialog(state)==RET_OK)
			{
				state = stateDialog.getInput();
				createNewLeaf(collName, state);
				modified = true;
			}
		}
		else
		if (collName.equals(collec[PogoAppliDefs.DEV_PROPERTIES].toString()) ||
			collName.equals(collec[PogoAppliDefs.CLASS_PROPERTIES].toString()))
		{
			//	Create a new device property
			//------------------------------
			PropertyDialog	propDialog = new PropertyDialog(frame, true);
			
			if (propDialog.showDialog(new Property("","Tango::DEV_SHORT", ""))==RET_OK)
			{
				createNewLeaf(collName, propDialog.getInput());
			}
		}
		else
			popupMessage("Not yet available !");
			
	}
	//======================================================
	/**
	 *	Start a thread to edit source file.
	 *
	 *	@param	cmdName	command's name.
	 */
	//======================================================
	private void editCmdCode(String cmdName)
	{
		String	mess = null;
		try
		{
			EditPogoCode	ed = new EditPogoCode(getPogoClass());
			ed.setCommandTarget(cmdName);
			ed.start();
		}
		catch(FileNotFoundException	e)
		{
			mess = "Source File Not Found !";
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
			popupMessage(mess);
	}
	//======================================================
	/**
	 *	Start a thread to edit source file.
	 */
	//======================================================
	private void editAttributesCode()
	{
		String	mess = null;
		try
		{
			EditPogoCode	ed = new EditPogoCode(getPogoClass());
			ed.setAttributeTarget();
			ed.start();
		}
		catch(FileNotFoundException	e)
		{
			mess = "Source File Not Found";
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
			popupMessage(mess);
	}
	//======================================================
	/**
	 *	Start a thread to edit source file.
	 *
	 *	@param type class or device properties.
	 */
	//======================================================
	private void editPropertiesCode(int type)
	{
		String	mess = null;
		try
		{
			EditPogoCode	ed = new EditPogoCode(getPogoClass());
			ed.setPropertiesTarget(type);
			ed.start();
		}
		catch(FileNotFoundException	e)
		{
			mess = "Source File Not Found";
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
			popupMessage(mess);
	}
	//======================================================
	/**
	 *	Manage event on clicked mouse on PogoTree object.
	 */
	//======================================================
	private void treeMouseClicked (java.awt.event.MouseEvent evt)
	{
		int selRow = tree.getRowForLocation(evt.getX(), evt.getY());
		selectedPath = tree.getPathForLocation(evt.getX(), evt.getY());
		
		//	Do something only if double click
		//-------------------------------------
		if(evt.getClickCount() != 2)
			return;
		else
		if (pMenu!=null)
			pMenu.setVisible(false);

		//	Check if btn2 -> do nothing
		//-------------------------------------
		int mask = evt.getModifiers();
		if ((mask & evt.BUTTON2_MASK)!=0)
		{
			System.out.println(" BTN 2");
			return;
		}

		//	Check if at least one cell is selected
		//----------------------------------------------
		if (selRow == -1)
		{
			//System.out.println(" No Cell selected");
			return;
		}

		//	If a collection is selected with BTN3 -> Create a new item
		//----------------------------------------------------------------
		if ((mask & evt.BUTTON3_MASK)!=0)
		{
			if (isRootSelected())
			{
				//	Edit Class Dialog
				//------------------------------
				editClassObject();
				return;
			}
			else
			{
				Object[]	path  = selectedPath.getPath();
				String		collName = path[COLLECTION].toString();

				if (isCollectionSelected())
				{

					//	Create a new collection item
					//------------------------------------
					createNewCollectionObject(collName);
					return;
				}
				else
				if (path.length>2)	//	leaf clicked
					if (collName.equals(collec[COMMANDS].toString()))
						editCmdCode(path[LEAF_ITEM].toString());//	edit code
					else
					if (collName.equals(collec[ATTRIBUTES].toString()))
						editAttributesCode();//	edit code
					else
					if (collName.equals(collec[DEV_PROPERTIES].toString()))
						editPropertiesCode(DEV_PROPERTIES);//	edit code
					else
					if (collName.equals(collec[CLASS_PROPERTIES].toString()))
						editPropertiesCode(CLASS_PROPERTIES);//	edit code
			}
		}
		else
		if ((mask & evt.BUTTON1_MASK)!=0)	//	If Btn1 edit the leaf object
//			if (isLeafSelected())
				editCollection();
	}

//======================================================
/**
 *	Action performed from Popup Menu 
 */
//======================================================
	private void  createActionPerformed(java.awt.event.ActionEvent evt)
	{
		//	Create a new object for the selected collection
		//------------------------------------------------------
		createNewCollectionObject(evt.getActionCommand());
		pMenu.setVisible(false);
	}

//======================================================
/**
 *	Manage a simple click on right button 
 *	for popu menu display.	
 */
//======================================================
	private void frameMouseClicked(java.awt.event.MouseEvent evt)
	{
		//	Check if btn2 -> do nothing
		//-------------------------------------
		int mask = evt.getModifiers();
		if ((mask & evt.BUTTON3_MASK)==0 || (mask & evt.SHIFT_MASK)==0)
		{
			pMenu.setVisible(false);
			return;
		}

		//	If already vissible, erase it
		//------------------------------------
		if (pMenu.isVisible()==true)
		{
			pMenu.setVisible(false);
			return;
		}

		//	Get position and display Popup menu
		//---------------------------------------
		Object	o = evt.getSource();
		Point	p = ((Component)o).getLocationOnScreen();
		p.x += evt.getX();
		p.y += evt.getY();

		if ((mask & evt.SHIFT_MASK)!=0)
		{
			pMenu.setLocation(p.x, p.y);
			pMenu.setVisible(true);
		}
	}

//======================================================
/**
 *	Build the JTree coresponding to the <i> PogoClass</i> object.
 *
 *	@param	pogo The <i> PogoClass</i> object to display architecture.
 */
//======================================================
	public void setPogoTree(PogoClass pogo)
	{
		int		nb_rows = collec.length;
	  	clear();
		
		root.setUserObject(pogo.class_name);
		class_name = new String(pogo.class_name);
		classDesc  = new String(pogo.class_desc);
		projTitle  = new String(pogo.title);
		
		//	Create Class Properties leaves
		//----------------------------------
		if (pogo.class_properties!=null)
			for (int i=0 ; i<pogo.class_properties.size() ; i++, nb_rows++)
			{
				Property	prop = pogo.class_properties.elementAt(i);
				createNewLeaf(collec[CLASS_PROPERTIES], prop);
			}
		
		//	Create Device Properties leaves
		//----------------------------------
		if (pogo.dev_properties!=null)
			for (int i=0 ; i<pogo.dev_properties.size() ; i++, nb_rows++)
			{
				Property	prop = pogo.dev_properties.elementAt(i);
				createNewLeaf(collec[DEV_PROPERTIES], prop);
			}
		
		//	Create Command leaves
		//----------------------------------
		if (pogo.commands!=null)
			for (int i=0 ; i<pogo.commands.size() ; i++, nb_rows++)
			{
				Cmd		cmd = pogo.commands.cmdIdx(i);
				createNewLeaf(collec[COMMANDS], cmd);
			}
		
		//	Create Attribute leaves
		//----------------------------------
		if (pogo.attributes!=null)
			for (int i=0 ; i<pogo.attributes.size() ; i++, nb_rows++)
			{
				Attrib	attr = pogo.attributes.elementAt(i);
				createNewLeaf(collec[ATTRIBUTES], attr);
			}

		//	Create State leaves
		//----------------------------------
		if (pogo.states!=null)
			for (int i=0 ; i<pogo.states.size() ; i++, nb_rows++)
			{
				DevState	state = pogo.states.elementAt(i);
				createNewLeaf(collec[STATES], state);
			}

		//	Open the tree
		for (int i=0 ; i<nb_rows ; i++)
			tree.expandRow(i);
		modified = false;
	}
//======================================================
/**
 *	@return the  object architecture displayed
 *				as a <i>PogoClass</i> object.
 */
//======================================================
	public PogoClass getPogoClass()
	{
		String name = root.getUserObject().toString();
		try {
			PogoClass	pogo = new PogoClass(name, classDesc,
											classPropVector, devPropVector, 
											cmdVector, attrVector, stVector);
			for (int i=0 ; i<pogo.commands.size() ; i++)
			{
				Cmd cmd = pogo.commands.cmdIdx(i);
				if (cmd.virtual_method==false)
				{
					//	Check if in the NotAllowed DevSateTable
					//	there is not any "not existing" state (deleted....)
					//---------------------------------------------------------
					for (int j=0 ; j<cmd.notAllowedFor.size() ; j++)
					{
						DevState	st = (DevState) cmd.notAllowedFor.elementAt(j);
						boolean	exist = false;
						for (int k=0 ; k<pogo.states.size() ; k++)
						{
							DevState	state = (DevState) pogo.states.elementAt(k);
							if (st.name.equals(state.name)==true)
								exist = true;
						}
						if (exist==false)
						{
							cmd.removeNotAllowedFor(st);
							System.out.println(st.name + "Does Not Exist !");
						}
					}
				}
			}
			pogo.title        = projTitle;
			pogo.language     = language;
			pogo.output_files = new String(homeDir);
			return pogo;
		}
		catch (PogoException ex)
		{
			popupMessage(ex.toString());
			return null;
		}
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
	public void setModified(boolean state)
	{
		modified = state;
	}
//======================================================
/**
 *	Set global param for pogo class creation
 */
//======================================================
	public void setHomeDir(String path)
	{
		homeDir = new String(path);
	}
//======================================================
/**
 *	Set global param for pogo class creation
 */
//======================================================
	public void setLanguage(int lang)
	{
		language = lang;
	}
}
