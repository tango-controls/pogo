//+======================================================================
//
// Project:   Tango
//
// Description:	java source code for display JTree defining device class.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011
//						European Synchrotron Radiation Facility
//                      BP 220, Grenoble 38043
//                      FRANCE
//
// This file is part of Tango.
//
// Tango is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// Tango is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
// $Revision: $
// $Date:  $
//
// $HeadURL: $
//
//-======================================================================

package org.tango.pogo.pogo_gui;


import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;
import fr.esrf.TangoDs.TangoConst;
import fr.esrf.tango.pogo.pogoDsl.*;
import fr.esrf.tangoatk.widget.util.ErrorPane;
import org.eclipse.emf.common.util.EList;
import org.tango.pogo.pogo_gui.tools.OAWutils;
import org.tango.pogo.pogo_gui.tools.PogoEditor;
import org.tango.pogo.pogo_gui.tools.Utils;

import javax.swing.*;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;


public class  ClassTree  extends JTree implements TangoConst, PogoConst
{

	private DefaultTreeModel	    treeModel;
	private DefaultMutableTreeNode  root;
	private ClassTreePopupMenu		menu;
	private PogoGUI					parent;

	private static final Color	background = Color.white;//new Color(0xf0, 0xf0, 0xf0);
	private static final Color	dynamicBG  = new Color(0xddffff);

	private PogoDeviceClass     pogo_class;
	private DeviceClass 	    dev_class;
	private DeletedObjects	    deleted_objects = new DeletedObjects();
	private RenamedObjects	    renamed_objects = new RenamedObjects();
    private InheritanceUtils    inherit_utils;
    private boolean             modified = false;
    private boolean             isInheritedClass;

    static private Object   copiedItem = null;
	//===============================================================
	//===============================================================
	public ClassTree(PogoGUI parent, DeviceClass devclass, boolean isInheritedClass)
	{
		super();
		this.parent    = parent;
		this.dev_class = devclass;
        this.isInheritedClass = isInheritedClass;
		pogo_class = devclass.getPogoDeviceClass();
        inherit_utils = InheritanceUtils.getInstance();

		buildTree();
		setBackground(background);
		 menu = new ClassTreePopupMenu(this);
		expandChildren(root);
		setSelectionPath(null);

        //  Check if class ID is not null (could be null from old Pogo)
        if (devclass.getPogoDeviceClass().getDescription().getIdentification()==null) {
            Utils.getInstance().stopSplashRefresher();
            editClass();
        }
	 }
	//===============================================================
	//===============================================================
	private void buildTree()
	{
		//  Create the nodes.
		root = new DefaultMutableTreeNode(new PogoRoot(pogo_class));
		createCollectionClassNodes(pogo_class);

		//	Create the tree that allows one selection at a time.
		getSelectionModel().setSelectionMode
				(TreeSelectionModel.SINGLE_TREE_SELECTION);

		//	Create Tree and Tree model
		treeModel = new DefaultTreeModel(root);
		setModel(treeModel);

		//Enable tool tips.
		ToolTipManager.sharedInstance().registerComponent(this);

		//  Set the icon for leaf nodes.
		TangoRenderer renderer = new TangoRenderer();
		setCellRenderer(renderer);

		//	Add Action listener
		addMouseListener (new java.awt.event.MouseAdapter () {
			public void mousePressed (java.awt.event.MouseEvent evt) {
			}
			public void mouseReleased (java.awt.event.MouseEvent evt) {
			}
			public void mouseClicked (java.awt.event.MouseEvent evt) {
				treeMouseClicked(evt);	//	for tree clicked, menu,...
			}
		});
		 //	Listen for collapse tree
		addTreeExpansionListener(new TreeExpansionListener () {
			public void treeCollapsed(TreeExpansionEvent e) {
				collapsedPerformed(e);
			}
			public void treeExpanded(TreeExpansionEvent e) {
				//expandedPerfomed(e);
			}
		});
	}
	//======================================================
	//======================================================
	public void collapsedPerformed(TreeExpansionEvent evt)
	{
		//	Get node to be collapsed
		TreePath	collapsePath = evt.getPath();
		int			idx = collapsePath.getPathCount()-1;
		DefaultMutableTreeNode	colapsedNode =
			(DefaultMutableTreeNode)collapsePath.getPathComponent(idx);

		//	get the selected node
 		DefaultMutableTreeNode selectedNode = getSelectedNode();
		if (selectedNode==null || colapsedNode==null)
			return;

		//	Check if collapse on selected node, else OK to collapse
		if (colapsedNode!=selectedNode)
			return;

		//	Then force to expand
		if (selectedNode.getChildCount()>0) {
			//	Cancel collapse tree -> expand first child
			DefaultMutableTreeNode	child = 
					(DefaultMutableTreeNode)selectedNode.getChildAt(0);
			TreeNode[]	child_path = child.getPath();
			setExpandedState(new TreePath(child_path), true);
		}
	}
	//===============================================================
	//===============================================================
	@SuppressWarnings({"UnusedDeclaration"})
    public void expandedPerfomed(TreeExpansionEvent evt)
	{
	}
	//======================================================
	/**
	 *	Manage event on clicked mouse on JTree object.
     * @param evt  clicked mouse event
     */
	//======================================================
	private void treeMouseClicked (java.awt.event.MouseEvent evt)
	{
		//	Set selection at mouse position
		TreePath	selectedPath = getPathForLocation(evt.getX(), evt.getY());
		if (selectedPath==null) {
			setSelectionPath(null);
			return;
		}
		DefaultMutableTreeNode	node =
		(DefaultMutableTreeNode) selectedPath.getPathComponent(selectedPath.getPathCount()-1);
		Object	o = node.getUserObject();
		int mask = evt.getModifiers();

		//  Check button clicked
		if(evt.getClickCount()==2 && (mask & MouseEvent.BUTTON1_MASK)!=0) {
			if (!(o instanceof PogoCollection)) {
				editItem();
			}
			else
			if (node!=root)
				addItem(node, false);
		}
		else
		if ((mask & MouseEvent.BUTTON3_MASK)!=0) {
			if (node == root)
				 menu.showMenu(evt, (PogoRoot)node.getUserObject());
			else
			if (o instanceof PogoCollection)
				menu.showMenu(evt, (PogoCollection)o);
			else {
				DefaultMutableTreeNode	parent_node =
						(DefaultMutableTreeNode) node.getParent();
                
				menu.showMenu(evt, o, parent_node.toString());
			}
	   }
	}
	//===============================================================
	//===============================================================
	private void createCollectionClassNodes(PogoDeviceClass	pogoClass)
	{
		EList<Property>		classprops = pogoClass.getClassProperties();
		EList<Property>		devprops   = pogoClass.getDeviceProperties();
		EList<Command>		commands   = pogoClass.getCommands();
		EList<Attribute>	attributes = pogoClass.getAttributes();
		EList<Attribute>	dynAttrib  = pogoClass.getDynamicAttributes();
		EList<State>		states     = pogoClass.getStates();

		//	Check for State and Status commands
		if (commands.size()==0) {
			Command[]	cmd = org.tango.pogo.pogo_gui.tools.OAWutils.createStateStatusCommand();
			commands.add(cmd[0]);
			commands.add(cmd[1]);
		}

		Utils	utils = Utils.getInstance();
		DefaultMutableTreeNode	classprop_node =
				new DefaultMutableTreeNode(
						new PogoCollection("Class Properties", utils.classprop_icon));
		DefaultMutableTreeNode	devprop_node   =
				new DefaultMutableTreeNode(
						new PogoCollection("Device Properties", utils.devprop_icon));
		DefaultMutableTreeNode	cmd_node       =
				new DefaultMutableTreeNode(
						new PogoCollection("Commands", utils.cmd_icon));
		DefaultMutableTreeNode	scalar_node       =
				new DefaultMutableTreeNode(
						new PogoCollection("Scalar Attributes", utils.scalar_icon));
		DefaultMutableTreeNode	spectrum_node    =
				new DefaultMutableTreeNode(
						new PogoCollection("Spectrum Attributes", utils.spectrum_icon));
		DefaultMutableTreeNode	image_node   =
				new DefaultMutableTreeNode(
						new PogoCollection("Image Attributes", utils.image_icon));
		DefaultMutableTreeNode	states_node    =
				new DefaultMutableTreeNode(
						new PogoCollection("States", utils.state_icon));

		for (Property prop : classprops) {
			DefaultMutableTreeNode	node =
				new DefaultMutableTreeNode(new PogoProperty(prop, false));
			classprop_node.add(node);
		}
		for (Property prop : devprops) {
			DefaultMutableTreeNode	node =
				new DefaultMutableTreeNode(new PogoProperty(prop, true));
			devprop_node.add(node);
		}
		for (Command cmd : commands) {
			DefaultMutableTreeNode	node =
				new DefaultMutableTreeNode(new PogoCommand(cmd));
			cmd_node.add(node);
		}
		for (State state : states) {
			DefaultMutableTreeNode	node =
				new DefaultMutableTreeNode(new PogoState(state));
			states_node.add(node);
		}
		for (Attribute att : attributes) {
			PogoAttribute	pa = new PogoAttribute(att);
			DefaultMutableTreeNode	node =
				new DefaultMutableTreeNode(pa);
			switch(pa.attType) {
			case SCALAR_ATTRIBUTE:
				scalar_node.add(node);
				break;
			case SPECTRUM_ATTRIBUTE:
				spectrum_node.add(node);
				break;
			case IMAGE_ATTRIBUTE:
				image_node.add(node);
				break;
			}
		}
		for (Attribute att : dynAttrib) {
			PogoAttribute	pa = new PogoAttribute(att);
			DefaultMutableTreeNode	node =
				new DefaultMutableTreeNode(pa);
			switch(pa.attType) {
			case SCALAR_ATTRIBUTE:
				scalar_node.add(node);
				break;
			case SPECTRUM_ATTRIBUTE:
				spectrum_node.add(node);
				break;
			case IMAGE_ATTRIBUTE:
				image_node.add(node);
				break;
			}
		}

		root.add(classprop_node);
		root.add(devprop_node);
		root.add(cmd_node);
		root.add(scalar_node);
		root.add(spectrum_node);
		root.add(image_node);
		root.add(states_node);
	}
	//======================================================
	//======================================================
	private DefaultMutableTreeNode getSelectedNode()
	{
		return (DefaultMutableTreeNode) getLastSelectedPathComponent();
	}

	//======================================================
	//======================================================
	Object getSelectedObject()
	{
		DefaultMutableTreeNode	node = getSelectedNode();
		if (node==null)
			return null;
		return node.getUserObject();
	}
	//======================================================
	//======================================================
	Object getSelectedEditableObject()
	{
		Object	selection = getSelectedObject();
		if  (selection instanceof PogoProperty)
			return ((PogoProperty)selection).value;
		if (selection instanceof PogoCommand) {
            Command cmd = ((PogoCommand)selection).value;
            if (cmd.getName().equals("State") ||
                cmd.getName().equals("Status") )
                return null;
            else
    			return cmd;
        }
        if (selection instanceof PogoAttribute)
			return ((PogoAttribute)selection).value;
		if (selection instanceof PogoState)
			return ((PogoState)selection).value;
		return null;
	}
	//===============================================================
	//===============================================================
	private void expandChildren(DefaultMutableTreeNode node)
	{
		boolean	level_done = false;
		for (int i=0 ; i<node.getChildCount() ; i++) {
			DefaultMutableTreeNode child =
					(DefaultMutableTreeNode) node.getChildAt(i);
			if (child.isLeaf()) {
				if (!level_done) {
					expandNode(child);
					level_done = true;
				}
			}
			else
				expandChildren(child);
		}
	}
	//===============================================================
	//===============================================================
	private void expandNode(DefaultMutableTreeNode node)
	{
		Vector<TreeNode>	v = new Vector<TreeNode>();
		v.add(node);
		while (node!=root) {
			node = (DefaultMutableTreeNode) node.getParent();
			v.insertElementAt(node, 0);
		}
		TreeNode[]    tn = new DefaultMutableTreeNode[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			tn[i] = v.get(i);
		TreePath      tp = new TreePath(tn);
		setSelectionPath(tp);
		scrollPathToVisible(tp);
	}
	//===============================================================
	//===============================================================
	private String[] nameAndCollecObject(Object object)
	{
		String	name = "Unknown name";
		String	item = "Unknown Item";
		if  (object instanceof PogoProperty) {
			name = ((PogoProperty)object).value.getName();
			item = "Property";
		}
		else
		if (object instanceof PogoCommand) {
			name = ((PogoCommand)object).value.getName();
			item = "Command";
		}
		else
		if (object instanceof PogoAttribute) {
			name = ((PogoAttribute)object).value.getName();
			item = "Attribute";
		}
		else
		if (object instanceof PogoState) {
			name = ((PogoState)object).value.getName();
			item = "State";
		}
		return new String[] { name, item };
	}
	//===============================================================
	//===============================================================
	public void setSrcPath(String path)
	{
        PogoRoot	pg_root = (PogoRoot) root.getUserObject();
		pg_root.path = path;
	}
	//===============================================================
	//===============================================================
    private void editSourceCode()
    {
        Object	selection = getSelectedObject();
        if (selection==null)
            return;
        try {
        	PogoRoot	pg_root = (PogoRoot) root.getUserObject();
        	String[]    data = new String[] { pg_root.name, pg_root.path, pg_root.language };
			if (pg_root.path==null) {
				Except.throw_exception("NOT_GENERATED",
					"Source files not generated !",
					"ClassTree.editSourceCode()");
            }
            if (selection instanceof PogoProperty) {
                Property	prop = ((PogoProperty)selection).value;
                boolean		is_dev = ((PogoProperty)selection).is_dev;
                PogoEditor.getInstance().editFile(data, prop, is_dev);
            }
            else
            if (selection instanceof PogoCommand) {
                Command	cmd = ((PogoCommand)selection).value;
                PogoEditor.getInstance().editFile(data, cmd);
            }
            else
            if (selection instanceof PogoAttribute) {
                Attribute   attribute =  ((PogoAttribute) selection).value;
                PogoEditor.getInstance().editFile(data, attribute);
            }
            else
            if (selection instanceof PogoState) {
                State   state = ((PogoState) selection).value;
                PogoEditor.getInstance().editFile(data, state);
            }
        }
        catch (IOException e) {
            ErrorPane.showErrorMessage(this, null, e);
        }
        catch (DevFailed e) {
            ErrorPane.showErrorMessage(this, null, e);
        }
    }
	//===============================================================
	/**
	 *	Remove the selected object
	 */
	//===============================================================
	void removeSelectedItem()
	{
        removeSelectedItem(true, true);
    }
	//===============================================================
	/**
	 *	Remove the selected object
     * @param askConfirm    Will ask to confirm before remove if true.
     * @param setModif      call setModified(true) if true;
     */
	//===============================================================
	void removeSelectedItem(boolean askConfirm, boolean setModif)
	{
		Object	selection = getSelectedObject();
		if (selection==null)
			return;
		String[]	naco = nameAndCollecObject(selection);
		if (!askConfirm ||
            JOptionPane.showConfirmDialog(this,
				"Remove  \"" + naco[0] + "\"  "+naco[1]+" ?",
				"Confirmation Window",
				JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION) {

			if (selection instanceof PogoProperty) {
 				Property	prop = ((PogoProperty)selection).value;
                if (!InheritanceUtils.isRemovable(parent, prop))
                    return;
				EList<Property>	properties;
				if (((PogoProperty)selection).is_dev)
					properties = pogo_class.getDeviceProperties();
				else
					properties = pogo_class.getClassProperties();
				int	idx = Utils.getPropertyIndex(properties, prop);
				if (idx>=0)
					properties.remove(idx);
			}
			else
			if (selection instanceof PogoCommand) {
				Command	cmd = ((PogoCommand)selection).value;
                if (!InheritanceUtils.isRemovable(parent, cmd))
                    return;
				EList<Command>	commands = pogo_class.getCommands();
				int	idx = Utils.getCommandIndex(commands, cmd);
				if (idx>=0)
					commands.remove(idx);
				deleted_objects.add(cmd);
			}
			else
			if (selection instanceof PogoAttribute) {
				Attribute	att = ((PogoAttribute)selection).value;
                if (!InheritanceUtils.isRemovable(parent, att))
                    return;
				EList<Attribute> attributes = pogo_class.getAttributes();
				int	idx = Utils.getAttributeIndex(attributes, att);
				if (idx>=0)
					attributes.remove(idx);
				deleted_objects.add(att);
			}
			else
			if (selection instanceof PogoState) {
				State	state = ((PogoState)selection).value;
				EList<State> states = pogo_class.getStates();
				int	idx = Utils.getStateIndex(states, state);
				if (idx>=0)
					states.remove(idx);
			}
			DefaultMutableTreeNode	node = getSelectedNode();
			treeModel.removeNodeFromParent(node);
            if (setModif)
                setModified(true);
		}
        ((PogoRoot)root.getUserObject()).isAbstract = checkIfAbstractClass();
        repaint();
	}
	//===============================================================
	/**
	 *	Move the selected object
	 *
	 *	@param	to_up	move node UP if true, otherwise move it down
	 */
	//===============================================================
	void moveSelectedItem(boolean to_up)
	{
		Object	selection = getSelectedObject();
		if (selection==null)
			return;

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
		if (selection instanceof PogoCommand)
			pos_min = 2;	//	Cannot move State and Status

		if (to_up) {
			//	MOve Up
			if (pos>pos_min)
			{
				treeModel.removeNodeFromParent(node);
				treeModel.insertNodeInto(node, parent_node, pos-1);
			}
		}
		else {
			//	Move Down
			if (pos<pos_max) {
				treeModel.removeNodeFromParent(node);
				treeModel.insertNodeInto(node, parent_node, pos+1);
			}
        }
		setSelectionNode(node);
		//modified = true;
	}
	//===============================================================
	/**
	 *	Sort objects on specified collection
     */
	//===============================================================
    @SuppressWarnings({"ConstantConditions"})
    private void sortItems()
	{
		//	Get all children nodes in a vector
		Vector<DefaultMutableTreeNode>	v =
				new Vector<DefaultMutableTreeNode>();
		DefaultMutableTreeNode	parent_node = getSelectedNode();
		for (int i=0 ; i<parent_node.getChildCount() ; i++)
			v.add((DefaultMutableTreeNode)parent_node.getChildAt(i));

		//	Sort them
        MyCompare	compare = new MyCompare();
        //noinspection unchecked
        Collections.sort(v, compare);

		//	remove all nodes from parent
		while (parent_node.getChildCount()>0)
			treeModel.removeNodeFromParent(
				(DefaultMutableTreeNode)parent_node.getChildAt(0));

		//	And add them in sorted order
		for (int i=0 ; i<v.size() ; i++)
			treeModel.insertNodeInto(v.get(i), parent_node, i);
		expandChildren(parent_node);
	}
	//===============================================================
	//===============================================================
	private void setSelectionNode(DefaultMutableTreeNode node)
	{
		TreeNode[]	path = node.getPath();
		setSelectionPath(new TreePath(path));
	}
	//===============================================================
	/**
	 *	Edit selected object
	 */
	//===============================================================
	private void editClass()
	{
        ClassDialog	dialog = new ClassDialog(parent, this, dev_class, isInheritedClass);
        if (dialog.showDialog()==JOptionPane.OK_OPTION) {
            dev_class  = dialog.getInputs();
            root.setUserObject(new PogoRoot(dev_class.getPogoDeviceClass()));
            if (! dialog.hasForcedToGenerate())
                setModified(true);
            repaint();
        }
	}
	//===============================================================
	/**
	 *	Copy selected object to be pasted.
	 */
	//===============================================================
	private void copyItem() {
        copiedItem = getSelectedObject();
    }

	//===============================================================
	/**
	 *	Paste the copiedItem object
     */
	//===============================================================
	private void pasteItem() {

        if (copiedItem==null)
            return;

        DefaultMutableTreeNode  newNode    = null;
        DefaultMutableTreeNode  collecNode = getSelectedNode();

        try {
            if (copiedItem instanceof PogoProperty) {
                boolean is_dev = collecNode==root.getChildAt(DEV_PROPERTIES);
                String  target = (is_dev)? "Device " : "Class ";
                if (propertyAlreadyExists(copiedItem.toString(), is_dev)) {
                    Except.throw_exception("ALREADY_EXITS",
                            target + "Property " + copiedItem + " already exists",
                            "ClassTree.pasteItem()");
                }
                PogoProperty pp = (PogoProperty)copiedItem;
                Property src = PropertyDialog.cloneProperty(pp.value);
                newNode = new DefaultMutableTreeNode(new PogoProperty(src, is_dev));
            }
            else
            if (copiedItem instanceof PogoCommand) {
                if (itemAlreadyExists(copiedItem.toString(), COMMANDS)) {
                    Except.throw_exception("ALREADY_EXITS",
                            "Command " + copiedItem + " already exists",
                            "ClassTree.pasteItem()");
                }
                PogoCommand pc = (PogoCommand)copiedItem;
                Command src = CommandDialog.cloneCommand(pc.value);
                newNode = new DefaultMutableTreeNode(new PogoCommand(src));
            }
            else
            if (copiedItem instanceof PogoAttribute) {
                if (itemAlreadyExists(copiedItem.toString(), SCALAR_ATTRIBUTE)) {
                    Except.throw_exception("ALREADY_EXITS",
                            "Attribute " + copiedItem + " already exists",
                            "ClassTree.pasteItem()");
                }
                PogoAttribute pa = (PogoAttribute) copiedItem;
                Attribute src = AttributeDialog.cloneAttribute(pa.value);
                newNode = new DefaultMutableTreeNode(new PogoAttribute(src));
                if (pa.attType==SCALAR_ATTRIBUTE)
                    collecNode = (DefaultMutableTreeNode) root.getChildAt(SCALAR_ATTRIBUTE);
                else
                if (pa.attType==SPECTRUM_ATTRIBUTE)
                    collecNode = (DefaultMutableTreeNode) root.getChildAt(SPECTRUM_ATTRIBUTE);
                else
                    collecNode = (DefaultMutableTreeNode) root.getChildAt(IMAGE_ATTRIBUTE);
            }
            else
            if (copiedItem instanceof PogoState) {
                if (itemAlreadyExists(copiedItem.toString(), COMMANDS)) {
                    Except.throw_exception("ALREADY_EXITS",
                            "State " + copiedItem + " already exists",
                            "ClassTree.pasteItem()");
                }
                PogoState ps = (PogoState) copiedItem;
                State src = StateDialog.cloneState(ps.value);
                newNode = new DefaultMutableTreeNode(new PogoState(src));
            }
            //  If has been cloned -> edit it
            if (newNode!=null) {
                treeModel.insertNodeInto(newNode, collecNode, collecNode.getChildCount());
                setSelectionNode(newNode);
                setModified(true);
                editItem();
            }
        }
        catch (DevFailed e) {
            ErrorPane.showErrorMessage(this, null, e);
        }
    }
	//===============================================================
	/**
	 *	Check if copiedItem is able to be pasted
     * @return  return true if opiedItem is able to be pasted
     */
	//===============================================================
	private boolean canPaste()
	{
        if (copiedItem==null)
            return false;

        DefaultMutableTreeNode  selectedNode = getSelectedNode();
        if (copiedItem instanceof PogoProperty) {
            if (selectedNode==root.getChildAt(DEV_PROPERTIES))     return true ;
            if (selectedNode==root.getChildAt(CLASS_PROPERTIES))   return true ;
        }
        else
        if (copiedItem instanceof PogoCommand) {
            if (selectedNode==root.getChildAt(COMMANDS))   return true ;
         }
        else
        if (copiedItem instanceof PogoAttribute) {
            if (selectedNode==root.getChildAt(SCALAR_ATTRIBUTE))     return true ;
            if (selectedNode==root.getChildAt(SPECTRUM_ATTRIBUTE))   return true ;
            if (selectedNode==root.getChildAt(IMAGE_ATTRIBUTE))      return true ;
         }
        else
        if (copiedItem instanceof PogoState) {
            if (selectedNode==root.getChildAt(STATES))   return true ;
        }
        return false;
    }
	//===============================================================
	/**
	 *	Clone selected object, and then edit it.
	 */
	//===============================================================
	private void cloneItem()
	{
        DefaultMutableTreeNode  newNode    = null;
        DefaultMutableTreeNode  collecNode =
                (DefaultMutableTreeNode) getSelectedNode().getParent();

        Object	obj = getSelectedObject();
        if (obj instanceof PogoProperty) {
            Property srcProp = ((PogoProperty) obj).value;
            Property newProp =  PropertyDialog.cloneProperty(srcProp);
            boolean		is_dev = ((PogoProperty)obj).is_dev;

            if (is_dev)
                pogo_class.getDeviceProperties().add(newProp);
            else
                pogo_class.getClassProperties().add(newProp);
            newNode = new DefaultMutableTreeNode(new PogoProperty(newProp, is_dev));
        }
        else
        if (obj instanceof PogoCommand){
            Command srcCmd = ((PogoCommand)obj).value;
            Command newCmd =  CommandDialog.cloneCommand(srcCmd);

            pogo_class.getCommands().add(newCmd);
            
            newNode = new DefaultMutableTreeNode(new PogoCommand(newCmd));
        }
        else
        if (obj instanceof PogoAttribute) {
            Attribute srcAttribute = ((PogoAttribute)obj).value;
            Attribute newAttribute =  AttributeDialog.cloneAttribute(srcAttribute);

            pogo_class.getAttributes().add(newAttribute);
            newNode = new DefaultMutableTreeNode(new PogoAttribute(newAttribute));
        }
        else
        if (obj instanceof PogoState) {
            State srcState = ((PogoState)obj).value;
            State newState =  StateDialog.cloneState(srcState);

            pogo_class.getStates().add(newState);
            newNode = new DefaultMutableTreeNode(new PogoState(newState));
        }
        
        //  If has been cloned -> edit it
        if (newNode!=null) {
            treeModel.insertNodeInto(newNode, collecNode, collecNode.getChildCount());
            setSelectionNode(newNode);
            boolean editOk = (editItem()==JOptionPane.OK_OPTION);
            System.out.println(editOk);
            if (editOk)
                setModified(true);
            else
                removeSelectedItem(false, false);
        }

    }
	//===============================================================
	/**
	 *	Edit selected object
     * @return  the edit dialog button
     *          (JOptionPane.CANCEL_OPTION or JOptionPane.OK_OPTION)
     */
	//===============================================================
	private int editItem()
	{
		Object	obj = getSelectedObject();
		if (obj instanceof PogoRoot)
			editClass();
		else
		if (obj instanceof PogoState) {
			State	state = ((PogoState)obj).value;
			StateDialog	dlg =  new StateDialog(parent, state);
			if (dlg.showDialog()==JOptionPane.OK_OPTION) {
				EList<State>	states = pogo_class.getStates();
				int	idx = Utils.getStateIndex(states, state);
                state = dlg.getState();
				if (idx>=0) {
					states.remove(idx);
				    states.add(idx, state);
                }
                else
    				states.add(state);
				getSelectedNode().setUserObject(new PogoState(state));
				setModified(true);
			}
            else
                return JOptionPane.CANCEL_OPTION;
		}
		else
		if (obj instanceof PogoProperty)
		{
			Property	property = ((PogoProperty)obj).value;
			boolean		is_dev = ((PogoProperty)obj).is_dev;
			PropertyDialog	dlg =  new PropertyDialog(parent, property, is_dev);
			if (dlg.showDialog()==JOptionPane.OK_OPTION) {
				EList<Property>	properties;
				if (((PogoProperty)obj).is_dev)
					properties = pogo_class.getDeviceProperties();
				else
					properties = pogo_class.getClassProperties();

				int	idx = Utils.getPropertyIndex(properties, property);
                property = dlg.getProperty();
  				if (idx>=0) {
					properties.remove(idx);
				    properties.add(idx, property);
                }
                else
    				properties.add(property);
				getSelectedNode().setUserObject(new PogoProperty(property, is_dev));
                setModified(true);
			}
            else
                return JOptionPane.CANCEL_OPTION;
		}
		else
		if (obj instanceof PogoCommand) {
			Command	cmd = ((PogoCommand)obj).value;
			String	name = cmd.getName();
			CommandDialog	dlg =  new CommandDialog(parent, cmd);
			if (dlg.showDialog()==JOptionPane.OK_OPTION) {
				EList<Command>	commands = pogo_class.getCommands();
				int	idx = Utils.getCommandIndex(commands, cmd);
                Command	new_cmd = dlg.getCommand();
				if (idx>=0) {	//	Exists
					commands.remove(idx);
                    commands.add(idx, new_cmd);
                }
				else
					commands.add(new_cmd);  //  else add at end
                
				getSelectedNode().setUserObject(new PogoCommand(new_cmd));
                setModified(true);
                new_cmd.getStatus().setHasChanged("false");

				//	Check if name has changed
				String	new_name = new_cmd.getName();
				if (!name.equals(new_name))
					renamed_objects.add(cmd, new_cmd);
			}
            else
                return JOptionPane.CANCEL_OPTION;
		}
		else
		if (obj instanceof PogoAttribute) {
			Attribute		attribute = ((PogoAttribute)obj).value;
			String			name = attribute.getName();
			AttributeDialog	dlg = new AttributeDialog(parent, attribute);
			String	attTypeOrg = attribute.getAttType();
			if (dlg.showDialog()==JOptionPane.OK_OPTION)
			{
				Attribute	new_attribute = dlg.getAttribute();
				String		attType = new_attribute.getAttType();
				if (attType.equals(attTypeOrg))	//	Type has not changed
					((PogoAttribute)obj).value = new_attribute;
				else
				{
					//	Remove old one
					DefaultMutableTreeNode	node = getSelectedNode();
					treeModel.removeNodeFromParent(node);

					//	Create a new node in another collection
					PogoAttribute	pa = new PogoAttribute(new_attribute);
					node = new DefaultMutableTreeNode(pa);
					DefaultMutableTreeNode	collecNode;
					if (attType.equals("Scalar"))
						collecNode =
							(DefaultMutableTreeNode) root.getChildAt(SCALAR_ATTRIBUTE);
					else
					if (attType.equals("Spectrum"))
						collecNode =
							(DefaultMutableTreeNode) root.getChildAt(SPECTRUM_ATTRIBUTE);
					else
						collecNode =
							(DefaultMutableTreeNode) root.getChildAt(IMAGE_ATTRIBUTE);
					treeModel.insertNodeInto(node, collecNode, collecNode.getChildCount());
				}
                setModified(true);
                new_attribute.getStatus().setHasChanged("false");

				//	Check if name has changed
				String	new_name = new_attribute.getName();
				if (!name.equals(new_name))
					renamed_objects.add(attribute, new_attribute);
			}
            else
                return JOptionPane.CANCEL_OPTION;

		}
        ((PogoRoot)root.getUserObject()).isAbstract = checkIfAbstractClass();
        repaint();
        return JOptionPane.OK_OPTION;
	}
	//===============================================================
    /**
     * @return true if at least one attribute or one command is abstract
     */
	//===============================================================
    private boolean checkIfAbstractClass()
    {
        for (int i=0 ; i<root.getChildCount() ; i++) {
            DefaultMutableTreeNode	collecNode =
                    (DefaultMutableTreeNode) root.getChildAt(i);
            switch(i)  {
                case COMMANDS:
                    for (int j=0 ; j<collecNode.getChildCount() ; j++)  {
                        DefaultMutableTreeNode node =
                                (DefaultMutableTreeNode) collecNode.getChildAt(j);
                        Command cmd = ((PogoCommand)node.getUserObject()).value;
                        if (! Utils.isTrue(cmd.getStatus().getConcrete()) &&
                            ! Utils.isTrue(cmd.getStatus().getConcreteHere()) )
                            return true;
                    }
                    break;
                case SCALAR_ATTRIBUTE:
                case SPECTRUM_ATTRIBUTE:
                case IMAGE_ATTRIBUTE:
                    for (int j=0 ; j<collecNode.getChildCount() ; j++)  {
                        DefaultMutableTreeNode node =
                                (DefaultMutableTreeNode) collecNode.getChildAt(j);
                        Attribute att = ((PogoAttribute)node.getUserObject()).value;
                        if (! Utils.isTrue(att.getStatus().getConcrete()) &&
                            ! Utils.isTrue(att.getStatus().getConcreteHere()))
                            return true;
                    }
                    break;
            }
        }
        return false;
    }
	//===============================================================
	/**
	 *	Add a new object on specified collection
     * @param itemClass   Class item object
     */
	//===============================================================
    @SuppressWarnings({"ConstantConditions"})
    void addItem(String itemClass)
	{
		for (int i=0 ; i<root.getChildCount() ; i++) {
			DefaultMutableTreeNode	collecNode =
					(DefaultMutableTreeNode) root.getChildAt(i);
			switch(i) {
                case CLASS_PROPERTIES:
                    if (itemClass.toLowerCase().indexOf("class prop")>0)
                        addItem(collecNode, false);
                    break;
                case DEV_PROPERTIES:
                    if (itemClass.toLowerCase().indexOf("device prop")>0)
                        addItem(collecNode, false);
                    break;
                case COMMANDS:
                    if (itemClass.toLowerCase().indexOf("command")>0)
                        addItem(collecNode, false);
                    break;
                case STATES:
                    if (itemClass.toLowerCase().indexOf("state")>0)
                        addItem(false);
                    break;
                case SCALAR_ATTRIBUTE:
                    if (itemClass.toLowerCase().indexOf("scalar")>0)
                        addItem(collecNode, false);
                    break;
                case SPECTRUM_ATTRIBUTE:
                    if (itemClass.toLowerCase().indexOf("spectrum")>0)
                        addItem(collecNode, false);
                    break;
                case IMAGE_ATTRIBUTE:
                    if (itemClass.toLowerCase().indexOf("image")>0)
                        addItem(collecNode, false);
                    break;
			}
		}
	}
	//===============================================================
	/**
	 *	Add a new object on selected collection
     * @param isDynamic true if the item is an attribute and must be a dynamic one
	 */
	//===============================================================
	private void addItem(boolean isDynamic)
	{
		addItem(getSelectedNode(), isDynamic);
	}
	//===============================================================
	/**
	 *	Add a new object on specified collection
     * @param collecNode  specified collection node
     * @param isDynamic true if the item is an attribute and must be a dynamic one	
     */
	//===============================================================
	private void addItem(DefaultMutableTreeNode collecNode, boolean isDynamic)
	{
		DefaultMutableTreeNode	new_node = null;
		if (collecNode.toString().equals("Commands"))
		{
			CommandDialog	dlg =  new CommandDialog(parent, null);
			if (dlg.showDialog()==JOptionPane.OK_OPTION)
			{
				Command	cmd = dlg.getCommand();
				pogo_class.getCommands().add(cmd);
				new_node = new DefaultMutableTreeNode(new PogoCommand(cmd));
				treeModel.insertNodeInto(new_node, collecNode, collecNode.getChildCount());
                setModified(true);
			}
		}
		else
		if (collecNode.toString().indexOf("Properties")>0)
		{
			boolean	is_dev = (collecNode.toString().indexOf("Device")==0);
			PropertyDialog	dlg =  new PropertyDialog(parent, null, is_dev);
			if (dlg.showDialog()==JOptionPane.OK_OPTION)
			{
				Property prop = dlg.getProperty();
				if (is_dev)
					pogo_class.getDeviceProperties().add(prop);
				else
					pogo_class.getClassProperties().add(prop);
				new_node = new DefaultMutableTreeNode(new PogoProperty(prop, is_dev));
				treeModel.insertNodeInto(new_node, collecNode, collecNode.getChildCount());
                setModified(true);
			}
		}
		else
		if (collecNode.toString().equals("States"))
		{
			StateDialog	dlg =  new StateDialog(parent, null);
			if (dlg.showDialog()==JOptionPane.OK_OPTION)
			{
				State	state = dlg.getState();
				pogo_class.getStates().add(state);
				new_node = new DefaultMutableTreeNode(new PogoState(state));
				treeModel.insertNodeInto(new_node, collecNode, collecNode.getChildCount());
                setModified(true);
			}
		}
		else
		if (collecNode.toString().indexOf("Attribute")>0)
		{
			int	attType;
			if (collecNode.toString().startsWith("Scalar"))
				attType = AttributeDialog.SCALAR;
			else
			if (collecNode.toString().startsWith("Spectrum"))
				attType = AttributeDialog.SPECTRUM;
			else
				attType = AttributeDialog.IMAGE;
			AttributeDialog	dlg = new AttributeDialog(parent, attType, isDynamic);
			if (dlg.showDialog()==JOptionPane.OK_OPTION)
			{
				Attribute	att = dlg.getAttribute();
				pogo_class.getAttributes().add(att);
				new_node = new DefaultMutableTreeNode(new PogoAttribute(att));

				//	Collection node depends on if scalar, spectrum or image
				//	And it could have changed
				String	strType = att.getAttType();
				if (strType.equals("Scalar"))
					collecNode =
						(DefaultMutableTreeNode) root.getChildAt(SCALAR_ATTRIBUTE);
				else
				if (strType.equals("Spectrum"))
					collecNode =
						(DefaultMutableTreeNode) root.getChildAt(SPECTRUM_ATTRIBUTE);
				else
					collecNode =
						(DefaultMutableTreeNode) root.getChildAt(IMAGE_ATTRIBUTE);
				treeModel.insertNodeInto(new_node, collecNode, collecNode.getChildCount());
                setModified(true);
			}
		}
		if (new_node!=null)
			expandNode(new_node);
        ((PogoRoot)root.getUserObject()).isAbstract = checkIfAbstractClass();
        repaint();
	}
	//===============================================================
	/**
	 *	Returns a vector of deleted objects.
     * @return   the deleted objects list
     */
	//===============================================================
	DeletedObjects getDeletedObjects()
	{
		return deleted_objects;
	}
	//===============================================================
	/**
	 *	Returns a vector of renamed objects.
     * @return   the renamed objects list
	 */
	//===============================================================
	RenamedObjects getRenamedObjects()
	{
		return renamed_objects;
	}
    //===============================================================
    //===============================================================
    public boolean getModified()
    {
       return modified;
    }
    //===============================================================
    //===============================================================
    public void setModified(boolean b)
    {
        modified = b;
        parent.fireClassHaveChanged();
    }
	//===============================================================
	/**
	 * Build a PogoDeviceClass from tree and return it a DeviceClass object
	 * @return	the Pogo model to be generated.
	 */
	//===============================================================
    DeviceClass getDeviceClass()
	{
		DeviceClass	devclass = new DeviceClass();
		PogoDeviceClass	pg_class = devclass.getPogoDeviceClass();


		PogoRoot	pg_root = (PogoRoot) root.getUserObject();
        //  Check if class ID is not null (could be null from old Pogo)
        if (pg_root.id==null) {
            editClass();
            pg_root = (PogoRoot) root.getUserObject();
            if (pg_root.id==null)
                return null;
        }
		pg_class.setName(pg_root.name);
		pg_class.getDescription().setDescription(pg_root.description);
		pg_class.getDescription().setTitle(pg_root.title);
		pg_class.getDescription().setSourcePath(pg_root.path);
        pg_class.getDescription().setIdentification(
                    OAWutils.cloneClassIdentification(pg_root.id));
        pg_class.getDescription().setLanguage(pg_root.language);

        //  Copy inheritances.
        EList<Inheritance> inheritances = pg_class.getDescription().getInheritances();
        inheritances.clear();
        for (Inheritance inheritance : pg_root.inheritances) {
            Inheritance inher = OAWutils.factory.createInheritance();
            inher.setClassname(inheritance.getClassname());
            inher.setSourcePath(inheritance.getSourcePath());
            inheritances.add(inher);
        }
		EList<Property>		classprop  = pg_class.getClassProperties();
		EList<Property>		devprop    = pg_class.getDeviceProperties();
		EList<Command>		commands   = pg_class.getCommands();
		EList<Attribute>	attributes = pg_class.getAttributes();
		EList<Attribute>	dynAttrib  = pg_class.getDynamicAttributes();
		EList<State>		states     = pg_class.getStates();
		for (int i=0 ; i<root.getChildCount() ; i++) {
			DefaultMutableTreeNode	collecNode =
					(DefaultMutableTreeNode) root.getChildAt(i);
			switch(i) {
                case CLASS_PROPERTIES:
                    setPropertyToPogoDeviceClass(classprop, collecNode);
                    break;
                case DEV_PROPERTIES:
                    setPropertyToPogoDeviceClass(devprop, collecNode);
                    break;
                case COMMANDS:
                    setCommandsToPogoDeviceClass(commands, collecNode);
                    break;
                case STATES:
                    setStateToPogoDeviceClass(states, collecNode);
                    break;
                case SCALAR_ATTRIBUTE:
                case SPECTRUM_ATTRIBUTE:
                case IMAGE_ATTRIBUTE:
                    setAttributeToPogoDeviceClass(attributes, dynAttrib, collecNode);
			}
		}
        //  Update abstract class fields
        DeviceClass.checkIfAbstractClass(pg_class, true);
        //  Update additinal file list
        EList<AdditionalFile>   newFileList = pg_class.getAdditionalFiles();
        EList<AdditionalFile>   orgFileList = dev_class.getPogoDeviceClass().getAdditionalFiles();
        for (AdditionalFile file : orgFileList) {
            newFileList.add(OAWutils.cloneAdditionalFile(file));
        }
		return devclass;
	}
	//===============================================================
	//===============================================================
	private DefaultMutableTreeNode getCollectionNode(int collecNum)
	{
		return (DefaultMutableTreeNode) root.getChildAt(collecNum);
	}
	//===============================================================
	//===============================================================
	private void setPropertyToPogoDeviceClass(EList<Property> properties, DefaultMutableTreeNode collecNode)
	{
		for (int i=0 ; i<collecNode.getChildCount() ; i++) {
			DefaultMutableTreeNode	node =
					(DefaultMutableTreeNode) collecNode.getChildAt(i);
			Property	prop = ((PogoProperty)node.getUserObject()).value;

			properties.add(OAWutils.cloneProperty(prop));
		}
	}
	//===============================================================
	//===============================================================
	private void setCommandsToPogoDeviceClass(EList<Command> commands,
											  DefaultMutableTreeNode collecNode)
	{
		for (int i=0 ; i<collecNode.getChildCount() ; i++) {
			DefaultMutableTreeNode	node =
					(DefaultMutableTreeNode) collecNode.getChildAt(i);
			Command	command = ((PogoCommand)node.getUserObject()).value;			
			command.setExecMethod(Utils.buildExcecMethodName(command.getName()));

			commands.add(OAWutils.cloneCommand(command));
		}
	}
	//===============================================================
	//===============================================================
	private void setAttributeToPogoDeviceClass(EList<Attribute> attributes,
                                               EList<Attribute> dynAttrib,
											   DefaultMutableTreeNode collecNode)
	{
		for (int i=0 ; i<collecNode.getChildCount() ; i++) {
			DefaultMutableTreeNode	node =
					(DefaultMutableTreeNode) collecNode.getChildAt(i);
			Attribute	attribute = ((PogoAttribute)node.getUserObject()).value;

            if (Utils.isTrue(attribute.getIsDynamic()))
     			dynAttrib.add(OAWutils.cloneAttribute(attribute));
            else
     			attributes.add(OAWutils.cloneAttribute(attribute));
		}
	}
	//===============================================================
	//===============================================================
	private void setStateToPogoDeviceClass(EList<State> states, DefaultMutableTreeNode collecNode)
	{
		for (int i=0 ; i<collecNode.getChildCount() ; i++) {
			DefaultMutableTreeNode	node =
					(DefaultMutableTreeNode) collecNode.getChildAt(i);
			State	state = ((PogoState)node.getUserObject()).value;

			states.add(OAWutils.cloneState(state));
		}
	}
	//===============================================================
	//===============================================================
	boolean itemAlreadyExists(String name, int type)
	{
		Vector<Integer>	collec = new Vector<Integer>();
		if (type==COMMANDS)
			collec.add(COMMANDS);
		else
		if (type==SCALAR_ATTRIBUTE || type==SPECTRUM_ATTRIBUTE ||
                type==IMAGE_ATTRIBUTE) {
			collec.add(SCALAR_ATTRIBUTE);
			collec.add(SPECTRUM_ATTRIBUTE);
			collec.add(IMAGE_ATTRIBUTE);
		}
		else
		if (type==STATES)
			collec.add(STATES);

		//	Collec not checked
		if (collec.size()==0)
			return false;

		for (int col : collec) {
			DefaultMutableTreeNode selectedNode = getSelectedNode();
			//	Get the collection node
			DefaultMutableTreeNode collecNode = getCollectionNode(col);
			for (int i=0 ; i<collecNode.getChildCount() ; i++) {
				DefaultMutableTreeNode node =
						(DefaultMutableTreeNode) collecNode.getChildAt(i);
				if (node.toString().equals(name))
					if (node!=selectedNode)	//	check if not edited one
						return true;
			}
		}
		return false;
	}
	//===============================================================
	//===============================================================
	boolean propertyAlreadyExists(String name, boolean is_dev)
	{
        DefaultMutableTreeNode selectedNode = getSelectedNode();
        //	Get the collection node
        DefaultMutableTreeNode collecNode;
        if (is_dev)
            collecNode = getCollectionNode(DEV_PROPERTIES);
        else
            collecNode = getCollectionNode(CLASS_PROPERTIES);
        for (int i=0 ; i<collecNode.getChildCount() ; i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collecNode.getChildAt(i);
            if (node.toString().equals(name))
                if (node!=selectedNode)	//	check if not edited one
                    return true;
        }
		return false;
	}
	//===============================================================
	//===============================================================
	public void editStateMachine()
	{
        //  Check if a state machine can be defined.
        try {
            Vector<State>	vs = getAllStates();
            Vector<Attribute>	va = getAllAttributes();
            Vector<Command> 	vc = getAllCommands();
            if (vs.size()==0)
                throw new Exception("Thre is no states defined !");
            if (vc.size()==0  && va.size()==0)
                throw new Exception("Thre is no commands and no attributes defined !");
        }
        catch(Exception e) {
            ErrorPane.showErrorMessage(this, null, e);
            return;
        }

        //  Then start a dialog to define it.
		StateMachineDialog	dialog = new StateMachineDialog(parent, pogo_class);
		if (dialog.showDialog()==JOptionPane.OK_OPTION) {
            pogo_class = dialog.getPogoClass();
            setModified(true);
		}
	}
	//===============================================================
	//===============================================================
	private void summarize()
	{
		Object	obj = getSelectedObject();
        if (obj instanceof PogoRoot) {
            JOptionPane.showMessageDialog(parent,
                        summarizeClass((PogoRoot)obj),
                        "information Window",
                        JOptionPane.INFORMATION_MESSAGE);
        }
        else
		if (obj.toString().indexOf("Properties")>0) {
			boolean	is_dev = obj.toString().startsWith("Device");
			Vector<Property>	vp = getAllProperties(is_dev);
			PropertyDialog.popupSummary(parent, vp, is_dev);
		}
        else
 		if (obj.toString().equals("Commands")) {
			Vector<Command>	vc = getAllCommands();
			CommandDialog.popupSummary(parent, vc);
		}
        else
		if (obj.toString().indexOf("Attributes")>0) {
			Vector<Attribute>	va = getAllAttributes();
			AttributeDialog.popupSummary(parent, va);
		}
        else
		if (obj.toString().equals("States")) {
			Vector<State>	vs = getAllStates();
			StateDialog.popupSummary(parent, vs);
		}
	}
	//===============================================================
	//===============================================================
    private String summarizeClass(PogoRoot _class)
    {
        //  Get nb properties, commands, attributes
        DefaultMutableTreeNode
        node =(DefaultMutableTreeNode) root.getChildAt(CLASS_PROPERTIES);
        int nb_class_prop = node.getChildCount();
        node =(DefaultMutableTreeNode) root.getChildAt(DEV_PROPERTIES);
        int nb_dev_prop = node.getChildCount();
        node =(DefaultMutableTreeNode) root.getChildAt(COMMANDS);
        int nb_cmd = node.getChildCount();

        node =(DefaultMutableTreeNode) root.getChildAt(SCALAR_ATTRIBUTE);
        int nb_scalars = node.getChildCount();
        node =(DefaultMutableTreeNode) root.getChildAt(SPECTRUM_ATTRIBUTE);
        int nb_spectra = node.getChildCount();
        node =(DefaultMutableTreeNode) root.getChildAt(IMAGE_ATTRIBUTE);
        int nb_images = node.getChildCount();
        node =(DefaultMutableTreeNode) root.getChildAt(STATES);
        int nb_states = node.getChildCount();

        //  And build message to be returned
        StringBuffer    sb = new  StringBuffer(_class.toInfoString());
        sb.append("\n\n");
        if (nb_class_prop>0)
            sb.append(nb_class_prop).append("  Class properties\n");
        if (nb_dev_prop>0)
            sb.append(nb_dev_prop).append("  Device properties\n");
        if (nb_cmd>0)
            sb.append(nb_cmd).append("  Commands\n");

        int nb_att = nb_scalars + nb_spectra + nb_images;
        if (nb_att>0) {
            sb.append(nb_att).append("  Attributes:\n");
            if (nb_scalars>0)
                sb.append("    ").append(nb_scalars).append("  Scalars\n");
            if (nb_spectra>0)
                sb.append("    ").append(nb_spectra).append("  Spectrums\n");
            if (nb_images>0)
                sb.append("    ").append(nb_images).append("  Images\n");
        }
        if (nb_states>0)
            sb.append(nb_states).append("  States\n");
        return sb.toString();
    }
	//===============================================================
	/**
     * @param is_dev    true if device / false if class
	 *	@return a vector with all properties
	 */
	//===============================================================
	private Vector<Property> getAllProperties(boolean is_dev)
	{
		Vector<Property>	vp = new Vector<Property>();
        DefaultMutableTreeNode collecNode;

		if (is_dev)
			collecNode =(DefaultMutableTreeNode) root.getChildAt(DEV_PROPERTIES);
		else
			collecNode =(DefaultMutableTreeNode) root.getChildAt(CLASS_PROPERTIES);
		for (int i=0 ; i<collecNode.getChildCount() ; i++)
		{
			DefaultMutableTreeNode node =
					(DefaultMutableTreeNode) collecNode.getChildAt(i);
			PogoProperty pp = (PogoProperty)node.getUserObject();
			vp.add(pp.value);
		}
		return vp;
	}
	//===============================================================
	/**
	 *	@return a vector with all Commands
	 */
	//===============================================================
	private Vector<Command> getAllCommands()
	{
		Vector<Command>	vc = new Vector<Command>();
        DefaultMutableTreeNode collecNode =
			(DefaultMutableTreeNode) root.getChildAt(COMMANDS);
		for (int i=0 ; i<collecNode.getChildCount() ; i++) {
			DefaultMutableTreeNode node =
					(DefaultMutableTreeNode) collecNode.getChildAt(i);
			PogoCommand pc = (PogoCommand)node.getUserObject();
			vc.add(pc.value);
		}
		return vc;
	}
	//===============================================================
	/**
	 *	@return a vector with all attributes
	 */
	//===============================================================
	private Vector<Attribute> getAllAttributes() {
		Vector<Attribute>	va = new Vector<Attribute>();
        DefaultMutableTreeNode collecNode;

		collecNode =(DefaultMutableTreeNode) root.getChildAt(SCALAR_ATTRIBUTE);
		for (int i=0 ; i<collecNode.getChildCount() ; i++) {
			DefaultMutableTreeNode node =
					(DefaultMutableTreeNode) collecNode.getChildAt(i);
			PogoAttribute pa = (PogoAttribute)node.getUserObject();
			va.add(pa.value);
		}
		collecNode = (DefaultMutableTreeNode) root.getChildAt(SPECTRUM_ATTRIBUTE);
		for (int i=0 ; i<collecNode.getChildCount() ; i++) {
			DefaultMutableTreeNode node =
					(DefaultMutableTreeNode) collecNode.getChildAt(i);
			PogoAttribute pa = (PogoAttribute)node.getUserObject();
			va.add(pa.value);
		}
		collecNode = (DefaultMutableTreeNode) root.getChildAt(IMAGE_ATTRIBUTE);
		for (int i=0 ; i<collecNode.getChildCount() ; i++) {
			DefaultMutableTreeNode node =
					(DefaultMutableTreeNode) collecNode.getChildAt(i);
			PogoAttribute pa = (PogoAttribute)node.getUserObject();
			va.add(pa.value);
		}
		return va;
	}
	//===============================================================
	/**
	 *	@return a vector with all States
	 */
	//===============================================================
	private Vector<State> getAllStates()
	{
		Vector<State>	vs = new Vector<State>();
        DefaultMutableTreeNode collecNode =
			(DefaultMutableTreeNode) root.getChildAt(STATES);
		for (int i=0 ; i<collecNode.getChildCount() ; i++) {
			DefaultMutableTreeNode node =
					(DefaultMutableTreeNode) collecNode.getChildAt(i);
			PogoState ps = (PogoState)node.getUserObject();
			vs.add(ps.value);
		}
		return vs;
	}
	//===============================================================
	//===============================================================
    String getClassFileName()
    {
        String  path     = ((PogoRoot)root.getUserObject()).path;
        if (path!=null) {
            String  filename = ((PogoRoot)root.getUserObject()).name + ".xmi";
            return path + "/" + filename;
        }
        return null;
    }
	//===============================================================
	//===============================================================





















	//===============================================================
	/*
	 *	PogoClass (root) object definition
	 */
	//===============================================================
	class PogoRoot
	{
		private String		name;
		private String		description;
		private String		title;
		private String		language;
		private String		path;
        private boolean     isAbstract;
        private Vector<Inheritance> inheritances = new Vector<Inheritance>();
        private ClassIdentification id;

        //===========================================================
		private PogoRoot(PogoDeviceClass pogo_class)
		{
			this.name         = pogo_class.getName();
			this.description  = pogo_class.getDescription().getDescription();
			this.title        = pogo_class.getDescription().getTitle();
			this.language     = pogo_class.getDescription().getLanguage();
			this.path         = pogo_class.getDescription().getSourcePath();
            this.isAbstract   = DeviceClass.checkIfAbstractClass(pogo_class, false);
			this.id           = pogo_class.getDescription().getIdentification();
			for (Inheritance inher : pogo_class.getDescription().getInheritances()) {
				inheritances.add(inher);
                //System.out.println(inher.getClassname());
            }
		}
		//===========================================================
		//===========================================================
		private String toInfoString()
		{
			
			String  title = "Class name:  " + name;
            if (isAbstract)
    			title += "  (class is abstract !)";
			
			
			StringBuffer	sb = new StringBuffer();
            if (path!=null && path.length()>0)
                sb.append("Read at:   ").append(path);

            sb.append("\nInherited from: ").append(inheritances.get(0).getClassname());
            if (! DeviceClass.isDefaultInheritance(inheritances.get(0)))
                sb.append("\nRead at:   ").append(inheritances.get(0).getSourcePath());
            else
                sb.append("  the default Tango device object.\n");
			sb.append("\n\nDescription:\n");
			sb.append(Utils.strReplace(description, "\\n", "\n")).append("\n");


			return Utils.buildToolTip(title, sb.toString());
		}
		//===========================================================
		public String toString()
		{
			return pogo_class.getName();
		}
		//===========================================================
	}
	//===============================================================
	//===============================================================
	private class PogoCollection
	{
		String name;
		ImageIcon	icon;
		//===========================================================
		private PogoCollection(String name, ImageIcon icon)
		{
			this.name = name;
			this.icon = icon;
		}
		//===========================================================
		public String toString()
		{
			return name;
		}
		//===========================================================
	}
	//===============================================================
	/*
	 *	PogoProperty object definition
	 */
	//===============================================================
	private class PogoProperty
	{
		Property	value;
		boolean		is_dev;
		//===========================================================
		private PogoProperty(Property value, boolean is_dev)
		{
			this.value  = value;
			this.is_dev = is_dev;
		}
		//===========================================================
		private String toInfoString()
		{
			StringBuffer	sb = new StringBuffer(((is_dev)? "Device":"Class"));
			sb.append(" property:  ").append(value.getName());

			return Utils.buildToolTip(sb.toString(),
                    Utils.strReplace(value.getDescription(), "\\n", "\n"));
		}
		//===========================================================
        private void manageDisplay(TangoRenderer renderer)
        {
            InheritanceStatus	status = value.getStatus();
            renderer.setIcon(inherit_utils.getIcon(status));
            renderer.setFont(inherit_utils.getLeafFont(status));
			if(status!=null && status.getHasChanged()!=null)
    	        renderer.setForeground(Color.red);
        	else
    			renderer.setForeground(Color.black);

            renderer.setToolTipText(toInfoString());
        }
		//===========================================================
		public String toString()
		{
			return value.getName();
		}
		//===========================================================
	}
	//===============================================================
	/*
	 *	PogoAttribute object definition
	 */
	//===============================================================
	private class PogoAttribute
	{
		Attribute	value;
		int			attType;
		//===========================================================

		private PogoAttribute(Attribute value)
		{
			this.value     = value;
			if(Utils.isEquals(value.getAttType(), "Spectrum"))
				this.attType = SPECTRUM_ATTRIBUTE;
			else
			if(Utils.isEquals(value.getAttType(), "Image"))
				this.attType = IMAGE_ATTRIBUTE;
			else
				this.attType = SCALAR_ATTRIBUTE;
		}
		//===========================================================
		private String toInfoString()
		{
            String desc;
			if (value.getProperties()==null ||
                value.getProperties().getDescription().length()==0)
                desc = "No Description.";
            else
                desc = Utils.strReplace(value.getProperties().getDescription(), "\\n", "\n");

            String s = "Attribute:  ";
            if ( Utils.isTrue(value.getIsDynamic()) )
                s = "Dynamic " + s;
			return Utils.buildToolTip(s + value.getName(), desc);
		}
		//===========================================================
		private void manageDisplay(TangoRenderer renderer)
		{
            InheritanceStatus	status = value.getStatus();
            renderer.setIcon(inherit_utils.getIcon(status));
            renderer.setFont(inherit_utils.getLeafFont(status));
            if(status!=null && Utils.isTrue(status.getHasChanged()))
                renderer.setForeground(Color.red);
            else
            if (Utils.isExpert(value))
				renderer.setForeground(Color.blue);
             else
 				renderer.setForeground(Color.black);
			renderer.setToolTipText(toInfoString());
		}
		//===========================================================
		public String toString()
		{
			return value.getName();
		}
        //===========================================================
	}
	//===============================================================
	/*
	 *	PogoCommand object definition
	 */
	//===============================================================
	private class PogoCommand
	{
		Command	value;
		//===========================================================
		private PogoCommand(Command value)
		{
			this.value = value;
		}
		//===========================================================
		private String toInfoString()
		{
            String desc = value.getDescription();
            if (desc!=null && desc.length()>0)
                desc = Utils.strReplace(desc, "\\n", "\n");
            else
                desc = "No Description.";
			return Utils.buildToolTip("Command:  " + value.getName(), desc);
		}
		//===========================================================
		private void manageDisplay(TangoRenderer renderer)
		{
            InheritanceStatus	status = value.getStatus();
            renderer.setIcon(inherit_utils.getIcon(status));
            renderer.setFont(inherit_utils.getLeafFont(status));
            if(status!=null && Utils.isTrue(status.getHasChanged()))
                renderer.setForeground(Color.red);
            else
            if (Utils.isExpert(value))
				renderer.setForeground(Color.blue);
             else
 				renderer.setForeground(Color.black);
			renderer.setToolTipText(toInfoString());
		}
		//===========================================================
		public String toString()
		{
			return value.getName();
		}
         //===========================================================
	}
	//===============================================================
	/*
	 *	PogoState object definition
	 */
	//===============================================================
	private class PogoState
	{
		State	value;
		//===========================================================
		private PogoState(State value)
		{
			this.value = value;
		}
		//===========================================================
		private String toInfoString()
		{
            String desc = value.getDescription();
            if (desc!=null && desc.length()>0)
                desc = Utils.strReplace(desc, "\\n", "\n");
            else
                desc = "No Description.";
			return Utils.buildToolTip("State:  " + value.getName(), desc);
		}
        //===========================================================
        private void manageDisplay(TangoRenderer renderer)
        {
            InheritanceStatus	status = value.getStatus();
            renderer.setIcon(inherit_utils.getIcon(status));
            renderer.setFont(inherit_utils.getLeafFont(status));
            if(status!=null && status.getHasChanged()!=null)
                renderer.setForeground(Color.red);
            else
                renderer.setForeground(Color.black);
            renderer.setToolTipText(toInfoString());
        }
		//===========================================================
		public String toString()
		{
			return value.getName();
		}
		//===========================================================
	}
	//===============================================================
	//===============================================================



















	//===============================================================
	/**
	 *	Renderer Class
	 */
	//===============================================================
	private class TangoRenderer extends DefaultTreeCellRenderer
	{
		//===============================================================
		//===============================================================
		public TangoRenderer()
		{
		}

		//===============================================================
		//===============================================================
		public Component getTreeCellRendererComponent(
							JTree tree,
							Object obj,
							boolean sel,
							boolean expanded,
							boolean leaf,
							int row,
							boolean hasFocus) {

			super.getTreeCellRendererComponent(
							tree, obj, sel,
							expanded, leaf, row,
							hasFocus);

			Utils	utils = Utils.getInstance();

			setBackgroundNonSelectionColor(background);
			setForeground(Color.black);
			setBackgroundSelectionColor(Color.lightGray);

			DefaultMutableTreeNode node = (DefaultMutableTreeNode)obj;
			Object	user_obj = node.getUserObject();
			if (row==0)
			{
				//	ROOT
                PogoRoot    pr = (PogoRoot) user_obj;
                if (pr.isAbstract)
				    setFont(rootFont_abstract);
                else
				    setFont(rootFont_concrete);
				setIcon(utils.root_icon);
				setToolTipText(pr.toInfoString());
			}
			else
			{
				if (user_obj instanceof PogoProperty) {
                    ((PogoProperty)user_obj).manageDisplay(this);
				}
				else
				if (user_obj instanceof PogoCommand) {
                    ((PogoCommand)user_obj).manageDisplay(this);
				}
				else
				if (user_obj instanceof PogoAttribute) {
                    ((PogoAttribute)user_obj).manageDisplay(this);
                    if (Utils.isTrue(((PogoAttribute) user_obj).value.getIsDynamic()) ) {
                        setBackgroundNonSelectionColor(dynamicBG);
                    }
				}
				else
				if (user_obj instanceof PogoState) {
                    ((PogoState)user_obj).manageDisplay(this);
				}
				else
				if (user_obj instanceof PogoCollection) {
					setFont(collecFont);
					setIcon(((PogoCollection)user_obj).icon);
					setToolTipText(null);
				}
			}
			return this;
		}
 	}//	End of Renderer Class

//==============================================================================
//==============================================================================
    static private final int	EDIT_CLASS    = 0;
	static private final int	ADD_ITEM      = 1;
	static private final int	ADD_DYN_ITEM  = 2;
    static private final int	PASTE_ITEM    = 3;
	static private final int	SORT_ITEM     = 4;
    static private final int	SUMMARIZE     = 5;
	static private final int	EDIT_ITEM     = 6;
	static private final int	COPY_ITEM     = 7;
	static private final int	CLONE_ITEM    = 8;
	static private final int	REMOVE_ITEM   = 9;
	static private final int	EDIT_SRC_CODE = 10;
	static private final int	OFFSET = 2;	//	Label And separator

	static private String[]	menuLabels = {
            "Edit Class",

            //  Collection menu
            "Add Item",
            "Add Dynamic Item",
            "Paste",
            "Sort Items",
            "Summarize",

            //  Item menu
            "Edit Item",
            "Copy",
            "Clone  Item",
            "Remove Item",
            "Edit Source Code"
        };
	private class ClassTreePopupMenu extends JPopupMenu
	{
		private JTree	tree;
		private JLabel	title;
		private ClassTreePopupMenu(JTree tree)
		{
			this.tree = tree;
			buildBtnPopupMenu();
		}
		//=======================================================
		/**
		 *	Create a Popup menu for class edition
		 */
		//=======================================================
		private void buildBtnPopupMenu()
		{
			title = new JLabel();
			title.setFont(new java.awt.Font("Dialog", 1, 16));
			add(title);
			add(new JPopupMenu.Separator());

			for (String menuLabel : menuLabels) {
				if (menuLabel == null)
					add(new Separator());
				else {
					JMenuItem btn = new JMenuItem(menuLabel);
					btn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							menuActionPerformed(evt);
						}
					});
					add(btn);
				}
			}
		}
		//======================================================
		//======================================================
        private void manageItemMenu(String itemName) {
            for (int i=OFFSET ; i<this.getComponentCount() ; i++) {
                Component   component = getComponent(i);
                if (component instanceof JMenuItem) {
                    String  text = menuLabels[i-OFFSET];
                    int pos = text.indexOf("Item");
                    if (pos>0)
                        text = text.substring(0, pos) + itemName +
                                text.substring(pos + "Item".length());
                    ((JMenuItem) component).setText(text);
                }
            }
        }
		//======================================================
		/**
		 *	Show menu on root
         * @param evt  the mouse event
         * @param root The root object containing class
         */
		//======================================================
		public void showMenu(MouseEvent evt, PogoRoot root)
		{
			//	Set selection at mouse position
			TreePath	selectedPath =
				tree.getPathForLocation(evt.getX(), evt.getY());
			if (selectedPath==null)
				return;
			tree.setSelectionPath(selectedPath);

			title.setText("Class " + root.name);

			//	Reset all items
			for (int i=0 ; i<menuLabels.length ; i++)
				getComponent(OFFSET+i).setVisible(false);

			//noinspection PointlessArithmeticExpression
			getComponent(OFFSET+EDIT_CLASS).setVisible(true);
            getComponent(OFFSET+SUMMARIZE).setVisible(true);
			show(tree, evt.getX(), evt.getY());
		}
		//======================================================
		/**
		 *	Show menu on Collection
         * @param evt  the mouse event
         * @param collec The collection object
		 */
		//======================================================
		public void showMenu(MouseEvent evt, PogoCollection collec)
		{
			//	Set selection at mouse position
			TreePath	selectedPath =
				tree.getPathForLocation(evt.getX(), evt.getY());
			if (selectedPath==null)
				return;
			tree.setSelectionPath(selectedPath);

            manageItemMenu(collec.toString());
			title.setText(collec.toString());

			//	Reset all items
			for (int i=0 ; i<menuLabels.length ; i++)
				getComponent(OFFSET+i).setVisible(false);

			getComponent(OFFSET+ADD_ITEM).setVisible(true);
			getComponent(OFFSET+ADD_DYN_ITEM).setVisible(collec.toString().indexOf("Attribute")>0);
            getComponent(OFFSET+PASTE_ITEM).setVisible(canPaste());
			getComponent(OFFSET+SORT_ITEM).setVisible(true);
 		    getComponent(OFFSET+SUMMARIZE).setVisible(true);
			show(tree, evt.getX(), evt.getY());
		}
		//======================================================
		/**
		 *	Show menu on item (Property, Command, Atribute..)
         * @param evt  the mouse event
         * @param obj The object itself
         * @param collec The collection name
		 */
		//======================================================
		public void showMenu(MouseEvent evt, Object obj, String collec)
		{
			//	Set selection at mouse position
			TreePath	selectedPath =
				tree.getPathForLocation(evt.getX(), evt.getY());
			if (selectedPath==null)
				return;
			tree.setSelectionPath(selectedPath);

            manageItemMenu(obj.toString());
			title.setText(collec);

			//	Reset all items
			for (int i=0 ; i<menuLabels.length ; i++)
				getComponent(OFFSET+i).setVisible(false);

			getComponent(OFFSET+EDIT_ITEM).setVisible(true);
			getComponent(OFFSET+COPY_ITEM).setVisible(true);
			getComponent(OFFSET+CLONE_ITEM).setVisible(true);
			getComponent(OFFSET+REMOVE_ITEM).setVisible(true);
			((JMenuItem)getComponent(OFFSET+EDIT_ITEM)).setText("Edit " + obj.toString());
            getComponent(OFFSET+EDIT_SRC_CODE).setVisible(true);
            boolean edit_code;
            if (obj instanceof PogoProperty)
                edit_code = Utils.isTrue(((PogoProperty)obj).value.getStatus().getConcreteHere());
            else
            if (obj instanceof PogoCommand)
                edit_code = Utils.isTrue(((PogoCommand)obj).value.getStatus().getConcreteHere());
            else
            if (obj instanceof PogoAttribute)
                edit_code = Utils.isTrue(((PogoAttribute)obj).value.getStatus().getConcreteHere());
            else
                edit_code = Utils.isTrue(((PogoState)obj).value.getStatus().getConcreteHere());
            getComponent(OFFSET+EDIT_SRC_CODE).setEnabled(edit_code &&
                        PogoEditor.getInstance().isAvailable());

            show(tree, evt.getX(), evt.getY());
		}
		//======================================================
		private void menuActionPerformed(ActionEvent evt)
		{
			 //	Check component source
			Object	obj = evt.getSource();
			int     cmdidx = 0;
			for (int i=0 ; i<menuLabels.length ; i++)
				if (getComponent(OFFSET+i)==obj)
					cmdidx = i;

			switch (cmdidx) {
                case EDIT_CLASS:
                    editClass();
                    break;

                //  Collections
                case ADD_ITEM:
                    addItem(false);
                    break;
                case ADD_DYN_ITEM:
                    addItem(true);
                    break;
                case PASTE_ITEM:
                    pasteItem();
                    break;
                case SORT_ITEM:
                    sortItems();
                    break;
                case SUMMARIZE:
                    summarize();
                    break;

                //  Items
                case EDIT_ITEM:
                    editItem();
                    break;
                case COPY_ITEM:
                    copyItem();
                    break;
                case CLONE_ITEM:
                    cloneItem();
                    break;
                case REMOVE_ITEM:
                    removeSelectedItem();
                case EDIT_SRC_CODE:
                    editSourceCode();
                    break;
			}
		}
	}
    //======================================================
    /**
     *	MyCompare class to sort collection
     */
    //======================================================
    class  MyCompare implements Comparator {
        public int compare(Object o1, Object o2) {
			if (o1.toString().equals("State") ||
				o1.toString().equals("Status"))
				return -1;
			if (o2.toString().equals("State") ||
				o2.toString().equals("Status"))
				return -1;
   			return o1.toString().compareTo(o2.toString());
        }
    }
}
