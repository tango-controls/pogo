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
T27 : 'dynamicAttributes:' ;
T28 : 'states:' ;
T29 : 'Cpp' ;
T30 : 'Java' ;
T31 : 'Python' ;
T32 : 'OPERATOR' ;
T33 : 'EXPERT' ;
T34 : 'Scalar' ;
T35 : 'Spectrum' ;
T36 : 'Image' ;
T37 : 'READ' ;
T38 : 'WRITE' ;
T39 : 'READ_WRITE' ;
T40 : 'READ_WITH_WRITE' ;
T41 : 'true' ;
T42 : 'false' ;
T43 : 'defaultPropValue:' ;
T44 : 'excludedStates:' ;
T45 : 'readExcludedStates:' ;
T46 : 'writeExcludedStates:' ;
T47 : 'void' ;
T48 : 'boolean' ;
T49 : 'short' ;
T50 : 'ushort' ;
T51 : 'int' ;
T52 : 'uint' ;
T53 : 'float' ;
T54 : 'double' ;
T55 : 'string' ;
T56 : 'DevVarCharArray' ;
T57 : 'DevVarShortArray' ;
T58 : 'DevVarUShortArray' ;
T59 : 'DevVarLongArray' ;
T60 : 'DevVarULongArray' ;
T61 : 'DevVarFloatArray' ;
T62 : 'DevVarDoubleArray' ;
T63 : 'DevVarStringArray' ;
T64 : 'DevVarLongStringArray' ;
T65 : 'DevVarDoubleStringArray' ;
T66 : 'DevState' ;
T67 : 'ConstDevString' ;
T68 : 'DevVarBooleanArray' ;
T69 : 'DevUChar' ;
T70 : 'DevLong64' ;
T71 : 'DevULong64' ;
T72 : 'DevVarLong64Array' ;
T73 : 'DevVarULong64Array' ;
T74 : 'DevInt' ;
T75 : 'DevEncoded' ;
T76 : 'vector<short>' ;
T77 : 'vector<int>' ;
T78 : 'vector<float>' ;
T79 : 'vector<double>' ;
T80 : 'vector<string>' ;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4993
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4995
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4997
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4999
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 5001
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 5003
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 5005
RULE_ANY_OTHER : .;


