//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Pogo class definition .
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.26  2005/12/07 13:24:51  pascal_verdier
// *** empty log message ***
//
// Revision 3.25  2005/12/07 11:59:02  pascal_verdier
// Tag command added in Makefile.
//
// Revision 3.24  2005/11/24 08:28:45  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.23  2005/11/07 08:40:46  pascal_verdier
// Memorized attribute written or not at starteup added.
//
// Revision 3.22  2005/10/12 13:56:22  pascal_verdier
// Do not display any more splash screen at startup.
//
// Revision 3.21  2005/09/06 06:10:26  pascal_verdier
// Bug on display message about Device_2 to Device_3 fixed.
//
// Revision 3.20  2005/06/14 08:48:39  pascal_verdier
// SuperClass is replaced by AbstractClass.
//
// Revision 3.19  2005/03/30 09:13:32  pascal_verdier
// Command line has been added.
//
// Revision 3.18  2005/03/29 15:07:16  pascal_verdier
// Cancel on open file bug fixed.
//
// Revision 3.17  2005/03/29 15:01:29  pascal_verdier
// Bug on change class name fixed.
//
// Revision 3.16  2005/03/11 15:04:52  pascal_verdier
// Pathes have been changed.
//
// Revision 3.15  2005/03/11 14:15:36  pascal_verdier
// Abstract class management is not only in test mode.
//
// Revision 3.14  2005/03/02 14:02:16  pascal_verdier
// Managing Abstract Classes and inherited classes.
//
// Revision 3.13  2005/02/23 12:15:27  pascal_verdier
// 4.1.2 tag version.
//
// Revision 3.12  2005/01/25 15:29:09  pascal_verdier
// ATTR_SOLEIL param added to do not force upper case at befinig of attribute name.
//
// Revision 3.11  2005/01/24 08:43:36  pascal_verdier
// Modifying previous files if class name has changed.
//
// Revision 3.10  2005/01/17 15:44:46  pascal_verdier
// *** empty log message ***
//
// Revision 3.9  2004/11/29 09:56:46  pascal_verdier
// Check for difference between java and cpp revisions added.
//
// Revision 3.8  2004/11/22 15:28:08  pascal_verdier
// Javadoc tags correction.
//
// Revision 3.7  2004/11/22 11:12:06  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.6  2004/11/03 09:57:16  pascal_verdier
// Help on What's new added.
//
// Revision 3.5  2004/10/21 06:54:46  pascal_verdier
// Check for non double item definitions
// for add, edit and clone item.
//
// Revision 3.4  2004/09/24 11:17:41  pascal_verdier
// Automatic revision number update at jar genaration.
//
// Revision 3.3  2004/09/07 12:02:44  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.2  2004/09/02 06:43:12  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
//
// Revision 3.1  2004/08/26 07:25:35  pascal_verdier
// Attributes are now generated as class.
// Look and field changed.
//
// Revision 3.0  2003/04/29 10:42:14  pascal_verdier
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
//               All Rights Reversed
//-======================================================================

package pogo.appli;


import pogo.gene.*;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

//===========================================================
/**
 *  This is class managing the main window for the POGO
 *  (Program Obviously used to Generate tango Object) application.
 *	This application is able to specify a TANGO device server,
 *	and generate the source code for this server.
 *
 *  @see <a href=http://www.esrf.fr/tango/ target="new"> Tango Pages</a>
 */
//===========================================================
public class PogoAppli extends JFrame
            implements PogoAppliDefs, PogoDefs {
/**
 *  Initialized by make jar call and used to display title.
 */
private static String revNumber = "Release 4.4.6  -  Thu Dec 08 10:17:33 CET 2005";
/**
 *  JTree used to display <a href=../gene/PogoClass.html>PogoClass</a> object.
 */
static PogoTree  tree;
/**
 *  Pogo object definition (used to define project and generate source file).
 */
static private PogoClass  pogo;
/**
 *  Director to start file selection.
 *  Could be set with 'HOME_GENE' property.
 */
static private String  homeDir;
/**
 *	File Chooser Object used in file menu.
 */
static private JFileChooser  chooser;

//===========================================================
/**
 *  Constructor for PogoAppli object.
 *  Initialize JFrame
 *  And initialize Jtree and all Pogo graphic application..
 */
 //===========================================================
	public PogoAppli()
	{
		initComponents ();

		//  Create Pogo Tree
		//------------------------------
		tree = new PogoTree(this);

		jScrollPane1.setPreferredSize(new Dimension(300, 450));
		jScrollPane1.setViewportView (tree);
		jScrollPane1.setBackground(tree.getBackground());
		customMenu();
		setPogoDefined(false);
		setTitle("POGO - " + revNumber);

		ImageIcon icon = new ImageIcon(
			getClass().getResource("/app_util/img/tango_icon.jpg"));
		setIconImage(icon.getImage());

		pack ();
		centerWindow();
	}

//===========================================================
/**
 *	Move the window to the center of the screen
 */
//===========================================================
	public void centerWindow() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension scrsize = toolkit.getScreenSize();
		Dimension appsize = getSize();
		Point	p = new Point();
		p.x = (scrsize.width  - appsize.width)/2;
		p.y = (scrsize.height - appsize.height)/2;
		setLocation(p);
	}
//===========================================================
/** This method is called from within the constructor to
 * initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is
 * always regenerated by the FormEditor.
 */
//===========================================================
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        southPanel = new javax.swing.JPanel();
        mousePanel = new javax.swing.JPanel();
        leftBtnLabel = new javax.swing.JLabel();
        rightBtnLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cppBtn = new javax.swing.JRadioButton();
        javaBtn = new javax.swing.JRadioButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        importMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        geneSrcBtn = new javax.swing.JMenuItem();
        geneDocBtn = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        deleteMenuItem = new javax.swing.JMenuItem();
        moveUpItem = new javax.swing.JMenuItem();
        moveDownItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        whatNewBtn = new javax.swing.JMenuItem();
        releaseBtn = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        aboutMenuItem = new javax.swing.JMenuItem();

        setTitle("Pogo Appli");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jScrollPane1.setBackground(java.awt.Color.white);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        southPanel.setLayout(new java.awt.BorderLayout());

        mousePanel.setLayout(new java.awt.BorderLayout());

        leftBtnLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mousePanel.add(leftBtnLabel, java.awt.BorderLayout.CENTER);

        mousePanel.add(rightBtnLabel, java.awt.BorderLayout.NORTH);

        southPanel.add(mousePanel, java.awt.BorderLayout.CENTER);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setText("Language Generated: ");
        jPanel1.add(jLabel1);

        cppBtn.setText("C++");
        cppBtn.setToolTipText("The device server will be generated in C++");
        cppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageBtnAP(evt);
            }
        });

        jPanel1.add(cppBtn);

        javaBtn.setText("Java");
        javaBtn.setToolTipText("The device server will be generated in Java");
        javaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageBtnAP(evt);
            }
        });

        jPanel1.add(javaBtn);

        southPanel.add(jPanel1, java.awt.BorderLayout.NORTH);

        getContentPane().add(southPanel, java.awt.BorderLayout.SOUTH);

        fileMenu.setText("File");
        fileMenu.setName("File");
        newMenuItem.setText("New Class");
        newMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuItemActionPerformed(evt);
            }
        });

        fileMenu.add(newMenuItem);

        openMenuItem.setText("Open");
        openMenuItem.setToolTipText("Open Class File");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });

        fileMenu.add(openMenuItem);

        importMenuItem.setText("Import");
        importMenuItem.setToolTipText("import TACO server");
        importMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importMenuItemActionPerformed(evt);
            }
        });

        fileMenu.add(importMenuItem);

        fileMenu.add(jSeparator1);

        geneSrcBtn.setText("Generate Source");
        geneSrcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateAP(evt);
            }
        });

        fileMenu.add(geneSrcBtn);

        geneDocBtn.setText("Generate Doc.");
        geneDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateAP(evt);
            }
        });

        fileMenu.add(geneDocBtn);

        fileMenu.add(jSeparator2);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });

        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                editAP(evt);
            }
        });

        deleteMenuItem.setText("Delete");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });

        editMenu.add(deleteMenuItem);

        moveUpItem.setText("Move Up");
        moveUpItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveUpActionPerformed(evt);
            }
        });

        editMenu.add(moveUpItem);

        moveDownItem.setText("Move Down");
        moveDownItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveDownActionPerformed(evt);
            }
        });

        editMenu.add(moveDownItem);

        menuBar.add(editMenu);

        helpMenu.setText("Help");
        contentsMenuItem.setText("Shortcuts");
        contentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpAP(evt);
            }
        });

        helpMenu.add(contentsMenuItem);

        whatNewBtn.setText("What's New ?");
        whatNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpAP(evt);
            }
        });

        helpMenu.add(whatNewBtn);

        releaseBtn.setText("Release Notes");
        releaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpAP(evt);
            }
        });

        helpMenu.add(releaseBtn);

        helpMenu.add(jSeparator4);

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpAP(evt);
            }
        });

        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

    }
    // </editor-fold>//GEN-END:initComponents


//===========================================================
/**
 *  Called on Move down button.
 *  Move down the selected item.
 */
//===========================================================
	private void moveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveDownActionPerformed

		tree.moveSelection("Down");
	}//GEN-LAST:event_moveDownActionPerformed

//===========================================================
/**
 *  Called on Move up button.
 *  Move up the selected item.
 */
//===========================================================
	private void moveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveUpActionPerformed

		tree.moveSelection("Up");
	}//GEN-LAST:event_moveUpActionPerformed

//===========================================================
/**
 *  Called on Edit menu buttoncliked.
 *  Check if a leaf is selected or not.
 *  And then enable or not the buttons.
 */
//===========================================================
  private void editAP (javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_editAP

	boolean		state  = tree.isLeafSelected();

	deleteMenuItem.setEnabled(state);
	moveUpItem.setEnabled(state);
	moveDownItem.setEnabled(state);
  }//GEN-LAST:event_editAP


//===========================================================
/**
 *  Called on one item of help menu cliked.
 */
//===========================================================
	private void helpAP (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpAP

		String  cmd = evt.getActionCommand();
		String  message = null;

		if (cmd.equals("About"))
			message = PogoAppliDefs.helpAbout +"\n\n" + revNumber +
						"\n\n"+
						"Pascal Verdier - Software Engineering Group - ESRF";
		else
		if (cmd.startsWith("Release"))
			new app_util.PopupHtml(this, true).show(ReleaseNote.str);
		else
			message = PogoUtil.getHelpMessage(cmd);

		if (message!=null)
			app_util.PopupMessage.showImage(this, message, "/app_util/img/tango_icon.jpg");
	}//GEN-LAST:event_helpAP


//===========================================================
/**
 *  Called on New item menu cliked.
 */
//===========================================================
  private void newMenuItemActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemActionPerformed

	//	Do not open a new project if this one
	//	has been modified and not saved.
	//----------------------------------------------------
	if (tree!=null && tree.hasBeenModified())
	{
		Object[] options = { "OK", "CANCEL" };
		if (JOptionPane.showOptionDialog(this,
				"This project has not been saved !\n\nDiscard modifications ?",
				"Warning",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE,
				null, options, options[0])!=JOptionPane.OK_OPTION)
			return;
	}
	//  Check if home dir has been initialize
	//------------------------------------------------
	if (homeDir==null)
		if ((homeDir=System.getProperty("HOME_GENE"))==null)
			homeDir = new File("").getAbsolutePath();
	//  Open Dialog
	//------------------
	ClassDialog  classDialog = new ClassDialog(this, new ServerDefinitions());
	if (classDialog.showDialog()== PogoAppliDefs.RET_OK)
	{
		//	Remove Old Project, if exists
		//----------------------------------
		if (tree!=null)
		{
			setPogoDefined(false);
			versionLabel.setText ("");
			pogo = null;
		}
		//	Create New Project
		//----------------------------------
		try
		{
			ServerDefinitions	sd = classDialog.getInput();
			if (sd==null)
				return;
			//	If inheritance from super Class load it
			if (sd.inherited_from.equals(tangoDeviceImpl)==false)
			{
				pogo = new PogoClass(sd.inherited_from);
				//	But keep info taken from dialog
				pogo.class_name     = sd.name;
				pogo.is_abstractclass  = false;
				pogo.inherited_from = sd.inherited_from;
				pogo.class_desc     = sd.description;
				pogo.title          = sd.project_title;
			}
			else
				pogo = new PogoClass(sd, getLanguage(), homeDir);
			tree.setPogoTree(pogo);
			setPogoDefined(true);
			resetLanguage();
			tree.setHomeDir(homeDir);
		}
		catch (PogoException ex) {
			app_util.PopupError.show(this, ex);
		}
		catch (Exception e) {
			app_util.PopupError.show(this, e);
		}
	}
  }//GEN-LAST:event_newMenuItemActionPerformed



//===========================================================
/**
 *  Called on Generate item menu cliked.
 */
//===========================================================
  private void generateAP (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateAP

	String type = evt.getActionCommand();

	if (type.indexOf("Source")>0)
		generateSource(GENE_SRC);
	else
	if (type.indexOf("Doc.")>0)
	{
		//	Before Doc generation check if project
		//	has been modified and saved.
		//----------------------------------------------------

		if (tree!=null)
			if (tree.hasBeenModified())
			{
				Object[] options = {"Generate Source\n Before",
									"Generate Only\n Documentation",
									"CANCEL" };
				switch(JOptionPane.showOptionDialog(this,
						"The source files have not been generated !\n" +
						"The programmer's guide generation use source files.\n\n\n",
						"Warning",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE,
						null, options, options[0]))
				{
				case 0:
					generateSource(GENE_SRC);
					generateSource(GENE_DOC);
					break;
				case 1:
					generateSource(GENE_DOC);
					break;
				}
			}
			else
				generateSource(GENE_DOC);
	}
  }//GEN-LAST:event_generateAP

//===========================================================
/**
 *  Called on one of the language toggle buttons is clicked.
 */
//===========================================================
	private void languageBtnAP (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageBtnAP
		String  lang = evt.getActionCommand();

		if (lang.equals("Java"))
		{
			cppBtn.setSelected(false);
			javaBtn.setSelected(true);
			PogoClass  server = tree.getPogoClass();
			//	Check for inheritance (not available in java)
			if (pogo.inherited_from!=null &&
				pogo.inherited_from.equals(tangoDeviceImpl)==false)
			{
				app_util.PopupMessage.show(this,
					"Java classes inheritance is not yet available");
				cppBtn.setSelected(true);
				javaBtn.setSelected(false);
				return;
			}
			//	Check for difference between java and cpp revisions.
			String[]	problems = server.attributes.isJavaCompatible();
			if (problems!=null)
			{
				app_util.PopupMessage.show(this,
					"WARNING: Java Servers API do not support:", problems);
			}
		}
		else
		{
			cppBtn.setSelected(true);
			javaBtn.setSelected(false);
		}
		//	Update Tree global param.

		tree.setLanguage(getLanguage());

	}//GEN-LAST:event_languageBtnAP


//======================================================
/**
 *  Generate source files.
 *
 *  Buid a PogoClass from the interface JTree,
 *  get the output langage to generate and call
 *  the popo.gene.PogoGene Class to generate source files.
 *
 *  @param  item GENE_SRC to generate Cpp or Java source files or
 *			GENE_DOC to generate html documentation.
 *  @see <a href=pogo/gene/PogoGene.html> PogoGene Class</a>
 */
//======================================================
  private void generateSource(int item)
  {
  	generateSource(item, DONT_EXIT_ON_RETURN);
  }
  private void generateSource(int item, int exiting)
  {
	//  Check if home dir has been initialize
	//------------------------------------------------
	if (homeDir==null)
		if ((homeDir=System.getProperty("HOME_GENE"))==null)
			homeDir = new File("").getAbsolutePath();

	int	lang=0;
	lang = getLanguage();
	//  Build a pogo class from tree
	//---------------------------------------
	tree.setLanguage(lang);
	PogoClass  server = tree.getPogoClass();
	if (server==null)  return;

	//	Confirm for output files dir.
	//---------------------------------
	if (item==GENE_SRC)
	{
		PrefGeneDialog	dialog = new PrefGeneDialog(this, lang);
		if (dialog.showDialog(homeDir, server.is_abstractclass) != PogoAppliDefs.RET_OK)
			return;
		homeDir = dialog.getOutputPath();
		server.is_abstractclass = dialog.getOutputModel();
		tree.setHomeDir(homeDir);
		tree.setOutputModel(server.is_abstractclass);
	}
	if (lang==javaLang)
	{
		//	if JAVA Check if Dir name is same as class name (used as package name)
		StringTokenizer st = new StringTokenizer(homeDir, "/");
		String			dir = null;
		while (st.countTokens()>0)
			dir = st.nextToken().toString();
		//	Display warning
		if (pogo.class_name.equals(dir)==false)
		{
			String[] options = {"Generate Source", "CANCEL" };
			if (JOptionPane.showOptionDialog(this, new String(
						"The Class name will be used as package name.\n\n" +
						"But the directory does not have the Class name !\n\n"+
						"Problem will occur when you try to compile.\n"),
						"Warning",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE,
						null, options, options[1]) == 1)
			{
				return;
			}
		}
		//	Check for inheritance (not available in java)
		if (pogo.inherited_from!=null &&
			pogo.inherited_from.equals(tangoDeviceImpl)==false)
		{
			app_util.PopupMessage.show(this,
				"Java classes inheritance is not yet available");
			return;
		}

		//	Check for difference between java and cpp revisions.
		String[]	problems = server.attributes.isJavaCompatible();
		if (problems!=null)
		{
			app_util.PopupMessage.show(this, "Java Servers API do not support:", problems);
			return;
		}
	}

	//	And get the data out of tree from previous pogo object
	//-------------------------------------------------------------
	server.projectFiles.setPath(homeDir) ;
	server.author       = pogo.author;
	server.revision     = pogo.revision;

	//	Check if class name has been changed and path is same,
	//	to know if class name must be changed in old files
	if (lang==cppLang &&
		server.projectFiles.getOriginalClassName()!=null &&
		server.projectFiles.getOriginalPath()!=null)
	{
		 if (server.class_name.equals(
			server.projectFiles.getOriginalClassName())==false &&
			homeDir.equals(server.projectFiles.getOriginalPath()))
		{
			Object[] options = { "Modify", "New Files", "CANCEL" };
			switch (JOptionPane.showOptionDialog(this,
						"The class name has been modified !\n\n" +
						"Would you like to modify old files or create new ones ?",
						"Warning",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE,
						null, options, options[0]))

			{
			case 0:	//	Modify old files
				System.out.println("Modify old files");
				try
				{
					new PogoGeneCpp(server).changeClassName();
				}
				catch(Exception e){
					app_util.PopupError.show(this, e);
				}
				break;
			case 1:	//	Create new files
				System.out.println("Create new files");
				break;
			case 2:	//	Cancel
				return;
			}
		}
	}

	//  get language and generate DS
	//----------------------------------------
	server.language = getLanguage();
	GenerateThread	gt =
		new GenerateThread(this, server, item, homeDir, exiting);
	gt.start();
	tree.setModified(false);

	//	Fixe the tree object language
	tree.setLanguage(getLanguage());

	//	If exiting, must wait end of code generation by thread before.
	if (exiting==EXIT_ON_RETURN)
		try	{
			gt.join();
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
  }
private  JLabel	versionLabel;
//======================================================
/**
 * Create the Palette menu item and add accelerators on other menu items.
 */
//======================================================
	private void customMenu()
	{
		//	Add the Pogo logo image.
		//-----------------------------------------
		jLabel1.setIcon (new ImageIcon(getClass().getResource(img_path + "pogo.jpg")));
		jLabel1.setDisabledIcon (null);
		jLabel1.setBackground (java.awt.Color.black);

		//	Create a label to display Author and revision
		//---------------------------------------------------
		versionLabel = new javax.swing.JLabel ();
		versionLabel.setText ("");
		versionLabel.setBackground (java.awt.Color.black);
		getContentPane().add(versionLabel, "North");

		//  Add mnemonics on existing buttons
		//----------------------------------------------
		fileMenu.setMnemonic ('F');
		editMenu.setMnemonic ('E');
		helpMenu.setMnemonic ('H');
		newMenuItem.setMnemonic ('N');
		openMenuItem.setMnemonic ('O');
		importMenuItem.setMnemonic ('I');
		exitMenuItem.setMnemonic ('E');
		deleteMenuItem.setMnemonic ('D');

		newMenuItem.setAccelerator (KeyStroke.getKeyStroke('N', Event.CTRL_MASK));
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke('O', Event.CTRL_MASK));
		importMenuItem.setAccelerator(KeyStroke.getKeyStroke('I', Event.CTRL_MASK));
		geneSrcBtn.setAccelerator (KeyStroke.getKeyStroke('G', Event.CTRL_MASK));
		geneDocBtn.setAccelerator (KeyStroke.getKeyStroke('H', Event.CTRL_MASK));
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke('Q', Event.CTRL_MASK));
		deleteMenuItem.setAccelerator(KeyStroke.getKeyStroke(Event.DELETE, 0));
		moveUpItem.setAccelerator(KeyStroke.getKeyStroke('U', Event.CTRL_MASK));
		moveDownItem.setAccelerator(KeyStroke.getKeyStroke('D', Event.CTRL_MASK));
		resetLanguage();
	}

//======================================================
/**
 * Set the language toggle button in compatibility with the
 * <a href=pogo/gene/PogoClass.html> PogoClass field</a>.
 */
//======================================================
  private void setLanguage()
  {
    switch(pogo.language)
	{
	case javaLang:
		cppBtn.setSelected(false);
		javaBtn.setSelected(true);
		break;
	case cppLang:
		cppBtn.setSelected(true);
		javaBtn.setSelected(false);
		break;
	default:
		cppBtn.setSelected(false);
		javaBtn.setSelected(false);
    break;
	}
  }

//======================================================
//======================================================
  private void resetLanguage()
  {
  	String	inLang;
  	boolean	cpp = true;
	if ((inLang=System.getProperty("IN_LANG"))!=null)
		if (inLang.indexOf("java")>=0)
			cpp = false;
 	cppBtn.setSelected(cpp==true);
	javaBtn.setSelected(cpp==false);
  }
//======================================================
/**
 * Set the language <a href=pogo/gene/PogoClass.html> PogoClass field</a>
 * in compatibility with the toggle button .
 */
//======================================================
	int getLanguage()
	{
		if (javaBtn.getSelectedObjects()!=null)
			return javaLang;
		else
			return cppLang;
	}
//======================================================
/**
 *  Called on delete menu item cliked.
 */
//======================================================
	private void deleteMenuItemActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
		tree.removeSelectedLeaf();
 	}//GEN-LAST:event_deleteMenuItemActionPerformed

//======================================================
/**
 *	Check if inheritance is cohenrent
 */
//======================================================
	void checkInheritance()  throws	PogoException,
									FileNotFoundException,
									SecurityException,
									IOException
	{
		//	check if Inheritance home path has been set
		if (System.getProperty("SUPER_HOME")==null)
		{
			app_util.PopupMessage.show(this, "WARNING:\n" +
					pogo.class_name + " inherit from " +
					pogo.inheritedClassName() + "\nBut SUPER_HOME is not defined !");
			return;
		}

		//	Check if Abstract class files could be found.
		if (new File(pogo.inherited_from+".h").exists()==false)
		{
			app_util.PopupMessage.show(this, "WARNING:\n" +
					pogo.class_name + " inherit from " +
					pogo.inheritedClassName() + "\n But " +
					pogo.inherited_from + ".h not found !");
			return;
		}

		//	Check if Abstract Class has changed
		//	Commands, Attributes  or states Added.
		PogoClass	sp = new PogoClass(	pogo.inherited_from+".h");
		Vector		v = new Vector();
		//	Check commands
		for (int i=0 ; i<sp.commands.size() ; i++)
		{
			boolean found = false;
			String	name  = sp.commands.cmdAt(i).name;
			for (int j=0 ; !found && j<pogo.commands.size() ; j++)
				found = pogo.commands.cmdAt(j).name.equals(name);

			if (!found)
				v.add(sp.commands.cmdAt(i));
		}
		String	message = "";
		if (v.size()>0)
		{
			message = "Command" + ((v.size()>1)? "s  ":"  ");
			for (int i=0 ; i<v.size() ; i++)
			{
				pogo.commands.add(v.elementAt(i));
				message += v.elementAt(i).toString() + ", ";
			}
			message +=  " ha" + ((v.size()>1)? "ve":"s")  +
						" been added in super class !";
		}
		if (message.length()>0)
			app_util.PopupMessage.show(this, "WARNING:\n" +
				pogo.class_name + " inherit from " +
				pogo.inheritedClassName() + "\n     But \n" +
				message);
		//	Check attributes
		v.clear();
		for (int i=0 ; i<sp.attributes.size() ; i++)
		{
			boolean found = false;
			String	name  = sp.attributes.attributeAt(i).name;
			for (int j=0 ; !found && j<pogo.attributes.size() ; j++)
				found = pogo.attributes.attributeAt(j).name.equals(name);

			if (!found)
				v.add(sp.attributes.attributeAt(i));
		}
		if (v.size()>0)
		{
			message = "Attribute" + ((v.size()>1)? "s  ":"  ");
			for (int i=0 ; i<v.size() ; i++)
			{
				pogo.attributes.add(v.elementAt(i));
				message += v.elementAt(i).toString() + ", ";
			}
			message +=  " ha" + ((v.size()>1)? "ve":"s")  +
						" been added in super class !";
		}
		//	Check States
		v.clear();
		for (int i=0 ; i<sp.states.size() ; i++)
		{
			boolean found = false;
			String	name  = sp.states.stateAt(i).name;
			for (int j=0 ; !found && j<pogo.states.size() ; j++)
				found = pogo.states.stateAt(j).name.equals(name);

			if (!found)
				v.add(sp.states.stateAt(i));
		}
		if (v.size()>0)
		{
			message = "State" + ((v.size()>1)? "s  ":"  ");
			for (int i=0 ; i<v.size() ; i++)
			{
				pogo.states.add(v.elementAt(i));
				message += v.elementAt(i).toString() + ", ";
			}
			message +=  " ha" + ((v.size()>1)? "ve":"s")  +
						" been added in super class !";
		}
		if (message.length()>0)
			app_util.PopupMessage.show(this, "WARNING:\n" +
				pogo.class_name + " inherit from " +
				pogo.inheritedClassName() + "\n     But \n" +
				message);
	}
//======================================================
/**
 *  Read the input source file to initialize PogoClass object.
 *  And built a JTree to display this object.
 *
 *  @param  filename  Source file to be read.
 */
//======================================================
  private void readSourceFile(String filename)
  {
    try
	{
		int	action = OPEN_FILE;
  		//	if file is a class.h replace by class.cpp and get DeviceImpl version
		String ext = PogoFileFilter.getExtension(filename);
		if (ext.equals("h"))
			filename = filename.substring(0, filename.length()-2) + cppExtention;

		//	Read the server source files.
		if (ext.equals("h") || ext.equals("cpp") || ext.equals("java"))
		{
			pogo = new PogoClass(filename);
			//	Check for inheritance
			if (pogo.inherited_from!=null &&
				pogo.inheritedClassName().equals(tangoDeviceImpl)==false)
					checkInheritance();
		}
		else
		{
			//	Import File
			Taco2Tango	t2t = new Taco2Tango(filename);
			pogo = t2t.getPogoClass();
			action = IMPORT_FILE;
		}
		//tracePogo();
		tree.setPogoTree(pogo);
		setPogoDefined(true);

		//	Check for TACO args type unexisting in TANGO
		//-----------------------------------------------
		String  message = pogo.commands.checkArgsType();
		if (message!=null)
			app_util.PopupError.show(this,  message);

		if (action==IMPORT_FILE && pogo.states!=null)
			if (pogo.states.size()>0)
				app_util.PopupMessage.show(this,
							"WARNING:\n"+
							"Device States have been created \n   BUT Not\n"+
							"the allowed state command !!!");
    }
    catch (Exception ex) {
		app_util.PopupError.show(this,  ex);
		ex.printStackTrace();
	}
  }


//===========================================================
/**
 *  Called on Open file item menu cliked.
 */
//===========================================================
	private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
		buildPogoFromFile(OPEN_FILE);
	}//GEN-LAST:event_openMenuItemActionPerformed
//===========================================================
/**
 *  Called on Import file item menu cliked.
 */
//===========================================================
	private void importMenuItemActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importMenuItemActionPerformed
		buildPogoFromFile(IMPORT_FILE);
  	}//GEN-LAST:event_importMenuItemActionPerformed


//===========================================================
/**
 *  get info from File Selection Box to build Pogo Class from file.
 */
//===========================================================
	private void buildPogoFromFile(int action)
	{
		//	Do not open a new project if this one
		//	has been modified and not saved.
		//----------------------------------------------------
		String	defaultfile = System.getProperty("POGO_FILE");
		if (defaultfile!=null && defaultfile.length()==0)
			defaultfile = null;

		if (tree.hasBeenModified())
		{
			Object[] options = { "OK", "CANCEL" };
			if (JOptionPane.showOptionDialog(this,
						"This project has not been saved !\n\nDiscard modifications ?",
						"Warning",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE,
						null, options, options[0])!=JOptionPane.OK_OPTION)
				return;
		}

		//	Create file filters
		String[]	ext = { "h", "java" };
		PogoFileFilter	tangoFF = new PogoFileFilter(ext, "TANGO Classes");
		tangoFF.setExtensionListInDescription(false);
		PogoFileFilter	tacoFF  = new PogoFileFilter("c", "TACO 'C' Classes");
		//	Fixe the input directory and File Filters
		//-----------------------------------------------------
		if (chooser==null)
		{
			if ((homeDir=System.getProperty("HOME_GENE"))==null)
			{
				homeDir = new File("").getAbsolutePath();
			}
			chooser = new JFileChooser(homeDir);
			chooser.addChoosableFileFilter(tacoFF);
			chooser.addChoosableFileFilter(tangoFF);
			if (action==IMPORT_FILE)
				chooser.setFileFilter(tacoFF);
		}
		else
		{
			//	Manage File filter between Open and Import action
			if (action==OPEN_FILE)
			{
				PogoFileFilter	ff = (PogoFileFilter)chooser.getFileFilter();
				if(ff.getDescription().indexOf("TACO")>=0)
				{
					chooser.setFileFilter(tangoFF);
				}
			}
			else
				chooser.setFileFilter(tacoFF);
		}
		chooser.setDialogTitle((action==OPEN_FILE)? "Open": "Import");
		chooser.setCurrentDirectory(new File(homeDir));

		//	Check if use default input file
		int retval;
		if (defaultfile==null)
			retval = chooser.showOpenDialog(this);
		else
			retval = JFileChooser.APPROVE_OPTION;

		//  Check if the selected file is OK and then read it
		//------------------------------------------------------
		if (retval==JFileChooser.APPROVE_OPTION)
		{
			//	Approve option --> remove previous project if exists
			//---------------------------------------------------------
			if (tree!=null)
			{
				tree.clear();
				setPogoDefined(false);
				versionLabel.setText ("");
				pogo = null;
			}
			//	Then get selected path and file to read it
			//----------------------------------------------------
			File  file;
			if (defaultfile==null)
				file = chooser.getSelectedFile();
			else
				file = new File(defaultfile);
			if (file!=null)
			{
				if (file.isDirectory()==false)
      			{
					String	filename = file.getAbsolutePath();
					readSourceFile(filename);
					homeDir = file.getParentFile().toString();
			    	if (pogo==null) return;
					versionLabel.setText ("  Author: " + pogo.author +
										"  - Revision: " + pogo.revision);
					//	Set the output language button
					//-----------------------------------------
					if (file.getAbsolutePath().indexOf(cppDefExtention)>0)
					{
						cppBtn.setSelected(true);
						javaBtn.setSelected(false);
					}
					else
					if (file.getAbsolutePath().indexOf(javaExtention)>0)
					{
						cppBtn.setSelected(false);
						javaBtn.setSelected(true);
					}
					//	Update Tree global param.
					tree.setLanguage(getLanguage());
					tree.setHomeDir(homeDir);
					checkDevImplRev(filename);
				}
			}
			pogo.projectFiles.setOriginalClassName(pogo.class_name);
			pogo.projectFiles.setOriginalPath(homeDir);
		}
	}
//===========================================================
/**
 *	Check if it an old TANGO DS.
 *	If Device_2impl, it must be changed to Device_3Impl.
 */
//===========================================================
	private void checkDevImplRev(String filename)
	{
		//	Right now, do it only for Cpp
		int	lang=0;
		lang = getLanguage();
		if (lang==javaLang)
			return;

		//	Check the Template version
		String	template_file = pogo.templates_dir + "/cpp/DevServ.h";
		int	template_rev = PogoUtil.deviceImplRevisionNumber(template_file);
		System.out.println("Template files are for Device_" + template_rev +"Impl");

		//	Check if Template files can be found
		if (template_rev<0)
		{
			String	message =	"Cannot not found the C++ template files at\n"+
								pogo.templates_dir + "/cpp\n";
			JOptionPane.showMessageDialog(this,
								message,
								"WARNING Window",
								JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
		else
		//	Check if Template files is a good version
		if (template_rev<3)
		{
			String	message ="The C++ template files situated in:\n" +
							pogo.templates_dir + "/cpp\n"            +
							"are not for this POGO version !\n\n"    +
							"Please download and install the latest version.";
			JOptionPane.showMessageDialog(this,
								message,
								"WARNING Window",
								JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}


		int	devimpl_rev = PogoUtil.deviceImplRevisionNumber(filename);

		//	If cpp Deviceimpl 1 or 2 --> convert to version 3
		if (devimpl_rev<3)
		{
			System.out.println();
			System.out.println(
	"**********************************************************************");
			System.out.println(change_deviceimpl_message);
			System.out.println(
	"**********************************************************************");
			System.out.println();

			Object[] options = { "GENERATE", "CANCEL" };
			if (JOptionPane.showOptionDialog(this,
				change_deviceimpl_message,
				"Warning",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE,
				null, options, options[0])==0)
			{
				System.out.println("Generate......");
				generateSource(GENE_SRC, EXIT_ON_RETURN);
				System.out.println();
				System.out.println(
	"**********************************************************************");
				System.out.println("	Conversion to new TANGO model successfull");
				System.out.println(
	"**********************************************************************");
				System.out.println();
				System.exit(0);
			}
		}
	}
//===========================================================
/**
 *  Called on Exit item menu cliked.
 *
 */
//===========================================================
  private void exitMenuItemActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
 	//	Do not exit if this project
	//	has been modified and not saved.
	//----------------------------------------------------
	if (tree!=null && tree.hasBeenModified())
	{
		Object[] options = { "Yes", "No", "Cancel" };
		int choice = JOptionPane.showOptionDialog(this,
						"This project has not been saved !\n\n" +
						"Would you like to generate modifications ?",
						"Warning",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE,
						null, options, options[0]);
		switch (choice)
		{
		case 0:	//	OK
			generateSource(GENE_SRC, EXIT_ON_RETURN);
			break;
		case 1:	// No
			break;
		case 2:	//	Cancel
			return;
		}
	}
	System.exit(0);
}//GEN-LAST:event_exitMenuItemActionPerformed

 //===========================================================
/**
 *  Called on Exit form button cliked.
 *
 */
//===========================================================
  private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
	//	Do not open a new project if this project
	//	has been modified and not saved.
	//----------------------------------------------------
	if (tree!=null && tree.hasBeenModified())
	{
		if (JOptionPane.showConfirmDialog(this,
							"This project has not been saved !\n\n" +
							"Would you like to generate modifications ?",
							"information",
							JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
			generateSource(GENE_SRC, EXIT_ON_RETURN);
	}
	System.exit(0);
  }//GEN-LAST:event_exitForm

//======================================================
/**
 *   Set available or not menu items or buttons if PogoClas is
 *  initialized, not initialized or reseted.
 *
 *  @param  state  true if initialized.
 */
//======================================================
   private void setPogoDefined(boolean state)
   {
	tree.setVisible(state);
	geneSrcBtn.setEnabled(state);
	geneDocBtn.setEnabled(state);
	if (state)
		setLanguage();
  }
   //======================================================
   //======================================================
	static public void centerDialog(JDialog dialog, JFrame parent)
	{
		Point	p = parent.getLocationOnScreen();
		p.x += ((parent.getWidth() - dialog.getWidth())  / 2);
		p.y += ((parent.getHeight() - dialog.getHeight())  / 2);
		dialog.setLocation(p);
	}

   //======================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JRadioButton cppBtn;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem geneDocBtn;
    private javax.swing.JMenuItem geneSrcBtn;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem importMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JRadioButton javaBtn;
    private javax.swing.JLabel leftBtnLabel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel mousePanel;
    private javax.swing.JMenuItem moveDownItem;
    private javax.swing.JMenuItem moveUpItem;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem releaseBtn;
    private javax.swing.JLabel rightBtnLabel;
    private javax.swing.JPanel southPanel;
    private javax.swing.JMenuItem whatNewBtn;
    // End of variables declaration//GEN-END:variables


	//===============================================================
	/**
	 * Main method to start the class.
	 *
	 * @param args the command line arguments
	 */
	//===============================================================
	public static void main(java.lang.String[] args) {

		//	Check if line command
		if (args.length>0)
		{
			try
			{
				new PogoCmdLine(args);
			}
			catch(Exception e)
			{
				System.out.println(e);
				//e.printStackTrace();
			}
			System.exit(0);
		}
		//	Else start application


		try
		{
			//	Firat time, Open a simple Tango window
//			app_util.TangoWindow	tw = new app_util.TangoWindow("POGO  Tango code generator");
//			tw.setVisible(true);

			//	Then start application itself
			PogoAppli	pogoAppli = new PogoAppli();
			pogoAppli.setVisible(true);
//			tw.toFront();

			//	Close Tango Window
//			tw.setVisible(false);



			//	Get the tango files list
			// if not empty (or if dbg property set), open file selection box
			String[]	list = PogoUtil.getTangoFilesList(".");
			if (System.getProperty("POGO_FILE")!=null || list.length>0)
				pogoAppli.buildPogoFromFile(OPEN_FILE);
		}
		catch(Exception e)
		{
			System.out.println("POGO Startup Failed.");
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
