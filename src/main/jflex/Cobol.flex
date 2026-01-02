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

/* string literals */
'[^']*'               { return CobolTypes.STRING_LITERAL; }

/* operators */
"="                   { return CobolTypes.EQUALS; }

[(]                   { return CobolTypes.LPAREN; }
[)]                   { return CobolTypes.RPAREN; }

"."                   { return CobolTypes.DOT; }

[ \t\r\n]+            { return TokenType.WHITE_SPACE; }
[0-9]+                { return CobolTypes.NUMBER; }
[A-Z][A-Z0-9-]*       { return CobolTypes.IDENTIFIER; }

.                     { return TokenType.BAD_CHARACTER; }





