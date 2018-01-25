lexer grammar InternalCfengineEditor;
@header {
package edu.kit.scc.cfeditor.cfengine.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T9 : ',' ;
T10 : '.' ;
T11 : '!' ;
T12 : '(' ;
T13 : ')' ;
T14 : 'bundle' ;
T15 : '{' ;
T16 : '}' ;
T17 : ':' ;
T18 : '::' ;
T19 : ';' ;
T20 : '=>' ;
T21 : '@' ;
T22 : 'body' ;
T23 : '$(' ;
T24 : '${' ;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 4718
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 4720
RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 4722
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 4724
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 4726
RULE_ANY_OTHER : .;


