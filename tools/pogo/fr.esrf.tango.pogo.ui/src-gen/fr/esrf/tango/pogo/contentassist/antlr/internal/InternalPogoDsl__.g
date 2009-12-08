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
T36 : 'inheritances:' ;
T37 : 'defaultPropValue:' ;
T38 : 'excludedStates:' ;
T39 : 'void' ;
T40 : 'boolean' ;
T41 : 'short' ;
T42 : 'ushort' ;
T43 : 'int' ;
T44 : 'uint' ;
T45 : 'float' ;
T46 : 'double' ;
T47 : 'string' ;
T48 : 'DevVarCharArray' ;
T49 : 'DevVarShortArray' ;
T50 : 'DevVarUShortArray' ;
T51 : 'DevVarLongArray' ;
T52 : 'DevVarULongArray' ;
T53 : 'DevVarFloatArray' ;
T54 : 'DevVarDoubleArray' ;
T55 : 'DevVarStringArray' ;
T56 : 'DevVarLongStringArray' ;
T57 : 'DevVarDoubleStringArray' ;
T58 : 'DevState' ;
T59 : 'ConstDevString' ;
T60 : 'DevVarBooleanArray' ;
T61 : 'DevUChar' ;
T62 : 'DevLong64' ;
T63 : 'DevULong64' ;
T64 : 'DevVarLong64Array' ;
T65 : 'DevVarULong64Array' ;
T66 : 'DevInt' ;
T67 : 'DevEncoded' ;
T68 : 'vector<short>' ;
T69 : 'vector<int>' ;
T70 : 'vector<float>' ;
T71 : 'vector<double>' ;
T72 : 'vector<string>' ;
T73 : 'abstract' ;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6588
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6590
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6592
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6594
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6596
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6598
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 6600
RULE_ANY_OTHER : .;


