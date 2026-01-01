package com.github.tghnx1.cobolplugin.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.intellij.lexer.FlexLexer;
import com.github.tghnx1.cobolplugin.psi.CobolTypes;

%%

%class CobolLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode
%public

%%

/* COBOL keywords */
"DATA"                { return CobolTypes.DATA; }
"PIC"                 { return CobolTypes.PIC; }
"VALUE"               { return CobolTypes.VALUE; }
"FROM"                { return CobolTypes.FROM; }
"BY"                  { return CobolTypes.BY; }
"UNTIL"               { return CobolTypes.UNTIL; }
"STOP"                { return CobolTypes.STOP; }
"RUN"                 { return CobolTypes.RUN; }
"DISPLAY"             { return CobolTypes.DISPLAY; }
[9AX](\([0-9]+\))?    { return CobolTypes.PICTURE_CHAR; }
/* string literals */
'[^']*'               { return CobolTypes.STRING_LITERAL; }

/* operators */
"="                   { return CobolTypes.EQUALS; }

[ \t\r\n]+            { return TokenType.WHITE_SPACE; }
[0-9]+                { return CobolTypes.NUMBER; }
[A-Z][A-Z0-9-]*       { return CobolTypes.IDENTIFIER; }
"."                   { return CobolTypes.DOT; }
.                     { return TokenType.BAD_CHARACTER; }




