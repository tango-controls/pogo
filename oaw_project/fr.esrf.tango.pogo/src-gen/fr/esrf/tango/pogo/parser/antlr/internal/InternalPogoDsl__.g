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
T18 : 'deviceclass' ;
T19 : 'abstract' ;
T20 : 'extends' ;
T21 : 'description:' ;
T22 : 'classProperties:' ;
T23 : 'deviceProperties:' ;
T24 : 'commands:' ;
T25 : 'attributes:' ;
T26 : 'states:' ;
T27 : 'Cpp' ;
T28 : 'Java' ;
T29 : 'Python' ;
T30 : 'OPERATOR' ;
T31 : 'EXPERT' ;
T32 : 'Scalar' ;
T33 : 'Spectrum' ;
T34 : 'Image' ;
T35 : 'READ' ;
T36 : 'WRITE' ;
T37 : 'READ_WRITE' ;
T38 : 'READ_WITH_WRITE' ;
T39 : 'true' ;
T40 : 'false' ;
T41 : 'defaultPropValue:' ;
T42 : 'excludedStates:' ;
T43 : 'readExcludedStates:' ;
T44 : 'writeExcludedStates:' ;
T45 : 'void' ;
T46 : 'boolean' ;
T47 : 'short' ;
T48 : 'ushort' ;
T49 : 'int' ;
T50 : 'uint' ;
T51 : 'float' ;
T52 : 'double' ;
T53 : 'string' ;
T54 : 'DevVarCharArray' ;
T55 : 'DevVarShortArray' ;
T56 : 'DevVarUShortArray' ;
T57 : 'DevVarLongArray' ;
T58 : 'DevVarULongArray' ;
T59 : 'DevVarFloatArray' ;
T60 : 'DevVarDoubleArray' ;
T61 : 'DevVarStringArray' ;
T62 : 'DevVarLongStringArray' ;
T63 : 'DevVarDoubleStringArray' ;
T64 : 'DevState' ;
T65 : 'ConstDevString' ;
T66 : 'DevVarBooleanArray' ;
T67 : 'DevUChar' ;
T68 : 'DevLong64' ;
T69 : 'DevULong64' ;
T70 : 'DevVarLong64Array' ;
T71 : 'DevVarULong64Array' ;
T72 : 'DevInt' ;
T73 : 'DevEncoded' ;
T74 : 'vector<short>' ;
T75 : 'vector<int>' ;
T76 : 'vector<float>' ;
T77 : 'vector<double>' ;
T78 : 'vector<string>' ;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4815
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4817
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4819
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4821
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4823
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4825
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g" 4827
RULE_ANY_OTHER : .;


