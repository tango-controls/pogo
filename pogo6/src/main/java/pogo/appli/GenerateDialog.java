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
// Revision 3.1  2004/09/07 12:02:44  pascal_verdier
// Remove CVS log messages and info from templates.
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
// Revision 1.1  2000/03/29 13:11:48  verdier
// Initial revision
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


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//===========================================================
/**
 *	Create a thread to display a Process Monitor
 *	and update it during files generation.
 */
//===========================================================
public class GenerateDialog extends JDialog implements ActionListener
{
	static private int		MAX = 100;
	private ProgressMonitor	pbar;
	private int				cnt = 0;
	private int				ratio;

//======================================================================
/**
 *	Constructor for the dialog.
 *
 *	@param	parent	Frame parent to create dialog.
 */
//======================================================================
	public GenerateDialog(Frame parent, int r)
	{
		super(parent, true);
		pbar = new ProgressMonitor(this, "Pogo is Generating Files. Wait a while....",
									"Wait a while", 0, MAX);

		cnt = 1;
		ratio = r;
		//	Fire a timer every once in a while to update the progress
		//--------------------------------------------------------------
		javax.swing.Timer	timer = new javax.swing.Timer(500, this);
		timer.start();
	}
//======================================================================
/**
 *	Invoked by the timer every half second.
 *	Simply place the progress monitor update in event queue.
 */
//======================================================================
	public void actionPerformed(ActionEvent	evt)
	{
		SwingUtilities.invokeLater(new Update());
	}
//======================================================================
/**
 *	Stop the thread (End of process reached).
 */
//======================================================================
	public void stop()
	{
		cnt = MAX;
		pbar.close();
	}
//======================================================================
/**
 *	Start the thread to update Process Monitor.
 */
//======================================================================
	class Update implements Runnable
	{
		public void run()
		{
			if (pbar.isCanceled())
				;
			pbar.setProgress(cnt);
			pbar.setNote("Operation is " + cnt + "% complete...");
			if (cnt< MAX-ratio)
				cnt+=ratio;
		}
	}
 //======================================================================
}
