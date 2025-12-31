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

/* whitespace */
[ \t\r\n]+          { return TokenType.WHITE_SPACE; }

/* line number: MUST go before NUMBER */
[0-9]{2}            { return CobolTypes.LINE_NUMBER; }

/* keywords */
"IDENTIFICATION"    { return CobolTypes.IDENTIFICATION; }
"DIVISION"          { return CobolTypes.DIVISION; }
"PROGRAM-ID"        { return CobolTypes.PROGRAM_ID; }
"DATA"              { return CobolTypes.DATA; }
"WORKING-STORAGE"   { return CobolTypes.WORKING_STORAGE; }
"PROCEDURE"         { return CobolTypes.PROCEDURE; }
"SECTION"           { return CobolTypes.SECTION; }
"STOP"              { return CobolTypes.STOP; }
"RUN"               { return CobolTypes.RUN; }

/* punctuation */
"."                 { return CobolTypes.DOT; }

/* number */
[0-9]+              { return CobolTypes.NUMBER; }

/* identifier */
[A-Z][A-Z0-9-]*     { return CobolTypes.IDENTIFIER; }

/* fallback */
.                   { return TokenType.BAD_CHARACTER; }
