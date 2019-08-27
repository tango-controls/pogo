//+======================================================================
//
// Project:   Tango
//
// Description:  java source code for main GUI swing class.
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

import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.ClassIdentification;
import org.eclipse.emf.common.util.EList;
import org.tango.pogo.pogo_gui.packaging.ConfigurePackagingDialog;
import org.tango.pogo.pogo_gui.packaging.Packaging;
import org.tango.pogo.pogo_gui.tools.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

//=======================================================
/**
 * JFrame Class to manage Tango code generator GUI.
 *
 * @author Pascal Verdier
 */
//=======================================================
public class PogoGUI extends JFrame {
    /**
     * True only if Display is used (false if code generator usage)
     */
    public static boolean useDisplay = false;
    /**
     * A vector to know how many JFrame has been created.
     * And to checked at exit button clicked, to know if at least one is still visible.
     */
    static private List<JFrame> runningApplications = new ArrayList<>();
    /**
     * File Chooser Object used in file menu.
     */
    private static JFileChooser chooser = null;
    static final PogoFileFilter pogoFilter = new PogoFileFilter("xmi", "Tango Classes");
    static String homeDir;

    //  Only for first instance, only when starting up
    private static boolean startup = true;

    /**
     * little buttons with icon on top of JTree.
     */
    private List<JButton> topButtons = new ArrayList<>();
    private static final int TOP_RELOAD = 0;
    private static final int TOP_NEW_CLASS = 1;
    private static final int TOP_NEW_TEMPL = 2;
    private static final int TOP_OPEN = 3;
    private static final int TOP_GENE = 4;

    private ClassPanels class_panels;
    private JLabel      languageLabel;
    private LanguagePopupMenu   languageMenu;
    private boolean hasInheritance = false;

    public static MultiClassesPanel multiClassesPanel = null;
    //=======================================================
    /**
     * Creates new form PogoGUI
     *
     * @param filename xmi file where device class is defined
     *                 (do not try to load if null).
     * @throws PogoException in case of failure
     */
    //=======================================================
    public PogoGUI(String filename) throws PogoException {
        this();
        checkLoadAtStartup(filename);
    }
    //=======================================================
    /**
     * Creates new form PogoGUI and display DeviceClass object
     *
     * @param deviceClass   DeviceClass object to be edited by Pogo
     * @param forceModified Force the edit/modified value to this boolean value.
     * @throws PogoException in case of failure
     */
    //=======================================================
    public PogoGUI(DeviceClass deviceClass, boolean forceModified) throws PogoException {
        this();

        //	Build users_tree to display info
        class_panels.addPanels(deviceClass);
        tabbedPane.setIconAt(class_panels.size()-1, Utils.getInstance().logoIcon);
        reBuildTabbedPane = false;
        setTitle(applicationTitle(deviceClass));

        //  Not from file but from new class.
        //  So set it as modified.
        class_panels.get(0).getTree().setModified(forceModified);
    }
    //=======================================================
    /**
     * Creates new form PogoGUI and load device class
     *
     * @throws PogoException in case of failure
     */
    //=======================================================
    public PogoGUI() throws PogoException {
        useDisplay = true;
        initComponents();
        PogoProperty.init();
        initOwnComponents();
        manageRecentMenu(null);
        setTitle(applicationTitle(null));

        //  Create a dummy panel for display
        class_panels = new ClassPanels(this);
        ClassPanel cp = new ClassPanel(this);
        class_panels.add(cp);
        tabbedPane.add(cp);

        setIconImage(Utils.getInstance().getIcon("pogo.png").getImage());
        //setIconImage(Utils.getInstance().logoIcon.getImage());
        pack();
        setScreenPosition(this);
        setVisible(true);
        runningApplications.add(this);
    }

    //===========================================================
    //===========================================================
    private String applicationTitle(DeviceClass deviceClass) {
        String  release = Utils.getInstance().getImplementationVersion();
        if (deviceClass!=null)
           return "TANGO Code Generator - " + release + " - " + deviceClass.toString();
        else
           return "TANGO Code Generator - " + release;
    }
    //===========================================================
    //===========================================================
    private void checkLoadAtStartup(String filename) {
        if (filename != null && filename.length() > 0)
            if (filename.endsWith(".xmi"))
                loadDeviceClassFromFile(filename);
            else {
                new PogoException(filename + " is not a xmi file").popup(this);
            }
        else {
            String xmiFile = Utils.getXmiFile(PogoConst.MonoClass);
            if (xmiFile != null) {
                openItemActionPerformed(null);
            } else if (PogoProperty.loadPrevious)
                if (PogoProperty.projectHistory.size() > 0) {
                    String previousFile = PogoProperty.projectHistory.get(0);
                    if (previousFile.endsWith(".xmi"))
                        loadDeviceClassFromFile(previousFile);
                }
        }
        startup = false;
    }
    //===========================================================

    /**
     * Move specified frame to the center of the screen if first instance.
     * Else check position from other instance
     *
     * @param frame frame to set position.
     */
    //===========================================================
    public void setScreenPosition(JFrame frame) {
        Point p = new Point();

        //  If not the first one set position from previous.
        for (int i = runningApplications.size() - 1; i >= 0; i--) {
            JFrame parent = runningApplications.get(i);
            if (parent.isVisible()) {
                p = parent.getLocation();
                p.x += 20;
                p.y += 20;
                frame.setLocation(p);
                return;
            }
        }

        // Else set to the default center
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension scrSize = toolkit.getScreenSize();
        Dimension appSize = frame.getSize();
        p.x = (scrSize.width - appSize.width) / 2;
        p.y = (scrSize.height - appSize.height) / 2;
        frame.setLocation(p);
    }

    //=======================================================
    //=======================================================
    private void manageRecentMenu(String newProject) {
        try {
            //	Check if there is something to manage.
            if (newProject == null && PogoProperty.projectHistory.size() == 0)    //	No project history
                return;

            //	Check if main class or inherited one.
            if (tabbedPane.getSelectedIndex() > 0)
                return;

            if (newProject != null)
                PogoProperty.addProject(newProject, PogoConst.SINGLE_CLASS);

            //	If project history available add it in recent menu
            recentMenu.removeAll();
            for (String project : PogoProperty.projectHistory) {
                JMenuItem item = new JMenuItem(project);
                item.addActionListener(this::recentItemActionPerformed);
                recentMenu.add(item);
            }
        } catch (Exception e) {
            System.err.println("\nWARNING:	" + e);
        }
    }

    //=======================================================
    //=======================================================
    private void initOwnComponents() {
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        Utils utils = Utils.getInstance();
        addTopPanelButton(utils.reloadIcon, "Reload Class", false);
        addTopPanelButton(utils.newIcon, "New Tango Class", false);
        addTopPanelButton(utils.newFromTemplateIcon, "New Class from Template", false);
        addTopPanelButton(utils.openIcon, "Open Class", false);
        addTopPanelButton(utils.saveIcon, "Generate Class", false);

        JLabel lbl = new JLabel("      Palette:");
        lbl.setFont(new Font("Dialog", Font.BOLD, 12));
        topPanel.add(lbl);

        addTopPanelButton(utils.classPropertyIcon, "Add Class Property", true);
        addTopPanelButton(utils.devicePropertyIcon, "Add Device Property", true);
        addTopPanelButton(utils.cmdIcon, "Add Command", true);
        addTopPanelButton(utils.scalarIcon, "Add ScalarAttribute", true);
        addTopPanelButton(utils.spectrumIcon, "Add Spectrum Attribute", true);
        addTopPanelButton(utils.imageIcon, "Add ImageAttribute", true);
        addTopPanelButton(utils.forwardedIcon, "Add Forwarded Attribute", true);
        addTopPanelButton(utils.pipeIcon, "Add Pipe", true);
        addTopPanelButton(utils.stateIcon, "Add State", true);

        //  Add a label to display language (and menu to change it)
        lbl = new JLabel("           ");
        topPanel.add(lbl);
        languageLabel = new JLabel("");
        topPanel.add(languageLabel);
        languageMenu = new LanguagePopupMenu(languageLabel);
        languageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                languageMenu.showMenu(evt);
            }
        });

        homeDir = System.getenv("SOURCE_PATH");
        if (homeDir == null) {
            homeDir = System.getProperty("SOURCE_PATH");
            if (homeDir == null)
                homeDir = new File("").getAbsolutePath();
        }
        chooser = new JFileChooser(new File(homeDir).getAbsolutePath());
        chooser.setFileFilter(pogoFilter);
        if (!TemplateChooser.templatesAvailable()) {
            newFromTemplateItem.setVisible(false);
            topButtons.get(TOP_NEW_TEMPL).setVisible(false);
        }
    }

    //=======================================================
    //=======================================================
    public void setLanguageLogo(String language) {
        if (language.equalsIgnoreCase("Cpp"))
            languageLabel.setIcon(Utils.getInstance().cppLogo);
        else
        if (language.equalsIgnoreCase("Java"))
            languageLabel.setIcon(Utils.getInstance().javaLogo);
        else
        if (language.equalsIgnoreCase("Python"))
            languageLabel.setIcon(Utils.getInstance().pythonLogo);
        else
        if (language.equalsIgnoreCase("PythonHL"))
            languageLabel.setIcon(Utils.getInstance().pythonHLLogo);
        pack();
    }
    //=======================================================
    //=======================================================
    private void addTopPanelButton(ImageIcon icon, String tip, final boolean isPalette) {
        JButton button = new JButton(icon);
        button.setToolTipText(Utils.buildToolTip(tip));
        button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button.addActionListener(evt -> {
            if (isPalette)
                paletteActionPerformed(evt);
            else
                topButtonActionPerformed(evt);
        });
        topPanel.add(button);
        topButtons.add(button);
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

        inherPanel = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        topPanel = new javax.swing.JPanel();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem newItem = new javax.swing.JMenuItem();
        newFromTemplateItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem openItem = new javax.swing.JMenuItem();
        recentMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem dummyItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem generateItem = new javax.swing.JMenuItem();
        packageItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem reLoadItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem exitItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem stateMachineItem = new javax.swing.JMenuItem();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        deleteItem = new javax.swing.JMenuItem();
        moveUpItem = new javax.swing.JMenuItem();
        moveDownItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem preferencesItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem sitePreferencesItem = new javax.swing.JMenuItem();
        javax.swing.JMenu toolsMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem multiItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem colorItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem releaseItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem aboutItem = new javax.swing.JMenuItem();
        javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
        javax.swing.JMenuItem tangoItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem pogoItem = new javax.swing.JMenuItem();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        getContentPane().setLayout(new java.awt.BorderLayout());

        inherPanel.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(inherPanel, java.awt.BorderLayout.EAST);

        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });
        getContentPane().add(tabbedPane, java.awt.BorderLayout.CENTER);
        getContentPane().add(topPanel, java.awt.BorderLayout.PAGE_START);

        fileMenu.setMnemonic('F');
        fileMenu.setText("File");
        fileMenu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fileMenuStateChanged(evt);
            }
        });

        newItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newItem.setMnemonic('N');
        newItem.setText("New");
        newItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemActionPerformed(evt);
            }
        });
        fileMenu.add(newItem);

        newFromTemplateItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        newFromTemplateItem.setText("New from template");
        newFromTemplateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFromTemplateItemActionPerformed(evt);
            }
        });
        fileMenu.add(newFromTemplateItem);

        openItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openItem.setMnemonic('O');
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

        generateItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        generateItem.setMnemonic('G');
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

        reLoadItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        reLoadItem.setText("Re-Load project");
        reLoadItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reLoadItemActionPerformed(evt);
            }
        });
        fileMenu.add(reLoadItem);

        exitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitItem.setMnemonic('E');
        exitItem.setText("Exit");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitItem);

        jMenuBar1.add(fileMenu);

        editMenu.setMnemonic('E');
        editMenu.setText("Edit");
        editMenu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                editMenuStateChanged(evt);
            }
        });

        stateMachineItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        stateMachineItem.setMnemonic('M');
        stateMachineItem.setText("State Machine");
        stateMachineItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateMachineItemActionPerformed(evt);
            }
        });
        editMenu.add(stateMachineItem);
        editMenu.add(jSeparator1);

        deleteItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        deleteItem.setMnemonic('D');
        deleteItem.setText("Delete Selection");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteItem);

        moveUpItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        moveUpItem.setMnemonic('U');
        moveUpItem.setText("Move Up");
        moveUpItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveUpItemActionPerformed(evt);
            }
        });
        editMenu.add(moveUpItem);

        moveDownItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        moveDownItem.setMnemonic('D');
        moveDownItem.setText("Move Down");
        moveDownItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveDownItemActionPerformed(evt);
            }
        });
        editMenu.add(moveDownItem);

        preferencesItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        preferencesItem.setMnemonic('P');
        preferencesItem.setText("Preferences");
        preferencesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferencesItemActionPerformed(evt);
            }
        });
        editMenu.add(preferencesItem);

        sitePreferencesItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        sitePreferencesItem.setText("Site Preferences");
        sitePreferencesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sitePreferencesItemActionPerformed(evt);
            }
        });
        editMenu.add(sitePreferencesItem);

        jMenuBar1.add(editMenu);

        toolsMenu.setMnemonic('T');
        toolsMenu.setText("Tools");

        multiItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        multiItem.setMnemonic('M');
        multiItem.setText("Multi Cpp Classes Manager");
        multiItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiItemActionPerformed(evt);
            }
        });
        toolsMenu.add(multiItem);

        jMenuBar1.add(toolsMenu);

        helpMenu.setMnemonic('H');
        helpMenu.setText("Help");

        colorItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        colorItem.setText("On Color");
        colorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorItemActionPerformed(evt);
            }
        });
        helpMenu.add(colorItem);

        releaseItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        releaseItem.setText("Release Notes");
        releaseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releaseItemActionPerformed(evt);
            }
        });
        helpMenu.add(releaseItem);

        aboutItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        aboutItem.setText("About");
        aboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutItem);
        helpMenu.add(jSeparator2);

        tangoItem.setText("Tango Pages");
        tangoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangoItemActionPerformed(evt);
            }
        });
        helpMenu.add(tangoItem);

        pogoItem.setText("Pogo online documentation");
        pogoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogoItemActionPerformed(evt);
            }
        });
        helpMenu.add(pogoItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //=======================================================
    //=======================================================
    private void recentItemActionPerformed(java.awt.event.ActionEvent evt) {
        String projectName = ((JMenuItem) evt.getSource()).getText();
        loadDeviceClassFromFile(projectName);
    }

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed

        chooser.setFileFilter(pogoFilter);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file != null) {
                if (!file.isDirectory()) {
                    if (file.toString().endsWith(".xmi")) {
                        homeDir = file.getParentFile().toString();
                        loadDeviceClassFromFile(file.getAbsolutePath());
                    }
                    else {
                        new PogoException(file.toString() + " is not a xmi file").popup(this);
                    }
                }
            }
        }
    }//GEN-LAST:event_openItemActionPerformed

    //=======================================================
    //=======================================================
    private void buildTree(DeviceClass devclass) {
        //	Check if ClassIdentification has already been defined.
        ClassIdentification id = devclass.getPogoDeviceClass().getDescription().getIdentification();

        //  Manage Device ID
        if (id == null && !Utils.isTrue(System.getenv("TEST_MODE"))) {
            Utils.getInstance().stopSplashRefresher();
            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            DeviceIdDialog dialog = new DeviceIdDialog(this);
            if (dialog.showDialog() == JOptionPane.OK_OPTION) {
                id = dialog.getInputs();
                devclass.getPogoDeviceClass().getDescription().setIdentification(id);
            } else
                return;        //	No ID definition, do not edit
        }

        reBuildTabbedPane = true;
        tabbedPane.removeAll();

        class_panels.addPanels(devclass);
        tabbedPane.setIconAt(class_panels.size()-1, Utils.getInstance().logoIcon);
        //class_panels.checkWarnings();
        reBuildTabbedPane = false;
    }

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed

        exitAppli();
    }//GEN-LAST:event_exitItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm

        if (exitAppli() == JOptionPane.CANCEL_OPTION) {
            //  If not exited -> start a thread to set it visible a bit later
            new SetVisibleLater(this).start();
        }
    }//GEN-LAST:event_exitForm
    //=======================================================
    /**
     * Manage if modification(s) has been done, and propose to generate them.
     *
     * @return JOptionPane.OK_OPTION to continue, JOptionPane.CANCEL_OPTION otherwise
     */
    //=======================================================
    private int checkModifications() {
        for (ClassPanel class_panel : class_panels) {
            if (class_panel.getTree() != null &&
                    class_panel.getTree().getModified()) {
                String name = class_panel.getName();
                Object[] options = {"Generate", "Discard", "Cancel"};
                switch (JOptionPane.showOptionDialog(this,
                        name + " project has not been generated !\n\n",
                        "Warning",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null, options, options[0])) {
                    case 0:    //	Generate
                        generateSourceFiles(class_panel.getTree());
                        break;
                    case 1:    // Discard
                        break;
                    case 2:    //	Cancel
                    case -1:   //	escape
                        return JOptionPane.CANCEL_OPTION;
                }
            }
        }
        return JOptionPane.OK_OPTION;
    }

    //=======================================================
    //=======================================================
    private int exitAppli() {
        if (checkModifications() == JOptionPane.OK_OPTION) {

            this.setVisible(false);
            // Check to know if at least one is still visible.
            for (JFrame frame : runningApplications)
                if (frame.isVisible())
                    return JOptionPane.OK_OPTION;
            //  Check if MultiClassesPanel is visible
            if ((multiClassesPanel != null && multiClassesPanel.isVisible()))
                return JOptionPane.OK_OPTION;

            //  No visible found.
            System.exit(0);
        }
        return JOptionPane.CANCEL_OPTION;
    }
    //=======================================================

    /**
     * Returns the main edited class name.
     *
     * @return the edited main class name.
     */
    //=======================================================
    String getMainClassName() {
        return class_panels.getPanelNameAt(0);
    }

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void generateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateItemActionPerformed

        int idx = tabbedPane.getSelectedIndex();
        ClassTree tree = class_panels.getSelectedTree();
        if (tree == null)    //	No class defined in tree
            return;
        generateSourceFiles(tree);
    }

    //=======================================================
    //=======================================================
    private void checkPogoClassCompatibilityLanguage(DeviceClass deviceClass) throws PogoException {
        EList<Attribute> attributeEList = deviceClass.getPogoDeviceClass().getAttributes();
        if (deviceClass.getPogoDeviceClass().
                getDescription().getLanguage().equalsIgnoreCase(PogoConst.strLang[PogoConst.Cpp]))
            return;
        for (Attribute attribute : attributeEList) {
            //  If spectrum or image and Enum throw exception
            if (!attribute.getAttType().equalsIgnoreCase(PogoConst.AttrTypeArray[PogoConst.SCALAR])) {
                if (attribute.getDataType().toString().contains("Enum")) {
                    throw new PogoException("Enum are supported as SPECTRUM only for C++");
                }
            }
        }
    }
    //=======================================================
    //=======================================================
    @SuppressWarnings("UnusedReturnValue")
    private boolean generateSourceFiles(ClassTree tree) {
        //	First time check output path
        GenerateDialog generateDialog = new GenerateDialog(this);
        DeviceClass deviceClass = tree.getDeviceClass();

        try {
            checkPogoClassCompatibilityLanguage(deviceClass);
        } catch (PogoException e) {
            e.popup(this);
            return false;
        }

        if (generateDialog.showDialog(deviceClass) == JOptionPane.OK_OPTION) {
            //	Then generate code and save
            Cursor cursor = new Cursor(Cursor.WAIT_CURSOR);
            setCursor(cursor);
            try {
                deviceClass = generateDialog.getDevClass();
                Utils.getInstance().startSplashRefresher(
                        "Generate class: " + deviceClass.getPogoDeviceClass().getName());

                deviceClass.generate(tree.getDeletedObjects(), tree.getRenamedObjects());

                Utils.getInstance().stopSplashRefresher();

                //	Update ClassTree object.
                tree.setModified(false);
                tree.setSrcPath(deviceClass.getPogoDeviceClass().getDescription().getSourcePath());

                manageRecentMenu(deviceClass.getProjectFilename());
            } catch (Exception e) {
                Utils.getInstance().stopSplashRefresher();
                cursor = new Cursor(Cursor.DEFAULT_CURSOR);
                setCursor(cursor);
                e.printStackTrace();
                PogoException.popup(this, e);
                return false;
            }
            cursor = new Cursor(Cursor.DEFAULT_CURSOR);
            setCursor(cursor);
            return true;
        } else
            return false;

    }//GEN-LAST:event_generateItemActionPerformed

    //=======================================================
    //=======================================================
    private boolean reBuildTabbedPane = false;

    @SuppressWarnings({"UnusedDeclaration"})
    private void newItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemActionPerformed

        //  ToDo add template management
        //  Start class dialog
        ClassDialog dialog = new ClassDialog(this);
        if (dialog.showDialog() != JOptionPane.OK_OPTION)
            return;

        DeviceClass deviceClass = dialog.getInputs();
        if (class_panels.getSelectedTree() != null) {
            try {
                new PogoGUI(deviceClass, true);
                return;
            } catch (Exception e) {
                Utils.getInstance().stopSplashRefresher();
                PogoException.popup(this, e);
            }
        }

        //  Display it in this panel
        reBuildTabbedPane = true;
        tabbedPane.removeAll();

        //	Build users_tree to display info
        class_panels.addPanels(deviceClass);
        tabbedPane.setIconAt(class_panels.size()-1, Utils.getInstance().logoIcon);
        class_panels.checkWarnings();
        reBuildTabbedPane = false;
    }//GEN-LAST:event_newItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed

        ClassTree tree = class_panels.getSelectedTree();
        Object selection = tree.getSelectedEditableObject();
        if (selection != null)
            tree.removeSelectedItem();

    }//GEN-LAST:event_deleteItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void moveUpItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveUpItemActionPerformed

        ClassTree tree = class_panels.getSelectedTree();
        Object selection = tree.getSelectedEditableObject();
        if (selection != null)
            tree.moveSelectedItem(true);
    }//GEN-LAST:event_moveUpItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void moveDownItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveDownItemActionPerformed

        ClassTree tree = class_panels.getSelectedTree();
        Object selection = tree.getSelectedEditableObject();
        if (selection != null)
            tree.moveSelectedItem(false);
    }//GEN-LAST:event_moveDownItemActionPerformed

    //=======================================================
    //=======================================================
    private void reloadProject() {

        if (class_panels.getSelectedTree() != null) {
            if (checkModifications() == JOptionPane.OK_OPTION) {
                String filename = class_panels.get(0).getTree().getClassFileName();
                if (filename != null) {
                    //System.out.println("Reload "+filename);
                    loadDeviceClassFromFile(filename, false);
                }
            }
        }
    }

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void topButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JButton src = (JButton) evt.getSource();
        for (int i = 0; i < topButtons.size(); i++)
            if (topButtons.get(i) == src)
                switch (i) {
                    case TOP_RELOAD:
                        reloadProject();
                        break;
                    case TOP_NEW_CLASS:
                        newItemActionPerformed(evt);
                        break;
                    case TOP_NEW_TEMPL:
                        newFromTemplateItemActionPerformed(evt);
                        break;
                    case TOP_OPEN:
                        openItemActionPerformed(evt);
                        break;
                    case TOP_GENE:
                        generateItemActionPerformed(evt);
                        break;
                }
    }

    //=======================================================
    //=======================================================
    private void paletteActionPerformed(java.awt.event.ActionEvent evt) {
        ClassTree tree = class_panels.getSelectedTree();
        if (tree != null) {
            JButton btn = (JButton) evt.getSource();
            String txt = btn.getToolTipText();
            tree.addItem(txt);
        }
    }

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void stateMachineItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateMachineItemActionPerformed

        ClassTree tree = class_panels.getSelectedTree();
        if (tree != null)
            tree.editStateMachine();

    }//GEN-LAST:event_stateMachineItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void editMenuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_editMenuStateChanged

        if (class_panels == null)
            return; //  Not yet initialized
        ClassTree tree = class_panels.getSelectedTree();
        boolean visible = tree != null &&
                (!editMenu.isSelected() ||
                        (tree.getSelectedEditableObject() != null));

        deleteItem.setEnabled(visible);
        moveUpItem.setEnabled(visible);
        moveDownItem.setEnabled(visible);

    }//GEN-LAST:event_editMenuStateChanged

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void colorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorItemActionPerformed
        new PopupColorCode(this).setVisible(true);
    }//GEN-LAST:event_colorItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void aboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemActionPerformed
        JOptionPane.showMessageDialog(this,
                "             Pogo  (Tango Code Generator)\n" +
                        "This programme is able to generate, update and modify\n" +
                        "                 Tango device classes.\n\n" +
                        Utils.getInstance().getImplementationVersion() +
                        "\n\n" +
                        "http://www.tango-controls.org/     -    tango@esrf.fr",
                "Help Window", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_aboutItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged

        class_panels.updateInheritancePanelForSelection();
    }//GEN-LAST:event_tabbedPaneStateChanged

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void preferencesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preferencesItemActionPerformed

        new PreferencesDialog(this).setVisible(true);

    }//GEN-LAST:event_preferencesItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void releaseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_releaseItemActionPerformed
        new PopupHtml(this).show(ReleaseNotes.htmlString, 550, 400);
    }//GEN-LAST:event_releaseItemActionPerformed
    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void reLoadItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reLoadItemActionPerformed

        reloadProject();
    }//GEN-LAST:event_reLoadItemActionPerformed

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void tangoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangoItemActionPerformed
        Utils.showInHtmBrowser(PogoConst.tangoHTTP[PogoConst.TANGO_PAGES]);
    }//GEN-LAST:event_tangoItemActionPerformed

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void pogoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogoItemActionPerformed
        Utils.showInHtmBrowser(PogoConst.tangoHTTP[PogoConst.POGO_PAGES]);
    }//GEN-LAST:event_pogoItemActionPerformed

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void sitePreferencesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sitePreferencesItemActionPerformed
        new PogoConfiguration(this).showDialog();
    }//GEN-LAST:event_sitePreferencesItemActionPerformed

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void multiItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiItemActionPerformed
        try {
            if (multiClassesPanel == null)
                multiClassesPanel = new MultiClassesPanel(this, null);
            multiClassesPanel.setVisible(true);
        } catch (PogoException e) {
            PogoException.popup(this, e);
        }
    }//GEN-LAST:event_multiItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings("UnusedParameters")
    private void packageItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageItemActionPerformed
        ClassTree tree = class_panels.getSelectedTree();
        if (tree == null)    //	No class defined in tree
            return;
        if (tree.getModified()) {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Save your project by generating the xmi file before.",
                    "Message Window",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        DeviceClass deviceClass = tree.getDeviceClass();
        new ConfigurePackagingDialog(this, deviceClass.getPogoDeviceClass()).setVisible(true);
    }//GEN-LAST:event_packageItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings("UnusedParameters")
    private void fileMenuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fileMenuStateChanged

        //  At creation --> do nothing
        if (class_panels==null)
            return;

        //  Check if Packaging is available (linux and C++)
        boolean b = false;
        if (Packaging.isAvailable()) {
            ClassTree tree = class_panels.getSelectedTree();
            if (tree != null)  {   //	a class is defined in tree
                DeviceClass deviceClass = tree.getDeviceClass();
                String language = deviceClass.getPogoDeviceClass().getDescription().getLanguage();
                b = (language.equals(PogoConst.strLang[PogoConst.Cpp]));
            }
        }
        packageItem.setVisible(b);
    }//GEN-LAST:event_fileMenuStateChanged

    //=======================================================
    //=======================================================
    @SuppressWarnings("UnusedParameters")
    private void newFromTemplateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFromTemplateItemActionPerformed
        // TODO add your handling code here:
        try {
            TemplateChooser templateChooser = new TemplateChooser(this);
            if (templateChooser.showDialog() != JOptionPane.OK_OPTION)
                return;
            DeviceClass deviceClass = templateChooser.getDeviceClass();
            if (deviceClass != null) {
                new PogoGUI(deviceClass, true);
            }
        }
        catch (PogoException e) {
            e.popup(this);
        }
    }//GEN-LAST:event_newFromTemplateItemActionPerformed

    //=======================================================
    //=======================================================
    private void loadDeviceClassFromFile(String filename) {
        loadDeviceClassFromFile(filename, true);
    }

    //=======================================================
    //=======================================================
    private void loadDeviceClassFromFile(String filename, boolean checkForNewFrame) {
        Cursor cursor = new Cursor(Cursor.WAIT_CURSOR);
        try {
            //  Get absolute path for file
            File file = new File(filename);
            filename = file.getCanonicalFile().toString();
            manageRecentMenu(filename);
        } catch (IOException e) { /* */ }

        try {
            if (checkForNewFrame) {
                //  If not first one, New Frame
                if (class_panels.getSelectedTree() != null) {
                    new PogoGUI(filename);
                    return;
                }
            }
            //  Else do it
            setCursor(cursor);
            Utils.getInstance().startSplashRefresher(
                    "Loading  " + Utils.getRelativeFilename(filename));

            DeviceClass deviceClass = new DeviceClass(filename);
            Utils.getInstance().startSplashRefresher(
                    "Building  " + Utils.getRelativeFilename(filename));
            buildTree(deviceClass);
            setTitle(applicationTitle(deviceClass));
            cursor = new Cursor(Cursor.DEFAULT_CURSOR);
            setCursor(cursor);
            Utils.getInstance().stopSplashRefresher();
        }
        catch (PogoException e) {
            Utils.getInstance().stopSplashRefresher();

            if (startup)
                System.err.println(e.toString());
            else if (!e.toString().equals("CANCEL")) {
                PogoException.popup(this, e);
                if (class_panels.getPanelNameAt(0) == null && runningApplications.size() > 1)
                    setVisible(false);
            }
        }

        cursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(cursor);
        class_panels.checkWarnings();

    }

    //=======================================================
    //=======================================================
    boolean itemAlreadyExists(String name, int type) {
        ClassTree tree = class_panels.getSelectedTree();
        return tree.itemAlreadyExists(name, type);
    }

    //=======================================================
    //=======================================================
    ClassPanels getClassPanels() {
        return class_panels;
    }

    //=======================================================
    //=======================================================
    void setTabbedPaneSelection(ClassPanel panel) {
        tabbedPane.setSelectedComponent(panel);
    }

    //=======================================================
    //=======================================================
    void fireClassHaveChanged() {
        for (int i=0 ; i<class_panels.size() ; i++) {
            //tabbedPane.setTitleAt(i, class_panels.get(i).toString());
            if (class_panels.get(i).isModified())
                tabbedPane.setForegroundAt(i,Color.red);
            else
                tabbedPane.setForegroundAt(i,Color.black);
        }
    }
    //=======================================================
    //=======================================================

    //=======================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem deleteItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JPanel inherPanel;
    private javax.swing.JMenuItem moveDownItem;
    private javax.swing.JMenuItem moveUpItem;
    private javax.swing.JMenuItem newFromTemplateItem;
    private javax.swing.JMenuItem packageItem;
    private javax.swing.JMenu recentMenu;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
    //=======================================================


    //=======================================================
    /**
     * This class is a vector of panels displaying JTrees
     */
    //=======================================================
    class ClassPanels extends ArrayList<ClassPanel> {
        private PogoGUI gui;
        private String warnings = "";
        private static final long serialVersionUID = -3468411367658544269L;

        //=======================================================
        private ClassPanels(PogoGUI gui) {
            this.gui = gui;
        }

        //=======================================================
        //=======================================================
        @SuppressWarnings("SameParameterValue")
        private String getPanelNameAt(int idx) {
            ClassPanel panel = (ClassPanel) tabbedPane.getComponent(idx);
            return panel.getName();
        }
        //=======================================================
        private ClassTree getSelectedTree() {
            return get(tabbedPane.getSelectedIndex()).getTree();
        }
        //=======================================================
        private void addPanel(DeviceClass deviceClass) {
            ClassPanel cp = new ClassPanel(gui);
            cp.setTree(deviceClass, this.size() > 0);
            add(cp);
            tabbedPane.add(cp);
            tabbedPane.setIconAt(class_panels.size()-1, Utils.getInstance().logoIcon);
        }
        //=======================================================
        private void addPanels(DeviceClass deviceClass) {
            //  Reset if needed
            this.removeAll(this);
            tabbedPane.removeAll();
            warnings = org.tango.pogo.pogo_gui.InheritanceUtils.getInstance().manageInheritanceItems(deviceClass);

            addPanel(deviceClass);

            //  manage inheritance elements
            List<DeviceClass> ancestors = deviceClass.getAncestors();
            for (int i=ancestors.size()-1 ; i>=0 ; i--) {
                addPanel(ancestors.get(i));
            }
            hasInheritance = (ancestors.size()>0);

            //  Build inheritance panel
            getContentPane().remove(inherPanel);
            inherPanel = new InheritancePanel(deviceClass, gui);
            getContentPane().add(inherPanel, java.awt.BorderLayout.EAST);
            pack();
        }

        //=======================================================
        private void checkWarnings() {
            if (warnings.length() > 0) {
                Utils.getInstance().stopSplashRefresher();
                JOptionPane.showMessageDialog(gui,
                        "Inheritance change(s):\n" + warnings,
                        "Warning Window", JOptionPane.WARNING_MESSAGE);
            }
        }

        //=======================================================
        private void updateInheritancePanelForSelection() {
            if (!reBuildTabbedPane) {
                ClassPanel panel = (ClassPanel) tabbedPane.getSelectedComponent();
                if (inherPanel instanceof InheritancePanel)
                    ((InheritancePanel) inherPanel).setSelected(panel.getName());
            }
        }
        //=======================================================
        /*
        private void updateInheritancePanels(ClassTree tree)
        {
            
        }
        */
    }
    //===============================================================
    //===============================================================


    //===============================================================
    //===============================================================
    private static class SetVisibleLater extends Thread {
        private Component component;

        private SetVisibleLater(Component component) {
            this.component = component;
        }

        public void run() {
            try {
                sleep(100);
            } catch (InterruptedException e) { /* */ }
            component.setVisible(true);
        }
    }
    //===============================================================
    //===============================================================






    //===============================================================
    //===============================================================
    private class LanguagePopupMenu extends JPopupMenu {
        private JLabel  label;
        private final int OFFSET = 2;    //	Label And separator

        private String[] menuLabels = {
                PogoConst.strLang[PogoConst.Java],
                PogoConst.strLang[PogoConst.Cpp],
                PogoConst.strLang[PogoConst.Python],
                PogoConst.strLang[PogoConst.PythonHL],
        };

        //===========================================================
        private LanguagePopupMenu(JLabel label) {
            this.label = label;
            JLabel  title = new JLabel("Language");
            title.setFont(new java.awt.Font("Dialog", Font.BOLD, 16));
            add(title);
            add(new JPopupMenu.Separator());

            for (String menuLabel : menuLabels) {
                if (menuLabel == null)
                    add(new Separator());
                else {
                    JMenuItem btn = new JMenuItem(menuLabel);
                    btn.addActionListener(this::menuActionPerformed);
                    add(btn);
                }
            }
            String  s = System.getenv("PythonHL");
            getComponent(OFFSET+PogoConst.PythonHL).setVisible(s!=null && s.equals("true"));
        }
        //===========================================================
        public void showMenu(MouseEvent evt) {
            //  If has inheritance -> cannot change language
            if (hasInheritance)
                return;
            int mask = evt.getModifiers();
            if ((mask & MouseEvent.BUTTON3_MASK)!=0)
                show(label, evt.getX(), evt.getY());
        }
        //===========================================================
        private void menuActionPerformed(ActionEvent evt) {
            //	Check component source
            Object obj = evt.getSource();
            int cmdidx = 0;
            for (int i = 0; i < menuLabels.length; i++)
                if (getComponent(OFFSET + i) == obj)
                    cmdidx = i;
            ClassTree tree = class_panels.getSelectedTree();
            if (tree!=null) {
                tree.setClassLanguage(cmdidx);
                setLanguageLogo(PogoConst.strLang[cmdidx]);
                tree.setModified(true);
            }
        }
        //===========================================================
    }
    //===============================================================
    //===============================================================
}
