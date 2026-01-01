package com.github.tghnx1.cobolplugin.lexer

import com.intellij.lexer.FlexAdapter

/**
 * Adapter between IntelliJ Lexer API and JFlex-generated CobolLexer.
 *
 * CobolLexer is generated from Cobol.flex into src/main/gen.
 */
class CobolLexerAdapter : FlexAdapter(CobolLexer(null))
