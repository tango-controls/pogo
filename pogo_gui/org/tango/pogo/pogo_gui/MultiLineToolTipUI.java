//+======================================================================
//
// Project:   Tango
//
// Description:	java source code for tool tip utilities
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011
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


/*
 * Originally written by Albert L. Ting and released into the public domain.
 *
 * Author: Albert L. Ting <alt@artisan.com>
 *
 * $Revision: 1.1.1.1 $
 * $Id: MultiLineToolTipUI.java,v 1.1.1.1 2010/07/02 10:54:41 verdier Exp $
 *
 */

package org.tango.pogo.pogo_gui;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.ToolTipUI;
import java.awt.*;
import java.awt.event.InputEvent;

/**
 * To add multiline tooltip support to your swing applications, just add this
 * static call to your main method.  Note, you only need to do this once, even
 * if you change LookAndFeel as the UIManager knows not to overwrite the user
 * defaults.  Moreover, it uses the current L&F foreground/background colors
 *
 *        MultiLineToolTipUI.initialize();
 */
public class MultiLineToolTipUI extends ToolTipUI {
  static MultiLineToolTipUI singleton = new MultiLineToolTipUI();
  private static int inset = 3;
  private static int accelerator_offset = 15;

  private MultiLineToolTipUI() {
  }

  public static void initialize() {
    // don't hardcode the class name, fetch it dynamically.  This way we can
    // obfuscate.
    String key = "ToolTipUI";
    Class cls = singleton.getClass();
    String name = cls.getName();
    UIManager.put(key, name);
    UIManager.put(name, cls);	// needed for 1.2
  }

  public static ComponentUI createUI(JComponent c) {
    return singleton;
  }

  public void installUI(JComponent c) {
    installDefaults(c);
  }

  public void uninstallUI(JComponent c) {
    uninstallDefaults(c);
  }

  protected void installDefaults(JComponent c) {
    LookAndFeel.installColorsAndFont(c,
        //"ToolTip.background",
			Color.LIGHT_GRAY.toString(),
		"ToolTip.foreground",
        "ToolTip.font"
		);
    LookAndFeel.installBorder(c, "ToolTip.border");
  }

  protected void uninstallDefaults(JComponent c) {
    LookAndFeel.uninstallBorder(c);
  }

  public void paint(Graphics g, JComponent c) {
    Font font = c.getFont();
     FontMetrics fontMetrics = g.getFontMetrics(font);
			 //Toolkit.getDefaultToolkit().getFontMetrics(font);

    Dimension dimension = c.getSize();
    int fontHeight = fontMetrics.getHeight();
    int fontAscent = fontMetrics.getAscent();
    String tipText = ((JToolTip) c).getTipText();
    if (tipText == null) return;
    String lines[] = tipText.split("\n");
    int num_lines = lines.length;
    int height;
    int i;

    g.setColor(c.getBackground());
    g.fillRect(0, 0, dimension.width, dimension.height);
    g.setColor(c.getForeground());
    for (i = 0, height = 2 + fontAscent; i < num_lines; i++, height += fontHeight) {
      g.drawString(lines[i], inset, height);
      if (i == num_lines - 1) {
        String keyText = getAcceleratorString((JToolTip) c);
        if (!keyText.equals("")) {
          Font small = new Font(font.getName(),
              font.getStyle(),
              font.getSize() - 2);
          g.setFont(small);
          g.drawString(keyText,
              fontMetrics.stringWidth(lines[i]) + accelerator_offset,
              height);
        }
      }
    }
  }

  public Dimension getPreferredSize(JComponent c) {
    Font font = c.getFont();
    FontMetrics fontMetrics = Toolkit.getDefaultToolkit().getFontMetrics(font);
    int fontHeight = fontMetrics.getHeight();
    String tipText = ((JToolTip) c).getTipText();

    // bug 4094153 indicates string could be null
    if (tipText == null) return new Dimension(6, 6);

    String lines[] = tipText.split("\n");
    int num_lines = lines.length;
    int width,height,onewidth;

    height = num_lines * fontHeight;
    width = 0;
    for (int i = 0; i < num_lines; i++) {
      onewidth = fontMetrics.stringWidth(lines[i]);
      if (i == num_lines - 1) {
        String keyText = getAcceleratorString((JToolTip) c);
        onewidth += fontMetrics.stringWidth(keyText) + accelerator_offset;
      }
      width = Math.max(width, onewidth);
    }
    return new Dimension(width + inset * 2, height + inset * 2);
  }

  public Dimension getMinimumSize(JComponent c) {
    return getPreferredSize(c);
  }

  public Dimension getMaximumSize(JComponent c) {
    return getPreferredSize(c);
  }

  public String getAcceleratorString(JToolTip tip) {
    JComponent comp = tip.getComponent();
    if (comp == null) {
      return "";
    }
    KeyStroke[] keys = comp.getRegisteredKeyStrokes();
    String controlKeyStr = "";

	  for (KeyStroke key : keys)
	  {

		  char c = (char) key.getKeyCode();
		  int mod = key.getModifiers();
		  if (mod == InputEvent.CTRL_MASK)
		  {
			  controlKeyStr = "cntl+" + (char) key.getKeyCode();
			  break;
		  }
		  else if (mod == InputEvent.ALT_MASK)
		  {
			  controlKeyStr = "alt+" + (char) key.getKeyCode();
			  break;
		  }
	  }
    return controlKeyStr;
  }
}
