//+======================================================================
//
// Project:   Tango
//
// Description:  java source code for state machchine swing class.
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

package org.tango.pogo.pogo_gui.tools;

import fr.esrf.tango.pogo.pogoDsl.*;
import org.eclipse.emf.common.util.EList;
import org.tango.pogo.pogo_gui.PogoConst;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;

//===============================================================
/**
 * JTable class to define state machine
 *  (Commands, attributes and pipe for each state)
 *
 * @author root
 */
//===============================================================
public class StateMachineTable extends JTable {
    private EList<Command> commands = null;
    private EList<Command> dynCommands = null;
    private EList<Attribute> attributes = null;
    private EList<Attribute> dynAttributes = null;
    private EList<Pipe> pipes = null;
    private EList<State> stateList;
    private List<String> columnNames = new ArrayList<>();
    private List<RowItem> itemList = new ArrayList<>();
    private TablePopupMenu popupMenu;
    private int width = 0;
    private static Color headerBackground;
    private boolean sortUp = true;

    public static final int COMMAND = 0;
    public static final int ATTRIBUTE = 1;
    public static final int PIPE = 2;

    private static final String[] ItemNames =
            new String[]{"Commands", "Attributes", "Pipes"};
    private static final int FIRST_COLUMN_WIDTH = 200;
    private static final int STATE_COLUMN_WIDTH = 60;
    public static final int MAX_HEIGHT = 500;
    private static final Boolean READ = false;
    private static final Boolean WRITE = true;
    //===============================================================
    /**
     * Creates new JTable to define state machine
     *
     * @param pogoClass Pogo class to edit state machine
     * @param type      COMMAND, ATTRIBUTE or PIPE
     */
    //===============================================================
    public StateMachineTable(PogoDeviceClass pogoClass, int type) {
        popupMenu = new TablePopupMenu(this);
        //  Build column names with item and state names
        stateList = pogoClass.getStates();
        columnNames.add(ItemNames[type]);
        for (State state : stateList)
            columnNames.add(state.getName());

        //  Set values with pogo class info
        //  Names and allowed states
        switch (type) {
            case COMMAND:
                commands = pogoClass.getCommands();
                dynCommands = pogoClass.getDynamicCommands();
                manageCommands(commands);
                manageCommands(dynCommands);
                break;
            case ATTRIBUTE:
                attributes    = pogoClass.getAttributes();
                dynAttributes = pogoClass.getDynamicAttributes();
                manageAttribute(attributes);
                manageAttribute(dynAttributes);
                break;
            case PIPE:
                pipes = pogoClass.getPipes();
                for (Pipe pipe : pipes) {
                    itemList.add(new RowItem(pipe.getName(), pipe.getReadExcludedStates(), READ));
                    boolean writable = !pipe.getRwType().equals(PogoConst.AttrRWtypeArray[PogoConst.READ]);
                    if (writable)
                        itemList.add(new RowItem(pipe.getName(), pipe.getWriteExcludedStates(), WRITE));
                }
                break;
        }
        buildTable();
    }

    //===============================================================
    //===============================================================
    private void manageCommands(EList<Command> commands) {
        for (Command command : commands) {
            String name = command.getName();
            if (!name.equals("State") && !name.equals("Status")) {
                itemList.add(new RowItem(name, command.getExcludedStates()));
            }
        }
    }
    //===============================================================
    //===============================================================
    private void manageAttribute(EList<Attribute> attributes) {
        for (Attribute attribute : attributes) {
            itemList.add(new RowItem(attribute.getName(), attribute.getReadExcludedStates(), READ));
            boolean writable = !attribute.getRwType().equals(PogoConst.AttrRWtypeArray[PogoConst.READ]);
            if (writable) {
                itemList.add(new RowItem(attribute.getName(), attribute.getWriteExcludedStates(), WRITE));
            }
        }
    }
    //===============================================================
    //===============================================================
    public Dimension getDimension(JDialog parent) {
        parent.pack();
        int height = getHeight() + 30; // + header
        if (height>MAX_HEIGHT) height = MAX_HEIGHT;
        return new Dimension(width, height);
    }

    //===============================================================
    //===============================================================
    private void buildTable() {
        setModel(new DataTableModel());
        setDefaultRenderer(String.class, new LabelCellRenderer());
        getTableHeader().setFont(new java.awt.Font("Dialog", Font.BOLD, 12));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableActionPerformed(evt);
            }
        });

        //  Set column width
        final Enumeration columnEnum = getColumnModel().getColumns();
        int i = 0;
        TableColumn tableColumn;
        while (columnEnum.hasMoreElements()) {
            int w = (i++==0) ? FIRST_COLUMN_WIDTH : STATE_COLUMN_WIDTH;
            width += w;
            tableColumn = (TableColumn) columnEnum.nextElement();
            tableColumn.setPreferredWidth(w);
            //tableColumn.setHeaderRenderer(new LabelHeaderRenderer());
        }
        width += 20; // Scroll bar

        getTableHeader().setDefaultRenderer(new LabelHeaderRenderer());

        //  Add listener on column headers
        getTableHeader().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHeaderActionPerformed(evt);
            }
        });
        headerBackground = getTableHeader().getBackground();
    }

    //===============================================================
    //===============================================================
    private void tableActionPerformed(java.awt.event.MouseEvent event) {
        Point clickedPoint = new Point(event.getX(), event.getY());
        int row = rowAtPoint(clickedPoint);
        int column = columnAtPoint(clickedPoint);
        int mask = event.getModifiers();
        //  Check button clicked
        if ((mask & MouseEvent.BUTTON1_MASK)!=0) {
            if (column>0) {
                //	Get selected allowed and inverse boolean value
                column--;
                RowItem rowItem = itemList.get(row);
                rowItem.toggleAllowed(column);
                repaint();
            }
        }
        else if ((mask & MouseEvent.BUTTON3_MASK)!=0) {
            selectedRow = row;
            popupMenu.showMenu(event, false); //   For Attr
        }
    }

    //===============================================================
    //===============================================================
    private int selectedColumn;
    private int selectedRow;
    private void tableHeaderActionPerformed(java.awt.event.MouseEvent event) {
        int mask = event.getModifiers();
        selectedColumn = getTableHeader().columnAtPoint(new Point(event.getX(), event.getY()));

        //  Check button clicked
        if ((mask & MouseEvent.BUTTON3_MASK)!=0) {
            //  Display menu
            if (selectedColumn>0)
                popupMenu.showMenu(event, true); // For State
        }
        else if ((mask & MouseEvent.BUTTON1_MASK)!=0) {
            if (selectedColumn==0) {
                Collections.sort(itemList, new RowItemComparator());
                sortUp = ! sortUp;
            }
        }
    }

    //===============================================================
    //===============================================================
    private void setAllFor(boolean b, boolean forState) {
        if (forState) {
            for (RowItem item : itemList) {
                item.setAllowed(selectedColumn - 1, b);
            }
        } else {
            itemList.get(selectedRow).setAllowed(b);
        }
        repaint();
    }

    //===============================================================
    //===============================================================
    private void updateExcluded(String name) {
        for (RowItem item : itemList) {
            if (item.name.equals(name)) {
                item.updateExcluded();
            }
        }
    }

    //===============================================================
    //===============================================================
    public void updateExcluded() {
        if (commands!=null) {
            for (Command command : commands) {
                updateExcluded(command.getName());
            }
        }
        if (dynCommands!=null) {
            for (Command command : dynCommands) {
                updateExcluded(command.getName());
            }
        }
        if (attributes!=null) {
            for (Attribute attribute : attributes) {
                updateExcluded(attribute.getName());
            }
        }
        if (dynAttributes!=null) {
            for (Attribute attribute : dynAttributes) {
                updateExcluded(attribute.getName());
            }
        }
        if (pipes!=null) {
            for (Pipe pipe : pipes) {
                updateExcluded(pipe.getName());
            }
        }
    }
    //===============================================================
    //===============================================================


    //===============================================================
    /**
     * Define a row item (command, read attribute, ....
     */
    //===============================================================
    private class RowItem {
        private String name;
        private boolean write = false;
        private boolean display = false;
        private Boolean[] allowed;
        private EList<String> excluded;
        //===========================================================
        private RowItem(String name, EList<String> excluded) {
            this.name = name;
            this.excluded = excluded;
            manageAllowed(excluded);
        }
        //===========================================================
        private RowItem(String name, EList<String> excluded, boolean write) {
            this.name = name;
            this.write = write;
            this.display = true;
            this.excluded = excluded;
            manageAllowed(excluded);
        }
        //===========================================================
        private void manageAllowed(EList<String> excluded) {
            allowed = new Boolean[stateList.size()];
            int i = 0;
            for (State state : stateList) {
                allowed[i++] = isAllowed(state.getName(), excluded);
            }
        }
        //===========================================================
        private boolean isAllowed(String stateName, EList<String> excluded) {
            boolean found = false;
            for (String s : excluded) {
                if (s.equals(stateName))
                    found = true;
            }
            return !found;
        }
        //===========================================================
        private void setAllowed(boolean b) {
            //  Do it for all
            for (int i = 0 ; i<allowed.length ; i++)
                allowed[i] = b;
        }
        //===========================================================
        private void setAllowed(int index, boolean b) {
            //  Do it for one specified
            allowed[index] = b;
        }
        //===========================================================
        private void toggleAllowed(int index) {
            allowed[index] = !allowed[index];
        }
        //===========================================================
        private void updateExcluded() {
            excluded.clear();
            int i = 0;
            for (boolean b : allowed) {
                if (b==false) {
                    excluded.add(stateList.get(i).getName());
                }
                i++;
            }
        }
        //===========================================================
        public String toString() {
            if (display)
                return name + ((write) ? " (Write)" : " (Read)");
            else
                return name;
        }
        //===========================================================
    }
    //=========================================================================
    //=========================================================================


    //=========================================================================
    /**
     * The Table model
     */
    //=========================================================================
    public class DataTableModel extends DefaultTableModel {
        //==========================================================
        public int getColumnCount() {
            return columnNames.size();
        }

        //==========================================================
        public int getRowCount() {
            return itemList.size();
        }

        //==========================================================
        public String getColumnName(int columnIndex) {
            if (columnIndex>=getColumnCount())
                return columnNames.get(getColumnCount() - 1);
            else
                return columnNames.get(columnIndex);
        }
        //==========================================================
        public Object getValueAt(int row, int column) {
            if (column==0)
                return itemList.get(row); // Row title

            column--;
            RowItem rowItem = itemList.get(row);
            return rowItem.allowed[column];
        }
        //==========================================================
        /**
         * @param column the specified co;umn number
         * @return the cell class at first row for specified column.
         */
        //==========================================================
        public Class getColumnClass(int column) {
            if (isVisible()) {
                if (column==0)
                    return String.class;
                else
                    return Boolean.class;
            } else
                return null;
        }
        //==========================================================
        //==========================================================
    }


    //=========================================================================
    /**
     * Renderer to set cell color
     */
    //=========================================================================
    public class LabelCellRenderer extends JLabel implements TableCellRenderer {

        //==========================================================
        public LabelCellRenderer() {
            setFont(new Font("Dialog", Font.BOLD, 12));
            setOpaque(true);
        }
        //==========================================================
        public Component getTableCellRendererComponent(
                JTable table, Object value,
                boolean isSelected, boolean hasFocus,
                int row, int column) {

            setText(itemList.get(row).toString());
            if (isSelected)
                setBackground(getSelectionBackground());
            else
                setBackground(headerBackground);
            return this;
        }
        //==========================================================
    }
    //=========================================================================
    //=========================================================================



    //=========================================================================
    /**
     * Renderer to set cell color
     */
    //=========================================================================
    public class LabelHeaderRenderer extends JButton implements TableCellRenderer {

        //==========================================================
        public LabelHeaderRenderer() {
            setFont(new Font("Dialog", Font.BOLD, 12));
            setOpaque(true);
            setBorder(new javax.swing.border.MatteBorder(null));
        }
        //==========================================================
        public Component getTableCellRendererComponent(
                JTable table, Object value,
                boolean isSelected, boolean hasFocus,
                int row, int column) {
            switch (column) {
                case 0:
                    setText("");
                    setBackground(headerBackground);
                    break;

                default:
                    String stateName = columnNames.get(column);
                    setText(stateName);
                    setBackground(Utils.getColor4State(columnNames.get(column)));
                    setForeground(Utils.getForeground4State(columnNames.get(column)));
            }
            return this;
        }
        //==========================================================
    }
    //=========================================================================
    //=========================================================================






    //======================================================
    /**
     * Popup menu class
     */
    //======================================================
    private static final int SELECT_ALL = 0;
    private static final int RESET_ALL = 1;
    private static final int OFFSET = 2;    //	Label And separator

    private static String[] menuLabels = {
            "Select ALL",
            "Un select ALL",
    };

    //=======================================================
    //=======================================================
    private class TablePopupMenu extends JPopupMenu {
        private JLabel title;
        private JTable table;
        private boolean forState; //    Else for attribute
        //======================================================
        private TablePopupMenu(JTable table) {
            this.table = table;
            title = new JLabel();
            title.setFont(new java.awt.Font("Dialog", Font.BOLD, 12));
            add(title);
            add(new JPopupMenu.Separator());

            for (String menuLabel : menuLabels) {
                if (menuLabel==null)
                    add(new Separator());
                else {
                    JMenuItem btn = new JMenuItem(menuLabel);
                    btn.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                            menuActionPerformed(evt);
                        }
                    });
                    add(btn);
                }
            }
        }
        //======================================================
        private void showMenu(MouseEvent event, boolean forState) {
            this.forState = forState;
            if (forState) {
                title.setText(columnNames.get(selectedColumn));
                show(table.getTableHeader(), event.getX(), event.getY());
            } else {
                title.setText(itemList.get(selectedRow).toString());
                show(table, event.getX(), event.getY());
            }
        }
        //======================================================
        private void menuActionPerformed(ActionEvent evt) {
            //	Check component source
            Object obj = evt.getSource();
            int itemIndex = -1;
            for (int i = 0 ; i<menuLabels.length ; i++)
                if (getComponent(OFFSET + i)==obj)
                    itemIndex = i;
            switch (itemIndex) {
                case SELECT_ALL:
                    setAllFor(true, forState);
                    break;
                case RESET_ALL:
                    setAllFor(false, forState);
                    break;
            }
        }
    }
    //=========================================================================
    //=========================================================================


    //=========================================================================
    /**
     * Comparator to sort RowItem list
     */
    //=========================================================================
    private class RowItemComparator implements Comparator<RowItem> {
        //======================================================
        public int compare(RowItem item1, RowItem item2) {
            switch (selectedColumn) {
                case 0:
                    return alphabeticalSort(item1.toString(), item2.toString());
                default:
                    return 0;
            }
        }
        //======================================================
        private int alphabeticalSort(String s1, String s2) {
            if (sortUp) {
                if (s1==null) return 1;
                else if (s2==null) return -1;
                else return s1.compareTo(s2);
            }
            else {
                if (s1==null) return -1;
                else if (s2==null) return 1;
                else return s2.compareTo(s1);
            }
        }
        //======================================================
    }
}