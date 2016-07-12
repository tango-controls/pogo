package fr.esrf.tango.pogo.validation;

public interface IssueCodes {
	String PREFIX = "fr.esrf.tango.pogo.validation.";
	
	String ERROR_NO_CLASS_DESCRIPTION = PREFIX + "no_class_description";
	String ERROR_COMMAND_NAME_START_UPPERCASE = PREFIX + "command_name_start_uppercase";	
	String ERROR_COMMAND_INPUTTYPE_MISSING = PREFIX + "command_inputtype_missing";	
	String ERROR_COMMAND_OUTPUTTYPE_MISSING = PREFIX + "command_outputtype_missing";	
	String ERROR_PROPERTY_NAME_START_UPPERCASE = PREFIX + "property_name_start_uppercase";	
}
