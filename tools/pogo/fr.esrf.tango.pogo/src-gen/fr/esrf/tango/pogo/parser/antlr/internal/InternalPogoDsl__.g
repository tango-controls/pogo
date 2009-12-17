lexer grammar InternalPogoDsl;
@header {
package fr.esrf.tango.pogo.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import' ;
T12 : 'deviceclass' ;
T13 : 'abstract' ;
T14 : 'extends' ;
T15 : '{' ;
T16 : 'description:' ;
T17 : 'classProperties:' ;
T18 : 'deviceProperties:' ;
T19 : 'commands:' ;
T20 : 'attributes:' ;
T21 : 'states:' ;
T22 : '}' ;
T23 : 'Cpp' ;
T24 : 'Java' ;
T25 : 'Python' ;
T26 : 'OPERATOR' ;
T27 : 'EXPERT' ;
T28 : 'Scalar' ;
T29 : 'Spectrum' ;
T30 : 'Image' ;
T31 : 'READ' ;
T32 : 'WRITE' ;
T33 : 'READ_WRITE' ;
T34 : 'READ_WITH_WRITE' ;
T35 : 'true' ;
T36 : 'false' ;
T37 : 'inheritances:' ;
T38 : 'defaultPropValue:' ;
T39 : 'excludedStates:' ;
T40 : 'void' ;
T41 : 'boolean' ;
T42 : 'short' ;
T43 : 'ushort' ;
T44 : 'int' ;
T45 : 'uint' ;
T46 : 'float' ;
T47 : 'double' ;
T48 : 'string' ;
T49 : 'DevVarCharArray' ;
T50 : 'DevVarShortArray' ;
T51 : 'DevVarUShortArray' ;
T52 : 'DevVarLongArray' ;
T53 : 'DevVarULongArray' ;
T54 : 'DevVarFloatArray' ;
T55 : 'DevVarDoubleArray' ;
T56 : 'DevVarStringArray' ;
T57 : 'DevVarLongStringArray' ;
T58 : 'DevVarDoubleStringArray' ;
T59 : 'DevState' ;
T60 : 'ConstDevString' ;
T61 : 'DevVarBooleanArray' ;
T62 : 'DevUChar' ;
T63 : 'DevLong64' ;
T64 : 'DevULong64' ;
T65 : 'DevVarLong64Array' ;
T66 : 'DevVarULong64Array' ;
T67 : 'DevInt' ;
T68 : 'DevEncoded' ;
T69 : 'vector<short>' ;
T70 : 'vector<int>' ;
T71 : 'vector<float>' ;
T72 : 'vector<double>' ;
T73 : 'vector<string>' ;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4131
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4133
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4135
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4137
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4139
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4141
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4143
RULE_ANY_OTHER : .;


