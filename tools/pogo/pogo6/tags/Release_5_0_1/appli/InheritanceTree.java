//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the InheritanceTree class definition .
//
// $Author$
//
// $Revision$
//
// $Log$
// Revision 3.1  2006/11/14 14:08:01  pascal_verdier
// Inheritance tree added.
//
//
// Copyleft 2005 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.appli;


/** 
 *	This class is able to represent hiheritance of a TANGO server
 *	in a tree lookin
 *
 * @author  verdier
 */

import pogo.gene.PogoClass;
import pogo.gene.PogoDefs;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;


public class  InheritanceTree extends JTree
{
    private DefaultMutableTreeNode	root = null;
//====================================================
//====================================================
    InheritanceTree()
    {

    }
//====================================================
//====================================================
    void updateInheritance(PogoClass server)
    {
        if (root!=null)
            root.removeAllChildren();

        int	cnt = 2;
        //	Create the default tree
        root = new DefaultMutableTreeNode("Tango:DeviceImpl");

        DefaultMutableTreeNode	node;
        if (server.inherited_from!=null &&
           !server.inherited_from.equals(PogoDefs.tangoDeviceImpl))
        {
            //  add abstract class if any
            node = new DefaultMutableTreeNode(
				new AbstractClass(server.inherited_from));
            root.add(node);
			cnt++;
        }
        else
            node = root;
        //	Add server class
        node.add(new DefaultMutableTreeNode(server.class_name));

        //	Create Tree and Tree model
        //------------------------------------
        DefaultTreeModel treeModel = new DefaultTreeModel(root);
        setModel(treeModel);
		ToolTipManager.sharedInstance().registerComponent(this);
		setCellRenderer(new InheritanceRenderer());

        for (int i=0 ; i<cnt ; i++)
            expandRow(i);
    }








    //===============================================================
    /**
     *	Class Description:
     *	A TreeCellRenderer class to be used by InheritanceTree.
     */
    //===============================================================
    class InheritanceRenderer extends DefaultTreeCellRenderer
    {
        private	Font		font;
        private ImageIcon	icon;

        //======================================================
        //======================================================
        public InheritanceRenderer()
        {
            font = new Font("helvetica", Font.BOLD, 12);
            icon = null;

			setTextSelectionColor(Color.blue);
			setBorderSelectionColor(Color.blue);
			setBackgroundSelectionColor(Color.white);

			setTextNonSelectionColor(Color.blue);
			setBackgroundNonSelectionColor(Color.white);
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

            String  tip = null;
            DefaultMutableTreeNode  node = (DefaultMutableTreeNode)value;
            Object obj = node.getUserObject();

            if (node.isRoot())
                tip = "TANGO device";
            else
            if (obj instanceof AbstractClass)
				tip = "Abstract Class " + ((AbstractClass)obj).name + " :\n"+
                            ((AbstractClass)obj).path;

            setFont(font);
            setIcon(icon);
            setToolTipText(tip);
            return this;
        }
    }



    //===============================================================
    //===============================================================
    class AbstractClass
    {
        String  name;
        String  path = "";
        AbstractClass(String name)
        {
            int start = name.lastIndexOf('/');
            if (start<0)
                this.name = name;
            else
            {
                this.name = name.substring(start+1);
                this.path = name.substring(0, start);
            }
        }
        //============================================================
        public String toString()
        {
            return name;
        }
    }
}
