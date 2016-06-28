//+======================================================================
//
// Project:   Tango
//
// Description:	java source code for inheritance utilities
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

import fr.esrf.tango.pogo.pogoDsl.*;
import org.eclipse.emf.common.util.EList;
import org.tango.pogo.pogo_gui.tools.OAWutils;
import org.tango.pogo.pogo_gui.tools.PogoProperty;
import org.tango.pogo.pogo_gui.tools.Utils;

import javax.swing.*;
import java.awt.*;


public class InheritanceUtils {
    private static InheritanceUtils instance = null;
    private static Utils utils;
    private static final boolean trace = false;

    //===============================================================
    //===============================================================
    private InheritanceUtils() {
        utils = Utils.getInstance();
    }

    //===============================================================
    //===============================================================
    public static InheritanceUtils getInstance() {
        if (instance == null)
            instance = new InheritanceUtils();
        return instance;
    }

    //===============================================================
    //===============================================================
    public String manageInheritanceItems(DeviceClass deviceClass) {
        return cloneAncestor(null, deviceClass);
    }

    //===============================================================
    //===============================================================
    private String cloneAncestor(DeviceClass originalClass, DeviceClass devClass) {
        StringBuilder sb = new StringBuilder();

        //  First time, check if devClass must be updated from ancestors
        DeviceClass _class = devClass;
        if (devClass.getAncestors().size() > 0) {
            for (int i=devClass.getAncestors().size() - 1  ; i>=0  ; i--) {
                DeviceClass ancestor = devClass.getAncestors().get(i);
                cloneAncestor(_class, ancestor);
                _class = ancestor;
            }
        }

        //  Then really clone items
        if (originalClass != null) {
            System.out.println(originalClass.getPogoDeviceClass().getName() + " inherits from " + devClass.getPogoDeviceClass()
                    .getName());
            cloneProperties(originalClass, devClass, false);
            cloneProperties(originalClass, devClass, true);
            sb.append(cloneCommands(originalClass, devClass));
            sb.append(cloneAttributes(originalClass, devClass));
            cloneForwardedAttributes(originalClass, devClass);
            cloneStates(originalClass, devClass);
        }
        return sb.toString();
    }

    //===============================================================
    //===============================================================
    private void cloneProperties(DeviceClass devClass, DeviceClass ancestor, boolean is_dev) {
        if (trace)
            System.out.println("Cloning " + ((is_dev) ? "device" : "class") +
                    " properties from " + ancestor.getPogoDeviceClass().getName() +
                    " to  " + devClass.getPogoDeviceClass().getName());

        EList<Property> classProperties;
        EList<Property> ancestorProperties;
        if (is_dev) {
            classProperties = devClass.getPogoDeviceClass().getDeviceProperties();
            ancestorProperties = ancestor.getPogoDeviceClass().getDeviceProperties();
        } else {
            classProperties = devClass.getPogoDeviceClass().getClassProperties();
            ancestorProperties = ancestor.getPogoDeviceClass().getClassProperties();
        }
        for (Property inheritedProperty : ancestorProperties) {
            Property new_prop = OAWutils.factory.createProperty();
            new_prop.setName(inheritedProperty.getName());
            new_prop.setDescription(inheritedProperty.getDescription());
            new_prop.setType(PropertyDialog.createType(inheritedProperty.getType()));
            EList<String> ancestor_values = inheritedProperty.getDefaultPropValue();
            EList<String> new_values = new_prop.getDefaultPropValue();
            for (String s : ancestor_values)
                new_values.add(s);
            if (Utils.isTrue(inheritedProperty.getMandatory()))
                new_prop.setMandatory("true");

            //	manage inheritance status
            InheritanceStatus status = OAWutils.factory.createInheritanceStatus();
            status.setAbstract("false");
            status.setInherited("true");
            status.setConcrete("true");
            new_prop.setStatus(status);

            //  Check if property already exists
            //System.out.println("   " + new_prop.getName());
            Property prop_exists = null;
            for (Property prop : classProperties) {
                if (prop.getName().equals(new_prop.getName())) {
                    prop_exists = prop;

                    //	Check if has changed **** Name cannot has been changed
                }
            }
            if (prop_exists != null) {
                int idx = classProperties.indexOf(prop_exists);
                classProperties.remove(prop_exists);
                classProperties.add(idx, new_prop);
            } else
                classProperties.add(new_prop);
        }
    }

    //===============================================================
    //===============================================================
    private void cloneStates(DeviceClass devClass, DeviceClass ancestor) {
        if (trace)
            System.out.println("Cloning states from " + ancestor.getPogoDeviceClass().getName() +
                    " to  " + devClass.getPogoDeviceClass().getName());

        EList<State> class_states = devClass.getPogoDeviceClass().getStates();
        EList<State> ancestor_states = ancestor.getPogoDeviceClass().getStates();
        for (State inher_state : ancestor_states) {
            State new_state = OAWutils.factory.createState();
            new_state.setName(inher_state.getName());
            new_state.setDescription(inher_state.getDescription());

            //	Check inheritance status
            InheritanceStatus status = OAWutils.factory.createInheritanceStatus();
            status.setAbstract("false");
            status.setInherited("true");
            status.setConcrete("true");
            new_state.setStatus(status);
            //  Check if state already exists
            //System.out.println("   " + new_state.getName());
            State state_exists = null;
            for (State state : class_states) {
                if (state.getName().equals(new_state.getName())) {
                    state_exists = state;

                    //	Check if has changed **** Name cannot has been changed
                }
            }
            if (state_exists != null) {
                int idx = class_states.indexOf(state_exists);
                class_states.remove(state_exists);
                class_states.add(idx, new_state);
            } else
                class_states.add(new_state);
        }
    }
    //===============================================================
    //===============================================================
    private void cloneForwardedAttributes(DeviceClass devClass, DeviceClass ancestor) {
        if (trace)
            System.out.println("Cloning forwarded attribute from " + ancestor.getPogoDeviceClass().getName() +
                    " to  " + devClass.getPogoDeviceClass().getName());

        EList<ForwardedAttribute> classForwardedList =
                devClass.getPogoDeviceClass().getForwardedAttributes();
        EList<ForwardedAttribute> ancestorForwardedList =
                ancestor.getPogoDeviceClass().getForwardedAttributes();
        for (ForwardedAttribute inheritedForwarded : ancestorForwardedList) {
            ForwardedAttribute newForwarded = OAWutils.factory.createForwardedAttribute();
            newForwarded.setName(inheritedForwarded.getName());
            newForwarded.setLabel(inheritedForwarded.getLabel());

            //	Check inheritance status
            InheritanceStatus status = OAWutils.factory.createInheritanceStatus();
            status.setAbstract("false");
            status.setInherited("true");
            status.setConcrete("true");
            newForwarded.setStatus(status);
            //  Check if FW attribute already exists
            //System.out.println("   " + new_state.getName());
            ForwardedAttribute forwarded_exists = null;
            for (ForwardedAttribute attribute : classForwardedList) {
                if (attribute.getName().equals(newForwarded.getName())) {
                    forwarded_exists = attribute;

                    //	Check if has changed **** Name cannot has been changed
                }
            }
            if (forwarded_exists != null) {
                int idx = classForwardedList.indexOf(forwarded_exists);
                classForwardedList.remove(forwarded_exists);
                classForwardedList.add(idx, newForwarded);
            } else
                classForwardedList.add(newForwarded);
        }
    }

    //===============================================================
    //===============================================================
    private String cloneAttributes(DeviceClass devClass, DeviceClass ancestor) {
        if (trace)
            System.out.println("Cloning attributes from " + ancestor.getPogoDeviceClass().getName() +
                    " to  " + devClass.getPogoDeviceClass().getName());

        StringBuilder sb = new StringBuilder();
        EList<Attribute> class_attributes = devClass.getPogoDeviceClass().getAttributes();
        EList<Attribute> ancestor_attributes = ancestor.getPogoDeviceClass().getAttributes();

        for (Attribute inher_attr : ancestor_attributes) {
            Attribute new_attr = OAWutils.factory.createAttribute();
            new_attr.setName(inher_attr.getName());
            new_attr.setAttType(inher_attr.getAttType());
            new_attr.setRwType(inher_attr.getRwType());

            new_attr.setDataType(OAWutils.createType(inher_attr.getDataType()));
            new_attr.setMaxX(inher_attr.getMaxX());
            new_attr.setMaxY(inher_attr.getMaxY());
            new_attr.setAllocReadMember(inher_attr.getAllocReadMember());

            //	Attribute properties.
            AttrProperties new_prop = OAWutils.factory.createAttrProperties();
            AttrProperties inher_prop = inher_attr.getProperties();
            if (inher_prop != null) {
                new_prop.setLabel(inher_prop.getLabel());
                new_prop.setUnit(inher_prop.getUnit());
                new_prop.setStandardUnit(inher_prop.getStandardUnit());
                new_prop.setDisplayUnit(inher_prop.getDisplayUnit());
                new_prop.setFormat(inher_prop.getFormat());
                new_prop.setMaxValue(inher_prop.getMaxValue());
                new_prop.setMinValue(inher_prop.getMinValue());
                new_prop.setMaxAlarm(inher_prop.getMaxAlarm());
                new_prop.setMinAlarm(inher_prop.getMinAlarm());
                new_prop.setMaxWarning(inher_prop.getMaxWarning());
                new_prop.setMinWarning(inher_prop.getMinWarning());
                new_prop.setDeltaTime(inher_prop.getDeltaTime());
                new_prop.setDeltaValue(inher_prop.getDeltaValue());
                new_prop.setDescription(inher_prop.getDescription());
                new_attr.setProperties(new_prop);
            }
            //  polling period, fire evt, memorized ....
            new_attr.setDisplayLevel(inher_attr.getDisplayLevel());
            new_attr.setPolledPeriod(inher_attr.getPolledPeriod());
            new_attr.setArchiveEvent(inher_attr.getArchiveEvent());
            new_attr.setChangeEvent(inher_attr.getChangeEvent());
            new_attr.setMemorized(inher_attr.getMemorized());
            new_attr.setMemorizedAtInit(inher_attr.getMemorizedAtInit());

            //	Check if a virtual attribute
            InheritanceStatus status = OAWutils.factory.createInheritanceStatus();
            status.setAbstract(inher_attr.getStatus().getAbstract());
            status.setInherited("true");
            if (Utils.isTrue(inher_attr.getStatus().getConcrete()) ||
                Utils.isTrue(inher_attr.getStatus().getConcreteHere()) )
                status.setConcrete("true");
            else
                status.setConcrete("false");
            new_attr.setStatus(status);

            //	Manage exclude states
            EList<String> new_states = new_attr.getReadExcludedStates();
            EList<String> inher_states = inher_attr.getReadExcludedStates();
            for (String name : inher_states)
                new_states.add(name);

            new_states = new_attr.getWriteExcludedStates();
            inher_states = inher_attr.getWriteExcludedStates();
            for (String name : inher_states)
                new_states.add(name);

            //  Set default event management
            if (inher_attr.getEventCriteria()!=null) {
                EventCriteria   eventCriteria = OAWutils.factory.createEventCriteria();
                eventCriteria.setPeriod(inher_attr.getEventCriteria().getPeriod());
                eventCriteria.setRelChange(inher_attr.getEventCriteria().getRelChange());
                eventCriteria.setAbsChange(inher_attr.getEventCriteria().getAbsChange());
                new_attr.setEventCriteria(eventCriteria);
            }
            if (inher_attr.getEvArchiveCriteria()!=null) {
                EventCriteria   eventCriteria = OAWutils.factory.createEventCriteria();
                eventCriteria.setPeriod(inher_attr.getEvArchiveCriteria().getPeriod());
                eventCriteria.setRelChange(inher_attr.getEvArchiveCriteria().getRelChange());
                eventCriteria.setAbsChange(inher_attr.getEvArchiveCriteria().getAbsChange());
                new_attr.setEvArchiveCriteria(eventCriteria);
            }

            //  Set fire event management
            if (inher_attr.getChangeEvent() != null) {
                FireEvents changeEvents = OAWutils.factory.createFireEvents();
                changeEvents.setFire(inher_attr.getChangeEvent().getFire());
                changeEvents.setLibCheckCriteria(inher_attr.getChangeEvent().getLibCheckCriteria());
                new_attr.setChangeEvent(changeEvents);
            }
            if (inher_attr.getArchiveEvent() != null) {
                FireEvents archiveEvents = OAWutils.factory.createFireEvents();
                archiveEvents.setFire(inher_attr.getArchiveEvent().getFire());
                archiveEvents.setLibCheckCriteria(inher_attr.getArchiveEvent().getLibCheckCriteria());
                new_attr.setArchiveEvent(archiveEvents);
            }

            //  Check if attribute already exists
            Attribute attr_exists = null;
            for (Attribute attr : class_attributes) {
                if (attr.getName().equals(new_attr.getName())) {
                    attr_exists = attr;
                    //  manage the non inherited part part(description,...)
                    manageNonInheritedPart(attr, new_attr);

                    //  Check if this cmd is set concrete in this class
                    InheritanceStatus orig_status = attr.getStatus();
                    status.setConcreteHere(orig_status.getConcreteHere());
                    status.setConcrete(orig_status.getConcrete());

                    //	Check if has changed
                    new_attr.getStatus().setHasChanged(attributeHasChanged(attr, new_attr));
                    if (new_attr.getStatus().getHasChanged() != null) {
                        System.err.println("******* " + attr.getName() + "  Has  Changed !!");
                        System.err.println(new_attr.getStatus().getHasChanged());
                        sb.append(new_attr.getStatus().getHasChanged());
                    }

                }
            }
            //System.out.println("   " + new_attr.getName());
            if (attr_exists != null) {
                int idx = class_attributes.indexOf(attr_exists);
                class_attributes.remove(attr_exists);
                class_attributes.add(idx, new_attr);
            } else
                class_attributes.add(new_attr);
        }
        return sb.toString();
    }

    //===============================================================
    //===============================================================
    private String cloneCommands(DeviceClass devClass, DeviceClass ancestor) {
        if (trace)
            System.out.println("Cloning commands from " + ancestor.getPogoDeviceClass().getName() +
                    " to  " + devClass.getPogoDeviceClass().getName());
        StringBuilder sb = new StringBuilder();
        EList<Command> class_commands = devClass.getPogoDeviceClass().getCommands();
        EList<Command> ancestor_commands = ancestor.getPogoDeviceClass().getCommands();

        for (Command inher_cmd : ancestor_commands) {
            Command new_cmd = OAWutils.factory.createCommand();
            new_cmd.setName(inher_cmd.getName());
            new_cmd.setDescription(inher_cmd.getDescription());

            //	Manage arguments
            Argument argin = OAWutils.factory.createArgument();
            Argument argout = OAWutils.factory.createArgument();

            argin.setType(OAWutils.createType(inher_cmd.getArgin().getType()));
            argin.setDescription(inher_cmd.getArgin().getDescription());

            argout.setType(OAWutils.createType(inher_cmd.getArgout().getType()));
            argout.setDescription(inher_cmd.getArgout().getDescription());
            new_cmd.setArgin(argin);
            new_cmd.setArgout(argout);
            new_cmd.setDisplayLevel(inher_cmd.getDisplayLevel());
            new_cmd.setPolledPeriod(inher_cmd.getPolledPeriod());

            //	Manage exclude states
            EList<String> new_states = new_cmd.getExcludedStates();
            EList<String> inher_states = inher_cmd.getExcludedStates();
            for (String name : inher_states)
                new_states.add(name);
            new_cmd.setExecMethod(Utils.buildCppExecuteMethodName(new_cmd.getName()));

            //	Check if a virtual command
            InheritanceStatus status = OAWutils.factory.createInheritanceStatus();
            status.setAbstract(inher_cmd.getStatus().getAbstract());
            status.setInherited("true");
            status.setConcrete(inher_cmd.getStatus().getConcrete());
            new_cmd.setStatus(status);

            //  Check if command already exists
            Command cmd_exists = null;
            for (Command cmd : class_commands) {
                if (cmd.getName().equals(new_cmd.getName())) {
                    cmd_exists = cmd;
                    //  manage the non inherited part part(description,...)
                    manageNonInheritedPart(cmd, new_cmd);
                    //  Check if this cmd is set concrete in this class
                    InheritanceStatus orig_status = cmd.getStatus();
                    status.setConcreteHere(orig_status.getConcreteHere());
                    status.setConcrete(orig_status.getConcrete());

                    //	Check if has changed
                    new_cmd.getStatus().setHasChanged(commandHasChanged(cmd, new_cmd));
                    if (new_cmd.getStatus().getHasChanged() != null) {
                        System.err.println("******* " + cmd.getName() + "  Has  Changed !!");
                        System.err.println(new_cmd.getStatus().getHasChanged());
                        sb.append(new_cmd.getStatus().getHasChanged());
                    }
                }
            }

            //System.out.println("   " + new_cmd.getName());
            if (cmd_exists != null) {
                int idx = class_commands.indexOf(cmd_exists);
                class_commands.remove(cmd_exists);
                class_commands.add(idx, new_cmd);
            } else
                class_commands.add(new_cmd);
        }
        return sb.toString();
    }
    //===============================================================
    /**
     * If a item already exists, some fields must not be inherited if set.
     *
     * @param existing existing item
     * @param created  created item (mixed with inheritance and existing one)
     */
    //===============================================================
    private void manageNonInheritedPart(Command existing, Command created) {
        if (Utils.isSet(existing.getDescription()))
            created.setDescription(existing.getDescription());
        if (Utils.isSet(existing.getArgin().getDescription()))
            created.getArgin().setDescription(existing.getArgin().getDescription());
        if (Utils.isSet(existing.getArgout().getDescription()))
            created.getArgout().setDescription(existing.getArgout().getDescription());
        if (Utils.isSet(existing.getPolledPeriod()))
            created.setPolledPeriod(existing.getPolledPeriod());
    }
    //===============================================================
    /**
     * If a item already exists, some fields must not be inherited if set.
     *
     * @param existing existing item
     * @param created  created item (mixed with inheritance and existing one)
     */
    //===============================================================
    @SuppressWarnings("ConstantConditions")
    private void manageNonInheritedPart(Attribute existing, Attribute created) {
        if (Utils.isSet(existing.getPolledPeriod()))
            created.setPolledPeriod(existing.getPolledPeriod());

        created.setArchiveEvent(existing.getArchiveEvent());
        created.setChangeEvent(existing.getChangeEvent());
        created.setMemorized(existing.getMemorized());
        created.setMemorizedAtInit(existing.getMemorizedAtInit());

        //	Attribute properties.
        AttrProperties exist_prop = existing.getProperties();
        AttrProperties creat_prop = created.getProperties();
        if (Utils.isSet(exist_prop.getLabel()))
            creat_prop.setLabel(exist_prop.getLabel());
        if (Utils.isSet(exist_prop.getUnit()))
            creat_prop.setUnit(exist_prop.getUnit());
        if (Utils.isSet(exist_prop.getStandardUnit()))
            creat_prop.setStandardUnit(exist_prop.getStandardUnit());
        if (Utils.isSet(exist_prop.getDisplayUnit()))
            creat_prop.setDisplayUnit(exist_prop.getDisplayUnit());
        if (Utils.isSet(exist_prop.getFormat()))
            creat_prop.setFormat(exist_prop.getFormat());
        if (Utils.isSet(exist_prop.getMaxValue()))
            creat_prop.setMaxValue(exist_prop.getMaxValue());
        if (Utils.isSet(exist_prop.getMinValue()))
            creat_prop.setMinValue(exist_prop.getMinValue());
        if (Utils.isSet(exist_prop.getMaxAlarm()))
            creat_prop.setMaxAlarm(exist_prop.getMaxAlarm());
        if (Utils.isSet(exist_prop.getMinAlarm()))
            creat_prop.setMinAlarm(exist_prop.getMinAlarm());
        if (Utils.isSet(exist_prop.getMaxWarning()))
            creat_prop.setMaxWarning(exist_prop.getMaxWarning());
        if (Utils.isSet(exist_prop.getMinWarning()))
            creat_prop.setMinWarning(exist_prop.getMinWarning());
        if (Utils.isSet(exist_prop.getDeltaTime()))
            creat_prop.setDeltaTime(exist_prop.getDeltaTime());
        if (Utils.isSet(exist_prop.getDeltaValue()))
            creat_prop.setDeltaValue(exist_prop.getDeltaValue());
        if (Utils.isSet(exist_prop.getDescription()))
            creat_prop.setDescription(exist_prop.getDescription());
    }

    //===============================================================
    //===============================================================
    private String attributeHasChanged(Attribute readAtt, Attribute inherAtt) {
        String readDataType = OAWutils.pogo2tangoType(readAtt.getDataType().toString());
        String inherDataType = OAWutils.pogo2tangoType(inherAtt.getDataType().toString());
        String retStr = null;
        if (!readDataType.equals(inherDataType))
            retStr = " - Attribute " + readAtt.getName() + "   must be a " + inherDataType + "\n";
        if (!readAtt.getAttType().equals(inherAtt.getAttType()))
            retStr = " - Attribute " + readAtt.getName() + "   must be a " + inherAtt.getAttType() + "\n";
        if (!readAtt.getRwType().equals(inherAtt.getRwType()))
            retStr = " - Attribute " + readAtt.getName() + "   must be a " + inherAtt.getRwType() + "\n";
        return retStr;
    }

    //===============================================================
    //===============================================================
    private String commandHasChanged(Command readCmd, Command inherCmd) {
        String readArgin = OAWutils.pogo2tangoType(readCmd.getArgin().getType().toString());
        String inherArgin = OAWutils.pogo2tangoType(inherCmd.getArgin().getType().toString());
        String readArgout = OAWutils.pogo2tangoType(readCmd.getArgout().getType().toString());
        String inherArgout = OAWutils.pogo2tangoType(inherCmd.getArgout().getType().toString());
        String retStr = "";
        if (!readArgin.equals(inherArgin))
            retStr += " - Command " + readCmd.getName() + "   must have a  " + inherArgin + " input argument\n";
        if (!readArgout.equals(inherArgout))
            retStr += " - Command " + readCmd.getName() + "   must have a  " + inherArgout + " output argument\n";

        if (retStr.length() == 0)
            return null;
        else
            return retStr;
    }

    //===============================================================
    //===============================================================
    public ImageIcon getIcon(InheritanceStatus status) {
        if (status == null)
            return utils.unknownIcon;

        if (Utils.isTrue(status.getConcreteHere()))
            return utils.overloadedIcon;
        else if (Utils.isTrue(status.getInherited())) {
            if (Utils.isTrue(status.getConcrete()))
                return utils.inheritedIcon;
            else
                return utils.abstractIcon;
        } else if (Utils.isTrue(status.getAbstract()))
            return utils.abstractIcon;
        else
            return utils.unknownIcon;
    }

    //===============================================================
    //===============================================================
    public Font getLeafFont(InheritanceStatus status) {
        if (status == null)
            return PogoConst.rootFont_concrete;
        else
            return (Utils.isTrue(status.getConcrete()) ?
                    PogoConst.leafFont_concrete : PogoConst.leafFont_abstract);
    }

    //===============================================================
    //===============================================================
    @SuppressWarnings("UnusedDeclaration")
    public static String getStatusStr(InheritanceStatus status) {
        if (status == null)
            return "Inheritance status is null";

        StringBuilder dbg = new StringBuilder();
        if (Utils.isTrue(System.getenv("DEBUG")))
            dbg.append("  ").append(Utils.isTrue(status.getAbstract())).append(", ")
                    .append(Utils.isTrue(status.getInherited())).append(", ")
                    .append(Utils.isTrue(status.getConcrete())).append(", ")
                    .append(Utils.isTrue(status.getConcreteHere())).append("  ");

        StringBuilder retStr = new StringBuilder(dbg);
        if (Utils.isTrue(status.getConcreteHere())) {
            if (Utils.isTrue(status.getInherited()))
                retStr.append("Overload");
            else
                retStr.append("Concrete");
        } else if (Utils.isTrue(status.getInherited())) {
            if (Utils.isTrue(status.getConcrete()))
                retStr.append("Inherited concrete");
            else
                retStr.append("Inherited abstract");
        } else if (Utils.isTrue(status.getAbstract()))
            retStr.append("Abstract");
        else
            retStr.append("??");
        return retStr.toString();
    }

    //===============================================================
    //===============================================================
    private static boolean isRemovable(JFrame parent, String name, InheritanceStatus status) {
        if (Utils.isTrue(status.getInherited())) {
            String message = name + " is inherited.  Remove it anyway ?";
            return (JOptionPane.showConfirmDialog(parent,
                    message,
                    "Confirmation Window",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION);
        }
        return true;
    }

    //===============================================================
    //===============================================================
    public static boolean isRemovable(JFrame parent, Property prop) {
        return isRemovable(parent, prop.getName(), prop.getStatus());
    }

    //===============================================================
    //===============================================================
    public static boolean isRemovable(JFrame parent, Command cmd) {
        return isRemovable(parent, cmd.getName(), cmd.getStatus());
    }

    //===============================================================
    //===============================================================
    public static boolean isRemovable(JFrame parent, Attribute attr) {
        return isRemovable(parent, attr.getName(), attr.getStatus());
    }

    //===============================================================
    //===============================================================
    /*
    public boolean isRemovable(JFrame parent, State state)
    {
        return isRemovable(parent, state.getName(), state.getStatus());
    }
    */
    //===============================================================
    //===============================================================
    public static String checkInheritanceFileFromEnv(String filename) {
        String inheritHome = System.getenv("INHERIT_HOME");

        //  if not from env, check from .pogorc file
        if (inheritHome == null)
            if (PogoProperty.inheritHome != null && PogoProperty.inheritHome.length() > 0)
                inheritHome = PogoProperty.inheritHome;

        if (filename != null) {
            filename = Utils.getRelativeFilename(filename);
            if (inheritHome != null) {
                System.out.println("Searching " + filename + "    from " + inheritHome);
                return Utils.searchFileFromDirectory(filename, inheritHome);
            }
        }
        return null;
    }
    //===============================================================
    //===============================================================
}
