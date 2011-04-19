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
T32 : 'additionalFiles:' ;
T33 : 'deviceclass' ;
T34 : 'description:' ;
T35 : 'classProperties:' ;
T36 : 'deviceProperties:' ;
T37 : 'commands:' ;
T38 : 'attributes:' ;
T39 : 'states:' ;
T40 : 'extends' ;
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
T79 : 'abstract' ;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8351
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8353
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8355
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8357
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8359
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8361
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8363
RULE_ANY_OTHER : .;


