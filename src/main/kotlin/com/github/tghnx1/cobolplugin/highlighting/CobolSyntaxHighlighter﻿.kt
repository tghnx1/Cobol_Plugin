package com.github.tghnx1.cobolplugin.highlighting

import com.github.tghnx1.cobolplugin.lexer.CobolLexerAdapter
import com.github.tghnx1.cobolplugin.psi.CobolTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.psi.tree.IElementType

class CobolSyntaxHighlighter : SyntaxHighlighter {
    override fun getHighlightingLexer(): Lexer {
        return CobolLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey?> {
        if (tokenType === CobolTypes.NUMBER) {
            return NUMBER_KEYS
        }

        if (tokenType === CobolTypes.STRING_LITERAL) {
            return STRING_KEYS
        }

        if (tokenType === CobolTypes.IDENTIFIER) {
            return IDENTIFIER_KEYS
        }

        return EMPTY_KEYS
    }

    companion object {
        private val NUMBER_KEYS = arrayOf<TextAttributesKey?>(DefaultLanguageHighlighterColors.NUMBER)

        private val STRING_KEYS = arrayOf<TextAttributesKey?>(DefaultLanguageHighlighterColors.STRING)

        private val IDENTIFIER_KEYS = arrayOf<TextAttributesKey?>(DefaultLanguageHighlighterColors.IDENTIFIER)

        private val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)
    }
}