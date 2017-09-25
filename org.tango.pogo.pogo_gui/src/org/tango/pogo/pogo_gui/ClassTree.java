//+======================================================================
//
// Project:   Tango
//
// Description:	java source code for display JTree defining device class.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013,2014
//						European Synchrotron Radiation Facility
//                      BP 220, Grenoble 38043
//                      FRANCE
//
// This file is part of Tango.
//
// Tango is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public license as published by
// the Free Software Foundation, either version 3 of the license, or
// (at your option) any later version.
// 
// Tango is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public license for more details.
// 
// You should have received a copy of the GNU General Public license
// along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
// $Revision: $
// $Date:  $
//
// $HeadURL: $
//
//-======================================================================

package org.tango.pogo.pogo_gui;


import fr.esrf.TangoDs.TangoConst;
import fr.esrf.tango.pogo.pogoDsl.*;
import org.eclipse.emf.common.util.EList;
import org.tango.pogo.pogo_gui.tools.*;

import javax.swing.*;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class ClassTree extends JTree implements TangoConst, PogoConst {

    private DefaultTreeModel treeModel;
    private DefaultMutableTreeNode root;
    private ClassTreePopupMenu menu;
    private PogoGUI parent;

    private static final Color background = Color.white;//new Color(0xf0, 0xf0, 0xf0);
    private static final Color dynamicBG = new Color(0xddffff);

    private PogoDeviceClass pogo_class;
    private DeviceClass deviceClass;
    private DeletedObjects deleted_objects = new DeletedObjects();
    private RenamedObjects renamed_objects = new RenamedObjects();
    private InheritanceUtils inherit_utils;
    private boolean modified = false;
    private boolean isInheritedClass;

    private static Object copiedItem = null;
    //===============================================================
    //===============================================================
    public ClassTree(PogoGUI parent, DeviceClass deviceClass, boolean isInheritedClass) {
        super();
        this.parent = parent;
        this.deviceClass = deviceClass;
        this.isInheritedClass = isInheritedClass;
        pogo_class = deviceClass.getPogoDeviceClass();
        inherit_utils = InheritanceUtils.getInstance();

        buildTree();
        setBackground(background);
        menu = new ClassTreePopupMenu(this);
        expandChildren(root);
        setSelectionPath(null);

        //  Check if class ID is not null (could be null from old Pogo)
        ClassIdentification identification = deviceClass.getPogoDeviceClass().getDescription().getIdentification();
        if (identification == null ||
            !Utils.isSet(identification.getAuthor()) ||
            !Utils.isSet(identification.getContact()) ||
            !Utils.isSet(identification.getPlatform()) ) {
                Utils.getInstance().stopSplashRefresher();
                editClass();
        }
        parent.setLanguageLogo(pogo_class.getDescription().getLanguage());
    }

    //===============================================================
    //===============================================================
    private void buildTree() {
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
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeMouseClicked(evt);    //	for tree clicked, menu,...
            }
        });
        //	Listen for collapse tree
        addTreeExpansionListener(new TreeExpansionListener() {
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
    public void collapsedPerformed(TreeExpansionEvent evt) {
        //	Get node to be collapsed
        TreePath collapsePath = evt.getPath();
        int idx = collapsePath.getPathCount() - 1;
        DefaultMutableTreeNode colapsedNode =
                (DefaultMutableTreeNode) collapsePath.getPathComponent(idx);

        //	get the selected node
        DefaultMutableTreeNode selectedNode = getSelectedNode();
        if (selectedNode == null || colapsedNode == null)
            return;

        //	Check if collapse on selected node, else OK to collapse
        if (colapsedNode != selectedNode)
            return;

        //	Then force to expand
        if (selectedNode.getChildCount() > 0) {
            //	Cancel collapse tree -> expand first child
            DefaultMutableTreeNode child =
                    (DefaultMutableTreeNode) selectedNode.getChildAt(0);
            TreeNode[] child_path = child.getPath();
            setExpandedState(new TreePath(child_path), true);
        }
    }

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    public void expandedPerfomed(TreeExpansionEvent evt) {
    }
    //======================================================
    /**
     * Manage event on clicked mouse on JTree object.
     *
     * @param evt clicked mouse event
     */
    //======================================================
    private void treeMouseClicked(java.awt.event.MouseEvent evt) {
        //	Set selection at mouse position
        TreePath selectedPath = getPathForLocation(evt.getX(), evt.getY());
        if (selectedPath == null) {
            setSelectionPath(null);
            return;
        }
        DefaultMutableTreeNode node =
                (DefaultMutableTreeNode) selectedPath.getPathComponent(selectedPath.getPathCount() - 1);
        Object o = node.getUserObject();
        int mask = evt.getModifiers();

        //  Check button clicked
        if (evt.getClickCount() == 2 && (mask & MouseEvent.BUTTON1_MASK) != 0) {
            if (!(o instanceof PogoCollection)) {
                editItem();
            } else if (node != root)
                addItem(node, false);
        } else if ((mask & MouseEvent.BUTTON3_MASK) != 0) {
            if (node == root)
                menu.showMenu(evt, (PogoRoot) node.getUserObject());
            else if (o instanceof PogoCollection)
                menu.showMenu(evt, (PogoCollection) o);
            else {
                DefaultMutableTreeNode parent_node =
                        (DefaultMutableTreeNode) node.getParent();

                menu.showMenu(evt, o, parent_node.toString());
            }
        }
    }

    //===============================================================
    //===============================================================
    private void createCollectionClassNodes(PogoDeviceClass pogoClass) {

        //  Create property nodes
        EList<Property> classProperties = pogoClass.getClassProperties();
        root.add(createPropertyBranch(classProperties, "Class"));
        EList<Property> deviceProperties = pogoClass.getDeviceProperties();
        root.add(createPropertyBranch(deviceProperties, "Device"));

        //  Create command node
        EList<Command> commands = pogoClass.getCommands();
        EList<Command> dynamicCommands = pogoClass.getDynamicCommands();
        //	Add State and Status commands
        if (commands.size() == 0) {
            Command[] cmd = org.tango.pogo.pogo_gui.tools.OAWutils.createStateStatusCommand();
            commands.add(cmd[0]);
            commands.add(cmd[1]);
        }
        root.add(createCommandBranch(commands, dynamicCommands));

        //  Create attribute nodes
        EList<Attribute> attributes = pogoClass.getAttributes();
        EList<Attribute> dynamicAttributes = pogoClass.getDynamicAttributes();
        DefaultMutableTreeNode[]    attributeNodes =
                createAttributeBranch(attributes, dynamicAttributes);
        root.add(attributeNodes[0]);
        root.add(attributeNodes[1]);
        root.add(attributeNodes[2]);

        EList<ForwardedAttribute>   forwardedAttributes = pogoClass.getForwardedAttributes();
        root.add(createForwardedBranch(forwardedAttributes));
        EList<Pipe>   pipes = pogoClass.getPipes();
        root.add(createPipeBranch(pipes));

        //  Create state node
        EList<State> states = pogoClass.getStates();
        root.add(createStateBranch(states));
    }

    //======================================================
    //======================================================
    private DefaultMutableTreeNode createPropertyBranch(EList<Property> properties, String target) {
        Utils utils = Utils.getInstance();
        DefaultMutableTreeNode propertiesNode =
                new DefaultMutableTreeNode(
                        new PogoCollection(target + " Properties", utils.classPropertyIcon));

        for (Property prop : properties) {
            DefaultMutableTreeNode node =
                    new DefaultMutableTreeNode(new PogoProperty(prop, target.equals("Device")));
            propertiesNode.add(node);
        }
        return propertiesNode;
    }
    //======================================================
    //======================================================
    private DefaultMutableTreeNode createCommandBranch(EList<Command> commands, EList<Command> dynamicCommands) {
        Utils utils = Utils.getInstance();
        DefaultMutableTreeNode commandsNode =
                new DefaultMutableTreeNode(
                        new PogoCollection("Commands", utils.cmdIcon));
        for (Command cmd : commands) {
            DefaultMutableTreeNode node =
                    new DefaultMutableTreeNode(new PogoCommand(cmd));
            commandsNode.add(node);
        }
        for (Command cmd : dynamicCommands) {
            DefaultMutableTreeNode node =
                    new DefaultMutableTreeNode(new PogoCommand(cmd));
            commandsNode.add(node);
        }
        return commandsNode;
    }
    //======================================================
    //======================================================
    private DefaultMutableTreeNode[] createAttributeBranch(EList<Attribute> attributes,
                                                         EList<Attribute> dynamicAttributes) {
        DefaultMutableTreeNode[]    nodes = new DefaultMutableTreeNode[3];
        Utils utils = Utils.getInstance();
        nodes[0] = new DefaultMutableTreeNode(
                        new PogoCollection("Scalar Attributes", utils.scalarIcon));
        nodes[1] = new DefaultMutableTreeNode(
                        new PogoCollection("Spectrum Attributes", utils.spectrumIcon));
        nodes[2] = new DefaultMutableTreeNode(
                        new PogoCollection("Image Attributes", utils.imageIcon));

        for (Attribute att : attributes) {
            PogoAttribute pa = new PogoAttribute(att);
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(pa);
            switch (pa.attType) {
                case SCALAR_ATTRIBUTES:
                    nodes[0].add(node);
                    break;
                case SPECTRUM_ATTRIBUTES:
                    nodes[1].add(node);
                    break;
                case IMAGE_ATTRIBUTES:
                    nodes[2].add(node);
                    break;
            }
        }
        for (Attribute att : dynamicAttributes) {
            PogoAttribute pa = new PogoAttribute(att);
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(pa);
            switch (pa.attType) {
                case SCALAR_ATTRIBUTES:
                    nodes[0].add(node);
                    break;
                case SPECTRUM_ATTRIBUTES:
                    nodes[1].add(node);
                    break;
                case IMAGE_ATTRIBUTES:
                    nodes[2].add(node);
                    break;
            }
        }
        return nodes;
    }
    //======================================================
    //======================================================
    private DefaultMutableTreeNode createStateBranch(EList<State> states) {
        Utils utils = Utils.getInstance();
        DefaultMutableTreeNode statesNode =
                new DefaultMutableTreeNode(
                        new PogoCollection("States", utils.stateIcon));

        for (State state : states) {
            DefaultMutableTreeNode node =
                    new DefaultMutableTreeNode(new PogoState(state));
            statesNode.add(node);
        }
        return statesNode;
    }
    //======================================================
    //======================================================
    private DefaultMutableTreeNode createForwardedBranch(EList<ForwardedAttribute> attributes) {
        Utils utils = Utils.getInstance();
        DefaultMutableTreeNode forwardedNode =
                new DefaultMutableTreeNode(
                        new PogoCollection("Forwarded Attributes", utils.forwardedIcon));

        for (ForwardedAttribute attribute : attributes) {
            DefaultMutableTreeNode node =
                    new DefaultMutableTreeNode(new PogoForwarded(attribute));
            forwardedNode.add(node);
        }
        return forwardedNode;
    }
    //======================================================
    //======================================================
    private DefaultMutableTreeNode createPipeBranch(EList<Pipe> pipes) {
        Utils utils = Utils.getInstance();
        DefaultMutableTreeNode pipesNode =
                new DefaultMutableTreeNode(
                        new PogoCollection("Pipes", utils.pipeIcon));
        for (Pipe pipe : pipes) {
            DefaultMutableTreeNode node =
                    new DefaultMutableTreeNode(new PogoPipe(pipe));
            pipesNode.add(node);
        }
        return pipesNode;
    }
    //======================================================
    //======================================================
    private DefaultMutableTreeNode getSelectedNode() {
        return (DefaultMutableTreeNode) getLastSelectedPathComponent();
    }

    //======================================================
    //======================================================
    Object getSelectedObject() {
        DefaultMutableTreeNode node = getSelectedNode();
        if (node == null)
            return null;
        return node.getUserObject();
    }

    //======================================================
    //======================================================
    Object getSelectedEditableObject() {
        Object selection = getSelectedObject();
        if (selection instanceof PogoProperty)
            return ((PogoProperty) selection).value;
        if (selection instanceof PogoCommand) {
            Command cmd = ((PogoCommand) selection).value;
            if (cmd.getName().equals("State") ||
                    cmd.getName().equals("Status"))
                return null;
            else
                return cmd;
        }
        if (selection instanceof PogoAttribute)
            return ((PogoAttribute) selection).value;
        if (selection instanceof PogoForwarded)
            return ((PogoForwarded) selection).value;
        if (selection instanceof PogoPipe)
            return ((PogoPipe) selection).value;
        if (selection instanceof PogoState)
            return ((PogoState) selection).value;
        return null;
    }

    //===============================================================
    //===============================================================
    private void expandChildren(DefaultMutableTreeNode node) {
        boolean level_done = false;
        for (int i = 0; i < node.getChildCount(); i++) {
            DefaultMutableTreeNode child =
                    (DefaultMutableTreeNode) node.getChildAt(i);
            if (child.isLeaf()) {
                if (!level_done) {
                    expandNode(child);
                    level_done = true;
                }
            } else
                expandChildren(child);
        }
    }

    //===============================================================
    //===============================================================
    private void expandNode(DefaultMutableTreeNode node) {
        List<TreeNode> v = new ArrayList<>();
        v.add(node);
        while (node != root) {
            node = (DefaultMutableTreeNode) node.getParent();
            v.add(0, node);
        }
        TreeNode[] tn = new DefaultMutableTreeNode[v.size()];
        for (int i = 0; i < v.size(); i++)
            tn[i] = v.get(i);
        TreePath tp = new TreePath(tn);
        setSelectionPath(tp);
        scrollPathToVisible(tp);
    }

    //===============================================================
    //===============================================================
    private boolean getRemoveConfirmation(Object object) {
        String str = "\"---\"  --";
        if (object instanceof PogoProperty) {
            str = "\"Property\"  " + ((PogoProperty) object).value.getName();
        }
        else if (object instanceof PogoCommand) {
            str = "\"Command\"  " + ((PogoCommand) object).value.getName();
        }
        else if (object instanceof PogoAttribute) {
            str = "\"Attribute\"  " + ((PogoAttribute) object).value.getName();
        }
        else if (object instanceof PogoForwarded) {
            str = "\"Forwarded Attribute\"  " + ((PogoForwarded) object).value.getName();
        }
        else if (object instanceof PogoPipe) {
            str = "\"Pipe\"  " + ((PogoPipe) object).value.getName();
        }
        else if (object instanceof PogoState) {
            str = "\"State\"  " + ((PogoState) object).value.getName();
        }

        return JOptionPane.showConfirmDialog(this,
                "Remove  " + str + " ?",
                "Confirmation Window",
                JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION;
    }

    //===============================================================
    //===============================================================
    public void setSrcPath(String path) {
        PogoRoot pg_root = (PogoRoot) root.getUserObject();
        pg_root.path = path;
    }

    //===============================================================
    //===============================================================
    private void editSourceCode() {
        Object selection = getSelectedObject();
        if (selection == null)
            return;

        try {
            PogoRoot pg_root = (PogoRoot) root.getUserObject();
            String[] data = new String[]{pg_root.name, pg_root.path, pg_root.language};
            if (pg_root.path == null) {
                throw new PogoException("Source files not generated !");
            }
            if (selection instanceof PogoProperty) {
                Property prop = ((PogoProperty) selection).value;
                boolean is_dev = ((PogoProperty) selection).is_dev;
                PogoEditor.getInstance().editFile(data, prop, is_dev);
            } else if (selection instanceof PogoCommand) {
                Command cmd = ((PogoCommand) selection).value;
                PogoEditor.getInstance().editFile(data, cmd);
            } else if (selection instanceof PogoAttribute) {
                Attribute attribute = ((PogoAttribute) selection).value;
                PogoEditor.getInstance().editFile(data, attribute);
            } else if (selection instanceof PogoPipe) {
                Pipe pipe = ((PogoPipe) selection).value;
                PogoEditor.getInstance().editFile(data, pipe);
            } else if (selection instanceof PogoState) {
                State state = ((PogoState) selection).value;
                PogoEditor.getInstance().editFile(data, state);
            }
        } catch (PogoException e) {
            e.popup(this);
        }
    }
    //===============================================================
    /**
     * Remove the selected object
     */
    //===============================================================
    void removeSelectedItem() {
        removeSelectedItem(true, true);
    }
    //===============================================================
    /**
     * Remove the selected object
     *
     * @param askConfirm  Will ask to confirm before remove if true.
     * @param setModified call setModified(true) if true;
     */
    //===============================================================
    void removeSelectedItem(boolean askConfirm, boolean setModified ) {
        Object selection = getSelectedObject();
        if (selection == null)
            return;
        if (!askConfirm || getRemoveConfirmation(selection)) {

            if (selection instanceof PogoProperty) {
                Property prop = ((PogoProperty) selection).value;
                if (!InheritanceUtils.isRemovable(parent, prop))
                    return;
                EList<Property> properties;
                if (((PogoProperty) selection).is_dev)
                    properties = pogo_class.getDeviceProperties();
                else
                    properties = pogo_class.getClassProperties();
                int idx = Utils.getPropertyIndex(properties, prop);
                if (idx >= 0)
                    properties.remove(idx);
            }
            else if (selection instanceof PogoCommand) {
                Command cmd = ((PogoCommand) selection).value;
                if (!InheritanceUtils.isRemovable(parent, cmd))
                    return;
                EList<Command> commands = pogo_class.getCommands();
                int idx = Utils.getCommandIndex(commands, cmd);
                if (idx >= 0)
                    commands.remove(idx);
                deleted_objects.add(cmd);
            }
            else if (selection instanceof PogoAttribute) {
                Attribute att = ((PogoAttribute) selection).value;
                if (!InheritanceUtils.isRemovable(parent, att))
                    return;
                EList<Attribute> attributes = pogo_class.getAttributes();
                int idx = Utils.getAttributeIndex(attributes, att);
                if (idx >= 0)
                    attributes.remove(idx);
                deleted_objects.add(att);
            }
            else if (selection instanceof PogoForwarded) {
                ForwardedAttribute attribute = ((PogoForwarded) selection).value;
                EList<ForwardedAttribute> attributes = pogo_class.getForwardedAttributes();
                int idx = Utils.getForwardedAttributeIndex(attributes, attribute);
                if (idx >= 0)
                    attributes.remove(idx);
            }
            else if (selection instanceof PogoPipe) {
                Pipe pipe = ((PogoPipe) selection).value;
                EList<Pipe> pipes = pogo_class.getPipes();
                int idx = Utils.getPipeIndex(pipes, pipe);
                if (idx >= 0)
                    pipes.remove(idx);
                deleted_objects.add(pipe);
            }
            else if (selection instanceof PogoState) {
                State state = ((PogoState) selection).value;
                EList<State> states = pogo_class.getStates();
                int idx = Utils.getStateIndex(states, state);
                if (idx >= 0)
                    states.remove(idx);
            }
            DefaultMutableTreeNode node = getSelectedNode();
            treeModel.removeNodeFromParent(node);
            if (setModified )
                setModified(true);
        }
        ((PogoRoot) root.getUserObject()).isAbstract = checkIfAbstractClass();
        repaint();
    }
    //===============================================================
    /**
     * Move the selected object
     *
     * @param    to_up    move node UP if true, otherwise move it down
     */
    //===============================================================
    void moveSelectedItem(boolean to_up) {
        Object selection = getSelectedObject();
        if (selection == null)
            return;

        DefaultMutableTreeNode node = getSelectedNode();
        //	Get parent node and node position.
        DefaultMutableTreeNode parent_node =
                (DefaultMutableTreeNode) node.getParent();
        int pos = 0;
        for (int i = 0; i < parent_node.getChildCount(); i++)
            if (parent_node.getChildAt(i).equals(node))
                pos = i;

        //	get position min and max (special case for commands state and status)
        int pos_min = 0;
        int pos_max = parent_node.getChildCount() - 1;
        if (selection instanceof PogoCommand)
            pos_min = 2;    //	Cannot move State and Status

        if (to_up) {
            //	MOve Up
            if (pos > pos_min) {
                treeModel.removeNodeFromParent(node);
                treeModel.insertNodeInto(node, parent_node, pos - 1);
            }
        } else {
            //	Move Down
            if (pos < pos_max) {
                treeModel.removeNodeFromParent(node);
                treeModel.insertNodeInto(node, parent_node, pos + 1);
            }
        }
        setSelectionNode(node);
        modified = true;
    }
    //===============================================================

    /**
     * Sort objects on specified collection
     */
    //===============================================================
    private void sortItems() {
        //	Get all children nodes in a vector
        List<DefaultMutableTreeNode> nodeList = new ArrayList<>();
        DefaultMutableTreeNode parent_node = getSelectedNode();
        for (int i = 0; i < parent_node.getChildCount(); i++)
            nodeList.add((DefaultMutableTreeNode) parent_node.getChildAt(i));

        //	Sort them
        Collections.sort(nodeList, new NodeComparator());

        //	remove all nodes from parent
        while (parent_node.getChildCount() > 0)
            treeModel.removeNodeFromParent(
                    (DefaultMutableTreeNode) parent_node.getChildAt(0));

        //	And add them in sorted order
        for (int i = 0; i < nodeList.size(); i++)
            treeModel.insertNodeInto(nodeList.get(i), parent_node, i);
        expandChildren(parent_node);
    }

    //===============================================================
    //===============================================================
    private void setSelectionNode(DefaultMutableTreeNode node) {
        TreeNode[] path = node.getPath();
        setSelectionPath(new TreePath(path));
    }
    //===============================================================
    /**
     * Edit selected object
     */
    //===============================================================
    public void editClass() {
        ClassDialog dialog = new ClassDialog(parent, this, deviceClass, isInheritedClass);
        if (dialog.showDialog() == JOptionPane.OK_OPTION) {
            deviceClass = dialog.getInputs();
            root.setUserObject(new PogoRoot(deviceClass.getPogoDeviceClass()));
            if (!dialog.hasForcedToGenerate()) {
                parent.setLanguageLogo(
                        deviceClass.getPogoDeviceClass().getDescription().getLanguage());
                setModified(true);
            }
            repaint();
        }
    }
    //===============================================================
    //===============================================================
    public void setClassLanguage(int language) {
        ((PogoRoot) root.getUserObject()).language = PogoConst.strLang[language];
        deviceClass.getPogoDeviceClass().getDescription().setLanguage(PogoConst.strLang[language]);
    }
    //===============================================================
    /**
     * Copy selected object to be pasted.
     */
    //===============================================================
    private void copyItem() {
        copiedItem = getSelectedObject();
    }

    //===============================================================
    /**
     * Paste the copiedItem object
     */
    //===============================================================
    private void pasteItem() {

        if (copiedItem == null)
            return;

        DefaultMutableTreeNode newNode = null;
        DefaultMutableTreeNode collectionNode = getSelectedNode();

        try {
            if (copiedItem instanceof PogoProperty) {
                boolean is_dev = collectionNode == root.getChildAt(DEV_PROPERTIES);
                String target = (is_dev) ? "Device " : "Class ";
                if (propertyAlreadyExists(copiedItem.toString(), is_dev)) {
                    throw new PogoException(target + "Property " +
                            copiedItem + " already exists");
                }
                PogoProperty pp = (PogoProperty) copiedItem;
                Property src = PropertyDialog.cloneProperty(pp.value);
                newNode = new DefaultMutableTreeNode(new PogoProperty(src, is_dev));
            } else if (copiedItem instanceof PogoCommand) {
                if (itemAlreadyExists(copiedItem.toString(), COMMANDS)) {
                    throw new PogoException("Command " + copiedItem + " already exists");
                }
                PogoCommand pc = (PogoCommand) copiedItem;
                Command src = CommandDialog.cloneCommand(pc.value);
                newNode = new DefaultMutableTreeNode(new PogoCommand(src));
            } else if (copiedItem instanceof PogoAttribute) {
                if (itemAlreadyExists(copiedItem.toString(), SCALAR_ATTRIBUTES)) {
                    throw new PogoException("Attribute " + copiedItem + " already exists");
                }
                PogoAttribute pa = (PogoAttribute) copiedItem;
                Attribute src = AttributeDialog.cloneAttribute(pa.value);
                newNode = new DefaultMutableTreeNode(new PogoAttribute(src));
                if (pa.attType ==SCALAR_ATTRIBUTES)
                    collectionNode = (DefaultMutableTreeNode) root.getChildAt(SCALAR_ATTRIBUTES);
                else if (pa.attType ==SPECTRUM_ATTRIBUTES)
                    collectionNode = (DefaultMutableTreeNode) root.getChildAt(SPECTRUM_ATTRIBUTES);
                else
                    collectionNode = (DefaultMutableTreeNode) root.getChildAt(IMAGE_ATTRIBUTES);
            } else if (copiedItem instanceof PogoPipe) {
                if (itemAlreadyExists(copiedItem.toString(), PIPES)) {
                    throw new PogoException("Pipe " + copiedItem + " already exists");
                }
                PogoPipe pipe = (PogoPipe) copiedItem;
                Pipe src = OAWutils.clonePipe(pipe.value);
                newNode = new DefaultMutableTreeNode(new PogoPipe(src));
            } else if (copiedItem instanceof PogoState) {
                if (itemAlreadyExists(copiedItem.toString(), STATES)) {
                    throw new PogoException("State " + copiedItem + " already exists");
                }
                PogoState ps = (PogoState) copiedItem;
                State src = StateDialog.cloneState(ps.value);
                newNode = new DefaultMutableTreeNode(new PogoState(src));
            }
            //  If has been cloned -> edit it
            if (newNode != null) {
                treeModel.insertNodeInto(newNode, collectionNode, collectionNode.getChildCount());
                setSelectionNode(newNode);
                setModified(true);
                editItem();
            }
        } catch (PogoException e) {
            e.popup(this);
        }
    }
    //===============================================================

    /**
     * Check if copiedItem is able to be pasted
     *
     * @return return true if opiedItem is able to be pasted
     */
    //===============================================================
    private boolean canPaste() {
        if (copiedItem == null)
            return false;

        DefaultMutableTreeNode selectedNode = getSelectedNode();
        if (copiedItem instanceof PogoProperty) {
            if (selectedNode == root.getChildAt(DEV_PROPERTIES)) return true;
            if (selectedNode == root.getChildAt(CLASS_PROPERTIES)) return true;
        } else if (copiedItem instanceof PogoCommand) {
            if (selectedNode == root.getChildAt(COMMANDS)) return true;
        } else if (copiedItem instanceof PogoAttribute) {
            if (selectedNode == root.getChildAt(SCALAR_ATTRIBUTES)) return true;
            if (selectedNode == root.getChildAt(SPECTRUM_ATTRIBUTES)) return true;
            if (selectedNode == root.getChildAt(IMAGE_ATTRIBUTES)) return true;
        }else if (copiedItem instanceof PogoPipe) {
            if (selectedNode == root.getChildAt(PIPES)) return true;
        } else if (copiedItem instanceof PogoState) {
            if (selectedNode == root.getChildAt(STATES)) return true;
        }
        return false;
    }
    //===============================================================
    /**
     * Clone selected object, and then edit it.
     */
    //===============================================================
    private void cloneItem() {
        DefaultMutableTreeNode newNode = null;
        DefaultMutableTreeNode collecNode =
                (DefaultMutableTreeNode) getSelectedNode().getParent();

        Object obj = getSelectedObject();
        if (obj instanceof PogoProperty) {
            Property srcProp = ((PogoProperty) obj).value;
            Property newProp = PropertyDialog.cloneProperty(srcProp);
            boolean is_dev = ((PogoProperty) obj).is_dev;

            if (is_dev)
                pogo_class.getDeviceProperties().add(newProp);
            else
                pogo_class.getClassProperties().add(newProp);
            newNode = new DefaultMutableTreeNode(new PogoProperty(newProp, is_dev));
        } else if (obj instanceof PogoCommand) {
            Command srcCmd = ((PogoCommand) obj).value;
            Command newCmd = CommandDialog.cloneCommand(srcCmd);

            pogo_class.getCommands().add(newCmd);

            newNode = new DefaultMutableTreeNode(new PogoCommand(newCmd));
        } else if (obj instanceof PogoAttribute) {
            Attribute srcAttribute = ((PogoAttribute) obj).value;
            Attribute newAttribute = AttributeDialog.cloneAttribute(srcAttribute);

            pogo_class.getAttributes().add(newAttribute);
            newNode = new DefaultMutableTreeNode(new PogoAttribute(newAttribute));
        } else if (obj instanceof PogoPipe) {
            Pipe srcPipe = ((PogoPipe) obj).value;
            Pipe newPipe = OAWutils.clonePipe(srcPipe);

            pogo_class.getPipes().add(newPipe);
            newNode = new DefaultMutableTreeNode(new PogoPipe(newPipe));
        } else if (obj instanceof PogoState) {
            State srcState = ((PogoState) obj).value;
            State newState = StateDialog.cloneState(srcState);

            pogo_class.getStates().add(newState);
            newNode = new DefaultMutableTreeNode(new PogoState(newState));
        }

        //  If has been cloned -> edit it
        if (newNode != null) {
            treeModel.insertNodeInto(newNode, collecNode, collecNode.getChildCount());
            setSelectionNode(newNode);
            boolean editOk = (editItem() == JOptionPane.OK_OPTION);
            if (editOk)
                setModified(true);
            else
                removeSelectedItem(false, false);
        }
    }
    //===============================================================
    /**
     * Clone selected class/device property
     */
    //===============================================================
    private void clonePropertyAs() {
        //  ToDo
        DefaultMutableTreeNode newNode;
        Object obj = getSelectedObject();
        if (obj instanceof PogoProperty) {
            Property srcProp = ((PogoProperty) obj).value;
            Property newProp = PropertyDialog.cloneProperty(srcProp);
            boolean is_dev = ((PogoProperty) obj).is_dev;

            if (is_dev)
                pogo_class.getDeviceProperties().add(newProp);
            else
                pogo_class.getClassProperties().add(newProp);
            newNode = new DefaultMutableTreeNode(new PogoProperty(newProp, is_dev));

            DefaultMutableTreeNode targetCollection;
            if (is_dev) {
                targetCollection = ((DefaultMutableTreeNode) root.getChildAt(CLASS_PROPERTIES));
            }
            else {
                targetCollection = ((DefaultMutableTreeNode) root.getChildAt(DEV_PROPERTIES));
            }

            treeModel.insertNodeInto(newNode, targetCollection, targetCollection.getChildCount());
            setSelectionNode(newNode);
            setModified(true);
        }
    }
    //===============================================================
    //===============================================================
    private void replaceSelectedNode(DefaultMutableTreeNode newNode) {
        DefaultMutableTreeNode srcNode = getSelectedNode();
        DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) srcNode.getParent();
        System.out.println(parentNode);
        for (int i=0 ; i<parentNode.getChildCount() ; i++) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) parentNode.getChildAt(i);
            if (node == srcNode) {
                //  Remove and add new at same index
                treeModel.removeNodeFromParent(srcNode);
                treeModel.insertNodeInto(newNode, parentNode, i);
                break;
            }
        }
        expandNode(newNode);
    }
    //===============================================================
    //===============================================================
    private void replaceNodeUserObject(Property srcProperty, Property newProperty, boolean is_dev) {
        EList<Property> properties;
        if (is_dev)
            properties = pogo_class.getDeviceProperties();
        else
            properties = pogo_class.getClassProperties();

        int idx = Utils.getPropertyIndex(properties, srcProperty);
        if (idx >= 0) {
            properties.remove(idx);
            properties.add(idx, srcProperty);
        } else
            properties.add(srcProperty);
        replaceSelectedNode(
                new DefaultMutableTreeNode(new PogoProperty(newProperty, is_dev)));
        setModified(true);
    }
    //===============================================================
    //===============================================================
    private void replaceNodeUserObject(Command srcCommand, Command newCommand) {
        EList<Command> commands = pogo_class.getCommands();
        int idx = Utils.getCommandIndex(commands, srcCommand);
        if (idx >= 0) {    //	Exists
            commands.remove(idx);
            commands.add(idx, newCommand);
        } else
            commands.add(newCommand);  //  else add at end

        replaceSelectedNode(
               new DefaultMutableTreeNode(new PogoCommand(newCommand)));
        setModified(true);
        newCommand.getStatus().setHasChanged("false");

        //	Check if name has changed
        if (!srcCommand.getName().equals(newCommand.getName()))
            renamed_objects.add(srcCommand, newCommand);
    }
    //===============================================================
    //===============================================================
    private void replaceNodeUserObject(Attribute srcAttribute, Attribute newAttribute) {
        String attType = newAttribute.getAttType();
        String attTypeOrg = srcAttribute.getAttType();
        if (attType.equals(attTypeOrg)) {   //	Type has not changed
            replaceSelectedNode(    //  replace existing node
                    new DefaultMutableTreeNode(new PogoAttribute(newAttribute)));
        }
        else {  //  Change collection
            //	Remove old one
            DefaultMutableTreeNode newNode = getSelectedNode();
            treeModel.removeNodeFromParent(newNode);

            //	Create a new node in another collection
            PogoAttribute pa = new PogoAttribute(newAttribute);
            newNode = new DefaultMutableTreeNode(pa);
            DefaultMutableTreeNode parentNode;
            switch (attType) {
                case "Scalar":
                    parentNode = (DefaultMutableTreeNode) root.getChildAt(SCALAR_ATTRIBUTES);
                    break;
                case "Spectrum":
                    parentNode = (DefaultMutableTreeNode) root.getChildAt(SPECTRUM_ATTRIBUTES);
                    break;
                default:
                    parentNode = (DefaultMutableTreeNode) root.getChildAt(IMAGE_ATTRIBUTES);
                    break;
            }
            treeModel.insertNodeInto(newNode, parentNode, parentNode.getChildCount());
            expandNode(newNode);
        }
        setModified(true);
        newAttribute.getStatus().setHasChanged("false");

        //	Check if name has changed
        if (srcAttribute.getName().equals(newAttribute.getName()))
            renamed_objects.add(srcAttribute, newAttribute);
    }
    //===============================================================
    //===============================================================
    private void replaceNodeUserObject(ForwardedAttribute srcAttribute, ForwardedAttribute newAttribute) {
        EList<ForwardedAttribute> attributes = pogo_class.getForwardedAttributes();
        int idx = Utils.getForwardedAttributeIndex(attributes, srcAttribute);
        if (idx >= 0) {
            attributes.remove(idx);
            attributes.add(idx, newAttribute);
        } else
            attributes.add(newAttribute);
        replaceSelectedNode(
                new DefaultMutableTreeNode(new PogoForwarded(newAttribute)) );
        setModified(true);
    }
    //===============================================================
    //===============================================================
    private void replaceNodeUserObject(Pipe srcPipe, Pipe newPipe) {
        EList<Pipe> pipes = pogo_class.getPipes();
        int idx = Utils.getPipeIndex(pipes, srcPipe);
        if (idx >= 0) {
            pipes.remove(idx);
            pipes.add(idx, newPipe);
        } else
            pipes.add(newPipe);
        replaceSelectedNode(
                new DefaultMutableTreeNode(new PogoPipe(newPipe)));
        setModified(true);
        //	Check if name has changed
        if (!srcPipe.getName().equals(newPipe.getName()))
            renamed_objects.add(srcPipe, newPipe);
    }
    //===============================================================
    //===============================================================
    private void replaceNodeUserObject(State srcState, State newState) {
        EList<State> states = pogo_class.getStates();
        int idx = Utils.getStateIndex(states, srcState);
        if (idx >= 0) {
            states.remove(idx);
            states.add(idx, newState);
        } else
            states.add(newState);
        replaceSelectedNode(
                new DefaultMutableTreeNode(new PogoState(newState)));
        setModified(true);
        setSelectionPath(null);
    }
    //===============================================================
    /**
     * Edit selected object
     *
     * @return the edit dialog button
     *         (JOptionPane.CANCEL_OPTION or JOptionPane.OK_OPTION)
     */
    //===============================================================
    private int editItem() {
        Object obj = getSelectedObject();
        if (obj instanceof PogoRoot)
            editClass();
        else if (obj instanceof PogoState) {
            State state = ((PogoState) obj).value;
            StateDialog dialog = new StateDialog(parent, state);
            if (dialog.showDialog() == JOptionPane.OK_OPTION) {
                replaceNodeUserObject(state, dialog.getState());
            } else
                return JOptionPane.CANCEL_OPTION;
        }
        else if (obj instanceof PogoForwarded) {
            ForwardedAttribute attribute = ((PogoForwarded) obj).value;
            ForwardedAttributeDialog dialog = new ForwardedAttributeDialog(parent, attribute);
            if (dialog.showDialog() == JOptionPane.OK_OPTION) {
                replaceNodeUserObject(attribute, dialog.getForwardedAttribute());
            } else
                return JOptionPane.CANCEL_OPTION;
        }
        else if (obj instanceof PogoProperty) {
            Property property = ((PogoProperty) obj).value;
            boolean is_dev = ((PogoProperty) obj).is_dev;
            PropertyDialog dialog = new PropertyDialog(parent, property, is_dev);
            if (dialog.showDialog() == JOptionPane.OK_OPTION) {
                replaceNodeUserObject(property, dialog.getProperty(), is_dev);
            } else
                return JOptionPane.CANCEL_OPTION;
        }
        else if (obj instanceof PogoCommand) {
            Command command = ((PogoCommand) obj).value;
            CommandDialog dialog = new CommandDialog(parent, command);
            if (dialog.showDialog() == JOptionPane.OK_OPTION) {
                replaceNodeUserObject(command, dialog.getCommand());
            } else
                return JOptionPane.CANCEL_OPTION;
        }
        else if (obj instanceof PogoAttribute) {
            Attribute attribute = ((PogoAttribute) obj).value;
            AttributeDialog dialog = new AttributeDialog(parent, attribute);
            if (dialog.showDialog() == JOptionPane.OK_OPTION) {
                replaceNodeUserObject(attribute, dialog.getAttribute());
            }
            else
                return JOptionPane.CANCEL_OPTION;
        }
        else if (obj instanceof PogoPipe) {
            Pipe pipe = ((PogoPipe) obj).value;
            PipeDialog dialog = new PipeDialog(parent, pipe);
            if (dialog.showDialog() == JOptionPane.OK_OPTION) {
                replaceNodeUserObject(pipe, dialog.getPipe());
            } else
                return JOptionPane.CANCEL_OPTION;
        }

        ((PogoRoot) root.getUserObject()).isAbstract = checkIfAbstractClass();
        repaint();
        return JOptionPane.OK_OPTION;
    }
    //===============================================================
    /**
     * @return true if at least one attribute or one command is abstract
     */
    //===============================================================
    private boolean checkIfAbstractClass() {
        for (int i = 0; i < root.getChildCount(); i++) {
            DefaultMutableTreeNode collecNode =
                    (DefaultMutableTreeNode) root.getChildAt(i);
            switch (i) {
                case COMMANDS:
                    for (int j = 0; j < collecNode.getChildCount(); j++) {
                        DefaultMutableTreeNode node =
                                (DefaultMutableTreeNode) collecNode.getChildAt(j);
                        Command cmd = ((PogoCommand) node.getUserObject()).value;
                        if (!Utils.isTrue(cmd.getStatus().getConcrete()) &&
                                !Utils.isTrue(cmd.getStatus().getConcreteHere()))
                            return true;
                    }
                    break;
                case SCALAR_ATTRIBUTES:
                case SPECTRUM_ATTRIBUTES:
                case IMAGE_ATTRIBUTES:
                    for (int j = 0; j < collecNode.getChildCount(); j++) {
                        DefaultMutableTreeNode node =
                                (DefaultMutableTreeNode) collecNode.getChildAt(j);
                        Attribute att = ((PogoAttribute) node.getUserObject()).value;
                        if (!Utils.isTrue(att.getStatus().getConcrete()) &&
                                !Utils.isTrue(att.getStatus().getConcreteHere()))
                            return true;
                    }
                    break;
            }
        }
        return false;
    }
    //===============================================================
    /**
     * Add a new object on specified collection
     *
     * @param itemClass Class item object
     */
    //===============================================================
    void addItem(String itemClass) {

        String  itemStr = itemClass.toLowerCase();
        for (int i=0 ; i<root.getChildCount() ; i++) {
            DefaultMutableTreeNode collectionNode =
                    (DefaultMutableTreeNode) root.getChildAt(i);
            String  nodeStr = collectionNode.toString().toLowerCase();

            if (itemStr.contains("class prop") && nodeStr.contains("class prop"))
                addItem(collectionNode, false);
            else
            if (itemStr.contains("device prop") && nodeStr.contains("device prop"))
                addItem(collectionNode, false);
            else
            if (itemStr.contains("command") && nodeStr.contains("command"))
                addItem(collectionNode, false);
            else
            if (itemStr.contains("scalar") && nodeStr.contains("scalar"))
                addItem(collectionNode, false);
            else
            if (itemStr.contains("spectrum") && nodeStr.contains("spectrum"))
                addItem(collectionNode, false);
            else
            if (itemStr.contains("image") && nodeStr.contains("image"))
                addItem(collectionNode, false);
            else
            if (itemStr.contains("forwarded") && nodeStr.contains("forwarded"))
                addItem(collectionNode, false);
            else
            if (itemStr.contains("pipe") && nodeStr.contains("pipe"))
                addItem(collectionNode, false);
            else
            if (itemStr.contains("state") && nodeStr.contains("state"))
                addItem(collectionNode, false);
        }
    }
    //===============================================================
    /**
     * Add a new object on selected collection
     *
     * @param isDynamic true if the item is an attribute and must be a dynamic one
     */
    //===============================================================
    private void addItem(boolean isDynamic) {
        addItem(getSelectedNode(), isDynamic);
    }
    //===============================================================
    /**
     * Add a new object on specified collection
     *
     * @param collectionNode specified collection node
     * @param isDynamic  true if the item is an attribute and must be a dynamic one
     */
    //===============================================================
    private void addItem(DefaultMutableTreeNode collectionNode, boolean isDynamic) {
        DefaultMutableTreeNode new_node = null;
        if (collectionNode.toString().equals("Commands")) {
            CommandDialog dlg = new CommandDialog(parent, isDynamic);
            if (dlg.showDialog() == JOptionPane.OK_OPTION) {
                Command cmd = dlg.getCommand();
                pogo_class.getCommands().add(cmd);
                new_node = new DefaultMutableTreeNode(new PogoCommand(cmd));
                treeModel.insertNodeInto(new_node, collectionNode, collectionNode.getChildCount());
                setModified(true);
            }
        }
        else if (collectionNode.toString().contains("Properties")) {
            boolean isDevice = (collectionNode.toString().indexOf("Device") == 0);
            PropertyDialog dlg = new PropertyDialog(parent, null, isDevice);
            if (dlg.showDialog() == JOptionPane.OK_OPTION) {
                Property prop = dlg.getProperty();
                if (isDevice)
                    pogo_class.getDeviceProperties().add(prop);
                else
                    pogo_class.getClassProperties().add(prop);
                new_node = new DefaultMutableTreeNode(new PogoProperty(prop, isDevice));
                treeModel.insertNodeInto(new_node, collectionNode, collectionNode.getChildCount());
                setModified(true);
            }
        }
        else if (collectionNode.toString().equals("States")) {
            StateDialog dlg = new StateDialog(parent, null);
            if (dlg.showDialog() == JOptionPane.OK_OPTION) {
                State state = dlg.getState();
                pogo_class.getStates().add(state);
                new_node = new DefaultMutableTreeNode(new PogoState(state));
                treeModel.insertNodeInto(new_node, collectionNode, collectionNode.getChildCount());
                setModified(true);
                setSelectionPath(null);
            }
        }
        else if (collectionNode.toString().contains("Forwarded")) {
            ForwardedAttributeDialog    dialog = new ForwardedAttributeDialog(parent, null);
            if (dialog.showDialog()==JOptionPane.OK_OPTION) {
                ForwardedAttribute attribute = dialog.getForwardedAttribute();
                pogo_class.getForwardedAttributes().add(attribute);
                new_node = new DefaultMutableTreeNode(new PogoForwarded(attribute));
                treeModel.insertNodeInto(new_node, collectionNode, collectionNode.getChildCount());
                setModified(true);
            }
        }
        else if (collectionNode.toString().contains("Pipes")) {
            PipeDialog    dialog = new PipeDialog(parent, null);
            if (dialog.showDialog()==JOptionPane.OK_OPTION) {
                //  ToDo insert object
                Pipe pipe = dialog.getPipe();
                pogo_class.getPipes().add(pipe);
                new_node = new DefaultMutableTreeNode(new PogoPipe(pipe));
                treeModel.insertNodeInto(new_node, collectionNode, collectionNode.getChildCount());
                setModified(true);
             }
        }
        else if (collectionNode.toString().contains("Attribute")) {
            int attType;
            if (collectionNode.toString().startsWith("Scalar"))
                attType = AttributeDialog.SCALAR;
            else if (collectionNode.toString().startsWith("Spectrum"))
                attType = AttributeDialog.SPECTRUM;
            else
                attType = AttributeDialog.IMAGE;
            AttributeDialog dlg = new AttributeDialog(parent, attType, isDynamic);
            if (dlg.showDialog() == JOptionPane.OK_OPTION) {
                Attribute att = dlg.getAttribute();
                pogo_class.getAttributes().add(att);
                new_node = new DefaultMutableTreeNode(new PogoAttribute(att));

                //	Collection node depends on if scalar, spectrum or image
                //	And it could have changed
                String strType = att.getAttType();
                switch (strType) {
                    case "Scalar":
                        collectionNode = (DefaultMutableTreeNode) root.getChildAt(SCALAR_ATTRIBUTES);
                        break;
                    case "Spectrum":
                        collectionNode = (DefaultMutableTreeNode) root.getChildAt(SPECTRUM_ATTRIBUTES);
                        break;
                    default:
                        collectionNode = (DefaultMutableTreeNode) root.getChildAt(IMAGE_ATTRIBUTES);
                        break;
                }
                treeModel.insertNodeInto(new_node, collectionNode, collectionNode.getChildCount());
                setModified(true);
            }
        }
        if (new_node != null)
            expandNode(new_node);
        ((PogoRoot) root.getUserObject()).isAbstract = checkIfAbstractClass();
        repaint();
    }
    //===============================================================
    /**
     * Returns a vector of deleted objects.
     *
     * @return the deleted objects list
     */
    //===============================================================
    DeletedObjects getDeletedObjects() {
        return deleted_objects;
    }
    //===============================================================
    /**
     * Returns a vector of renamed objects.
     *
     * @return the renamed objects list
     */
    //===============================================================
    RenamedObjects getRenamedObjects() {
        return renamed_objects;
    }

    //===============================================================
    //===============================================================
    public boolean getModified() {
        return modified;
    }

    //===============================================================
    //===============================================================
    public void setModified(boolean b) {
        modified = b;
        parent.fireClassHaveChanged();
    }
    //===============================================================
    /**
     * Build a PogoDeviceClass from tree and return it as DeviceClass object
     *
     * @return the Pogo model to be generated.
     */
    //===============================================================
    DeviceClass getDeviceClass() {
        DeviceClass devClass = new DeviceClass();
        devClass.setAncestors(deviceClass.getAncestors());
        PogoDeviceClass pg_class = devClass.getPogoDeviceClass();

        PogoRoot pogoRoot = (PogoRoot) root.getUserObject();
        //  Check if class ID is not null (could be null from old Pogo)
        if (pogoRoot.id == null) {
            editClass();
            pogoRoot = (PogoRoot) root.getUserObject();
            if (pogoRoot.id == null)
                return null;
        }

        pg_class.setName(pogoRoot.name);
        pg_class.getDescription().setDescription(pogoRoot.description);
        pg_class.getDescription().setTitle(pogoRoot.title);
        pg_class.getDescription().setSourcePath(pogoRoot.path);
        pg_class.getDescription().setLicense(pogoRoot.license);
		pg_class.getDescription().setCopyright(pogoRoot.copyright);
        pg_class.getDescription().setIdentification(
                OAWutils.cloneClassIdentification(pogoRoot.id));
        pg_class.getDescription().setLanguage(pogoRoot.language);

        //  Copy inheritances.
        EList<Inheritance> inheritances = pg_class.getDescription().getInheritances();
        inheritances.clear();
        for (Inheritance inheritance : pogoRoot.inheritances) {
            Inheritance inher = OAWutils.factory.createInheritance();
            inher.setClassname(inheritance.getClassname());
            inher.setSourcePath(inheritance.getSourcePath());
            inheritances.add(inher);
        }
        EList<Property> classProperties = pg_class.getClassProperties();
        EList<Property> deviceProperties = pg_class.getDeviceProperties();
        EList<Command> commands = pg_class.getCommands();
        EList<Command> dynamicCommands = pg_class.getDynamicCommands();
        EList<Attribute> attributes = pg_class.getAttributes();
        EList<Attribute> dynamicAttributes = pg_class.getDynamicAttributes();
        EList<ForwardedAttribute> forwardedAttributes = pg_class.getForwardedAttributes();
        EList<Pipe> pipes = pg_class.getPipes();
        EList<State> states = pg_class.getStates();
        for (int i=0 ; i<root.getChildCount() ; i++) {
            DefaultMutableTreeNode collectionNode =
                    (DefaultMutableTreeNode) root.getChildAt(i);
            switch (i) {
                case CLASS_PROPERTIES:
                    setPropertyToPogoDeviceClass(classProperties, collectionNode);
                    break;
                case DEV_PROPERTIES:
                    setPropertyToPogoDeviceClass(deviceProperties, collectionNode);
                    break;
                case COMMANDS:
                    setCommandsToPogoDeviceClass(commands, dynamicCommands, collectionNode);
                    break;
                case STATES:
                    setStateToPogoDeviceClass(states, collectionNode);
                    break;
                case FORWARDED_ATTRIBUTES:
                    setForwardedToPogoDeviceClass(forwardedAttributes, collectionNode);
                    break;
                case SCALAR_ATTRIBUTES:
                case SPECTRUM_ATTRIBUTES:
                case IMAGE_ATTRIBUTES:
                    setAttributeToPogoDeviceClass(attributes, dynamicAttributes, collectionNode);
                    break;
                case PIPES:
                    setPipeToPogoDeviceClass(pipes, collectionNode);
                    break;
            }
        }
        //  ToDo Check if supported
        if (pg_class.getDynamicCommands().size()>0 &&
                pogoRoot.language.equals(PogoConst.strLang[PogoConst.Python])) {
            Utils.popupError(this, "Dynamic commands are not supported in Python !");
            return null;
        }
        if (pg_class.getForwardedAttributes().size()>0 &&
                pogoRoot.language.equals(PogoConst.strLang[PogoConst.Python]))  {
            Utils.popupError(this, "Forwarded attributes are not supported in Python !");
            return null;
        }

        //  Update abstract class fields
        DeviceClass.checkIfAbstractClass(pg_class, true);
        //  Update additional file list
        EList<AdditionalFile> newFileList = pg_class.getAdditionalFiles();
        EList<AdditionalFile> orgFileList = deviceClass.getPogoDeviceClass().getAdditionalFiles();
        for (AdditionalFile file : orgFileList) {
            newFileList.add(OAWutils.cloneAdditionalFile(file));
        }

        //  Check if polling period has been modified for
        //  overloaded object if any
        checkForPollingPeriodOverloaded(devClass.getPogoDeviceClass());
        devClass.setUsingPyHlPackage(pogoRoot.usingPyHlPackage);
        return devClass;
    }

    //===============================================================
    //===============================================================
    private void checkForPollingPeriodOverloaded(PogoDeviceClass pogoDeviceClass) {

        List<DeviceClass>  ancestors  = deviceClass.getAncestors();
        if (ancestors.isEmpty())
            return; //  No ancestor -> Nothing overloaded.

        EList<OverlodedPollPeriodObject>    newPollPeriods =
                pogoDeviceClass.getOverlodedPollPeriodObject();

        //  Check for Attributes
        EList<Attribute>        attributes = pogo_class.getAttributes();
        for (Attribute attribute : attributes) {
            for (DeviceClass ancestor : ancestors) {
                EList<Attribute> ancestorAttributes = ancestor.getPogoDeviceClass().getAttributes();
                for (Attribute ancestorAttribute : ancestorAttributes) {
                    //  Check if the polling period is not null
                    if (ancestorAttribute.getPolledPeriod()==null)
                        ancestorAttribute.setPolledPeriod("0");
                    //  Check if the polling period has been modified.
                    if (ancestorAttribute.getName().equals(attribute.getName()) &&
                        !attribute.getPolledPeriod().equals(ancestorAttribute.getPolledPeriod())) {

                        OverlodedPollPeriodObject pollPeriodObject =
                            OAWutils.factory.createOverlodedPollPeriodObject();
                        pollPeriodObject.setName(attribute.getName());
                        pollPeriodObject.setType("attribute");
                        pollPeriodObject.setPollPeriod(attribute.getPolledPeriod());
                        newPollPeriods.add(pollPeriodObject);
                    }
                }
            }
        }

        //  Check for commands
        EList<Command>        commands = pogo_class.getCommands();
        for (Command command : commands) {
            for (DeviceClass ancestor : ancestors) {
                EList<Command> ancestorCommands = ancestor.getPogoDeviceClass().getCommands();
                for (Command ancestorCommand : ancestorCommands) {
                    //  Check if the polling period is not null
                    if (ancestorCommand.getPolledPeriod()==null)
                        ancestorCommand.setPolledPeriod("0");
                    //  Check if the polling period has been modified.
                    if (ancestorCommand.getName().equals(command.getName()) &&
                        !command.getPolledPeriod().equals(ancestorCommand.getPolledPeriod())) {

                        OverlodedPollPeriodObject pollPeriodObject =
                                OAWutils.factory.createOverlodedPollPeriodObject();
                        pollPeriodObject.setName(command.getName());
                        pollPeriodObject.setType("command");
                        pollPeriodObject.setPollPeriod(command.getPolledPeriod());
                        newPollPeriods.add(pollPeriodObject);
                    }
                }
            }
        }
    }
    //===============================================================
    //===============================================================
    private DefaultMutableTreeNode getCollectionNode(int collecNum) {
        return (DefaultMutableTreeNode) root.getChildAt(collecNum);
    }

    //===============================================================
    //===============================================================
    private void setPropertyToPogoDeviceClass(EList<Property> properties, DefaultMutableTreeNode collecNode) {
        for (int i = 0; i < collecNode.getChildCount(); i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collecNode.getChildAt(i);
            Property prop = ((PogoProperty) node.getUserObject()).value;

            properties.add(OAWutils.cloneProperty(prop));
        }
    }
    //===============================================================
    //===============================================================
    private void setCommandsToPogoDeviceClass(EList<Command> commands,
                                              EList<Command> dynCommands,
                                              DefaultMutableTreeNode collectionNode) {
        for (int i = 0; i < collectionNode.getChildCount(); i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collectionNode.getChildAt(i);
            Command command = ((PogoCommand) node.getUserObject()).value;
            command.setExecMethod(Utils.buildCppExecuteMethodName(command.getName()));

            //  For compatibility reason, verify polling_period
            if (command.getPolledPeriod()==null ||
                command.getPolledPeriod().length()==0) {
                command.setPolledPeriod("0");
            }


            if (Utils.isTrue(command.getIsDynamic()))
                dynCommands.add(OAWutils.cloneCommand(command));
            else
                commands.add(OAWutils.cloneCommand(command));
        }
    }
    //===============================================================
    //===============================================================
    private void setAttributeToPogoDeviceClass(EList<Attribute> attributes,
                                               EList<Attribute> dynAttributes,
                                               DefaultMutableTreeNode collectionNode) {
        for (int i = 0; i < collectionNode.getChildCount(); i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collectionNode.getChildAt(i);
            Attribute attribute = ((PogoAttribute) node.getUserObject()).value;

            //  For compatibility reason, verify polling_period
            if (attribute.getPolledPeriod()==null ||
                attribute.getPolledPeriod().length()==0) {
                attribute.setPolledPeriod("0");
            }

            if (Utils.isTrue(attribute.getIsDynamic()))
                dynAttributes.add(OAWutils.cloneAttribute(attribute));
            else
                attributes.add(OAWutils.cloneAttribute(attribute));
        }
    }
    //===============================================================
    //===============================================================
    private void setStateToPogoDeviceClass(EList<State> states, DefaultMutableTreeNode collecNode) {
        for (int i = 0; i < collecNode.getChildCount(); i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collecNode.getChildAt(i);
            State state = ((PogoState) node.getUserObject()).value;

            states.add(OAWutils.cloneState(state));
        }
    }
    //===============================================================
    //===============================================================
    private void setForwardedToPogoDeviceClass(EList<ForwardedAttribute> attributes, DefaultMutableTreeNode collecNode) {
        for (int i=0 ; i<collecNode.getChildCount() ; i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collecNode.getChildAt(i);
            ForwardedAttribute forwardedAttribute = ((PogoForwarded) node.getUserObject()).value;

            attributes.add(OAWutils.cloneForwardedAttribute(forwardedAttribute));
        }
    }
    //===============================================================
    //===============================================================
    private void setPipeToPogoDeviceClass(EList<Pipe> pipes, DefaultMutableTreeNode collecNode) {
        for (int i=0 ; i<collecNode.getChildCount() ; i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collecNode.getChildAt(i);
            Pipe pipe = ((PogoPipe) node.getUserObject()).value;

            pipes.add(OAWutils.clonePipe(pipe));
        }
    }
    //===============================================================
    //===============================================================
    boolean itemAlreadyExists(String name, int type) {
        List<Integer> collections = new ArrayList<>();
        if (type == COMMANDS)
            collections.add(COMMANDS);
        else
        if (type ==SCALAR_ATTRIBUTES || type ==SPECTRUM_ATTRIBUTES ||
                type ==IMAGE_ATTRIBUTES) {
            collections.add(SCALAR_ATTRIBUTES);
            collections.add(SPECTRUM_ATTRIBUTES);
            collections.add(IMAGE_ATTRIBUTES);
        } else
        if (type == PIPES)
            collections.add(PIPES);
         else
        if (type == STATES)
            collections.add(STATES);

        //	Collections not checked
        if (collections.size() == 0)
            return false;

        for (int col : collections) {
            DefaultMutableTreeNode selectedNode = getSelectedNode();
            //	Get the collection node
            DefaultMutableTreeNode collecNode = getCollectionNode(col);
            for (int i = 0; i < collecNode.getChildCount(); i++) {
                DefaultMutableTreeNode node =
                        (DefaultMutableTreeNode) collecNode.getChildAt(i);
                if (node.toString().equals(name))
                    if (node != selectedNode)    //	check if not edited one
                        return true;
            }
        }
        return false;
    }

    //===============================================================
    //===============================================================
    boolean propertyAlreadyExists(String name, boolean is_dev) {
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
                if (node != selectedNode)    //	check if not edited one
                    return true;
        }
        return false;
    }

    //===============================================================
    //===============================================================
    public void editStateMachine() {
        //  Check if a state machine can be defined.
        List<State>     vs = getAllStates();
        List<Attribute> va = getAllAttributes();
        List<Command>   vc = getAllCommands();
        if (vs.isEmpty()) {
            PogoException.popup(this, "There is no states defined !");
            return;
        }
        if (vc.isEmpty() && va.isEmpty()) {
            PogoException.popup(this, "There is no commands and no attributes defined !");
            return;
        }

        //  Then start a dialog to define it.
        StateMachineDialog dialog = new StateMachineDialog(parent, pogo_class);
        if (dialog.showDialog() == JOptionPane.OK_OPTION) {
            pogo_class = dialog.getPogoClass();
            setModified(true);
        }
    }

    //===============================================================
    //===============================================================
    private void summarize() {
        Object obj = getSelectedObject();
        if (obj instanceof PogoRoot) {
            new PopupHtml(parent).show(summarizeClass((PogoRoot) obj), 500, 600);
            /*
            JOptionPane.showMessageDialog(parent,
                    summarizeClass((PogoRoot) obj),
                    "information Window",
                    JOptionPane.INFORMATION_MESSAGE);
                    */
        } else if (obj.toString().indexOf("Properties") > 0) {
            boolean is_dev = obj.toString().startsWith("Device");
            List<Property> propertyList = getAllProperties(is_dev);
            PropertyDialog.popupSummary(parent, propertyList, is_dev);
        } else if (obj.toString().equals("Commands")) {
            List<Command> commandList = getAllCommands();
            CommandDialog.popupSummary(parent, commandList);
        } else if (obj.toString().indexOf("Attributes") > 0) {
            List<Attribute> attributeList = getAllAttributes();
            AttributeDialog.popupSummary(parent, attributeList);
        } else if (obj.toString().equals("Pipes")) {
            List<Pipe> pipeList = getAllPipes();
            PipeDialog.popupSummary(parent, pipeList);
        } else if (obj.toString().equals("States")) {
            List<State> stateList = getAllStates();
            StateDialog.popupSummary(parent, stateList);
        }
    }

    //===============================================================
    //===============================================================
    private String summarizeClass(PogoRoot _class) {
        //  Get nb properties, commands, attributes
        DefaultMutableTreeNode
                node = (DefaultMutableTreeNode) root.getChildAt(CLASS_PROPERTIES);
        int nb_class_prop = node.getChildCount();
        node = (DefaultMutableTreeNode) root.getChildAt(DEV_PROPERTIES);
        int nb_dev_prop = node.getChildCount();
        node = (DefaultMutableTreeNode) root.getChildAt(COMMANDS);
        int nb_cmd = node.getChildCount();

        node = (DefaultMutableTreeNode) root.getChildAt(SCALAR_ATTRIBUTES);
        int nb_scalars = node.getChildCount();
        node = (DefaultMutableTreeNode) root.getChildAt(SPECTRUM_ATTRIBUTES);
        int nb_spectra = node.getChildCount();
        node = (DefaultMutableTreeNode) root.getChildAt(IMAGE_ATTRIBUTES);
        int nb_images = node.getChildCount();
        node = (DefaultMutableTreeNode) root.getChildAt(FORWARDED_ATTRIBUTES);
        int nb_forwarded = node.getChildCount();
        node = (DefaultMutableTreeNode) root.getChildAt(PIPES);
        int nb_pipes = node.getChildCount();
        node = (DefaultMutableTreeNode) root.getChildAt(STATES);
        int nb_states = node.getChildCount();

        //  And build message to be returned
        StringBuilder sb = new StringBuilder(_class.toInfoString());
        sb.append("\n<br>\n");
        //  Properties and commands
        if (nb_class_prop > 0)
            sb.append("<li>").append(nb_class_prop).append(getCollectionName("Class property", nb_class_prop));
        if (nb_dev_prop > 0)
            sb.append("<li>").append(nb_dev_prop).append(getCollectionName("Device property", nb_dev_prop));
        if (nb_cmd > 0)
            sb.append("<li>").append(nb_cmd).append(getCollectionName("Command", nb_cmd));

        //  Attributes
        int nb_att = nb_scalars + nb_spectra + nb_images + nb_forwarded;
        if (nb_att > 0) {
            sb.append("<li>").append(nb_att).append(getCollectionName("Attribute", nb_att));
            sb.append("<ul>\n");
            if (nb_scalars > 0)
                sb.append("<li>").append(nb_scalars).append(getCollectionName("Scalar", nb_scalars));
            if (nb_spectra > 0)
                sb.append("<li>").append(nb_spectra).append(getCollectionName("Spectrum", nb_spectra));
            if (nb_images > 0)
                sb.append("<li>").append(nb_images).append(getCollectionName("Image", nb_images));
            //  Forwarded attributes
            if (nb_forwarded > 0)
                sb.append("<li>").append(nb_forwarded).append(getCollectionName("Forwarded", nb_forwarded));
            sb.append("</ul>\n");
        }

        //  Pipes and States
        if (nb_pipes > 0)
            sb.append("<li>").append(nb_pipes).append(getCollectionName("Pipe", nb_pipes));
        if (nb_states > 0)
            sb.append("<li>").append(nb_states).append(getCollectionName("State", nb_states));
        return sb.toString();
    }
    //===============================================================
    //===============================================================
    private String getCollectionName(String name, int nb) {
        String collectionName = name;
        if (nb>1) {
            //  Manage plural
            if (name.endsWith("y"))
                collectionName = name.substring(0, name.length() - 1) + "ies";
            else
            if (name.endsWith("um"))
                collectionName = name.substring(0, name.length() - 2) + "a";
            else
            if (!name.equalsIgnoreCase("forwarded"))
                collectionName = name + "s";
        }
        return " " + collectionName + "\n";
    }
    //===============================================================
    /**
     * @param is_dev true if device / false if class
     * @return a list with all properties
     */
    //===============================================================
    private List<Property> getAllProperties(boolean is_dev) {
        List<Property> vp = new ArrayList<>();
        DefaultMutableTreeNode collectionNode;

        if (is_dev)
            collectionNode = (DefaultMutableTreeNode) root.getChildAt(DEV_PROPERTIES);
        else
            collectionNode = (DefaultMutableTreeNode) root.getChildAt(CLASS_PROPERTIES);
        for (int i = 0; i < collectionNode.getChildCount(); i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collectionNode.getChildAt(i);
            PogoProperty pp = (PogoProperty) node.getUserObject();
            vp.add(pp.value);
        }
        return vp;
    }
    //===============================================================
    /**
     * @return a list with all Commands
     */
    //===============================================================
    private List<Command> getAllCommands() {
        List<Command> vc = new ArrayList<>();
        DefaultMutableTreeNode collectionNode =
                (DefaultMutableTreeNode) root.getChildAt(COMMANDS);
        for (int i = 0; i < collectionNode.getChildCount(); i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collectionNode.getChildAt(i);
            PogoCommand pc = (PogoCommand) node.getUserObject();
            vc.add(pc.value);
        }
        return vc;
    }
    //===============================================================
    /**
     * @return a list with all attributes
     */
    //===============================================================
    private List<Attribute> getAllAttributes() {
        List<Attribute> va = new ArrayList<>();
        DefaultMutableTreeNode collectionNode;

        collectionNode = (DefaultMutableTreeNode) root.getChildAt(SCALAR_ATTRIBUTES);
        for (int i = 0; i < collectionNode.getChildCount(); i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collectionNode.getChildAt(i);
            PogoAttribute pa = (PogoAttribute) node.getUserObject();
            va.add(pa.value);
        }
        collectionNode = (DefaultMutableTreeNode) root.getChildAt(SPECTRUM_ATTRIBUTES);
        for (int i = 0; i < collectionNode.getChildCount(); i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collectionNode.getChildAt(i);
            PogoAttribute pa = (PogoAttribute) node.getUserObject();
            va.add(pa.value);
        }
        collectionNode = (DefaultMutableTreeNode) root.getChildAt(IMAGE_ATTRIBUTES);
        for (int i = 0; i < collectionNode.getChildCount(); i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collectionNode.getChildAt(i);
            PogoAttribute pa = (PogoAttribute) node.getUserObject();
            va.add(pa.value);
        }

        return va;
    }
    //===============================================================
    /**
     * @return a list with all Pipes
     */
    //===============================================================
    private List<Pipe> getAllPipes() {
        List<Pipe> pipeList = new ArrayList<>();
        DefaultMutableTreeNode collectionNode =
                (DefaultMutableTreeNode) root.getChildAt(PIPES);
        for (int i=0 ; i<collectionNode.getChildCount() ; i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collectionNode.getChildAt(i);
            PogoPipe pogoPipe = (PogoPipe) node.getUserObject();
            pipeList.add(pogoPipe.value);
        }
        return pipeList;
    }
    //===============================================================
    /**
     * @return a list with all States
     */
    //===============================================================
    private List<State> getAllStates() {
        List<State> stateList = new ArrayList<>();
        DefaultMutableTreeNode collectionNode =
                (DefaultMutableTreeNode) root.getChildAt(STATES);
        for (int i=0 ; i<collectionNode.getChildCount() ; i++) {
            DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode) collectionNode.getChildAt(i);
            PogoState pogoState = (PogoState) node.getUserObject();
            stateList.add(pogoState.value);
        }
        return stateList;
    }

    //===============================================================
    //===============================================================
    String getClassFileName() {
        String path = ((PogoRoot) root.getUserObject()).path;
        if (path != null) {
            String filename = ((PogoRoot) root.getUserObject()).name + ".xmi";
            return path + "/" + filename;
        }
        return null;
    }
    //===============================================================
    //===============================================================


    //===============================================================
    /**
      *	PogoClass (root) object definition
      */
    //===============================================================
    class PogoRoot {
        private String name;
        private String description;
        private String title;
        private String language;
        private boolean usingPyHlPackage = false;
        private String path;
        private String license;
        private String copyright;
        private boolean isAbstract;
        private List<Inheritance> inheritances = new ArrayList<>();
        private ClassIdentification id;
        //===========================================================
        private PogoRoot(PogoDeviceClass pogo_class) {
            this.name = pogo_class.getName();
            this.description = pogo_class.getDescription().getDescription();
            this.title = pogo_class.getDescription().getTitle();
            this.language = pogo_class.getDescription().getLanguage();
            this.path = pogo_class.getDescription().getSourcePath();
            this.license = pogo_class.getDescription().getLicense();
			this.copyright = pogo_class.getDescription().getCopyright();
            this.isAbstract = DeviceClass.checkIfAbstractClass(pogo_class, false);
            this.id = pogo_class.getDescription().getIdentification();
            if (language.equals(strLang[PythonHL]) && pogo_class.getDescription().getFilestogenerate()!=null)
                usingPyHlPackage = pogo_class.getDescription().getFilestogenerate().toLowerCase().contains("package");
            inheritances.addAll(pogo_class.getDescription().getInheritances());
        }
        //===========================================================
        //===========================================================
        private String toInfoString() {
            String title = language + " Class :  " + name;
            if (isAbstract)
                title += "  (class is abstract !)";

            StringBuilder sb = new StringBuilder();
            if (path != null && path.length() > 0)
                sb.append("Read at:   ").append(path);

            sb.append("\nInherited from: ").append(inheritances.get(0).getClassname());
            if (!DeviceClass.isDefaultInheritance(inheritances.get(0)))
                sb.append("\nRead at:   ").append(inheritances.get(0).getSourcePath());
            else
                sb.append("  the default Tango device object.\n");
            sb.append("\nDescription:\n");
            sb.append(Utils.strReplace(description, "\\n", "\n")).append("\n");

            return Utils.buildToolTip(title, sb.toString());
        }
        //===========================================================
        public String toString() {
            return pogo_class.getName();
        }
        //===========================================================
    }

    //===============================================================
    //===============================================================
    private class PogoCollection {
        String name;
        ImageIcon icon;
        //===========================================================
        private PogoCollection(String name, ImageIcon icon) {
            this.name = name;
            this.icon = icon;
        }
        //===========================================================
        public String toString() {
            return name;
        }
        //===========================================================
    }

    //===============================================================
    /**
      *	PogoProperty object definition
      */
    //===============================================================
    private class PogoProperty {
        Property value;
        boolean is_dev;
        //===========================================================
        private PogoProperty(Property value, boolean is_dev) {
            this.value = value;
            this.is_dev = is_dev;
        }
        //===========================================================
        private String toInfoString() {
            String str = ((is_dev) ? "Device" : "Class") + " property:  " + value.getName();
            return Utils.buildToolTip(str, Utils.strReplace(value.getDescription(), "\\n", "\n"));
        }
        //===========================================================
        private void manageDisplay(TangoRenderer renderer) {
            InheritanceStatus status = value.getStatus();
            renderer.setIcon(inherit_utils.getIcon(status));
            renderer.setFont(inherit_utils.getLeafFont(status));
            if (status != null && status.getHasChanged() != null)
                renderer.setForeground(Color.red);
            else
                renderer.setForeground(Color.black);

            renderer.setToolTipText(toInfoString());
        }
        //===========================================================
        public String toString() {
            return value.getName();
        }
        //===========================================================
    }

    //===============================================================
    /**
     *	PogoAttribute object definition
     */
    //===============================================================
    private class PogoAttribute {
        Attribute value;
        int attType;
        //===========================================================
        private PogoAttribute(Attribute value) {
            this.value = value;
            if (Utils.isEquals(value.getAttType(), "Spectrum"))
                this.attType = SPECTRUM_ATTRIBUTES;
            else if (Utils.isEquals(value.getAttType(), "Image"))
                this.attType = IMAGE_ATTRIBUTES;
            else
                this.attType = SCALAR_ATTRIBUTES;
        }
        //===========================================================
        private String toInfoString() {
            String desc;
            if (value.getProperties() == null ||
                    value.getProperties().getDescription() == null ||
                    value.getProperties().getDescription().isEmpty())
                desc = "No Description.";
            else
                desc = Utils.strReplace(value.getProperties().getDescription(), "\\n", "\n");

            String s = "Attribute:  ";
            if (Utils.isTrue(value.getIsDynamic()))
                s = "Dynamic " + s;
            return Utils.buildToolTip(s + value.getName(), desc);
        }
        //===========================================================
        private void manageDisplay(TangoRenderer renderer) {
            InheritanceStatus status = value.getStatus();
            renderer.setIcon(inherit_utils.getIcon(status));
            renderer.setFont(inherit_utils.getLeafFont(status));
            if (status != null && Utils.isTrue(status.getHasChanged()))
                renderer.setForeground(Color.red);
            else if (Utils.isExpert(value))
                renderer.setForeground(Color.blue);
            else
                renderer.setForeground(Color.black);
            renderer.setToolTipText(toInfoString());
        }
        //===========================================================
        public String toString() {
            return value.getName();
        }
        //===========================================================
    }

    //===============================================================
    /**
     *	PogoCommand object definition
     */
    //===============================================================
    private class PogoCommand {
        Command value;
        //===========================================================
        private PogoCommand(Command value) {
            this.value = value;
        }
        //===========================================================
        private String toInfoString() {
            String desc = value.getDescription();
            if (desc != null && desc.length() > 0)
                desc = Utils.strReplace(desc, "\\n", "\n");
            else
                desc = "No Description.";
            String s = "Command:  ";
            if (Utils.isTrue(value.getIsDynamic()))
                s = "Dynamic " + s;
            return Utils.buildToolTip(s + value.getName(), desc);
        }
        //===========================================================
        private void manageDisplay(TangoRenderer renderer) {
            InheritanceStatus status = value.getStatus();
            renderer.setIcon(inherit_utils.getIcon(status));
            renderer.setFont(inherit_utils.getLeafFont(status));
            if (status != null && Utils.isTrue(status.getHasChanged()))
                renderer.setForeground(Color.red);
            else if (Utils.isExpert(value))
                renderer.setForeground(Color.blue);
            else
                renderer.setForeground(Color.black);
            renderer.setToolTipText(toInfoString());
        }
        //===========================================================
        public String toString() {
            return value.getName();
        }
        //===========================================================
    }

    //===============================================================
    /**
     *	PogoForwarded object definition
     */
    //===============================================================
    private class PogoForwarded {
        ForwardedAttribute value;
        //===========================================================
        private PogoForwarded(ForwardedAttribute value) {
            this.value = value;
        }
        //===========================================================
        private String toInfoString() {
            String label = value.getLabel();
            if (label != null && label.length() > 0)
                label = Utils.strReplace(label, "\\n", "\n");
            else
                label = "No Label.";
            return Utils.buildToolTip("Label:  " + value.getName(), label);
        }
        //===========================================================
        private void manageDisplay(TangoRenderer renderer) {

            InheritanceStatus status = value.getStatus();
            renderer.setIcon(inherit_utils.getIcon(status));
            renderer.setFont(inherit_utils.getLeafFont(status));
            if (status != null && status.getHasChanged() != null)
                renderer.setForeground(Color.red);
            else
                renderer.setForeground(Color.black);

            renderer.setToolTipText(toInfoString());
        }
        //===========================================================
        public String toString() {
            return value.getName();
        }
        //===========================================================
    }
    //===============================================================
    /**
     *	PogoProperty object definition
     */
    //===============================================================
    private class PogoPipe {
        Pipe value;
        //===========================================================
        private PogoPipe(Pipe value) {
            this.value = value;
        }
        //===========================================================
        private String toInfoString() {
            String str = "Pipe:  " + value.getName();

            return Utils.buildToolTip(str, Utils.strReplace(value.getDescription(), "\\n", "\n"));
        }
        //===========================================================
        private void manageDisplay(TangoRenderer renderer) {
            /* Do not manage pipe inheritance until now. */
            renderer.setIcon(Utils.getInstance().overloadedIcon);
            renderer.setFont(PogoConst.leafFont_concrete);
            renderer.setToolTipText(toInfoString());
        }
        //===========================================================
        public String toString() {
            return value.getName();
        }
        //===========================================================
    }

    //===============================================================
    /**
     *	PogoState object definition
     */
    //===============================================================
    private class PogoState {
        State value;

        //===========================================================
        private PogoState(State value) {
            this.value = value;
        }
        //===========================================================
        private String toInfoString() {
            String desc = value.getDescription();
            if (desc != null && desc.length() > 0)
                desc = Utils.strReplace(desc, "\\n", "\n");
            else
                desc = "No Description.";
            return Utils.buildToolTip("State:  " + value.getName(), desc);
        }
        //===========================================================
        private void manageDisplay(TangoRenderer renderer) {
            InheritanceStatus status = value.getStatus();
            renderer.setIcon(inherit_utils.getIcon(status));
            renderer.setFont(inherit_utils.getLeafFont(status));
            if (status != null && status.getHasChanged() != null)
                renderer.setForeground(Color.red);
            else
                renderer.setForeground(Color.black);
            renderer.setToolTipText(toInfoString());
        }
        //===========================================================
        public String toString() {
            return value.getName();
        }
        //===========================================================
    }
    //===============================================================
    //===============================================================


    //===============================================================
    /**
     * Renderer Class
     */
    //===============================================================
    private class TangoRenderer extends DefaultTreeCellRenderer {
        //===============================================================
        //===============================================================
        public TangoRenderer() {
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

            Utils utils = Utils.getInstance();

            setBackgroundNonSelectionColor(background);
            setForeground(Color.black);
            setBackgroundSelectionColor(Color.lightGray);

            DefaultMutableTreeNode node = (DefaultMutableTreeNode) obj;
            Object userObject = node.getUserObject();
            if (row == 0) {
                //	ROOT
                PogoRoot pr = (PogoRoot) userObject;
                if (pr.isAbstract)
                    setFont(rootFont_abstract);
                else
                    setFont(rootFont_concrete);
                setIcon(utils.rootIcon);
                setToolTipText(pr.toInfoString());
            } else {
                if (userObject instanceof PogoProperty) {
                    ((PogoProperty) userObject).manageDisplay(this);
                }
                else if (userObject instanceof PogoCommand) {
                    ((PogoCommand) userObject).manageDisplay(this);
                    if (Utils.isTrue(((PogoCommand) userObject).value.getIsDynamic())) {
                        setBackgroundNonSelectionColor(dynamicBG);
                    }
                }
                else if (userObject instanceof PogoAttribute) {
                    ((PogoAttribute) userObject).manageDisplay(this);
                    if (Utils.isTrue(((PogoAttribute) userObject).value.getIsDynamic())) {
                        setBackgroundNonSelectionColor(dynamicBG);
                    }
                }
                else if (userObject instanceof PogoForwarded) {
                    ((PogoForwarded) userObject).manageDisplay(this);
                }
                else if (userObject instanceof PogoPipe) {
                    ((PogoPipe) userObject).manageDisplay(this);
                }
                else if (userObject instanceof PogoState) {
                    // ToDo
                    PogoState state = (PogoState) userObject;
                    state.manageDisplay(this);
                    setBackgroundNonSelectionColor(Utils.getColor4State(state.toString()));
                    setForeground(Utils.getForeground4State(state.toString()));
                }
                else if (userObject instanceof PogoCollection) {
                    setFont(collecFont);
                    setIcon(((PogoCollection) userObject).icon);
                    setToolTipText(null);
                }
            }
            return this;
        }
    }//	End of Renderer Class

    //==============================================================================
    //==============================================================================





    //==============================================================================
    /**
     * Tree popup menu definition
     */
    //==============================================================================
    static private final int EDIT_CLASS    = 0;
    static private final int ADD_ITEM      = 1;
    static private final int ADD_DYN_ITEM  = 2;
    static private final int ADD_FW_ATTR   = 3;
    static private final int PASTE_ITEM    = 4;
    static private final int SORT_ITEM     = 5;
    static private final int SUMMARIZE     = 6;
    static private final int EDIT_ITEM     = 7;
    static private final int COPY_ITEM     = 8;
    static private final int CLONE_ITEM    = 9;
    static private final int CLONE_PROPERTY_AS = 10;
    static private final int REMOVE_ITEM   = 11;
    static private final int EDIT_SRC_CODE = 12;
    static private final int OFFSET = 2;    //	Label And separator

    static private String[] menuLabels = {
            "Edit Class",

            //  Collection menu
            "Add Item",
            "Add Dynamic Item",
            "Add Forwarded Attribute",
            "Paste",
            "Sort Item",
            "Summarize",

            //  Item menu
            "Edit Item",
            "Copy",
            "Clone  Item",
            "Clone  as Item",
            "Remove Item",
            "Edit Source Code"
    };

    private class ClassTreePopupMenu extends JPopupMenu {
        private JTree tree;
        private JLabel title;

        private ClassTreePopupMenu(JTree tree) {
            this.tree = tree;
            title = new JLabel();
            title.setFont(new java.awt.Font("Dialog", Font.BOLD, 16));
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
        private void manageCloneAs(Object item) {
            if (item instanceof PogoProperty) {
                PogoProperty pogoProperty = (PogoProperty) item;
                //  Get source and target
                String targetText;
                DefaultMutableTreeNode targetNode;
                if (pogoProperty.is_dev) {
                    targetNode = ((DefaultMutableTreeNode) root.getChildAt(CLASS_PROPERTIES));
                    targetText = "Clone as class property";
                }
                else {
                    targetNode = ((DefaultMutableTreeNode) root.getChildAt(DEV_PROPERTIES));
                    targetText = "Clone as device property";
                }
                //  Check if item already exists in target collection
                for (int i = 0 ; i<targetNode.getChildCount() ; i++) {
                    if (targetNode.getChildAt(i).toString().equalsIgnoreCase(item.toString()))
                        return; //  Exists. Do nothing
                }

                ((JMenuItem) getComponent(OFFSET + CLONE_PROPERTY_AS)).setText(targetText);
                getComponent(OFFSET + CLONE_PROPERTY_AS).setVisible(true);
            }
            //  Else (not a property) do nothing
        }
        //======================================================
        private void manageItemMenu(String itemName) {
            for (int i = OFFSET; i < this.getComponentCount(); i++) {
                Component component = getComponent(i);
                if (component instanceof JMenuItem) {
                    String text = menuLabels[i - OFFSET];
                    int pos = text.indexOf("Item");
                    if (pos > 0)
                        text = text.substring(0, pos) + itemName +
                                text.substring(pos + "Item".length());
                    ((JMenuItem) component).setText(text);
                }
            }
        }
        //======================================================
        /**
         * Show menu on root
         *
         * @param evt  the mouse event
         * @param root The root object containing class
         */
        //======================================================
        public void showMenu(MouseEvent evt, PogoRoot root) {
            //	Set selection at mouse position
            TreePath selectedPath =
                    tree.getPathForLocation(evt.getX(), evt.getY());
            if (selectedPath == null)
                return;
            tree.setSelectionPath(selectedPath);

            title.setText("Class " + root.name);

            //	Reset all items
            for (int i = 0; i < menuLabels.length; i++)
                getComponent(OFFSET + i).setVisible(false);

            //noinspection PointlessArithmeticExpression
            getComponent(OFFSET + EDIT_CLASS).setVisible(true);
            getComponent(OFFSET + SUMMARIZE).setVisible(true);
            show(tree, evt.getX(), evt.getY());
        }
        //======================================================
        /**
         * Show menu on Collection
         *
         * @param evt    the mouse event
         * @param collection The collection object
         */
        //======================================================
        public void showMenu(MouseEvent evt, PogoCollection collection) {
            //	Set selection at mouse position
            TreePath selectedPath =
                    tree.getPathForLocation(evt.getX(), evt.getY());
            if (selectedPath == null)
                return;
            tree.setSelectionPath(selectedPath);

            manageItemMenu(collection.toString());
            title.setText(collection.toString());

            //	Reset all items
            for (int i = 0; i < menuLabels.length; i++)
                getComponent(OFFSET + i).setVisible(false);

            getComponent(OFFSET + ADD_ITEM).setVisible(!collection.name.contains("Forwarded"));
            getComponent(OFFSET + ADD_DYN_ITEM).setVisible(!collection.name.contains("Forwarded") &&
                    (collection.name.contains("Attribute") || collection.name.contains("Command")));
            getComponent(OFFSET + ADD_FW_ATTR).setVisible(collection.name.contains("Forwarded"));
            getComponent(OFFSET + PASTE_ITEM).setVisible(canPaste());
            getComponent(OFFSET + SORT_ITEM).setVisible(true);
            getComponent(OFFSET + SUMMARIZE).setVisible(true);
            show(tree, evt.getX(), evt.getY());
        }
        //======================================================
        /**
         * Show menu on item (Property, Command, Attribute..)
         *
         * @param evt    the mouse event
         * @param obj    The object itself
         * @param collectionName The collection name
         */
        //======================================================
        public void showMenu(MouseEvent evt, Object obj, String collectionName) {
            //	Set selection at mouse position
            TreePath selectedPath =
                    tree.getPathForLocation(evt.getX(), evt.getY());
            if (selectedPath == null)
                return;
            tree.setSelectionPath(selectedPath);

            manageItemMenu(obj.toString());
            title.setText(collectionName);

            //	Reset all items
            for (int i = 0; i < menuLabels.length; i++)
                getComponent(OFFSET + i).setVisible(false);

            getComponent(OFFSET + EDIT_ITEM).setVisible(true);
            getComponent(OFFSET + COPY_ITEM).setVisible(true);
            getComponent(OFFSET + CLONE_ITEM).setVisible(true);
            getComponent(OFFSET + REMOVE_ITEM).setVisible(true);
            ((JMenuItem) getComponent(OFFSET + EDIT_ITEM)).setText("Edit " + obj.toString());
            getComponent(OFFSET + EDIT_SRC_CODE).setVisible(true);
            boolean edit_code = false;
            if (obj instanceof PogoProperty)
                edit_code = Utils.isTrue(((PogoProperty) obj).value.getStatus().getConcreteHere());
            else if (obj instanceof PogoCommand)
                edit_code = Utils.isTrue(((PogoCommand) obj).value.getStatus().getConcreteHere());
            else if (obj instanceof PogoAttribute)
                edit_code = Utils.isTrue(((PogoAttribute) obj).value.getStatus().getConcreteHere());
            else if (obj instanceof PogoForwarded)
                edit_code = Utils.isTrue(((PogoForwarded) obj).value.getStatus().getConcreteHere());
            else if (obj instanceof PogoPipe)
                edit_code = true;
            else if (obj instanceof PogoState)
                edit_code = Utils.isTrue(((PogoState) obj).value.getStatus().getConcreteHere());

            getComponent(OFFSET + EDIT_SRC_CODE).setEnabled(edit_code);
            manageCloneAs(obj);
            show(tree, evt.getX(), evt.getY());
        }

        //======================================================
        private void menuActionPerformed(ActionEvent evt) {
            //	Check component source
            Object obj = evt.getSource();
            int itemIndex = 0;
            for (int i = 0; i < menuLabels.length; i++)
                if (getComponent(OFFSET + i) == obj)
                    itemIndex = i;

            switch (itemIndex) {
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
                case ADD_FW_ATTR:
                    addItem(false);
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
                case CLONE_PROPERTY_AS:
                    clonePropertyAs();
                    break;
                case REMOVE_ITEM:
                    removeSelectedItem();
                    break;
                case EDIT_SRC_CODE:
                    editSourceCode();
                    break;
            }
        }
    }
    //======================================================
    /**
     * MyCompare class to sort collection
     */
    //======================================================
    class NodeComparator implements Comparator<DefaultMutableTreeNode> {
        public int compare(DefaultMutableTreeNode node1, DefaultMutableTreeNode node2) {
            if (node1.toString().equals("State") ||
                    node1.toString().equals("Status"))
                return -1;
            if (node2.toString().equals("State") ||
                    node2.toString().equals("Status"))
                return -1;
            return node1.toString().compareTo(node2.toString());
        }
    }
}
