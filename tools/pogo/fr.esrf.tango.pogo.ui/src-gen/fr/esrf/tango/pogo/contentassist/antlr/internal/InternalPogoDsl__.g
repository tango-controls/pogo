lexer grammar InternalPogoDsl;
@header {
package fr.esrf.tango.pogo.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'Cpp' ;
T12 : 'Java' ;
T13 : 'Python' ;
T14 : 'OPERATOR' ;
T15 : 'EXPERT' ;
T16 : 'Scalar' ;
T17 : 'Spectrum' ;
T18 : 'Image' ;
T19 : 'READ' ;
T20 : 'WRITE' ;
T21 : 'READ_WRITE' ;
T22 : 'READ_WITH_WRITE' ;
T23 : 'true' ;
T24 : 'false' ;
T25 : 'import' ;
T26 : 'deviceclass' ;
T27 : '{' ;
T28 : 'description:' ;
T29 : 'classProperties:' ;
T30 : 'deviceProperties:' ;
T31 : 'commands:' ;
T32 : 'attributes:' ;
T33 : 'states:' ;
T34 : '}' ;
T35 : 'extends' ;
T36 : 'defaultPropValue:' ;
T37 : 'excludedStates:' ;
T38 : 'void' ;
T39 : 'boolean' ;
T40 : 'short' ;
T41 : 'ushort' ;
T42 : 'int' ;
T43 : 'uint' ;
T44 : 'float' ;
T45 : 'double' ;
T46 : 'string' ;
T47 : 'DevVarCharArray' ;
T48 : 'DevVarShortArray' ;
T49 : 'DevVarUShortArray' ;
T50 : 'DevVarLongArray' ;
T51 : 'DevVarULongArray' ;
T52 : 'DevVarFloatArray' ;
T53 : 'DevVarDoubleArray' ;
T54 : 'DevVarStringArray' ;
T55 : 'DevVarLongStringArray' ;
T56 : 'DevVarDoubleStringArray' ;
T57 : 'DevState' ;
T58 : 'ConstDevString' ;
T59 : 'DevVarBooleanArray' ;
T60 : 'DevUChar' ;
T61 : 'DevLong64' ;
T62 : 'DevULong64' ;
T63 : 'DevVarLong64Array' ;
T64 : 'DevVarULong64Array' ;
T65 : 'DevInt' ;
T66 : 'DevEncoded' ;
T67 : 'vector<short>' ;
T68 : 'vector<int>' ;
T69 : 'vector<float>' ;
T70 : 'vector<double>' ;
T71 : 'vector<string>' ;
T72 : 'abstract' ;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6942
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6944
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6946
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6948
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6950
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6952
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6954
RULE_ANY_OTHER : .;


