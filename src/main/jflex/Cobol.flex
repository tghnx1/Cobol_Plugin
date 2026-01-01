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
[ \t\r\n]+            { return TokenType.WHITE_SPACE; }

/* numbers */
[0-9]+                { return CobolTypes.NUMBER; }

/* identifiers */
[A-Z][A-Z0-9-]*       { return CobolTypes.IDENTIFIER; }

/* dot = end of statement */
"."                   { return CobolTypes.DOT; }

/* anything else */
.                     { return TokenType.BAD_CHARACTER; }
