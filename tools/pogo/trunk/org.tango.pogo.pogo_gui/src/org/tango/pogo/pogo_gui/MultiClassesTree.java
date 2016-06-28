//+======================================================================
// $Source:  $
//
// Project:   Tango
//
// Description:	java source code for display JTree
//
// $Author: pascal_verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013,2014
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

import fr.esrf.tango.pogo.pogoDsl.*;
import org.eclipse.emf.common.util.EList;
import org.tango.pogo.pogo_gui.packaging.PackUtils;
import org.tango.pogo.pogo_gui.tools.*;

import javax.swing.*;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class MultiClassesTree extends JTree {
    private DefaultMutableTreeNode root;
    private DefaultTreeModel treeModel;
    private MultiClassesTreePopupMenu menu;
    private JFrame parent;
    private EditClasses editedClasses = new EditClasses();
    private boolean modified = false;
    private LoadedClasses loadedClasses = new LoadedClasses();
    private static JFileChooser chooser = null;
    private static final Color background = Color.white;

    //===============================================================
    //===============================================================
    public MultiClassesTree(JFrame parent, PogoMultiClasses multiClasses) throws PogoException {
        super();
        this.parent = parent;

        initComponents();
        buildTree(new TangoServer(multiClasses));
        createClassNodes(root, multiClasses.getClasses());
        expandChildren(root);
        setSelectionPath(null);
    }

    //===============================================================
    //===============================================================
    public MultiClassesTree(JFrame parent, TangoServer server) throws PogoException {
        super();
        this.parent = parent;

        initComponents();
        buildTree(server);
    }

    //===============================================================
    //===============================================================
    private void initComponents() {
        String homeDir = System.getenv("SOURCE_PATH");
        if (homeDir == null) {
            homeDir = System.getProperty("SOURCE_PATH");
            if (homeDir == null)
                homeDir = new File("").getAbsolutePath();
        }
        chooser = new JFileChooser(new File(homeDir).getAbsolutePath());
        chooser.setFileFilter(PogoGUI.pogo6Filter);
        chooser.setFileFilter(PogoGUI.pogoFilter);
        menu = new MultiClassesTreePopupMenu(this);
        setBackground(background);
    }

    //===============================================================
    //===============================================================
    private void buildTree(TangoServer server) throws PogoException {
        //  Create the nodes.
        root = new DefaultMutableTreeNode(server);

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

        //	Listen for collapse tree
        addTreeExpansionListener(new TreeExpansionListener() {
            public void treeCollapsed(TreeExpansionEvent e) {
                //collapsedPerformed(e);
            }

            public void treeExpanded(TreeExpansionEvent e) {
                //expandedPerformed(e);
            }
        });
        //	Add Action listener
        addMouseListener(new java.awt.event.MouseAdapter() {
            /*
               public void mousePressed (java.awt.event.MouseEvent evt) {
                   treeMousePressed (evt);		//	for Drag
               }
               public void mouseReleased (java.awt.event.MouseEvent evt) {
                   treeMouseReleased (evt);	//	for Drop
               }
           */
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeMouseClicked(evt);    //	for tree clicked, menu,...
            }
        });
    }
    //======================================================
    /**
     * Manage event on clicked mouse on JTree object.
     *
     * @param evt the mouse event
     */
    //======================================================
    private void treeMouseClicked(java.awt.event.MouseEvent evt) {
        //	Set selection at mouse position
        TreePath selectedPath = getPathForLocation(evt.getX(), evt.getY());
        if (selectedPath == null)
            return;

        DefaultMutableTreeNode node =
                (DefaultMutableTreeNode) selectedPath.getPathComponent(selectedPath.getPathCount() - 1);
        Object o = node.getUserObject();
        int mask = evt.getModifiers();

        //  Check button clicked
        //noinspection StatementWithEmptyBody
        if (evt.getClickCount() == 2 && (mask & MouseEvent.BUTTON1_MASK) != 0) {
        } else if ((mask & MouseEvent.BUTTON3_MASK) != 0) {
            if (node == root)
                menu.showMenu(evt, (TangoServer) o);
            else if (o instanceof DeviceClass)
                menu.showMenu(evt, (DeviceClass) o);
        }
    }
    //===============================================================
    //===============================================================
    private DeviceClass loadDeviceClass(OneClassSimpleDef simpleClass) throws PogoException {
        String xmiFileName = simpleClass.getSourcePath() + "/" + simpleClass.getClassname();
        if (Utils.isTrue(simpleClass.getPogo6()))
            xmiFileName += ".h";
        else
            xmiFileName += ".xmi";
        DeviceClass deviceClass = null;

        File xmiFile = new File(xmiFileName);
        while (deviceClass == null) {
            try {
                if (xmiFile.exists()==false) {
                    //  Check with relative path converted as absolute one
                    //  Get multi classes file as reference
                    TangoServer server = (TangoServer) root.getUserObject();
                    String serverPath = server.sourcePath;
                    String absolute = Utils.getAbsolutePath(xmiFileName, serverPath);
                    xmiFile = new File(absolute);
                    if (xmiFile.exists()==false)
                        throw new PogoException("No such file: " + xmiFileName);
                }
                deviceClass = loadedClasses.getDeviceClass(xmiFile.getAbsolutePath());
                if (!deviceClass.getPogoDeviceClass().getName().equals(simpleClass.getClassname()))
                    throw new PogoException(simpleClass.getClassname() + " file expected !");
            } catch (PogoException e) {
                e.popup(this);

                //  Display chooser to select a new path
                chooser.setDialogTitle("Class: " + simpleClass.getClassname() + " ?");
                if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                    xmiFile = chooser.getSelectedFile();
                } else
                    throw new PogoException("Canceled");
            }
        }
        return deviceClass;
    }

    //===============================================================
    //===============================================================
    private void createClassNodes(DefaultMutableTreeNode parentNode, EList<OneClassSimpleDef> classes)
            throws PogoException {
        String parentName = (parentNode == root) ? "root" : parentNode.toString();
        for (OneClassSimpleDef _class : classes) {
            EList<String> parentClasses = _class.getParentClasses();
            if (parentClasses.size() == 0)
                parentClasses.add("root");
            for (String parentClass : parentClasses) {
                if (parentClass.equals(parentName)) {
                    DeviceClass deviceClass = loadDeviceClass(_class);
                    DefaultMutableTreeNode node =
                            new DefaultMutableTreeNode(deviceClass);
                    parentNode.add(node);

                    createClassNodes(node, classes);
                }
            }
        }
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
        List<DefaultMutableTreeNode> v = new ArrayList<>();
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
    private void editSelectedClass() {
        Object obj = getSelectedObject();
        if (obj instanceof DeviceClass) {
            try {
                editedClasses.addClass((DeviceClass) obj);
            } catch (PogoException e) {
                e.popup(this);
            }
        }
    }

    //===============================================================
    //===============================================================
    boolean allEditorsAreClosed() {
        return editedClasses.everythingClosed();
    }

    //===============================================================
    //===============================================================
    private void editServer() {
        TangoServer server = (TangoServer) root.getUserObject();
        ServerDialog serverDialog = new ServerDialog(parent, server);
        if (serverDialog.showDialog() == JOptionPane.OK_OPTION)
            setModified(true);
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
    }

    //===============================================================
    //===============================================================
    public boolean isANodeSelected() {
        return (getSelectedNode() != null);
    }

    //===============================================================
    //===============================================================
    public boolean isAClassSelected() {
        Object obj = getSelectedObject();
        return (obj instanceof DeviceClass);
    }

    //===============================================================
    //===============================================================
    public void addClass() {
        try {
            //  Display chooser to select a new path
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                DeviceClass deviceClass = loadedClasses.getDeviceClass(file.getAbsolutePath());
                //  Check if C++ class.
                String language =
                        deviceClass.getPogoDeviceClass().getDescription().getLanguage();
                if (language.toLowerCase().equals("cpp")) {
                    DefaultMutableTreeNode parentNode = getSelectedNode();
                    DefaultMutableTreeNode node = new DefaultMutableTreeNode(deviceClass);
                    treeModel.insertNodeInto(node, parentNode, parentNode.getChildCount());
                    setModified(true);
                    expandChildren(parentNode);
                } else
                    throw new PogoException(language +
                            " classes are not supported by multi classes manager !");
            }
        } catch (PogoException e) {
            e.popup(this);
        }
    }

    //===============================================================
    //===============================================================
    public void removeClass() {
        DefaultMutableTreeNode node = getSelectedNode();
        if (JOptionPane.showConfirmDialog(this,
                "Remove " + node.getUserObject() + " class  ?",
                "Confirmation Window",
                JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
            treeModel.removeNodeFromParent(node);
            setModified(true);
        }
    }
    //===============================================================
    //===============================================================
    public void moveNode(boolean up) {
        DefaultMutableTreeNode node = getSelectedNode();
        DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) node.getParent();
        int pos = 0;
        for (int i = 0; i < parentNode.getChildCount(); i++)
            if (parentNode.getChildAt(i).equals(node))
                pos = i;

        //	get position min and max (special case for commands state and status)
        int pos_min = 0;
        int pos_max = parentNode.getChildCount() - 1;
        if (up) {
            //	MOve Up
            if (pos > pos_min) {
                treeModel.removeNodeFromParent(node);
                treeModel.insertNodeInto(node, parentNode, pos - 1);
                setModified(true);
            }
        } else {
            //	Move Down
            if (pos < pos_max) {
                treeModel.removeNodeFromParent(node);
                treeModel.insertNodeInto(node, parentNode, pos + 1);
                setModified(true);
            }
        }
    }

    //===============================================================
    //===============================================================
    public boolean pasteAvailable() {
        return (isANodeSelected() && copiedClass != null);
    }

    //===============================================================
    //===============================================================
    public void copySelectedClass() {
        Object obj = getSelectedObject();
        if (obj instanceof DeviceClass)
            copiedClass = (DeviceClass) obj;
    }

    //===============================================================
    //===============================================================
    public void pasteClass() {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(copiedClass);
        DefaultMutableTreeNode parentNode = getSelectedNode();
        treeModel.insertNodeInto(node, parentNode, parentNode.getChildCount());
        setModified(true);
        expandChildren(parentNode);
    }

    //===============================================================
    //===============================================================
    private List<DeviceClass> getClasses(DefaultMutableTreeNode node) {
        List<DeviceClass> classes = new ArrayList<>();
        for (int i = 0; i < node.getChildCount(); i++) {
            DefaultMutableTreeNode childNode =
                    (DefaultMutableTreeNode) node.getChildAt(i);
            DeviceClass _class = (DeviceClass) childNode.getUserObject();
            classes.add(_class);
            if (node != root) {
                _class.addParentClass(node.getUserObject().toString());
            }

            List<DeviceClass> children = getClasses(childNode);
            for (DeviceClass child : children)
                classes.add(child);
        }
        return classes;
    }

    //===============================================================
    //===============================================================
    public String getServerFileName() {
        TangoServer server = (TangoServer) root.getUserObject();
        if (server.sourcePath != null)
            return server.sourcePath + "/" + server.name + ".multi.xmi";
        else
            return null;
    }

    //===============================================================
    //===============================================================
    public String getAuthor() {
        if (loadedClasses.isEmpty())
            return "? ? ?";
        else {
            //  Return the any class author name
            return PackUtils.buildMailAddress(loadedClasses.getAny().getPogoDeviceClass().getDescription());
        }
    }

    //===============================================================
    //===============================================================
    public PogoMultiClasses getServer() {
        loadedClasses.resetParentClasses();
        TangoServer server = (TangoServer) root.getUserObject();

        //  Get all classes from JTree objects
        List<DeviceClass> classes = getClasses(root);
        List<DeviceClass> pogoClasses = new ArrayList<>();

        //  Check to have class only once.
        //  Start by the end to be sure the leaves are at the end.
        for (int i = classes.size() - 1; i >= 0; i--) {
            DeviceClass _class = classes.get(i);
            //  Check if already in final vector
            boolean exists = false;
            String name = _class.getPogoDeviceClass().getName();
            for (DeviceClass pogoClass : pogoClasses) {
                if (pogoClass.getPogoDeviceClass().getName().equals(name)) {
                    exists = true;
                }
            }

            if (!exists) {
                pogoClasses.add(0, _class);
            }

        }
        for (DeviceClass pc : pogoClasses) {
            System.out.println(pc.getPogoDeviceClass().getName());
        }

        PogoMultiClasses multiClasses = buildPogoMultiClassesObject(server.name, pogoClasses);
        multiClasses.setName(server.name);
        multiClasses.setDescription(server.description);
        multiClasses.setSourcePath(server.sourcePath);
        return multiClasses;
    }

    //========================================================================
    //========================================================================
    private PogoMultiClasses buildPogoMultiClassesObject(String name, List<DeviceClass> classes) {
        //  Build Multi classes object
        PogoMultiClasses multiClasses = OAWutils.factory.createPogoMultiClasses();
        multiClasses.setName(name);

        //  copy preferences for Makefile environment
        Preferences pref = OAWutils.factory.createPreferences();
        pref.setMakefileHome(PogoProperty.makefileHome);
        multiClasses.setPreferences(pref);

        EList<OneClassSimpleDef> definitions = multiClasses.getClasses();
        for (DeviceClass devClass : classes) {

            PogoDeviceClass pogoClass = devClass.getPogoDeviceClass();

            //  Convert to simple class def
            OneClassSimpleDef simple = OAWutils.factory.createOneClassSimpleDef();
            simple.setClassname(pogoClass.getName());
            simple.setSourcePath(pogoClass.getDescription().getSourcePath());
            for (String parentClass : devClass.getParentClasses()) {
                simple.getParentClasses().add(parentClass);
            }
            //  Check if dynamic attributes
            // ToDo
            if (Utils.getPogoGuiRevision() >= 8.1) {
                if (pogoClass.getDynamicAttributes().size()>0 ||
					pogoClass.getDynamicCommands().size()>0) {
                    simple.setHasDynamic("true");
                }
            }

            if (devClass.isOldPogoModel())
                simple.setPogo6("true");
            definitions.add(simple);

            //  Copy inheritances
            EList<Inheritance> multiInheritances = simple.getInheritances();
            EList<Inheritance> monoInheritances = pogoClass.getDescription().getInheritances();
            for (Inheritance monoInheritance : monoInheritances) {
                Inheritance multiInheritance = OAWutils.factory.createInheritance();
                multiInheritance.setClassname(monoInheritance.getClassname());
                multiInheritance.setSourcePath(monoInheritance.getSourcePath());
                multiInheritances.add(multiInheritance);
            }
            //  Copy additional files
            EList<AdditionalFile> multiAdditional = simple.getAdditionalFiles();
            EList<AdditionalFile> monoAdditional = pogoClass.getAdditionalFiles();
            for (AdditionalFile monoFile : monoAdditional) {
                multiAdditional.add(OAWutils.cloneAdditionalFile(monoFile));
            }
        }

        return multiClasses;
    }

    //===============================================================
    //===============================================================
    public String getName() {
        return root.getUserObject().toString();
    }
    //===============================================================
    //===============================================================


    //===============================================================
    /**
     * A cache of DeviceClasses.
     */
    //===============================================================
    private static class LoadedClasses {
        private final Map<String, DeviceClass> deviceClasses = new HashMap<>();

        DeviceClass getAny() {
            return deviceClasses.values().iterator().next();
        }

        boolean isEmpty() {
            return deviceClasses.size() == 0;
        }

        //===========================================================
        DeviceClass getDeviceClass(String xmiFileName) throws PogoException {
            DeviceClass result = deviceClasses.get(xmiFileName);
            if (result == null) deviceClasses.put(xmiFileName, result = new DeviceClass(xmiFileName));
            return result;
        }

        //===========================================================
        void resetParentClasses() {
            for (DeviceClass dc : deviceClasses.values()) {
                dc.resetParentClasses();
            }
        }
        //===========================================================
    }
    //===============================================================
    //===============================================================


    //===============================================================

    /**
     * A class to manage  PogoGUI instances.
     */
    //===============================================================
    private class EditClasses extends ArrayList<PogoGUI> {
        //===========================================================
        private void addClass(DeviceClass _class) throws PogoException {
            for (PogoGUI pogo : this) {
                if (pogo.getMainClassName().equals(_class.toString())) {
                    pogo.setVisible(true);
                    return;
                }
            }
            add(new PogoGUI(_class, false));
            //  Check if first to set position
            if (size() == 1) {
                Point p = parent.getLocation();
                p.x += parent.getWidth();
                p.y -= 50;
                get(0).setLocation(p);
            }
        }

        //===========================================================
        private boolean everythingClosed() {
            for (PogoGUI pogo : this) {
                if (pogo.isVisible())
                    return false;
            }
            return true;
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
        private Font[] fonts;

        private final int TITLE = 0;
        private final int CLASS = 1;
        private ImageIcon class_icon = Utils.getInstance().getIcon("TangoClass.gif", 0.17);

        //===============================================================
        //===============================================================
        public TangoRenderer() {
            fonts = new Font[CLASS + 1];
            fonts[TITLE] = new Font("Dialog", Font.BOLD, 18);
            fonts[CLASS] = new Font("Dialog", Font.BOLD, 14);
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

            setBackgroundNonSelectionColor(background);
            setForeground(Color.black);
            setBackgroundSelectionColor(Color.lightGray);
            if (row == 0) {
                //	ROOT
                setFont(fonts[TITLE]);
                setIcon(Utils.getInstance().rootIcon);
            } else {
                setFont(fonts[CLASS]);
                setIcon(class_icon);
            }
            return this;
        }
    }//	End of Renderer Class
    //===============================================================
    //===============================================================


    private DeviceClass copiedClass = null;
    //==============================================================================
    //==============================================================================
    static private final int EDIT_SERVER = 0;
    static private final int EDIT_CLASS = 1;
    static private final int ADD_CLASS = 2;
    static private final int COPY_CLASS = 3;
    static private final int PASTE_CLASS = 4;
    static private final int REMOVE_CLASS = 5;
    static private final int MOVE_UP   = 6;
    static private final int MOVE_DOWN = 7;
    static private final int OFFSET = 2;    //	Label And separator

    static private String[] menuLabels = {
            "Edit Server",
            "Edit class",
            "Add  class",
            "Copy  class",
            "Paste class",
            "Remove class",
            "Move up",
            "Move down",
    };

    private class MultiClassesTreePopupMenu extends JPopupMenu {
        private JTree tree;
        private JLabel title;

        private MultiClassesTreePopupMenu(JTree tree) {
            this.tree = tree;
            buildBtnPopupMenu();
        }
        //=======================================================

        /**
         * Create a Popup menu for host control
         */
        //=======================================================
        private void buildBtnPopupMenu() {
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
                            hostActionPerformed(evt);
                        }
                    });
                    add(btn);
                }
            }
        }

        //======================================================
        /*
           *	Show menu on root
           */
        //======================================================
        public void showMenu(MouseEvent evt, TangoServer pmc) {
            //	Set selection at mouse position
            TreePath selectedPath =
                    tree.getPathForLocation(evt.getX(), evt.getY());
            if (selectedPath == null)
                return;
            tree.setSelectionPath(selectedPath);

            title.setText(pmc.toString());

            //	Reset all items
            for (int i = 0; i < menuLabels.length; i++)
                getComponent(OFFSET + i).setVisible(false);

            getComponent(OFFSET/*+ROOT_OPTION*/).setVisible(true);
            getComponent(OFFSET + ADD_CLASS).setVisible(true);
            getComponent(OFFSET + PASTE_CLASS).setVisible(pasteAvailable());
            show(tree, evt.getX(), evt.getY());
        }

        //======================================================
        /*
           *	Show menu on Collection
           */
        //======================================================
        public void showMenu(MouseEvent evt, DeviceClass collec) {
            //	Set selection at mouse position
            TreePath selectedPath =
                    tree.getPathForLocation(evt.getX(), evt.getY());
            if (selectedPath == null)
                return;
            tree.setSelectionPath(selectedPath);

            title.setText(collec.toString());

            //	Reset all items
            for (int i = 0; i < menuLabels.length; i++)
                getComponent(OFFSET + i).setVisible(true);

            getComponent(OFFSET + PASTE_CLASS).setVisible(pasteAvailable());
            show(tree, evt.getX(), evt.getY());
        }

        //======================================================
        //======================================================
        private void hostActionPerformed(ActionEvent evt) {
            //	Check component source
            Object obj = evt.getSource();
            int cmdidx = 0;
            for (int i = 0; i < menuLabels.length; i++)
                if (getComponent(OFFSET + i) == obj)
                    cmdidx = i;

            switch (cmdidx) {
                case EDIT_SERVER:
                    editServer();
                    break;
                case EDIT_CLASS:
                    editSelectedClass();
                    break;
                case ADD_CLASS:
                    addClass();
                    break;
                case COPY_CLASS:
                    copySelectedClass();
                    break;
                case PASTE_CLASS:
                    pasteClass();
                    break;
                case REMOVE_CLASS:
                    removeClass();
                    break;
                case MOVE_UP:
                    moveNode(true);
                    break;
                case MOVE_DOWN:
                    moveNode(false);
                    break;
            }
        }
    }
}
