//+======================================================================
//
// Project:   Tango
//
// Description:  java source code for main GUI swing class.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009, 2010
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
import fr.esrf.tango.pogo.pogoDsl.ClassIdentification;
import fr.esrf.tangoatk.widget.util.ErrorPane;
import org.tango.pogo.pogo_gui.tools.*;

import javax.swing.*;

import java.awt.*;
import java.io.File;
import java.util.Vector;

//=======================================================
/**
 *	JFrame Class to manage Tango code generator GUI.
 *
 * @author  Pascal Verdier
 */
//=======================================================
public class PogoGUI extends JFrame
{
    /**
     * True only if Display is used (false if code generator usage)
     */
    public static boolean useDisplay = false;
    /**
     * A vector to know how many JFrame has been instancied.
     * And to checked at exit button clicked, to know if at least one is still visible.
     */
    static private Vector<JFrame>   runningApplis = new Vector<JFrame>();
	/**
	 *	File Chooser Object used in file menu.
	 */
	private static  JFileChooser    chooser = null;
    private static final PogoFileFilter	pogoFilter  = new PogoFileFilter("xmi", "Tango Classes");
    private static final PogoFileFilter	pogo6Filter = new PogoFileFilter(
                                new String[] { "h", "java", "py" }, "Pogo-6 Tango Classes");
	static String		homeDir;

    //  Only for first instance, only when starting up
    private static boolean startup = true;

    /**
     * little buttons with icon on top of JTree.
     */
    private Vector<JButton> topButtons = new Vector<JButton>();
    private static final int    TOP_RELOAD  = 0;
    private static final int    TOP_NEW     = 1;
    private static final int    TOP_OPEN    = 2;
    private static final int    TOP_GENE    = 3;

    private ClassPanels class_panels;

    public static boolean  dbg_java   = false;
    public static boolean  dbg_python = false;
	//=======================================================
    /**
	 *	Creates new form PogoGUI
     * @param filename xmi file where device class is defined
     *      (do not try to load if null).
     * @throws fr.esrf.Tango.DevFailed in case of failure
     */
	//=======================================================
    public PogoGUI(String filename) throws DevFailed
	{
        this();
        checkLoadAtStartup(filename);
	}

	//=======================================================
    /**
	 *	Creates new form PogoGUI and display DeviceClass object
     * @param devclass  DeviceClass object to be edited by Pogo
     * @throws fr.esrf.Tango.DevFailed in case of failure
	 */
	//=======================================================
    public PogoGUI(DeviceClass devclass) throws DevFailed
	{
        this();

        //	Build users_tree to display info
        class_panels.addPanels(devclass);
        reBuildTabbedPane = false;
        setTitle("TANGO Code Generator - " + devclass.toString());

        //  Not from file but from new class.
        //  So set it as modified.
        class_panels.get(0).getTree().setModified(true);
	}
	//=======================================================
    /**
	 *	Creates new form PogoGUI and load device class
     * @throws fr.esrf.Tango.DevFailed in case of failure
	 */
	//=======================================================
    public PogoGUI() throws DevFailed
	{
        useDisplay = true;
        MultiLineToolTipUI.initialize();
        initComponents();
        PogoProperty.init();
        initOwnComponents();
        customizeMenus();

        //  Create a dummy panel for display
        class_panels = new ClassPanels(this);
        ClassPanel  cp = new ClassPanel(this);
        class_panels.add(cp);
        tabbedPane.add(cp);

        setTitle("TANGO Code Generator - " + PogoConst.revNumber);
        pack();
        setScreenPosition(this);
        setVisible(true);
        runningApplis.add(this);

        String  env = System.getenv("DBG_JAVA");
        if (env!=null)
            if (env.toLowerCase().equals("true"))
                dbg_java = true;
        env = System.getenv("DBG_PYTHON");
        if (env!=null)
            if (env.toLowerCase().equals("true"))
                dbg_python = true;
	}
	//===========================================================
	//===========================================================
    private void checkLoadAtStartup(String filename)
    {
        if (filename!=null && filename.length()>0)
            loadDeviceClassFromFile(filename);
        else {
            if (PogoProperty.loadPrevious)
                if (PogoProperty.projectHistory.size()>0)
                    loadDeviceClassFromFile(PogoProperty.projectHistory.get(0));
        }
        startup = false;
    }
	//===========================================================
	/**
	 *	Move specified frame to the center of the screen if first instance.
     * Else check position from other instance
     * @param frame frame to set position.
     */
	//===========================================================
	public void setScreenPosition(JFrame frame)
	{
        Point	p = new Point();

        //  If not the first one set position from previous.
        for (int i=runningApplis.size()-1 ; i>=0 ; i--) {
            JFrame parent = runningApplis.get(i);
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
        Dimension scrsize = toolkit.getScreenSize();
        Dimension appsize = frame.getSize();
        p.x = (scrsize.width  - appsize.width)/2;
        p.y = (scrsize.height - appsize.height)/2;
        frame.setLocation(p);
	}
	//=======================================================
	//=======================================================
    private void startOldPogo(String filename)
    {
        pogo.appli.PogoAppli    oldPogo = new pogo.appli.PogoAppli(filename, runningApplis);
        setScreenPosition(oldPogo);
        oldPogo.setVisible(true);
        runningApplis.add(oldPogo);
    }
	//=======================================================
	//=======================================================

	//=======================================================
	//=======================================================
	private void customizeMenus() throws DevFailed
	{
		fileMenu.setMnemonic ('F');
		newItem.setMnemonic ('N');
		newItem.setAccelerator(KeyStroke.getKeyStroke('N', Event.CTRL_MASK));
		openItem.setMnemonic ('O');
		openItem.setAccelerator(KeyStroke.getKeyStroke('O', Event.CTRL_MASK));
		generateItem.setMnemonic ('G');
		generateItem.setAccelerator(KeyStroke.getKeyStroke('G', Event.CTRL_MASK));
		exitItem.setMnemonic ('E');
		exitItem.setAccelerator(KeyStroke.getKeyStroke('Q', Event.CTRL_MASK));

		editMenu.setMnemonic ('E');
		stateMachineItem.setMnemonic ('M');
		stateMachineItem.setAccelerator(KeyStroke.getKeyStroke('M', Event.CTRL_MASK));
		deleteItem.setMnemonic ('D');
		deleteItem.setAccelerator(KeyStroke.getKeyStroke(Event.DELETE, 0));

		moveUpItem.setMnemonic ('U');
		moveUpItem.setAccelerator(KeyStroke.getKeyStroke('U', Event.CTRL_MASK));
		moveDownItem.setMnemonic ('D');
		moveDownItem.setAccelerator(KeyStroke.getKeyStroke('D', Event.CTRL_MASK));

		preferencesItem.setMnemonic ('P');
		preferencesItem.setAccelerator(KeyStroke.getKeyStroke('P', Event.CTRL_MASK));

		helpMenu.setMnemonic ('H');
		colorItem.setMnemonic ('C');
		aboutItem.setMnemonic ('A');
		
		manageRecentMenu(null);
	}
	//=======================================================
	//=======================================================
	private void manageRecentMenu(String new_proj)
	{
		try
		{
			//	Check if there is something to manage.
			if (new_proj==null && PogoProperty.projectHistory.size()==0)	//	No project histo
				return;
			
			//	Check if main class or inherited one.
			if (tabbedPane.getSelectedIndex()>0)
                return;
			
			if (new_proj!=null)
				PogoProperty.addProject(new_proj);

			//	If project history available add it in recent menu
			recentMenu.removeAll();
			for (String project : PogoProperty.projectHistory)
			{
				JMenuItem	item = new JMenuItem(project);
        		item.addActionListener(new java.awt.event.ActionListener() {
            		public void actionPerformed(java.awt.event.ActionEvent evt) {
                		recentItemActionPerformed(evt);
            		}
        		});
				recentMenu.add(item);
			}
		}
		catch(Exception e)
		{
			System.err.println("\nWARNING:	" + e);
		}
	}
	//=======================================================
	//=======================================================
	private void initOwnComponents()
	{
		Utils	utils = Utils.getInstance();
        addTopPanelButton(utils.reload_icon,  "Reload Class", false);
        addTopPanelButton(utils.new_icon,     "New Class", false);
        addTopPanelButton(utils.open_icon,    "Open Class", false);
        addTopPanelButton(utils.save_icon,    "Generate Class", false);
		
		JLabel	lbl = new JLabel("      Palette:"); 
		lbl.setFont(new Font("Dialog", Font.BOLD, 12));
		topPanel.add(lbl);
		
		addTopPanelButton(utils.classprop_icon, "Add Class Property", true);
		addTopPanelButton(utils.devprop_icon,   "Add Device Property", true);
		addTopPanelButton(utils.cmd_icon,       "Add Command", true);
		addTopPanelButton(utils.scalar_icon,    "Add ScalarAttribute", true);
		addTopPanelButton(utils.spectrum_icon,  "Add Spectrum Attribute", true);
		addTopPanelButton(utils.image_icon,     "Add ImageAttribute", true);
		addTopPanelButton(utils.state_icon,     "Add State", true);
		
		homeDir=System.getenv("SOURCE_PATH");
		if (homeDir==null)
		{
			homeDir=System.getProperty("SOURCE_PATH");
			if (homeDir==null)
				homeDir = new File("").getAbsolutePath();
		}
		chooser = new JFileChooser(new File(homeDir).getAbsolutePath());
        chooser.setFileFilter(pogo6Filter);
		chooser.setFileFilter(pogoFilter);
		//pogoFilter.setExtensionListInDescription(false);
		//pogo6Filter.setExtensionListInDescription(false);
	}
	//=======================================================
	//=======================================================
	private void addTopPanelButton(ImageIcon icon, String tip, final boolean isPalette)
	{
		JButton btn = new JButton(icon);
		btn.setToolTipText(tip);
		btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		btn.addActionListener(new java.awt.event.ActionListener() {
			 public void actionPerformed(java.awt.event.ActionEvent evt) {
			 	if (isPalette)
					paletteActionPerformed(evt);
				else
					topButtonActionPerformed(evt);
			 }
		 });
		topPanel.add(btn);
        topButtons.add(btn);
	}
	//=======================================================
	//=======================================================
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
	//=======================================================
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inherPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newItem = new javax.swing.JMenuItem();
        openItem = new javax.swing.JMenuItem();
        recentMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem dummyItem = new javax.swing.JMenuItem();
        generateItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem reLoadItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        stateMachineItem = new javax.swing.JMenuItem();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        deleteItem = new javax.swing.JMenuItem();
        moveUpItem = new javax.swing.JMenuItem();
        moveDownItem = new javax.swing.JMenuItem();
        preferencesItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem sitePreferencesItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        colorItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem releaseItem = new javax.swing.JMenuItem();
        aboutItem = new javax.swing.JMenuItem();
        javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
        javax.swing.JMenuItem tangoItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem pogoItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem kernelItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem classItem = new javax.swing.JMenuItem();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        inherPanel.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(inherPanel, java.awt.BorderLayout.EAST);

        topPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        getContentPane().add(topPanel, java.awt.BorderLayout.PAGE_START);

        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });
        getContentPane().add(tabbedPane, java.awt.BorderLayout.CENTER);

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

        reLoadItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        reLoadItem.setText("Re-Load project");
        reLoadItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reLoadItemActionPerformed(evt);
            }
        });
        fileMenu.add(reLoadItem);

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

        stateMachineItem.setText("State Machine");
        stateMachineItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateMachineItemActionPerformed(evt);
            }
        });
        editMenu.add(stateMachineItem);
        editMenu.add(jSeparator1);

        deleteItem.setText("Delete Selection");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteItem);

        moveUpItem.setText("Move Up");
        moveUpItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveUpItemActionPerformed(evt);
            }
        });
        editMenu.add(moveUpItem);

        moveDownItem.setText("Move Down");
        moveDownItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveDownItemActionPerformed(evt);
            }
        });
        editMenu.add(moveDownItem);

        preferencesItem.setText("Preferences");
        preferencesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferencesItemActionPerformed(evt);
            }
        });
        editMenu.add(preferencesItem);

        sitePreferencesItem.setText("Site Preferences");
        sitePreferencesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sitePreferencesItemActionPerformed(evt);
            }
        });
        editMenu.add(sitePreferencesItem);

        jMenuBar1.add(editMenu);

        helpMenu.setText("Help");

        colorItem.setText("On Color");
        colorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorItemActionPerformed(evt);
            }
        });
        helpMenu.add(colorItem);

        releaseItem.setText("Release Notes");
        releaseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releaseItemActionPerformed(evt);
            }
        });
        helpMenu.add(releaseItem);

        aboutItem.setText("about");
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

        pogoItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        pogoItem.setText("Pogo Pages");
        pogoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogoItemActionPerformed(evt);
            }
        });
        helpMenu.add(pogoItem);

        kernelItem.setText("Kernel Pages");
        kernelItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kernelItemActionPerformed(evt);
            }
        });
        helpMenu.add(kernelItem);

        classItem.setText("Device Class Pages");
        classItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classItemActionPerformed(evt);
            }
        });
        helpMenu.add(classItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

	//=======================================================
	//=======================================================
    private void recentItemActionPerformed(java.awt.event.ActionEvent evt)
	{
		String proj_name = ((JMenuItem)evt.getSource()).getText();
		loadDeviceClassFromFile(proj_name);
	}
	//=======================================================
	//=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed

        chooser.setFileFilter(pogoFilter);
		int	retval = chooser.showOpenDialog(this);
		if (retval==JFileChooser.APPROVE_OPTION) {
			File	file = chooser.getSelectedFile();
			if (file!=null) {
				if (!file.isDirectory()) {
					homeDir = file.getParentFile().toString();
					loadDeviceClassFromFile(file.getAbsolutePath());
				}
			}
		}
    }//GEN-LAST:event_openItemActionPerformed
	//=======================================================
	//=======================================================
	private void buildTree(DeviceClass devclass)
	{ 
		//	Check if ClassIdentification has already been defined.
		ClassIdentification	id = devclass.getPogoDeviceClass().getDescription().getIdentification();

        //  Manage Device ID
		if (id==null && !Utils.isTrue(System.getenv("TEST_MODE")))
		{
			Utils.getInstance().stopSplashRefresher();
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			DeviceIdDialog	dialog = new DeviceIdDialog(this);
			if (dialog.showDialog()==JOptionPane.OK_OPTION)
			{
				id = dialog.getInputs();
				devclass.getPogoDeviceClass().getDescription().setIdentification(id);
			}
			else
				return;		//	No ID definition, do not edit
		}

        reBuildTabbedPane = true;
        tabbedPane.removeAll();

        class_panels.addPanels(devclass);
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
        
        exitAppli();
   }//GEN-LAST:event_exitForm
	//=======================================================
    /**
     * Manage if modification(s) has been done, and propose to generate trhem.
     * @return JOptionPane.OK_OPTION to continue, JOptionPane.CANCEL_OPTION if cancel has been choosen
     */
	//=======================================================
    private int checkModifications()
    {
        for (ClassPanel class_panel : class_panels)
        {
            if (class_panel.getTree()!=null &&
                class_panel.getTree().getModified())
            {
                String name = class_panel.getName();
                Object[] options = {"Generate", "Discard", "Cancel"};
                switch (JOptionPane.showOptionDialog(this,
                        name + " project has not been generated !\n\n",
                        "Warning",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]))
                {
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
    private void exitAppli()
    {
        if (checkModifications()==JOptionPane.OK_OPTION) {

            this.setVisible(false);
            // Check to know if at least one is still visible.
            for (JFrame frame : runningApplis)
                if (frame.isVisible())
                    return;
            //  No visible found.
            System.exit(0);
        }
    }
	//=======================================================
	//=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void generateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateItemActionPerformed

        int idx = tabbedPane.getSelectedIndex();
        ClassTree tree = class_panels.getSelectedTree();
		if (tree==null)	//	No class defined in tree
			return;
        generateSourceFiles(tree);
    }
    //=======================================================
    //=======================================================
    private boolean generateSourceFiles(ClassTree tree)
    {
		//	First time check output path
		GenerateDialog	dialog = new GenerateDialog(this);
		DeviceClass		devclass = tree.getDeviceClass();

		if (devclass==null)	//	No class defined in tree or cannot get it (ID is null)
			return true;
		if (dialog.showDialog(devclass)==JOptionPane.OK_OPTION)
		{
			//	Then generate code and save
			Cursor	cursor = new Cursor(Cursor.WAIT_CURSOR);
			setCursor(cursor);
			try
			{
				devclass = dialog.getDevClass();
				Utils.getInstance().startSplashRefresher(
									"Generate class: " +
									 devclass.getPogoDeviceClass().getName());

				devclass.generate(tree.getDeletedObjects(),
									tree.getRenamedObjects());

				Utils.getInstance().stopSplashRefresher();
				
				//	Update ClassTree object.
				tree.setModified(false);
				tree.setSrcPath(devclass.getPogoDeviceClass().getDescription().getSourcePath());

				manageRecentMenu(devclass.getProjectFilename());
			}
			catch (Exception e)
			{
				Utils.getInstance().stopSplashRefresher();
                cursor = new Cursor(Cursor.DEFAULT_CURSOR);
                setCursor(cursor);
				ErrorPane.showErrorMessage(this, null, e);
                return false;
			}
			cursor = new Cursor(Cursor.DEFAULT_CURSOR);
			setCursor(cursor);
            return true;
		}
        else
            return false;

	}//GEN-LAST:event_generateItemActionPerformed

	//=======================================================
	//=======================================================
	private boolean reBuildTabbedPane = false;
    @SuppressWarnings({"UnusedDeclaration"})
	private void newItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemActionPerformed

		ClassDialog	dialog = new ClassDialog(this);
		if (dialog.showDialog()==JOptionPane.OK_OPTION) {

            DeviceClass devclass = dialog.getInputs();
            if (class_panels.getSelectedTree()!=null) {
                try {
                    new PogoGUI(devclass);
                    return;
                }
                catch (Exception e) {
                    Utils.getInstance().stopSplashRefresher();
                    ErrorPane.showErrorMessage(this, null, e);
                }

            }

            //  Display it in this panel
			reBuildTabbedPane = true;
            tabbedPane.removeAll();

            //	Build users_tree to display info
            class_panels.addPanels(devclass);
            class_panels.checkWarnings();
			reBuildTabbedPane = false;
		}
	}//GEN-LAST:event_newItemActionPerformed

	//=======================================================
	//=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed

        ClassTree tree = class_panels.getSelectedTree();
		Object	selection = tree.getSelectedEditableObject();
		if (selection!=null)
			tree.removeSelectedItem();

	}//GEN-LAST:event_deleteItemActionPerformed
	//=======================================================
	//=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void moveUpItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveUpItemActionPerformed

        ClassTree tree = class_panels.getSelectedTree();
		Object	selection = tree.getSelectedEditableObject();
		if (selection!=null)
			tree.moveSelectedItem(true);
	}//GEN-LAST:event_moveUpItemActionPerformed
	//=======================================================
	//=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void moveDownItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveDownItemActionPerformed

        ClassTree tree = class_panels.getSelectedTree();
		Object	selection = tree.getSelectedEditableObject();
		if (selection!=null)
			tree.moveSelectedItem(false);
	}//GEN-LAST:event_moveDownItemActionPerformed

	//=======================================================
	//=======================================================
    private void reloadProject() {

         if (class_panels.getSelectedTree()!=null) {
             if (checkModifications()==JOptionPane.OK_OPTION) {
                 String filename = class_panels.get(0).getTree().getClassFileName();
                 if (filename!=null) {
                     //System.out.println("Reload "+filename);
                     loadDeviceClassFromFile(filename, false);
                 }
             }
         }
    }
	//=======================================================
	//=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void topButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        JButton src = (JButton) evt.getSource();
        for (int i=0 ; i<topButtons.size() ; i++)
            if (topButtons.get(i)==src)
                switch(i)
                {
                    case TOP_RELOAD:
                        reloadProject();
                        break;
                    case TOP_NEW:
                        newItemActionPerformed(evt);
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
	private void paletteActionPerformed(java.awt.event.ActionEvent evt)
    {
        ClassTree tree = class_panels.getSelectedTree();
		if (tree!=null)
		{
			JButton	btn = (JButton) evt.getSource();
			String	txt = btn.getToolTipText();
			tree.addItem(txt);
		}
	}
	//=======================================================
	//=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void stateMachineItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateMachineItemActionPerformed

		ClassTree tree = class_panels.getSelectedTree();
		if (tree!=null)
			tree.editStateMachine();

	}//GEN-LAST:event_stateMachineItemActionPerformed

    //=======================================================
    //=======================================================
    @SuppressWarnings({"UnusedDeclaration"})
	private void editMenuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_editMenuStateChanged

        if (class_panels==null)
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

				"             Pogo  (Tango Code Generator)\n"+
				"This programme is able to generate, update and modify\n" +
				"                 Tango device classes.\n\n" +
				PogoConst.revNumber +
				"\n\n"+
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
		new PopupHtml(this).show(ReleaseNote.str, 550, 400);
     }//GEN-LAST:event_releaseItemActionPerformed

	//=======================================================
	//=======================================================
	private DeviceClass  generateFromOldAndReload(DeviceClass devclass, String filename) throws DevFailed
	{
		Utils.getInstance().stopSplashRefresher();
		Cursor	cursor = new Cursor(Cursor.DEFAULT_CURSOR);
		setCursor(cursor);

		boolean recoverCode;
        //  If old class is not abstrac, ask if code must be inserted.
        String  message =
                "         Class:  " + devclass.toString() + "  loaded.\n" +
                "         This device class has been generated by an old version of Pogo\n\n"+
                "                       Do you want to convert and reload ?\n\n";
        if (devclass.isOldPogoModelAbstract()) {
            if (JOptionPane.showConfirmDialog(this,
                    message,
                    "Confirmation Window",
                    JOptionPane.YES_NO_OPTION)!=JOptionPane.OK_OPTION)
                return null;
            recoverCode = false;    //  No code to be recovered in abstract class
        }
        else {
            Object[] options = {"Convert and Insert User Code",
                                "Convert Class Only",
                                "Cancel"};
            int choice = JOptionPane.showOptionDialog(this,
                        message,
                        "Confirmation Window",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);


            switch(choice) {
            case 0:    //	Convert and Try to Insert User Code
                //  Add a test for the inheritance
                if (OldPogoModel.checkForInheritance(this, devclass)==JOptionPane.CANCEL_OPTION)
                    return null;
                recoverCode = true;
                break;
            case 1:    // Convert Class Only
                //  Add a test for the inheritance 
                if (OldPogoModel.checkForInheritance(this, devclass)==JOptionPane.CANCEL_OPTION)
                    return null;
                recoverCode = false;
                break;
            case 2:    //	Cancel
            case -1:   //	escape
            default:
                return null;
            }
        }
		cursor = new Cursor(Cursor.DEFAULT_CURSOR);
		setCursor(cursor);

		//	OK generate in a new dir
		Utils.getInstance().startSplashRefresher(
				"Generate  source files fo " +  devclass.getPogoDeviceClass().getName());

		devclass.generateFromOldModel(filename, recoverCode);

		//	And reload from new dir
		String	env = System.getenv("TEST_MODE");
		String	dir = (Utils.isTrue(env) ? PogoConst.CONVERTION_DIR : "");	//	Same dir if no test
		String	new_filename = Utils.getPath(filename) + dir +
						"/" + devclass.getPogoDeviceClass().getName() + ".xmi";
		Utils.getInstance().startSplashRefresher(
				"Loading  " + Utils.getRelativeFilename(new_filename));

		devclass = new DeviceClass(new_filename);
		JOptionPane.showMessageDialog(new JFrame(),
					"Device class source files have been generated in :\n"+
					 Utils.getPath(filename) + dir,
					"Message Window",
					JOptionPane.INFORMATION_MESSAGE);
        manageRecentMenu(devclass.getProjectFilename());
        
		return devclass;
	}
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
    private void kernelItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kernelItemActionPerformed
        Utils.showInHtmBrowser(PogoConst.tangoHTTP[PogoConst.KERNEL_PAGES]);
    }//GEN-LAST:event_kernelItemActionPerformed
    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})
    private void classItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classItemActionPerformed
        Utils.showInHtmBrowser(PogoConst.tangoHTTP[PogoConst.CLASS_PAGES]);
    }//GEN-LAST:event_classItemActionPerformed

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
	//=======================================================
	//=======================================================
	private void loadDeviceClassFromFile(String filename) {
        loadDeviceClassFromFile(filename, true);
    }
	//=======================================================
	//=======================================================
	private void loadDeviceClassFromFile(String filename, boolean checkForNewFrame) {
        //  Not called any more --> open a new JFrame !
        //if (checkModifications()==JOptionPane.CANCEL_OPTION)
        //    return;

        Cursor	cursor = new Cursor(Cursor.WAIT_CURSOR);
        manageRecentMenu(filename);

        if ((filename.endsWith(".java") && !dbg_java) ||
            (filename.endsWith(".py")   && !dbg_python)) {

            System.out.println("-------> filename: " + filename + "   - Starting old Pogo");
            startOldPogo(filename);
            return;
        }

		try {
            if (checkForNewFrame) {
                //  If not first one, New Frame
                if (class_panels.getSelectedTree()!=null)  {
                    new PogoGUI(filename);
                    return;
                }
            }
            //  Else do it
            setCursor(cursor);
            Utils.getInstance().startSplashRefresher(
                    "Loading  " + Utils.getRelativeFilename(filename));
            
			DeviceClass	devclass = new DeviceClass(filename);

			//	If from old POGO, generate and reload
			if (devclass.isOldPogoModel()) {
				devclass = generateFromOldAndReload(devclass, filename);
				if (devclass == null)
					return;
			}
			
			Utils.getInstance().startSplashRefresher(
					"Building  " + Utils.getRelativeFilename(filename));
			buildTree(devclass);
            setTitle("TANGO Code Generator - " + devclass.toString());
			cursor = new Cursor(Cursor.DEFAULT_CURSOR);
			setCursor(cursor);
			Utils.getInstance().stopSplashRefresher();
		}
		catch (DevFailed e) {
			Utils.getInstance().stopSplashRefresher();

            if (startup)
                System.err.println(e.errors[0].desc);
            else
			if (!e.errors[0].reason.equals("CANCEL"))
				ErrorPane.showErrorMessage(this, filename, e);
		}
		cursor = new Cursor(Cursor.DEFAULT_CURSOR);
		setCursor(cursor);
        class_panels.checkWarnings();
	}
	//=======================================================
	//=======================================================
	boolean itemAlreadyExists(String name, int type)
	{
        ClassTree tree = class_panels.getSelectedTree();
		return tree.itemAlreadyExists(name, type);
	}
	//=======================================================
	//=======================================================
    ClassPanels getClassPanels()
    {
        return class_panels;
    }
	//=======================================================
	//=======================================================
    void setTabbedPaneSelection(ClassPanel panel)
    {
        tabbedPane.setSelectedComponent(panel);
    }
	//=======================================================
	//=======================================================
    void fireClassHaveChanged()
    {
        for (int i=0 ; i<class_panels.size() ; i++)
            tabbedPane.setTitleAt(i, class_panels.get(i).toString());
    }
	//=======================================================
	//=======================================================

	//=======================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JMenuItem colorItem;
    private javax.swing.JMenuItem deleteItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem generateItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel inherPanel;
    private javax.swing.JMenuItem moveDownItem;
    private javax.swing.JMenuItem moveUpItem;
    private javax.swing.JMenuItem newItem;
    private javax.swing.JMenuItem openItem;
    private javax.swing.JMenuItem preferencesItem;
    private javax.swing.JMenu recentMenu;
    private javax.swing.JMenuItem stateMachineItem;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
	//=======================================================



    //=======================================================
    /**
     * This class is a vector of panels displaying JTrees
     */
    //=======================================================
    private class ClassPanels extends Vector<ClassPanel>
    {
        private PogoGUI gui;
        private String  warnings = "";
        private static final long serialVersionUID = -3468411367658544269L;

        //=======================================================
        private ClassPanels(PogoGUI gui)
        {
            this.gui = gui;
        }
        //=======================================================
        private ClassTree getSelectedTree()
        {
            return get(tabbedPane.getSelectedIndex()).getTree();
        }
        //=======================================================
        private void addPanel(DeviceClass devclass)
        {

            ClassPanel  cp = new ClassPanel(gui);
            cp.setTree(devclass);
            add(cp);
            tabbedPane.add(cp);
        }
        //=======================================================
        private void addPanels(DeviceClass devclass)
        {
            //  Reset if needed
            removeAllElements();
            tabbedPane.removeAll();
            warnings = org.tango.pogo.pogo_gui.InheritanceUtils.getInstance().manageInheritanceItems(devclass);

            addPanel(devclass);

            //  manage inheritance elements
            Vector<DeviceClass> ancestors = devclass.getAncestors();
            for (int i=ancestors.size()-1 ; i>=0 ; i--) {
                addPanel(ancestors.get(i));
            }

            //  Build inheritance panel
            getContentPane().remove(inherPanel);
            inherPanel = new InheritancePanel(devclass, gui);
            getContentPane().add(inherPanel, java.awt.BorderLayout.EAST);
            pack();
        }
        //=======================================================
        private void checkWarnings()
        {
            if (warnings.length()>0)
            {
                Utils.getInstance().stopSplashRefresher();
                JOptionPane.showMessageDialog(gui,
                        "Inheritance change(s):\n" + warnings,
                        "Warning Window", JOptionPane.WARNING_MESSAGE);
            }
        }
        //=======================================================
        private void updateInheritancePanelForSelection()
        {
			if (!reBuildTabbedPane)
			{
	            ClassPanel  panel = (ClassPanel) tabbedPane.getSelectedComponent();
    	        if (inherPanel instanceof InheritancePanel)
        	        ((InheritancePanel)inherPanel).setSelected(panel.getName());
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
}
