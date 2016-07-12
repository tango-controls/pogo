//+======================================================================
// $Source:  $
//
// Project:   Tango
//
// Description:  java source code for main swing class.
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

import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef;
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses;
import fr.esrf.tangoatk.widget.util.ATKGraphicsUtils;
import org.eclipse.emf.common.util.EList;
import org.tango.pogo.pogo_gui.packaging.ConfigurePackagingDialog;
import org.tango.pogo.pogo_gui.packaging.Packaging;
import org.tango.pogo.pogo_gui.tools.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

//=======================================================
/**
 * JFrame Class to display info
 *
 * @author Pascal Verdier
 */
//=======================================================
public class MultiClassesPanel extends JFrame {
    private JFrame parent;
    static private JFileChooser chooser = null;
    static public String homeDir;
    private MultiClassesTree tree;
    private JScrollPane scrollPane;

    private List<JButton> topButtons = new ArrayList<>();
    private static final int TOP_RELOAD = 0;
    private static final int TOP_NEW = 1;
    private static final int TOP_OPEN = 2;
    private static final int TOP_GENE = 3;

    private static final PogoFileFilter pogoFilter = new PogoFileFilter("xmi", "Multi Classes");

    //=======================================================
    /**
     * Creates new form MultiClassesPanel
     *
     * @param parent   JFrame parent instance
     * @param fileName xmi file to be loaded (if not null).
     * @throws PogoException in case of Site Property not found
     */
    //=======================================================
    public MultiClassesPanel(JFrame parent, String fileName) throws PogoException {
        this.parent = parent;
        initComponents();
        PogoProperty.init();    //	Load them

        customizeMenus();
        initOwnComponents();
        checkLoadAtStartup(fileName);

        //  Set the PogoGUI instance to do not close this when PogoGUI is closed !!!
        PogoGUI.multiClassesPanel = this;

        packageItem.setVisible(Packaging.isAvailable());
        pack();
        ATKGraphicsUtils.centerFrameOnScreen(this);
    }

    //===========================================================
    //===========================================================
    private void checkLoadAtStartup(String filename) {
        try {
            if (filename != null && filename.length() > 0)
                loadXmiFile(filename);
            else {
                String xmiFile = Utils.getXmiFile(PogoConst.MultiClasses);
                if (xmiFile != null) {
                    openItemActionPerformed(null);
                } else
                if (PogoProperty.loadPrevious) {
                    if (PogoProperty.multiClassProjectHistory.size() > 0)
                        loadXmiFile(PogoProperty.multiClassProjectHistory.get(0));
                }
            }
        }
        catch(PogoException e) {
            System.err.println(e.getMessage());
        }
    }
    //=======================================================
    //=======================================================
    private void initOwnComponents() {
        setTitle("Multi TANGO Classes Code Generator - " + PogoConst.revNumber);

        //	Build users_tree to display info
        scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(350, 450));
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        //  Initialize file chooser 
        homeDir = System.getenv("SOURCE_PATH");
        if (homeDir == null) {
            homeDir = System.getProperty("SOURCE_PATH");
            if (homeDir == null)
                homeDir = new File("").getAbsolutePath();
        }
        chooser = new JFileChooser(new File(homeDir).getAbsolutePath());
        chooser.setFileFilter(pogoFilter);
        setIconImage(Utils.getInstance().logoIcon.getImage());


        Utils utils = Utils.getInstance();
        addTopPanelButton(utils.reloadIcon, "Reload Server");
        addTopPanelButton(utils.newIcon, "New Server");
        addTopPanelButton(utils.openIcon, "Open Server");
        addTopPanelButton(utils.saveIcon, "Generate Server");
    }

    //=======================================================
    //=======================================================
    private void addTopPanelButton(ImageIcon icon, String tip) {
        JButton btn = new JButton(icon);
        btn.setToolTipText(Utils.buildToolTip(tip));
        btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topButtonActionPerformed(evt);
            }
        });
        topPanel.add(btn);
        topButtons.add(btn);
    }

    //=======================================================
    //=======================================================
    private void customizeMenus() {
        fileMenu.setMnemonic('F');
        newItem.setMnemonic('N');
        newItem.setAccelerator(KeyStroke.getKeyStroke('N', MouseEvent.CTRL_MASK));
        openItem.setMnemonic('O');
        openItem.setAccelerator(KeyStroke.getKeyStroke('O', MouseEvent.CTRL_MASK));
        generateItem.setMnemonic('G');
        generateItem.setAccelerator(KeyStroke.getKeyStroke('G', MouseEvent.CTRL_MASK));
        exitItem.setMnemonic('E');
        exitItem.setAccelerator(KeyStroke.getKeyStroke('Q', MouseEvent.CTRL_MASK));

        editMenu.setMnemonic('E');
        addItem.setMnemonic('A');
        addItem.setAccelerator(KeyStroke.getKeyStroke('A', MouseEvent.CTRL_MASK));
        removeItem.setMnemonic('R');
        removeItem.setAccelerator(KeyStroke.getKeyStroke(Event.DELETE, 0));

        helpMenu.setMnemonic('H');
        helpItem.setMnemonic('H');
        helpItem.setAccelerator(KeyStroke.getKeyStroke('H', MouseEvent.CTRL_MASK));

        manageRecentMenu(null);
    }

    //=======================================================
    //=======================================================
    private void manageRecentMenu(String new_proj) {
        try {
            //	Check if there is something to manage.
            if (new_proj == null && PogoProperty.projectHistory.size() == 0)    //	No project histo
                return;

            if (new_proj != null)
                PogoProperty.addProject(new_proj, PogoConst.MULTI_CLASS);

            //	If project history available add it in recent menu
            recentMenu.removeAll();
            for (String project : PogoProperty.multiClassProjectHistory) {
                JMenuItem item = new JMenuItem(project);
                item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        recentItemActionPerformed(evt);
                    }
                });
                recentMenu.add(item);
            }
        } catch (Exception e) {
            System.err.println("\nWARNING:	" + e);
        }
    }
    //=======================================================

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    //=======================================================
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newItem = new javax.swing.JMenuItem();
        openItem = new javax.swing.JMenuItem();
        recentMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem dummyItem = new javax.swing.JMenuItem();
        generateItem = new javax.swing.JMenuItem();
        packageItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        addItem = new javax.swing.JMenuItem();
        removeItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpItem = new javax.swing.JMenuItem();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        topPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        getContentPane().add(topPanel, java.awt.BorderLayout.NORTH);

        fileMenu.setText("File");

        newItem.setText("New");
        newItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemActionPerformed(evt);
            }
        });
        fileMenu.add(newItem);

        openItem.setText("Open");
        openItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openItemActionPerformed(evt);
            }
        });
        fileMenu.add(openItem);

        recentMenu.setText("Open Recent");

        dummyItem.setText("...");
        recentMenu.add(dummyItem);

        fileMenu.add(recentMenu);

        generateItem.setText("Generate");
        generateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateItemActionPerformed(evt);
            }
        });
        fileMenu.add(generateItem);

        packageItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        packageItem.setText("Export Package");
        packageItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageItemActionPerformed(evt);
            }
        });
        fileMenu.add(packageItem);

        exitItem.setText("Exit");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                editMenuStateChanged(evt);
            }
        });

        addItem.setText("Add Class");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });
        editMenu.add(addItem);

        removeItem.setText("Remove class");
        removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemActionPerformed(evt);
            }
        });
        editMenu.add(removeItem);

        jMenuBar1.add(editMenu);

        helpMenu.setText("help");

        helpItem.setText("On Multi Class Manager");
        helpItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpItemActionPerformed(evt);
            }
        });
        helpMenu.add(helpItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void topButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JButton src = (JButton) evt.getSource();
        for (int i = 0; i < topButtons.size(); i++)
            if (topButtons.get(i) == src)
                switch (i) {
                    case TOP_RELOAD:
                        if (tree != null)
                            reloadProject();
                        break;
                    case TOP_NEW:
                        newItemActionPerformed(evt);
                        break;
                    case TOP_OPEN:
                        openItemActionPerformed(evt);
                        break;
                    case TOP_GENE:
                        if (tree != null)
                            generateItemActionPerformed(evt);
                        break;
                }
    }

    //=======================================================
    //=======================================================
    private void reloadProject() {

        if (checkModifications() == JOptionPane.OK_OPTION) {
            String filename = tree.getServerFileName();
            if (filename != null) {
                try {
                    loadXmiFile(filename);
                } catch (PogoException e) {
                    e.popup(this);
                }
            }
        }
    }

    //=======================================================
    //=======================================================
    private void recentItemActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String proj_name = ((JMenuItem) evt.getSource()).getText();
            loadXmiFile(proj_name);
        } catch (PogoException e) {
            e.popup(this);
        }
    }

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed
        if (chooser == null) {
            chooser = new JFileChooser(new File("").getAbsolutePath());
        }
        int returnValue = chooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file != null) {
                if (!file.isDirectory()) {
                    String filename = file.getAbsolutePath();
                    try {
                        loadXmiFile(filename);
                    } catch (PogoException e) {
                        e.popup(this);
                    }
                }
            }
        }
    }//GEN-LAST:event_openItemActionPerformed

    //===============================================================
    //===============================================================
    public PogoMultiClasses loadXmiFile(String xmiFileName) throws PogoException {
        PogoMultiClasses multiClasses = OAWutils.getInstance().loadMultiClassesModel(xmiFileName);
        multiClasses.setSourcePath(Utils.getPath(xmiFileName));
        buildTree(multiClasses);
        manageRecentMenu(xmiFileName);
        return multiClasses;
    }

    //=======================================================
    //=======================================================
    private void buildTree(PogoMultiClasses multiClasses) {
        try {
            tree = new MultiClassesTree(this, multiClasses);
            scrollPane.setViewportView(tree);
        } catch (PogoException e) {
            /* Has been canceled */
        }
    }

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        doClose();
    }//GEN-LAST:event_exitItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        doClose();
    }//GEN-LAST:event_exitForm

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void generateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateItemActionPerformed
        generateFiles();
    }

    //=======================================================
    //=======================================================
    private int generateFiles() {
        if (tree==null)
            return JOptionPane.CANCEL_OPTION;
        try {
            PogoMultiClasses multiClasses = tree.getServer();
            GenerateDialog dialog = new GenerateDialog(this);
            if (dialog.showDialog(multiClasses) == JOptionPane.OK_OPTION) {
                //	Then generate code and save
                setCursor(new Cursor(Cursor.WAIT_CURSOR));
                String serverPath = dialog.getPath();
                multiClasses.setSourcePath(serverPath);
                //  Set relative path for each class.
                EList<OneClassSimpleDef> classes = multiClasses.getClasses();
                for (OneClassSimpleDef oneClass : classes) {
                    String classPath = Utils.getRelativePath(oneClass.getSourcePath(), serverPath);
                    oneClass.setSourcePath(classPath);
                }
                multiClasses.setFilestogenerate(dialog.getGenerated());
                OAWutils.getInstance().generate(multiClasses);
                tree.setModified(false);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

                //  Manage recent menu
                String projectFile = multiClasses.getSourcePath() +
                        "/" + multiClasses.getName() + ".multi.xmi";
                manageRecentMenu(projectFile);
                return JOptionPane.OK_OPTION;
            }
        } catch (PogoException e) {
            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            e.popup(this);
        }
        return JOptionPane.CANCEL_OPTION;
    }//GEN-LAST:event_generateItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void newItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemActionPerformed

        //  First time, check if modified
        if (tree != null && tree.getModified()) {
            if (checkModifications() == JOptionPane.CANCEL_OPTION)
                return;
        }

        try {
            ServerDialog dialog = new ServerDialog(this, new TangoServer());
            if (dialog.showDialog() == JOptionPane.OK_OPTION) {
                tree = new MultiClassesTree(this, dialog.getTangoServer());
                tree.setModified(true);
                scrollPane.setViewportView(tree);
            }
        } catch (PogoException e) {
            e.popup(this);
        }
    }//GEN-LAST:event_newItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        if (tree.isANodeSelected())
            tree.addClass();
    }//GEN-LAST:event_addItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void removeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemActionPerformed
        if (tree.isAClassSelected())
            tree.removeClass();
    }//GEN-LAST:event_removeItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void editMenuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_editMenuStateChanged

        boolean visible = (!editMenu.isSelected());
        if (tree != null) {
            addItem.setEnabled(tree.isANodeSelected() || visible);
            removeItem.setEnabled(tree.isAClassSelected() || visible);
        }
    }//GEN-LAST:event_editMenuStateChanged

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void helpItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpItemActionPerformed
        JOptionPane.showMessageDialog(this,

                "             Pogo  (Tango Code Generator)\n" +
                        "    This tool is able to generate, update and modify\n" +
                        "           a server project containing several\n" +
                        "                 Tango device classes.\n\n" +
                        "Define a new server (Name, description,...)\n" +
                        "Then add classes (Highest classes to lowest ones)\n" +
                        "And finally, generate.\n\n" +
                        "This tool is available only for C++ classes on Linux." +
                        "\n\n" +
                        "http://www.tango-controls.org/     -    tango@esrf.fr",
                "Help Window", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings("UnusedParameters")
    private void packageItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageItemActionPerformed
        PogoMultiClasses multiClasses = tree.getServer();
        if (multiClasses == null)    //	No class defined in tree
            return;
        new ConfigurePackagingDialog(this, multiClasses, tree.getAuthor()).setVisible(true);

    }//GEN-LAST:event_packageItemActionPerformed

    //=======================================================
    /**
     * Manage if modification(s) has been done, and propose to generate them.
     *
     * @return JOptionPane.OK_OPTION to continue, JOptionPane.CANCEL_OPTION otherwise
     */
    //=======================================================
    private int checkModifications() {
        if (tree.getModified()) {
            String name = tree.getName();
            Object[] options = {"Generate", "Discard", "Cancel"};
            switch (JOptionPane.showOptionDialog(this,
                    name + " project has not been generated !\n\n",
                    "Warning",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null, options, options[0])) {
                case 0:    //	Generate
                    return generateFiles();

                case 1:    // Discard
                    return JOptionPane.OK_OPTION;
                case 2:    //	Cancel
                case -1:   //	escape
                default:
                    return JOptionPane.CANCEL_OPTION;
            }
        }
        return JOptionPane.OK_OPTION;
    }

    //=======================================================
    //=======================================================
    private void doClose() {
        if (tree != null && tree.getModified()) {
            if (checkModifications() == JOptionPane.CANCEL_OPTION)
                return;
        }
        if (parent.isVisible())
            setVisible(false);
        else if (tree == null)
            System.exit(0);
        else if (tree.allEditorsAreClosed())
            System.exit(0);
        else
            setVisible(false);
    }
    //=======================================================

    /**
     * @param args the command line arguments
     */
    //=======================================================
    public static void main(String args[]) {
        try {
            if (args.length == 0)
                new MultiClassesPanel(new JFrame(), null).setVisible(true);
            else
                new MultiClassesPanel(new JFrame(), args[0]).setVisible(true);
        } catch (PogoException e) {
            e.popup(new Frame());
        }
    }


    //=======================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem generateItem;
    private javax.swing.JMenuItem helpItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem newItem;
    private javax.swing.JMenuItem openItem;
    private javax.swing.JMenuItem packageItem;
    private javax.swing.JMenu recentMenu;
    private javax.swing.JMenuItem removeItem;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
    //=======================================================

}
