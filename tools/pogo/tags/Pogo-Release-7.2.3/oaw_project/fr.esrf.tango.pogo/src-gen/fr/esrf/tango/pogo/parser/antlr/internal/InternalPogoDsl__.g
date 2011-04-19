lexer grammar InternalPogoDsl;
@header {
package fr.esrf.tango.pogo.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import' ;
T12 : 'multiclasses' ;
T13 : '{' ;
T14 : 'classes:' ;
T15 : '}' ;
T16 : 'inheritances:' ;
T17 : 'parentClasses:' ;
T18 : 'additionalFiles:' ;
T19 : 'deviceclass' ;
T20 : 'abstract' ;
T21 : 'extends' ;
T22 : 'description:' ;
T23 : 'classProperties:' ;
T24 : 'deviceProperties:' ;
T25 : 'commands:' ;
T26 : 'attributes:' ;
T27 : 'states:' ;
T28 : 'Cpp' ;
T29 : 'Java' ;
T30 : 'Python' ;
T31 : 'OPERATOR' ;
T32 : 'EXPERT' ;
T33 : 'Scalar' ;
T34 : 'Spectrum' ;
T35 : 'Image' ;
T36 : 'READ' ;
T37 : 'WRITE' ;
T38 : 'READ_WRITE' ;
T39 : 'READ_WITH_WRITE' ;
T40 : 'true' ;
T41 : 'false' ;
T42 : 'defaultPropValue:' ;
T43 : 'excludedStates:' ;
T44 : 'readExcludedStates:' ;
T45 : 'writeExcludedStates:' ;
T46 : 'void' ;
T47 : 'boolean' ;
T48 : 'short' ;
T49 : 'ushort' ;
T50 : 'int' ;
T51 : 'uint' ;
T52 : 'float' ;
T53 : 'double' ;
T54 : 'string' ;
T55 : 'DevVarCharArray' ;
T56 : 'DevVarShortArray' ;
T57 : 'DevVarUShortArray' ;
T58 : 'DevVarLongArray' ;
T59 : 'DevVarULongArray' ;
T60 : 'DevVarFloatArray' ;
T61 : 'DevVarDoubleArray' ;
T62 : 'DevVarStringArray' ;
T63 : 'DevVarLongStringArray' ;
T64 : 'DevVarDoubleStringArray' ;
T65 : 'DevState' ;
T66 : 'ConstDevString' ;
T67 : 'DevVarBooleanArray' ;
T68 : 'DevUChar' ;
T69 : 'DevLong64' ;
T70 : 'DevULong64' ;
T71 : 'DevVarLong64Array' ;
T72 : 'DevVarULong64Array' ;
T73 : 'DevInt' ;
T74 : 'DevEncoded' ;
T75 : 'vector<short>' ;
T76 : 'vector<int>' ;
T77 : 'vector<float>' ;
T78 : 'vector<double>' ;
T79 : 'vector<string>' ;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4947
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4949
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4951
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4953
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4955
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4957
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4959
RULE_ANY_OTHER : .;


