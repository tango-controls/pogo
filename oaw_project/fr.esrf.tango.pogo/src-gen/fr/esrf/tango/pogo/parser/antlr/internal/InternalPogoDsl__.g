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
T40 : 'readExcludedStates:' ;
T41 : 'writeExcludedStates:' ;
T42 : 'void' ;
T43 : 'boolean' ;
T44 : 'short' ;
T45 : 'ushort' ;
T46 : 'int' ;
T47 : 'uint' ;
T48 : 'float' ;
T49 : 'double' ;
T50 : 'string' ;
T51 : 'DevVarCharArray' ;
T52 : 'DevVarShortArray' ;
T53 : 'DevVarUShortArray' ;
T54 : 'DevVarLongArray' ;
T55 : 'DevVarULongArray' ;
T56 : 'DevVarFloatArray' ;
T57 : 'DevVarDoubleArray' ;
T58 : 'DevVarStringArray' ;
T59 : 'DevVarLongStringArray' ;
T60 : 'DevVarDoubleStringArray' ;
T61 : 'DevState' ;
T62 : 'ConstDevString' ;
T63 : 'DevVarBooleanArray' ;
T64 : 'DevUChar' ;
T65 : 'DevLong64' ;
T66 : 'DevULong64' ;
T67 : 'DevVarLong64Array' ;
T68 : 'DevVarULong64Array' ;
T69 : 'DevInt' ;
T70 : 'DevEncoded' ;
T71 : 'vector<short>' ;
T72 : 'vector<int>' ;
T73 : 'vector<float>' ;
T74 : 'vector<double>' ;
T75 : 'vector<string>' ;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4463
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4465
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4467
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4469
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4471
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4473
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4475
RULE_ANY_OTHER : .;


