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
// Revision 3.20  2009/02/18 15:03:47  pascal_verdier
// Tango 7 (IDL 4) compatibility implementation.
//
// Revision 3.19  2007/04/17 14:03:06  pascal_verdier
// Attributes are now displayed separatly
// (Scalar, Spectrum and image attributes)
//
// Revision 3.18  2006/12/05 09:32:03  pascal_verdier
// Min/Max warning  attribute properties added.
// delay time/val   attribute properties added.
//
// Revision 3.17  2006/11/02 11:39:44  pascal_verdier
// Python code generation added.
//
// Revision 3.16  2006/08/30 12:13:11  pascal_verdier
// pack added on AttributeDialog.
//
// Revision 3.15  2006/08/30 11:56:20  pascal_verdier
// Buttons text modified in attribute dialog.
//
// Revision 3.14  2006/06/26 09:24:53  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.13  2005/11/24 08:28:44  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.12  2005/11/07 08:40:46  pascal_verdier
// Memorized attribute written or not at starteup added.
//
// Revision 3.11  2005/10/12 13:55:28  pascal_verdier
// Fix a bug in memorized button management.
//
// Revision 3.10  2005/06/14 08:48:39  pascal_verdier
// SuperClass is replaced by AbstractClass.
//
// Revision 3.9  2005/03/02 14:01:53  pascal_verdier
// Managing Abstract Classes and inherited classes.
//
// Revision 3.8  2005/01/25 15:29:09  pascal_verdier
// ATTR_SOLEIL param added to do not force upper case at befinig of attribute name.
//
// Revision 3.7  2004/11/29 09:53:50  pascal_verdier
// NotAllowedDialog constructor call has been modified for title.
//
// Revision 3.6  2004/11/22 11:12:06  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.5  2004/11/12 09:05:19  pascal_verdier
// Disply message if cannot parse integer on x/y size field.
//
// Revision 3.4  2004/10/21 06:54:46  pascal_verdier
// Check for non double item definitions
// for add, edit and clone item.
//
// Revision 3.3  2004/09/07 12:04:02  pascal_verdier
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
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================
package pogo.appli;



import pogo.gene.*;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Vector;


//===============================================================
/**
 *	A Dialog Class to get the Attribute parameters.
 */
//===============================================================
public class AttributeDialog extends javax.swing.JDialog implements PogoAppliDefs, PogoDefs {

  private static int returnStatus = PogoAppliDefs.RET_CANCEL;


	private	int			attr_idx = -1;
	private JFrame		parent;
	private PogoClass	server;
	private	int			poll_period = 0;
	private String		name;
	private String		assAttr;
	private int			xSize;
	private int			ySize;
	private Vector		prop_txt;
	private DevStateTable	notAllowedFor;

    private JRadioButton    changeEvtCode;
    private JRadioButton    changeEvtChecked;
    private JRadioButton    archiveEvtCode;
    private JRadioButton    archiveEvtChecked;

    private boolean     initializing = true;
    ///===================================================================
	/**
	 * Initializes the Form
	 */
	//===================================================================
	public AttributeDialog(JFrame parent, PogoClass server, Attrib attr, int action)
	{
 		super (parent, true);
		this.parent = parent;
		this.server = server;
		initComponents ();

		addElements();
		initializeWindow(attr);
		if (action==CREATING)
			attr_idx = -1;
		else
		for (int i=0 ; i<server.attributes.size() ; i++)
			if (server.attributes.attributeAt(i) == attr)
				attr_idx = i;
		pack ();
	}
	//===================================================================
	/**
	 *	 Add components in window
	 */
	//===================================================================
	private void addElements()
	{
		//  init comboboxes
		//-----------------------
        for (String s : AttrDataArray)
            dataTypeCB.addItem(s);
        for (String s : AttrTypeArray)
            attrTypeCB.addItem(s);
        for (String s : AttrRWtypeArray)
            rwTypeCB.addItem(cppNameSpace + s);

		//	hide property panel
		//propertyPanel.setVisible(false);
		prop_txt = new Vector();
		prop_txt.addElement(attrPropLabel);
		prop_txt.addElement(attrPropUnit);
		prop_txt.addElement(attrPropStdUnit);
		prop_txt.addElement(attrPropDispUnit);
		prop_txt.addElement(attrPropFormat);
		prop_txt.addElement(attrPropMaxValue);
		prop_txt.addElement(attrPropMinValue);
		prop_txt.addElement(attrPropMaxAlarm);
		prop_txt.addElement(attrPropMinAlarm);
		prop_txt.addElement(attrPropMaxWarning);
		prop_txt.addElement(attrPropMinWarning);
		prop_txt.addElement(attrPropDeltaTime);
		prop_txt.addElement(attrPropDeltaValue);
 		prop_txt.addElement(attrPropDescription);


		//	add components for polling ang and display level
		//	Add radio box for expert/operator
		//-------------------------------------------------------------
        JLabel  lbl;
        int y = 14;
        GridBagConstraints gbc = new GridBagConstraints ();
        lbl = new JLabel("Controled by : ");
        gbc.gridx = 0;
        gbc.gridy = ++y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        definitionPanel.add (lbl, gbc);

        levelBtn = new javax.swing.JRadioButton ();
		levelBtn.setToolTipText ("Display Level (expert or operator)");
		levelBtn.setText (" Expert Only  ");
		gbc.gridx = 1;
		gbc.gridy = y;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		definitionPanel.add (levelBtn, gbc);

        //  Add Buttons for change event management
        //-------------------------------------------------------------
        lbl = new JLabel("Change Event : ");
        gbc.gridx = 0;
        gbc.gridy = ++y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        definitionPanel.add (lbl, gbc);
        changeEvtCode = new JRadioButton ("Pushed by code");
        gbc.gridx = 1;
        gbc.gridy = y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        definitionPanel.add (changeEvtCode, gbc);

        changeEvtChecked = new JRadioButton ("Event criteria checked by library");
        changeEvtChecked.setSelected(true);
        changeEvtChecked.setVisible(false);
        gbc.gridx = 1;
        gbc.gridy = ++y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        definitionPanel.add (changeEvtChecked, gbc);
        changeEvtCode.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                evtByCodeBtnActionPerformed (evt);
                }
            });

        //  Add Buttons for archive event management
        //-------------------------------------------------------------
        lbl = new JLabel("Archive Event : ");
        gbc.gridx = 0;
        gbc.gridy = ++y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        definitionPanel.add (lbl, gbc);
        archiveEvtCode = new JRadioButton ("Pushed by code");
        gbc.gridx = 1;
        gbc.gridy = y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        definitionPanel.add (archiveEvtCode, gbc);

        archiveEvtChecked = new JRadioButton ("Event criteria checked by library");
        archiveEvtChecked.setSelected(true);
        archiveEvtChecked.setVisible(false);
        gbc.gridx = 1;
        gbc.gridy = ++y;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        definitionPanel.add (archiveEvtChecked, gbc);
        archiveEvtCode.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                evtByCodeBtnActionPerformed (evt);
                }
            });


        //	Add radio box btn for command polled
		//-------------------------------------------------------------
		polledBtn = new javax.swing.JRadioButton ();
		polledBtn.setToolTipText ("Attribute polled");
		polledBtn.setText ("Polled");
		gbc.gridx = 1;
		gbc.gridy = ++y;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		definitionPanel.add (polledBtn, gbc);
		
		polledBtn.addActionListener (new java.awt.event.ActionListener () {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				polledBtnActionPerformed (evt);
				}
			});
		
		//	Add components for period polling
		periodLabel = new JLabel("  Polling Period :");
		periodLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		gbc.gridx = 0;
		gbc.gridy = ++y;
		definitionPanel.add (periodLabel, gbc);
		
		periodText = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = y;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		definitionPanel.add (periodText, gbc);
		periodText.setRequestFocusEnabled(true);

		periodUnitLabel = new JLabel(" ms  ");
		gbc.gridx = 2;
		gbc.gridy = y;
		definitionPanel.add (periodUnitLabel, gbc);

		//	Add a dummy label
		gbc.gridx = 1;
		gbc.gridy = ++y;
		definitionPanel.add (new JLabel(" "), gbc);
		setPeriodEnabled(false);

		//	Add radio btn to memorized and memorized int
		//-------------------------------------------------------------
		memorizedBtn = new javax.swing.JRadioButton ();
		memorizedBtn.setToolTipText ("Attribute setpoint memorized .");
		memorizedBtn.setText (" Memorized  ");
		memorizedBtn.setVisible(false);
		gbc.gridx = 0;
		gbc.gridy = ++y;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		definitionPanel.add (memorizedBtn, gbc);
		
		memorizedBtn.addActionListener (new java.awt.event.ActionListener () {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				memorizedBtnActionPerformed (evt);
				}
			});

		memorizedInitBtn = new javax.swing.JRadioButton ();
		memorizedInitBtn.setToolTipText ("Attribute setpoint memorized witten on hardware at startup");
		memorizedInitBtn.setText (" Write hardware at init ");
		memorizedInitBtn.setVisible(false);
		gbc.gridx = 1;
		gbc.gridy = y;
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		definitionPanel.add (memorizedInitBtn, gbc);
 	}
	//===================================================================
	//===================================================================
    private void evtByCodeBtnActionPerformed(ActionEvent evt)
    {
        Object  o = evt.getSource();
        if (o == changeEvtCode)
            changeEvtChecked.setVisible(changeEvtCode.getSelectedObjects()!=null);
        else
        if (o == archiveEvtCode)
            archiveEvtChecked.setVisible(archiveEvtCode.getSelectedObjects()!=null);
        pack();
    }
	//===================================================================
	//===================================================================
	private void setPeriodEnabled(boolean state)
	{
		periodLabel.setVisible(state);
		periodText.setVisible(state);
		periodUnitLabel.setVisible(state);
		if (state)
		{
			//	Default value if never set
			String	txt;
			if (poll_period==0)
				txt = "2000";
			else
				txt = "" + poll_period;
			periodText.setText(txt);
			pack();
		}
	}
	//===================================================================
	//===================================================================
	private void memorizedBtnActionPerformed (java.awt.event.ActionEvent evt) {

		memorizedInitBtn.setVisible(
			(memorizedBtn.getSelectedObjects()!=null) );
	}
	//===================================================================
	//===================================================================
	private void polledBtnActionPerformed (java.awt.event.ActionEvent evt) {
		boolean state = (polledBtn.getSelectedObjects()!=null);
		setPeriodEnabled(state);
		if (state)
		{
			periodText.selectAll();
			periodText.requestFocus();
		}
	}

	 //===================================================================
	 /** This method is called from within the constructor to
	  * initialize the form.
	  * WARNING: Do NOT modify this code. The content of this method is
	  * always regenerated by the FormEditor.
	  */
	//===================================================================
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        definitionPanel = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        attrTypeCB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dataTypeCB = new javax.swing.JComboBox();
        xDataLBL = new javax.swing.JLabel();
        yDataLBL = new javax.swing.JLabel();
        xDataTF = new javax.swing.JTextField();
        yDataTF = new javax.swing.JTextField();
        rwTypeCB = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        assAttrLBL = new javax.swing.JLabel();
        assAttrTF = new javax.swing.JTextField();
        rwTypeLBL = new javax.swing.JLabel();
        allowedBtn = new javax.swing.JButton();
        propertyPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        attrPropLabel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        attrPropUnit = new javax.swing.JTextField();
        attrPropStdUnit = new javax.swing.JTextField();
        attrPropDispUnit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        attrPropFormat = new javax.swing.JTextField();
        attrPropMaxValue = new javax.swing.JTextField();
        attrPropMinValue = new javax.swing.JTextField();
        attrPropMaxAlarm = new javax.swing.JTextField();
        attrPropMinAlarm = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        attrPropDescription = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        attrPropDeltaTime = new javax.swing.JTextField();
        attrPropDeltaValue = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        attrPropMaxWarning = new javax.swing.JTextField();
        attrPropMinWarning = new javax.swing.JTextField();

        setTitle("Edit Attribute Window");
        setBackground(new java.awt.Color(198, 178, 168));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel17.setText("        ");
        jPanel1.add(jLabel17);

        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        jPanel1.add(okBtn);

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        definitionPanel.setLayout(new java.awt.GridBagLayout());

        nameLbl.setFont(new java.awt.Font("Arial", 1, 12));
        nameLbl.setText("Attribute name ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        definitionPanel.add(nameLbl, gridBagConstraints);

        attrTypeCB.setFont(new java.awt.Font("Arial", 1, 12));
        attrTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attrTypeCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(attrTypeCB, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("Attribute Type: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        definitionPanel.add(jLabel1, gridBagConstraints);

        nameText.setFont(new java.awt.Font("Arial", 1, 12));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(nameText, gridBagConstraints);

        jLabel2.setText(" ");
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        definitionPanel.add(jLabel2, gridBagConstraints);

        jLabel3.setText(" ");
        jLabel3.setMinimumSize(new java.awt.Dimension(20, 15));
        jLabel3.setPreferredSize(new java.awt.Dimension(20, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        definitionPanel.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel4.setText("Data Type: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        definitionPanel.add(jLabel4, gridBagConstraints);

        dataTypeCB.setFont(new java.awt.Font("Arial", 1, 12));
        dataTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTypeCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(dataTypeCB, gridBagConstraints);

        xDataLBL.setFont(new java.awt.Font("Arial", 1, 12));
        xDataLBL.setText("Maximum X data size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        definitionPanel.add(xDataLBL, gridBagConstraints);

        yDataLBL.setFont(new java.awt.Font("Arial", 1, 12));
        yDataLBL.setText("Maximum Y data size: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        definitionPanel.add(yDataLBL, gridBagConstraints);

        xDataTF.setFont(new java.awt.Font("Arial", 1, 12));
        xDataTF.setMinimumSize(new java.awt.Dimension(100, 20));
        xDataTF.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(xDataTF, gridBagConstraints);

        yDataTF.setFont(new java.awt.Font("Arial", 1, 12));
        yDataTF.setMinimumSize(new java.awt.Dimension(100, 20));
        yDataTF.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(yDataTF, gridBagConstraints);

        rwTypeCB.setFont(new java.awt.Font("Arial", 1, 12));
        rwTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rwTypeCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(rwTypeCB, gridBagConstraints);

        jLabel5.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        definitionPanel.add(jLabel5, gridBagConstraints);

        assAttrLBL.setFont(new java.awt.Font("Arial", 1, 12));
        assAttrLBL.setText("Associated Attribute:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        definitionPanel.add(assAttrLBL, gridBagConstraints);

        assAttrTF.setFont(new java.awt.Font("Arial", 1, 12));
        assAttrTF.setMinimumSize(new java.awt.Dimension(100, 20));
        assAttrTF.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        definitionPanel.add(assAttrTF, gridBagConstraints);

        rwTypeLBL.setFont(new java.awt.Font("Arial", 1, 12));
        rwTypeLBL.setText("Read/Write Type: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        definitionPanel.add(rwTypeLBL, gridBagConstraints);

        allowedBtn.setText("Allowed for State,,,");
        allowedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allowedBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        definitionPanel.add(allowedBtn, gridBagConstraints);

        jTabbedPane1.addTab("Definition", definitionPanel);

        propertyPanel.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel6.setText("Default Attribute Properties");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        propertyPanel.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel7.setText("Label");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropLabel, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel8.setText("Unit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel9.setText("Standard Unit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel10.setText("Display Unit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropUnit, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropStdUnit, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropDispUnit, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel11.setText("Display Format       ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel12.setText("Max. Value");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel12, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel13.setText("Min. Value");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel13, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel14.setText("Max. Alarm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel14, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel15.setText("Min. Alarm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropFormat, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMaxValue, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMinValue, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMaxAlarm, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMinAlarm, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel16.setText("Description :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel16, gridBagConstraints);

        jScrollPane.setPreferredSize(new java.awt.Dimension(350, 100));

        attrPropDescription.setColumns(80);
        attrPropDescription.setRows(20);
        jScrollPane.setViewportView(attrPropDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        propertyPanel.add(jScrollPane, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel20.setText("Delta time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel20, gridBagConstraints);

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel21.setText("Delta value   ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel21, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropDeltaTime, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropDeltaValue, gridBagConstraints);

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel22.setText("Max Warning");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel22, gridBagConstraints);

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel23.setText("Min Warning");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        propertyPanel.add(jLabel23, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMaxWarning, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        propertyPanel.add(attrPropMinWarning, gridBagConstraints);

        jTabbedPane1.addTab("Properties", propertyPanel);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

	//==============================================================
	//==============================================================
	private void allowedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allowedBtnActionPerformed
		if (server.states.size()==0)
		{
			JOptionPane.showMessageDialog(this,
						"There is no state defined !",
						"Error Window",
						JOptionPane.ERROR_MESSAGE);
			return;
		}

		NotAllowedDialog	dialog = new NotAllowedDialog(parent,
						"Attribute " + nameText.getText(), server.states);
		int ret = dialog.showDialog(notAllowedFor);

		if (ret==PogoAppliDefs.RET_OK)
			notAllowedFor = dialog.getInput();
	}//GEN-LAST:event_allowedBtnActionPerformed

	//==============================================================
	//==============================================================	//==============================================================
	//==============================================================
	private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

  	String	message = null;

	//	Control if Name has been filled.correctly
	//--------------------------------------------------------------
	name = nameText.getText();
	try {
		name = PogoUtil.checkCmdAttrName(name,
						server.commands, server.attributes, attr_idx, ATTRIBUTES);
	}
	catch(PogoException e) {
		JOptionPane.showMessageDialog(this,
					e.toString(),
					"Error Window",
					JOptionPane.INFORMATION_MESSAGE);
		return;
	}
	nameText.setText(name);

	//	Control if  xSize and ySize fields have been filled.
	//--------------------------------------------------------------
	int attrType = attrTypeCB.getSelectedIndex();
	switch(attrType)
    {
	case ATTR_SCALAR:
		if (rwTypeCB.getSelectedIndex()==ATTR_READ_WITH_WRITE)
			assAttr = assAttrTF.getText();
		else
			assAttr = "";
		break;
	case ATTR_SPECTRUM:
		switch(xSize=checkIntField(xDataTF.getText()))
		{
		case EMPTY_FIELD:
			message = "Spectrum Attribute needs an X length of data";
			break;
		case NEGATIVE_FIELD:
			message = "Spectrum Attribute needs a POSITIVE X length of data";
			break;
		case INVALID_FIELD:
			message = "Cannot parse an integer value for X length !";
			break;
		}
		break;
	case ATTR_IMAGE:
		switch(xSize=checkIntField(xDataTF.getText()))
		{
		case EMPTY_FIELD:
			message = "Image Attribute needs an X length of data";
			break;
		case NEGATIVE_FIELD:
			message = "Image Attribute needs a POSITIVE X length of data";
			break;
		case INVALID_FIELD:
			message = "Cannot parse an integer value for X length !";
			break;
		}
		switch(ySize=checkIntField(yDataTF.getText()))
		{
		case EMPTY_FIELD:
			message = "Image Attribute needs an Y length of data";
			break;
		case NEGATIVE_FIELD:
			message = "Image Attribute needs a POSITIVE Y length of data";
			break;
		case INVALID_FIELD:
			message = "Cannot parse an integer value for Y length !";
			break;
		}
	}

	//	Check polled period if set
	if (polledBtn.getSelectedObjects()!=null)
	{
		String strval = periodText.getText();
		try {
			poll_period = Integer.parseInt(strval);
			//	Control if value not too small
			if (poll_period < PogoAppliDefs.POLLING_PERIOD_MIN  &&
				poll_period != 0)	//	if 0 means externally filling mode (by code)
			{
				message = "The polling period minimum value is  " +
								PogoAppliDefs.POLLING_PERIOD_MIN + " ms";
			}
		}
		catch (NumberFormatException e)
		{
			 message = e.toString() + "\n\nBad Value in Polling period field !";
		}
	}
	if (message!=null)
		JOptionPane.showMessageDialog(this,  message, "Error Window",
													JOptionPane.ERROR_MESSAGE);
	else
	    doClose(PogoAppliDefs.RET_OK);
  }//GEN-LAST:event_okBtnActionPerformed
	//==============================================================
	//==============================================================
	private void rwTypeCBActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rwTypeCBActionPerformed
		updateWindow();
	}//GEN-LAST:event_rwTypeCBActionPerformed

	//==============================================================
	//==============================================================
	private void dataTypeCBActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTypeCBActionPerformed
	//==============================================================
	//==============================================================
		updateWindow();
	}//GEN-LAST:event_dataTypeCBActionPerformed

	//==============================================================
	//==============================================================
	private void attrTypeCBActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attrTypeCBActionPerformed
		updateWindow();

		//	Check if JComboBox initialized
		if (rwTypeCB.getItemCount()==0)
			return;
		//	Add/Remove read with write
		String	item = "Tango::"+AttrRWtypeArray[AttrRWtypeArray.length-1];
		switch (attrTypeCB.getSelectedIndex())
		{
		case ATTR_SCALAR:
			if (rwTypeCB.getItemCount() < AttrRWtypeArray.length)
				rwTypeCB.addItem(item);
			break;
		default:
			if (rwTypeCB.getItemCount()>=AttrRWtypeArray.length)
				rwTypeCB.removeItem(item);
			break;
		}
	}//GEN-LAST:event_attrTypeCBActionPerformed



	//==============================================================
	//==============================================================
	private void cancelBtnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
		doClose(PogoAppliDefs.RET_CANCEL);
	}//GEN-LAST:event_cancelBtnActionPerformed

	//==============================================================
	//==============================================================
	private final int	EMPTY_FIELD    = -1;
	private final int	NEGATIVE_FIELD = -2;
	private final int	INVALID_FIELD  = -3;
	private int checkIntField(String s)
	{
		int	value;
		int end = s.indexOf('.');
		if (end>=0)
			s = s.substring(0, end);

		try
		{
			if (s.length()==0)
				return EMPTY_FIELD;
			else
			if ((value=Integer.parseInt(s)) < 0)
				return NEGATIVE_FIELD;
			else
				return value;
		}
		catch (NumberFormatException e)
		{
			return INVALID_FIELD;
		}
	}

	//======================================================
	/**
	*	Closes the dialog
	*/
	//======================================================
	private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
		doClose(PogoAppliDefs.RET_CANCEL);
	}//GEN-LAST:event_closeDialog

	//======================================================
	/**
	 *	Show dialog window
	 */
	//======================================================
	public int showDialog()
	{
		PogoAppli.centerDialog(this, parent);
		setVisible(true);
		return returnStatus;
	}
	//======================================================
	//======================================================
	void setType(int type_idx)
	{
		attrTypeCB.setSelectedIndex(type_idx);
	}
	//======================================================
	/**
	 *	Initialise Window
	 */
	//======================================================
	private void initializeWindow(Attrib attr)
	{
        initializing = false;
        if (attr!=null)
		{
			//  Initialize Window with input parameters
			//-----------------------------------------------
			nameText.setText(attr.name);
			xDataTF.setText(Integer.toString(attr.xSize));
			yDataTF.setText(Integer.toString(attr.ySize));
			assAttrTF.setText(attr.assAttr);

			attrTypeCB.setSelectedIndex(attr.attrType);
			rwTypeCB.setSelectedIndex(attr.rwType);
    		notAllowedFor = new DevStateTable(attr.notAllowedFor);

			//	Update combo box
			for (int i=0 ; i<dataTypeCB.getItemCount() ; i++)
			{
				String	item = (String)dataTypeCB.getItemAt(i);
				if (item.equals(attr.dataType.cpp_code_str))
					dataTypeCB.setSelectedIndex(i);
			}
			//	Set the default attribute property values
            for (int i=AttrPropLabel ; i<=AttrPropDescription ; i++)
            {
                JTextComponent	txt = (JTextComponent)prop_txt.elementAt(i);
                String			value = attr.getPropValue(i);

                if (value!=null)
                {
                    if (i==AttrPropDescription)
                    {
                        //	For description the "\n" String must be replaced by Cr char
                        StringBuffer	sb = new StringBuffer();
                        for (int j=0 ; j<value.length() ; j++)
                            if (value.charAt(j)=='\\' && value.charAt(j+1)=='n')
                            {
                                sb.append("\n");
                                j++;
                            }
                            else
                                sb.append(value.charAt(j));
                        txt.setText(sb.toString());
                    }
                    else
                        txt.setText(value);
                }
            }

			//	Update window look.
			updateWindow();
			//	Display level
			if (attr.disp_level==fr.esrf.Tango.DispLevel.EXPERT)
				levelBtn.setSelected(true);
			//	Check if command polled
			if ((poll_period=attr.polled_period)>0)
			{
				polledBtn.setSelected(true);
				setPeriodEnabled(true);
			}
			else
				setPeriodEnabled(false);
			memorizedBtn.setSelected(attr.memorized);
            memorizedInitBtn.setVisible(attr.memorized);
			if (attr.memorized)
			{
				memorizedInitBtn.setSelected(attr.memorized_init);
			}

            //  Set event fire management
            boolean[]   ch = attr.getFireEvent(Attrib.CHANGE);
            changeEvtCode.setSelected(ch[0]);
            changeEvtChecked.setSelected(ch[1]);
            changeEvtChecked.setVisible(ch[0]);

            boolean[]   ar = attr.getFireEvent(Attrib.ARCHIVE);
            archiveEvtCode.setSelected(ar[0]);
            archiveEvtChecked.setSelected(ar[1]);
            archiveEvtChecked.setVisible(ar[0]);
        }
	}
  //======================================================
  //======================================================
  private void doClose(int retStatus)
  {
    returnStatus = retStatus;
    setVisible (false);
    dispose ();
  }

  //======================================================
  //======================================================
  public Attrib  getInput()
  {
  	Attrib	attr;
	switch(attrTypeCB.getSelectedIndex())
	{
	case ATTR_SPECTRUM:
		attr = new Attrib(name,
						ATTR_SPECTRUM,
						dataTypeCB.getSelectedItem().toString(),
						rwTypeCB.getSelectedIndex(),
						xSize);
		break;

    case ATTR_IMAGE:
		attr = new Attrib(name,
						ATTR_IMAGE,
						dataTypeCB.getSelectedItem().toString(),
						rwTypeCB.getSelectedIndex(),
						xSize,
						ySize);
		break;

    case ATTR_SCALAR:
    default:
        attr = new Attrib(name,
                        ATTR_SCALAR,
                        dataTypeCB.getSelectedItem().toString(),
                        rwTypeCB.getSelectedIndex(),
                        assAttr);
        break;
	}

	//	get and set additional fields
	//	Add allowed states
	if (notAllowedFor==null)
		notAllowedFor = new DevStateTable();
	attr.notAllowedFor = notAllowedFor;

	if (polledBtn.getSelectedObjects()!=null)
	{
		String strval = periodText.getText();
		attr.polled_period = Integer.parseInt(strval);
	}
	if (levelBtn.getSelectedObjects()!=null)
		attr.disp_level = fr.esrf.Tango.DispLevel.EXPERT;

	attr.setMemorized( memorizedBtn.getSelectedObjects()!=null ) ;
	attr.setMemorizedInit( memorizedInitBtn.getSelectedObjects()!=null );

	//	Get the default attribute property values
	for (int i=AttrPropLabel ; i<=AttrPropDescription ; i++)
	{
		JTextComponent	txt = (JTextComponent)prop_txt.elementAt(i);
		String			value = txt.getText();

		//	For description the Cr char must be replaced by "\n" String
		if (i==AttrPropDescription)
		{
			StringBuffer	sb = new StringBuffer();
			for (int j=0 ; j<value.length() ; j++)
				if (value.charAt(j)=='\n')
					sb.append("\\n");
				else
					sb.append(value.charAt(j));
			attr.setPropValue(i, sb.toString());
		}
		else
			attr.setPropValue(i, value);

	}
    //  Set event fire management
    attr.setFireEvent(Attrib.CHANGE,
            changeEvtCode.getSelectedObjects()!=null,
            changeEvtChecked.getSelectedObjects()!=null);
    attr.setFireEvent(Attrib.ARCHIVE,
            archiveEvtCode.getSelectedObjects()!=null,
            archiveEvtChecked.getSelectedObjects()!=null);

    return attr;
  }
  //======================================================
  /**
   *	Update Window . Depends on attribute type
   */
  //======================================================
    private void updateWindow()
    {
        if (initializing) //  Not initialized yet
            return;

        xDataTF.setVisible(false);
        yDataTF.setVisible(false);
        xDataLBL.setVisible(false);
        yDataLBL.setVisible(false);
        assAttrTF.setVisible(false);
        assAttrLBL.setVisible(false);
        memorizedBtn.setVisible(false);
        memorizedInitBtn.setVisible(false);

        //    Special case for DevEncoded type
        String    dataType = dataTypeCB.getSelectedItem().toString();
        if (dataType.equals("Tango::DEV_ENCODED"))
            //    Attribute only scalar
            attrTypeCB.setSelectedIndex(ATTR_SCALAR);

        switch(attrTypeCB.getSelectedIndex())
        {
        case ATTR_SCALAR:
            switch(rwTypeCB.getSelectedIndex())
            {
            case ATTR_READ_WITH_WRITE:
                assAttrTF.setVisible(true);
                assAttrLBL.setVisible(true);
                break;
            case ATTR_WRITE:
            case ATTR_READ_WRITE:
                if (memorizedBtn!=null)
                {
                    memorizedBtn.setVisible(true);
                    memorizedInitBtn.setVisible(false);
                }
                break;
            }
            break;
        case ATTR_SPECTRUM:
            xDataTF.setVisible(true);
            xDataLBL.setVisible(true);
            break;
        case ATTR_IMAGE:
            xDataTF.setVisible(true);
            yDataTF.setVisible(true);
            xDataLBL.setVisible(true);
            yDataLBL.setVisible(true);
            break;
        }
        //    Special case for DevEncoded type
        if (dataType.equals("Tango::DEV_ENCODED"))
        {
            //    Attribute not memorized
            memorizedBtn.setSelected(false);
            memorizedBtn.setVisible(false);
            memorizedInitBtn.setVisible(false);
       }

        pack();
    }
  //======================================================

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allowedBtn;
    private javax.swing.JLabel assAttrLBL;
    private javax.swing.JTextField assAttrTF;
    private javax.swing.JTextField attrPropDeltaTime;
    private javax.swing.JTextField attrPropDeltaValue;
    private javax.swing.JTextArea attrPropDescription;
    private javax.swing.JTextField attrPropDispUnit;
    private javax.swing.JTextField attrPropFormat;
    private javax.swing.JTextField attrPropLabel;
    private javax.swing.JTextField attrPropMaxAlarm;
    private javax.swing.JTextField attrPropMaxValue;
    private javax.swing.JTextField attrPropMaxWarning;
    private javax.swing.JTextField attrPropMinAlarm;
    private javax.swing.JTextField attrPropMinValue;
    private javax.swing.JTextField attrPropMinWarning;
    private javax.swing.JTextField attrPropStdUnit;
    private javax.swing.JTextField attrPropUnit;
    private javax.swing.JComboBox attrTypeCB;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox dataTypeCB;
    private javax.swing.JPanel definitionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton okBtn;
    private javax.swing.JPanel propertyPanel;
    private javax.swing.JComboBox rwTypeCB;
    private javax.swing.JLabel rwTypeLBL;
    private javax.swing.JLabel xDataLBL;
    private javax.swing.JTextField xDataTF;
    private javax.swing.JLabel yDataLBL;
    private javax.swing.JTextField yDataTF;
    // End of variables declaration//GEN-END:variables


	//	Added components.
	private JRadioButton	levelBtn;
	private JRadioButton	polledBtn;
	private JRadioButton	memorizedBtn;
	private JRadioButton	memorizedInitBtn;
	private JLabel			periodLabel;
	private JLabel			periodUnitLabel;
	private JTextField		periodText;

  //======================================================
}
