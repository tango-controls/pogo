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

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4190
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4192
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4194
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4196
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4198
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4200
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4202
RULE_ANY_OTHER : .;


