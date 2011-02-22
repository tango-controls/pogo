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
// $Log$
// Revision 3.5  2005/11/24 08:28:45  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.4  2004/11/22 15:28:08  pascal_verdier
// Javadoc tags correction.
//
// Revision 3.3  2004/10/21 06:40:44  pascal_verdier
// Minor changes
//
// Revision 3.2  2004/09/07 12:02:44  pascal_verdier
// Remove CVS log messages and info from templates.
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
// Revision 1.1  2000/02/28 15:41:38  verdier
// Initial revision
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.appli;


import pogo.gene.*;

import javax.swing.*;

//========================================================================
/**
 *	This class implemets a thread to generate source files in background time.
 */
//========================================================================
public class GenerateThread extends Thread implements PogoDefs, PogoAppliDefs
{
/**
 *	PogoClass object to be used for files generation.
 */
	private PogoClass		pogo; 
	private int				item;
	private PogoAppli		parent;
	private GenerateDialog	dialog;
	private int				exiting;
	
//========================================================================
/**
 *	Constructor for the thread.
 *
 *	@param	parent	Parent frame used to popup dialog.
 *	@param	pogo	<a href=../gene/PogoClass.html>PogoClass </a> object
 *					to be used for files generation.
 *	@param	item	Type of file to be generated.
 *	@param	exiting	Program exit after code generation if true
 */
//========================================================================
	public GenerateThread(PogoAppli parent, PogoClass pogo, int item, int exiting)
	{
		this.parent = parent;
		this.pogo   = pogo;
		this.item   = item;
		this.exiting= exiting;
		
		int ratio;	//	to increase counter to 100% during generation
		if (item==GENE_DOC && pogo.language==javaLang)
			ratio = 7;
		else
			ratio = 20;
		dialog = new GenerateDialog(parent, ratio);
	}
	
	
//========================================================================
/**
 *	Start the thread.
 */
 //========================================================================
   public void run()
	{
		try
		{
			switch(item)
			{
			//	Generate Source Files
			case GENE_SRC:
				if (pogo.language==pyLang)
				{
					PogoGenePython gene = new PogoGenePython(pogo);
					gene.generate();
					dialog.stop();
					if (exiting==DONT_EXIT_ON_RETURN)
						JOptionPane.showMessageDialog(parent, 
											gene.getTrace(),
											"Message Window",
											JOptionPane.INFORMATION_MESSAGE);
					
				}
				else
				if (pogo.language==javaLang)
				{
					PogoGeneJava gene = new PogoGeneJava(pogo);
					gene.generate();
					dialog.stop();
					if (exiting==DONT_EXIT_ON_RETURN)
						JOptionPane.showMessageDialog(parent,
											gene.getTrace(),
											"Message Window",
											JOptionPane.INFORMATION_MESSAGE);

				}
				else
                if (pogo.language==cppLang)
				{
					PogoGeneCpp gene = new PogoGeneCpp(pogo);
					gene.generate();
					dialog.stop();
					if (exiting==DONT_EXIT_ON_RETURN)
						JOptionPane.showMessageDialog(parent, 
											gene.getTrace(),
											"Message Window",
											JOptionPane.INFORMATION_MESSAGE);
					
				}
                else
                    app_util.PopupError.show(parent, "Language not supported.");

                break;

			//	Generate Doc Files
			//----------------------------
			case GENE_DOC:
				new PogoGeneDoc(pogo).generate();
				dialog.stop();
				if (exiting==DONT_EXIT_ON_RETURN)
					JOptionPane.showMessageDialog(parent, 
										"Html Documentation Generated in :\n"+
										pogo.projectFiles.getDocHtml(),
										"Message Window",
										JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}
		//	catch exceptions occured on file generation
		//------------------------------------------------------
		catch (Exception ex)
		{
			dialog.stop();
			if (exiting==DONT_EXIT_ON_RETURN)
				JOptionPane.showMessageDialog(parent, ex.toString(),
													"Error Window",
													JOptionPane.ERROR_MESSAGE);
			//else
				ex.printStackTrace();
		}
		//parent.endOfGenerateThread();
	}
}
