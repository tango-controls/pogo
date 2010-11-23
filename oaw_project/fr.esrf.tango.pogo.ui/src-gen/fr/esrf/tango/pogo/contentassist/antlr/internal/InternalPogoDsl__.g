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
T39 : 'readExcludedStates:' ;
T40 : 'writeExcludedStates:' ;
T41 : 'void' ;
T42 : 'boolean' ;
T43 : 'short' ;
T44 : 'ushort' ;
T45 : 'int' ;
T46 : 'uint' ;
T47 : 'float' ;
T48 : 'double' ;
T49 : 'string' ;
T50 : 'DevVarCharArray' ;
T51 : 'DevVarShortArray' ;
T52 : 'DevVarUShortArray' ;
T53 : 'DevVarLongArray' ;
T54 : 'DevVarULongArray' ;
T55 : 'DevVarFloatArray' ;
T56 : 'DevVarDoubleArray' ;
T57 : 'DevVarStringArray' ;
T58 : 'DevVarLongStringArray' ;
T59 : 'DevVarDoubleStringArray' ;
T60 : 'DevState' ;
T61 : 'ConstDevString' ;
T62 : 'DevVarBooleanArray' ;
T63 : 'DevUChar' ;
T64 : 'DevLong64' ;
T65 : 'DevULong64' ;
T66 : 'DevVarLong64Array' ;
T67 : 'DevVarULong64Array' ;
T68 : 'DevInt' ;
T69 : 'DevEncoded' ;
T70 : 'vector<short>' ;
T71 : 'vector<int>' ;
T72 : 'vector<float>' ;
T73 : 'vector<double>' ;
T74 : 'vector<string>' ;
T75 : 'abstract' ;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 7451
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 7453
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 7455
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 7457
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 7459
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 7461
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 7463
RULE_ANY_OTHER : .;


