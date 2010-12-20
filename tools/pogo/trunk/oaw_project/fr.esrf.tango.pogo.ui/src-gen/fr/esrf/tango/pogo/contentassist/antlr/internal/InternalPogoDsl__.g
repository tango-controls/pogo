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
T26 : 'multiclasses' ;
T27 : '{' ;
T28 : 'classes:' ;
T29 : '}' ;
T30 : 'inheritances:' ;
T31 : 'parentClasses:' ;
T32 : 'deviceclass' ;
T33 : 'description:' ;
T34 : 'classProperties:' ;
T35 : 'deviceProperties:' ;
T36 : 'commands:' ;
T37 : 'attributes:' ;
T38 : 'states:' ;
T39 : 'extends' ;
T40 : 'defaultPropValue:' ;
T41 : 'excludedStates:' ;
T42 : 'readExcludedStates:' ;
T43 : 'writeExcludedStates:' ;
T44 : 'void' ;
T45 : 'boolean' ;
T46 : 'short' ;
T47 : 'ushort' ;
T48 : 'int' ;
T49 : 'uint' ;
T50 : 'float' ;
T51 : 'double' ;
T52 : 'string' ;
T53 : 'DevVarCharArray' ;
T54 : 'DevVarShortArray' ;
T55 : 'DevVarUShortArray' ;
T56 : 'DevVarLongArray' ;
T57 : 'DevVarULongArray' ;
T58 : 'DevVarFloatArray' ;
T59 : 'DevVarDoubleArray' ;
T60 : 'DevVarStringArray' ;
T61 : 'DevVarLongStringArray' ;
T62 : 'DevVarDoubleStringArray' ;
T63 : 'DevState' ;
T64 : 'ConstDevString' ;
T65 : 'DevVarBooleanArray' ;
T66 : 'DevUChar' ;
T67 : 'DevLong64' ;
T68 : 'DevULong64' ;
T69 : 'DevVarLong64Array' ;
T70 : 'DevVarULong64Array' ;
T71 : 'DevInt' ;
T72 : 'DevEncoded' ;
T73 : 'vector<short>' ;
T74 : 'vector<int>' ;
T75 : 'vector<float>' ;
T76 : 'vector<double>' ;
T77 : 'vector<string>' ;
T78 : 'abstract' ;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8090
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8092
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8094
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8096
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8098
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8100
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8102
RULE_ANY_OTHER : .;


