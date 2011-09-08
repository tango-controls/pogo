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
T39 : 'dynamicAttributes:' ;
T40 : 'states:' ;
T41 : 'extends' ;
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
T80 : 'abstract' ;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8443
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8445
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8447
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8449
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8451
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8453
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g" 8455
RULE_ANY_OTHER : .;


